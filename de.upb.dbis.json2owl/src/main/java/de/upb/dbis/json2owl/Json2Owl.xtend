package de.upb.dbis.json2owl

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSyntaxException
import java.util.Map.Entry
import java.util.Stack

class Json2Owl {
	
	
	private JsonElement root;
	private String rooturi;
	private StringBuffer stringbuffer = new StringBuffer();
	private String namespace;
	private Stack<JsonElement> jsonElements2 = new Stack<JsonElement>();
	private Stack<String> jsonPath = new Stack<String>();
	private Stack<String> conceptNames = new Stack<String>();
	
	private IdentifierProvider id;
	private UriProvider uri = UriProvider.INSTANCE;
	
	
	
	public def run(String namespace, String operationId, String json, String host, String method){
		id = new IdentifierProvider();
		
		try{
			
			root = new JsonParser().parse(json);
			
			this.namespace = namespace;
			
			//stringbuffer.append('''<«namespace»> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#Ontology> .''');
			//stringbuffer.append("\n");
			
			//rooturi = uri.json2class(namespace, operationId.toFirstUpper); //TODO use IdProvider
			rooturi = uri.domainRoot(host, operationId, method); //(namespace, operationId.toFirstUpper); //TODO use IdProvider
			stringbuffer.append(
			'''
					<owl:Class rdf:about="«rooturi»">
					<rdfs:label><![CDATA[«operationId»]]></rdfs:label>
					</owl:Class>
				'''
			);
					
			doSwitch("$", root, operationId);
						
		}
		catch(JsonSyntaxException e){
			System.out.println("ERROR parsing JSON in "+namespace);
			e.printStackTrace();
			
			
			var rooturi = uri.json2class(namespace, operationId); //TODO use IdProvider
			stringbuffer.append(
			'''
					<owl:Class rdf:about="«rooturi»">
					<!-- ERROR while parsing JSON -->
					</owl:Class>
				'''
			);
			
		}
		
		return 
		'''
			<rdf:RDF
				xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
				   xmlns:owl="http://www.w3.org/2002/07/owl#"
				   xmlns:j.0="http://is.upb.de/#"
				   xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#">
				<owl:Ontology rdf:about="«namespace»"/>
				«stringbuffer.toString»
			</rdf:RDF>
		''';
	}
	
	protected def void doSwitch(String pathsegment, JsonElement jsonElement, String label){
		JsonStatistics.add(pathsegment);
		
		jsonElements2.push(jsonElement);
		
		jsonPath.push(pathsegment);
		
		//jsonElements.push(pathsegment -> jsonElement);
		if(jsonElement.isJsonObject){
			conceptNames.push(label);
			handleJsonObject(pathsegment, jsonElement.asJsonObject, label);
			conceptNames.pop();
		}
		else if(jsonElement.isJsonArray){
			conceptNames.push(label);
			handleJsonArray(pathsegment, jsonElement.asJsonArray, label);
			conceptNames.pop();
		}
		else if(jsonElement.isJsonPrimitive){
			conceptNames.push(label);
			handleJsonPrimitive(label, jsonElement.asJsonPrimitive);
			conceptNames.pop();
		}
		else if(jsonElement.jsonNull){
			conceptNames.push(label);
			handleJsonNull(label);
			conceptNames.pop();
		}

		jsonElements2.pop();
		
		jsonPath.pop();	
	}

