package de.upb.dbis.codegen.owl

import org.apache.jena.rdf.model.Resource
import de.upb.dbis.astro.OWLUtil
import de.upb.dbis.astro.OWLS
import de.upb.dbis.astro.ReferenceAlignment
import de.upb.dbis.astro.OWLS_EXT
import org.apache.jena.vocabulary.OWL
import io.swagger.models.Swagger
import io.swagger.models.Operation
import java.io.File
import org.apache.jena.ontology.OntModelSpec
import org.apache.jena.rdf.model.ModelFactory
import io.swagger.models.parameters.QueryParameter
import io.swagger.models.parameters.PathParameter
import io.swagger.models.parameters.HeaderParameter
import java.util.HashSet
import de.upb.dbis.astro.Triple
import io.swagger.models.parameters.AbstractSerializableParameter
import java.util.HashMap

class OwlsAdapterGenerator {
	
	private static SchemaorgTypeTranslator schemaorg2java = new SchemaorgTypeTranslator();
	private HashSet<String> imports = new HashSet<String>();
	
	protected def xsd2java(Resource resource){
		
		return xsd2java(resource.URI);
		
		/*
		if(resource.localName.toLowerCase.equals("string")){
			
			return "String";
		}
		else if(resource.localName.toLowerCase.equals("integer")){
			return "Integer";
		}
		else if(resource.localName.toLowerCase.equals("double")){
			return "Double";
		}
		else if(resource.localName.toLowerCase.equals("boolean")){
			return "Boolean";
		}
		*/
	}
	
	protected def xsd2java(String uri){
		
		if(uri.toLowerCase.endsWith("string")){
			
			return "String";
		}
		else if(uri.toLowerCase.endsWith("integer")){
			return "Integer";
		}
		else if(uri.toLowerCase.endsWith("double")){
			return "Double";
		}
		else if(uri.toLowerCase.endsWith("boolean")){
			return "Boolean";
		}
	}	
	
	protected def convertType(String type, String format){
		if(type.equals("integer")){
			if(format!==null && !format.empty){
				if(format.equals("int32")){
					return "int"
				}
				else if(format.equals("int64")){
					return "int";
				}	
			}
			else{
				return "int";
			}
		}
		else if(type.equals("number")){
			if(format!==null && !format.empty){
				if(format.equals("float")){
					return "float";
				}
				else if(format.equals("double")){
					return "double";
				}
			}
			else{
				"double";
			}
		}
		else if(type.equals("string")){
			
			if(format!==null && !format.empty){
				if(format.equals("byte")){
					return "byte";
				}
				else if(format.equals("binary")){
					return "byte";
				}
				else if(format.equals("date")){
					return "java.util.Date";
				}
				else if(format.equals("date-time")){
					return "java.util.Date";
				}
				else if(format.equals("password")){
					return "String";
				}
			}
			else{
				return "String";
			}
		}
		else if(type.equals("boolean")){
			return "boolean";
		}
	}
	