	protected def handleJsonObject(String name, JsonObject jsonObject, String label){
		
		var classuri = uri.json2class(namespace, getUriPath());
		
		if(!jsonObject.equals(root)){
			
			stringbuffer.append(
			'''
					<owl:Class rdf:about="«classuri»">
						<rdfs:label><![CDATA[«label»]]></rdfs:label>
					</owl:Class>
				'''
			);
		}
		
		
		if(jsonElements2.size>1){ // && jsonElements2.get(jsonElements2.length-2).isJsonObject){
			
			var propertyuri = uri.json2property(namespace, getUriPath());
			
			var parenturi = uri.json2class(namespace, getUriPath(-1));
			
			stringbuffer.append(
			'''
					<owl:ObjectProperty rdf:about="«propertyuri»">
					  <rdfs:domain rdf:resource="«parenturi»"/>
					  <rdfs:range rdf:resource="«classuri»"/>
					  <rdfs:label><![CDATA[«label»]]></rdfs:label>
					</owl:ObjectProperty>
				'''
			);
		}
		
		for(Entry<String, JsonElement> item:jsonObject.entrySet){
			
			doSwitch(item.key, item.value, item.key);
		}
		
	}

	
	protected def handleJsonArray(String name2, JsonArray jsonArray, String label){
		
		var classuri = uri.json2class(namespace, getUriPath());
		
		if(!jsonArray.equals(root)){
			
			stringbuffer.append(
			'''
				<owl:Class rdf:about="«classuri»">
					<rdfs:label><![CDATA[«label»]]></rdfs:label>
				</owl:Class>
			'''
			);
		}
		
		if(jsonElements2.size>1){ // && jsonElements2.get(jsonElements2.length-2).isJsonObject){
			
			var propertyuri = uri.json2property(namespace, getUriPath());
			
			var parenturi = uri.json2class(namespace, getUriPath(-1));
			
			stringbuffer.append(
			'''
				<owl:ObjectProperty rdf:about="«propertyuri»">
				  <rdfs:domain rdf:resource="«parenturi»"/>
				  <rdfs:range rdf:resource="«classuri»"/>
				  <rdfs:label><![CDATA[«label»]]></rdfs:label>
				</owl:ObjectProperty>
			'''
			);
		}
		
		
		var list = jsonArray.toList;
		
		if(!list.isEmpty){
			
			
			doSwitch("[*]", list.get(0), label);	


		}
		else{
			var propertyuri = uri.json2property(namespace, getUriPath().toFirstLower+"_"+label);
			var listuri = uri.json2class(namespace, getUriPath().toFirstUpper);
			stringbuffer.append(
			'''
				<owl:ObjectProperty rdf:about="«propertyuri»">
				  <rdfs:domain rdf:resource="«listuri»"/>
				  <rdfs:label><![CDATA[«label»]]></rdfs:label>
				</owl:ObjectProperty>
			''');
		}

	}
	
	
	

	
	protected def String getActualType(String declaredType, String sample){
		
		if(sample.matches("^-?\\d+\\.\\d+$")){
			//1.1
			return "http://www.w3.org/2001/XMLSchema#double";
//			return "http://127.0.0.1/ontology/xsd.owl#double"
		}
		else if(sample.matches("^-?\\d+$")){
			//12
			return "http://www.w3.org/2001/XMLSchema#integer";
//			return "http://127.0.0.1/ontology/xsd.owl#integer"
		}
		else if(sample.matches("^\\d{4}-\\d{2}-\\d{2}$")){
			//2014-05-31
			return "http://www.w3.org/2001/XMLSchema#date";
//			return "http://127.0.0.1/ontology/xsd.owl#date"
		}
		else if(sample.matches("^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}$")){
			//2014-05-31T20:00
			return "http://www.w3.org/2001/XMLSchema#dateTime";
//			return "http://127.0.0.1/ontology/xsd.owl#dateTime"
		}
		else if(sample.matches("^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}$")){
			//2014-05-31T20:00:00
			return "http://www.w3.org/2001/XMLSchema#dateTime";
//			return "http://127.0.0.1/ontology/xsd.owl#dateTime"
		}
		else if(sample.matches("^(true|false)$")){
			//true
			return "http://www.w3.org/2001/XMLSchema#boolean";
//			return "http://127.0.0.1/ontology/xsd.owl#boolean"
		}
		else if(sample.matches("^(yes|no)$")){
			//true
			return "http://www.w3.org/2001/XMLSchema#boolean";
//			return "http://127.0.0.1/ontology/xsd.owl#boolean"
		}
		else if(sample.matches("^http.*")){
			//http...
			return "http://www.w3.org/2001/XMLSchema#anyURI";
//			return "http://127.0.0.1/ontology/xsd.owl#anyURI"
		}
		else{
			return declaredType;
		}
	}
	
	protected def getType(JsonPrimitive jsonPrimitive){
		if(jsonPrimitive.isBoolean){
			return "http://www.w3.org/2001/XMLSchema#boolean";
//			return "http://127.0.0.1/ontology/xsd.owl#boolean"	
		}
		else if(jsonPrimitive.isNumber){
			
			if(jsonPrimitive.asString.contains(".")){
				return "http://www.w3.org/2001/XMLSchema#double";
//				return "http://127.0.0.1/ontology/xsd.owl#double"				
			}
			else{
				
				return "http://www.w3.org/2001/XMLSchema#integer";
//				return "http://127.0.0.1/ontology/xsd.owl#integer"
			}
			
		}
		else if(jsonPrimitive.isString){
			return "http://www.w3.org/2001/XMLSchema#string";
//			return "http://127.0.0.1/ontology/xsd.owl#string"
		}
	}
	
	protected def handleJsonNull(String name){
		
		var propertyname = id.caseProperty(name);
		var propertyuri = uri.json2property(namespace, uriPath.toFirstLower);
		
		var jsonpath = getJsonPath();

		
		//TODO catch if conceptNames.size-2 < 0
		//var parenturi = uri.json2class(namespace, conceptNames.get(conceptNames.size-2));
		var parenturi = uri.json2class(namespace, getUriPath(-1));
		
		stringbuffer.append(
		'''
			<owl:ObjectProperty rdf:about="«propertyuri»">
			  <rdfs:domain rdf:resource="«parenturi»"/>
			  <rdfs:label><![CDATA[«propertyname»]]></rdfs:label>
			</owl:ObjectProperty>
		'''
		);
	}
	
	protected def handleJsonPrimitive(String name, JsonPrimitive jsonPrimitive){

//		var propertyuri = namespace + "p/" + path;
		//var propertyuri = uri.json2property(namespace, propertyname);
		var propertyuri = uri.json2property(namespace, uriPath.toFirstLower);
		
		var jsonpath = getJsonPath();

		
		var type = getType(jsonPrimitive);
		
		var actualtype = getActualType(type, jsonPrimitive.asString);
		
		
		//TODO catch if conceptNames.size-2 < 0
		//var parenturi = uri.json2class(namespace, conceptNames.get(conceptNames.size-2));
		var parenturi = uri.json2class(namespace, getUriPath(-1));
		
		
		stringbuffer.append(
		'''
			<owl:DatatypeProperty rdf:about="«propertyuri»">
			  <rdfs:domain rdf:resource="«parenturi»"/>
			  <j.0:actualtype rdf:resource="«actualtype»"/>
			  <j.0:jsonpath><![CDATA[«jsonpath»]]></j.0:jsonpath>
			  <rdfs:range rdf:resource="«type»"/>
			  <rdfs:label><![CDATA[«name»]]></rdfs:label>
			</owl:DatatypeProperty>
		'''
		);
	}
	
	
	protected def String getJsonPath(){
		return getJsonPath(0, ".");
	}
	
	protected def String getJsonPath(int end){
		return getJsonPath(end, ".");
	}
	
	protected def String getJsonPath(String separator){
		return getJsonPath(0, separator);
	}
	
	
	protected def String getJsonPath(int end, String separator){
		
		
		var end2 = end;
		if(end2>0){
			end2 = 0;
		}
		
		var iter = jsonPath.iterator;
		
		var s = new StringBuffer();
		var index = 0;
		
		while(iter.hasNext && index<jsonPath.length+end2){
			
			var next = iter.next;
			s.append(next);
			
			if(iter.hasNext && index+1<jsonPath.length+end2){
				s.append(separator);
			}
			index++;
		}
		
		return s.toString;
		
	}
	
	protected def String getUriPath(){
		return getUriPath(0, "_");	
	}
	
	protected def String getUriPath(int end){
		return getUriPath(end, "_");	
	}
	
	protected def String getUriPath(int end, String separator){
		
		
		var end2 = end;
		if(end2>0){
			end2 = 0;
		}
		
		var iter = conceptNames.iterator;
		
		var s = new StringBuffer();
		var index = 0;
		
		while(iter.hasNext && index<conceptNames.length+end2){
			
			var next = iter.next;
			s.append(next);
			
			if(iter.hasNext && index+1<conceptNames.length+end2){
				s.append(separator);
			}
			index++;
		}
		
		return s.toString;
		
	}

}