	public def x(String htdocs_directory, ReferenceAlignment grounding, Swagger swagger){
		
		for(Triple triple : grounding.values){
			if(triple.subject!==null){
				
				imports.add(triple.subject.localName);
			}
			if(triple.object!==null){
				
				imports.add(triple.object.localName);
			}
			
		}
		
		return 
		'''
		package de.upb.dbis.astro;
		
		import org.schema;
		import com.jayway.jsonpath.JsonPath;
		import io.swagger.client.ApiException;
		import io.swagger.client.api.DefaultApi;
		
		«FOR String class_:imports»
		import org.schema.«class_»
		«ENDFOR»
		
		public class Adapter{
			
			private DefaultApi openapi = new DefaultApi();
			
			«FOR File file : new File(htdocs_directory+"/services/").listFiles»
				«sig(file.absolutePath, file.absolutePath.replace("\\services\\","/ontology/").replace(".owls",".owl"), grounding, swagger)»
			«ENDFOR»
		}
		'''
	}
	
	
	/**
	 * @see https://github.com/swagger-api/swagger-codegen-generators/blob/master/src/main/resources/v2/Java/libraries/jersey2/api.mustache
	 */
 	private def sig(String patha, String pathb, ReferenceAlignment grounding, Swagger swagger){
		
		var servicemodel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		servicemodel.read(patha);
		
		var domainmodel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		domainmodel.read(pathb);
		
		var atomic_process = OWLUtil.listInstances(servicemodel, OWLS.ATOMIC_PROCESS)?.get(0);
		var operation = null as Operation;
		
		for(String path : swagger?.paths?.keySet){
			
			for(Operation op : swagger?.paths?.get(path)?.operations){
				
				if(op.operationId.equals(atomic_process.localName)){
					operation = op;
				}
			}
		}
		
		var output = OWLUtil.listInstances(servicemodel, OWLS.OUTPUT).iterator.next;
		//FIXME assure there is at most one output
		//var output_parametertype = OWLUtil.getLiteral(servicemodel, output, OWLS.PARAMETER_TYPE);
		var output_type = grounding.get(output.URI)?.subject?.localName ?: "String";
		
		var inputs = OWLUtil.listInstances(servicemodel, OWLS.INPUT);
		var datatypeproperties = OWLUtil.listInstances(domainmodel, OWL.DatatypeProperty);
		var groundingByName = new HashMap<String, Triple>();
		
		var result = '''
				public «output_type» «atomic_process.localName»(
					«FOR Resource input : inputs SEPARATOR ', '»
						«IF grounding.containsKey(input.URI)»
							«grounding.get(input.URI)?.subject.localName» «input.localName»
							«{groundingByName.put(input.localName, grounding.get(input.URI)); ""}»
						«ELSE»
							«xsd2java(OWLUtil.getLiteral(servicemodel, input, OWLS.PARAMETER_TYPE))» «input.localName»
						«ENDIF»
					«ENDFOR») throws ApiException {
					
					//lowering (OWLS to OpenAPI)
					«FOR param: operation.parameters»
						«IF param instanceof AbstractSerializableParameter»
							«var param2 = param as AbstractSerializableParameter»
							«convertType(param2.type, param2.format)» «param.name»_ = «IF groundingByName.containsKey(param2.name)»«param.name».get«groundingByName.get(param2.name).predicate.localName.toFirstUpper»()«ELSEIF param2.required && param2.defaultValue!==null»«param2.defaultValue»«ELSEIF !param2.required»null«ELSE»null«ENDIF»;
						«ENDIF»
					«ENDFOR»
					
					String response = openapi.«operation.operationId»(«FOR param: operation.parameters SEPARATOR ', '»«param.name»_«ENDFOR»);

					//lifting (OpenAPI to OWLS)
					«output_type» result = new «output_type»();
					«FOR datatypeProperty: datatypeproperties»
						«var range = OWLUtil.listRange(datatypeProperty).get(0)»
						«var tripleX = grounding.get(datatypeProperty.URI)»
						«IF tripleX!==null»
							//Mapping: «datatypeProperty.URI» -> «tripleX»
							//TODO: assign «tripleX?.subject?.localName.toFirstLower» to a property of result
							«tripleX.subject.localName» «tripleX.subject.localName.toFirstLower» = new «tripleX.subject.localName»();
							
							«IF isCompatible(tripleX.predicate, datatypeProperty)»
								«xsd2java(range)» «tripleX.predicate.localName» = JsonPath.parse(response).read("«OWLUtil.getLiteral(domainmodel, datatypeProperty, OWLS_EXT.JSONPATH)»", «xsd2java(range)».class);
								«tripleX.subject.localName.toFirstLower».set«tripleX.predicate.localName.toFirstUpper»(«tripleX.predicate.localName»);
							«ELSE»
								«tripleX.object.localName» «tripleX.object.localName.toFirstLower» = new «tripleX.object.localName»();
								//TODO: assign range to a property of «tripleX.object.localName.toFirstLower»
								«xsd2java(range)» range = JsonPath.parse(response).read("«OWLUtil.getLiteral(domainmodel, datatypeProperty, OWLS_EXT.JSONPATH)»", «xsd2java(range)».class);
								«tripleX.subject.localName.toFirstLower».set«tripleX.predicate.localName.toFirstUpper»(«tripleX.object.localName.toFirstLower»);
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					
					return result;
				}
			}
		'''
		
		return result.toString;
	}
	
	private def isCompatible(Resource property1, Resource property2){
		
		var range1 = OWLUtil.listRange(property1).map[Resource r| schemaorg2java.translateType(r)];
		var range2 = OWLUtil.listRange(property2).map[Resource r| xsd2java(r)];
		
		range1.retainAll(range2); 
		
		return !range1.isEmpty; 
	}
	
}
