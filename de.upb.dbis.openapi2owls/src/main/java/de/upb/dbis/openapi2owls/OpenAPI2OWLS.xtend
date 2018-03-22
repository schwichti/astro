package de.upb.dbis.openapi2owls

import java.util.HashSet
import java.util.Set
import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.ontology.OntModelSpec
import org.apache.jena.vocabulary.RDF
import org.apache.jena.vocabulary.OWL
import org.apache.jena.datatypes.xsd.XSDDatatype
import org.apache.jena.ontology.OntModel
import de.upb.dbis.openapi.model.PathParameterSubSchema
import de.upb.dbis.openapi.model.ResponseValue
import de.upb.dbis.openapi.model.HeaderParameterSubSchema
import de.upb.dbis.openapi.model.FormDataParameterSubSchema
import de.upb.dbis.openapi.model.Swagger
import de.upb.dbis.astro.ReferenceAlignment
import de.upb.dbis.openapi.model.Operation

class OpenAPI2OWLS {
	
	
	private Set<String> inputs;
	private Set<String> outputs;
	private Set<String> processes;
	
	private OntModel serviceModel;
	
	private ReferenceAlignment alignment = null;
	
	new(){
		alignment = new ReferenceAlignment();
	}
	
	public def setAlignment(ReferenceAlignment a){
		alignment = a;
	}
	
	public def OntModel createService(Swagger swagger, String host, Operation operation, String method){
		inputs = new HashSet<String>();
		outputs = new HashSet<String>();
		processes = new HashSet<String>();
		
		var uri = UriProvider.INSTANCE;
		
		
		var namespace = uri.namespaceService(host, operation.operationId, method);
		
		serviceModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		
		var ontology = serviceModel.createOntology(namespace);
		var service = serviceModel.createResource("http://www.daml.org/services/owl-s/1.1/Service.owl#Service");
		var service_instance = serviceModel.createResource(namespace+"#Service");
		var profile = serviceModel.createResource("http://www.daml.org/services/owl-s/1.1/Profile.owl#Profile");
		var profile_instance = serviceModel.createResource(namespace+"#Profile");
		var input = serviceModel.createResource("http://www.daml.org/services/owl-s/1.1/Process.owl#Input");
		var output = serviceModel.createResource("http://www.daml.org/services/owl-s/1.1/Process.owl#Output");
		var atomicprocess = serviceModel.createResource("http://www.daml.org/services/owl-s/1.1/Process.owl#AtomicProcess");
		
		
		
		var process_hasInput = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Process.owl#hasInput");
		var process_hasOutput = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Process.owl#hasOutput");
		var describes = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Service.owl#describes");
		var parameterType = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Process.owl#parameterType");
		
		var presents = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Service.owl#presents");
		var describedBy = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Service.owl#describedBy");
		var isPresentedBy = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Service.owl#isPresentedBy");
		var serviceName = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#serviceName");
		var textDescription = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#textDescription");
		var profile_hasOutput = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#hasOutput");
		var profile_hasInput = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#hasInput");
		var has_process = serviceModel.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#has_process");
		
		serviceModel.add(ontology, RDF.type, OWL.Ontology);
		serviceModel.add(ontology, OWL.imports, serviceModel.createResource("http://127.0.0.1/ontology/Service.owl"));
		serviceModel.add(ontology, OWL.imports, serviceModel.createResource("http://127.0.0.1/ontology/Process.owl"));
		serviceModel.add(ontology, OWL.imports, serviceModel.createResource("http://127.0.0.1/ontology/Profile.owl"));
		//serviceModel.add(ontology, OWL.imports, serviceModel.createResource("http://127.0.0.1/ontology/Grounding.owl"));
		serviceModel.add(ontology, OWL.imports, serviceModel.createResource("http://127.0.0.1/ontology/xsd.owl"));

		if(alignment!==null){
			
			serviceModel.add(ontology, OWL.imports, serviceModel.createResource("http://127.0.0.1/ontology/schema.owl"));
		}		
		
		serviceModel.add(ontology, OWL.imports, serviceModel.createResource(uri.namespaceDomain(host, operation.operationId, method)));
		
		
		serviceModel.add(service_instance, RDF.type, service);
		serviceModel.add(service_instance, serviceName, operation.operationId);
		
		var txt = "";
		if(operation.description!==null){
			txt = operation.description;
		}
		
		serviceModel.add(service_instance, textDescription, txt);
		serviceModel.add(service_instance, presents, profile_instance);
		serviceModel.add(profile_instance, isPresentedBy, service_instance);
		serviceModel.add(profile_instance, RDF.type, profile);
		
		if(operation!==null){
			var atomic_process_uri = uri.namespaceService(host, operation.operationId, method, operation.operationId);
			var atomicprocess_instance = serviceModel.createResource(atomic_process_uri);
			
			serviceModel.add(atomicprocess_instance, RDF.type, atomicprocess);
			serviceModel.add(atomicprocess_instance, describes, service_instance);
			serviceModel.add(service_instance, describedBy, atomicprocess_instance);
			serviceModel.add(profile_instance, has_process, atomicprocess_instance); 
			
			
			for(PathParameterSubSchema parameter : operation.pathParameterSubSchema){
				
				var input_uri = uri.namespaceService(host, operation.operationId, method, parameter.name);
				var input_instance = serviceModel.createResource(input_uri);
				serviceModel.add(input_instance, RDF.type, input);
				var datatype = serviceModel.createTypedLiteral(getType(parameter.type, parameter.format), XSDDatatype.XSDanyURI);
				
				
				serviceModel.add(input_instance, parameterType, datatype);
				serviceModel.add(atomicprocess_instance, process_hasInput, input_instance);
				serviceModel.add(profile_instance, profile_hasInput, input_instance); 
				
			}
			if(operation.responses!==null){
				for(ResponseValue responveValue : operation.responses.responseValue){
					var output_uri = uri.namespaceService(host, operation.operationId, method, "Response")
					var output_instance = serviceModel.createResource(output_uri);
					serviceModel.add(output_instance, RDF.type, output);
					serviceModel.add(atomicprocess_instance, process_hasOutput, output_instance);
					serviceModel.add(profile_instance, profile_hasOutput, output_instance); 
				}
			}
		}
		
		return serviceModel;
		
	}
	
	
	public def run(Swagger swagger, String host, Operation operation, String method){
		var uri = UriProvider.INSTANCE;
		
		var namespace = uri.namespaceService(host, operation.operationId, method);
		
		//TODO add swagger.info.description under custom property
		
		inputs = new HashSet<String>();
		outputs = new HashSet<String>();
		processes = new HashSet<String>();
		
		//var info = '''"«service_uri»";«spec.info.title»'''
		
		
		
		
		
		return 
		'''
							<?xml version="1.0" encoding="UTF-8"?>
							<rdf:RDF  xmlns:owl       = "http://www.w3.org/2002/07/owl#"
							xmlns:rdfs      = "http://www.w3.org/2000/01/rdf-schema#"
							xmlns:rdf       = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
							xmlns:service   = "http://www.daml.org/services/owl-s/1.1/Service.owl#"
							xmlns:process   = "http://www.daml.org/services/owl-s/1.1/Process.owl#"
							xmlns:profile   = "http://www.daml.org/services/owl-s/1.1/Profile.owl#"
							xmlns:grounding = "http://www.daml.org/services/owl-s/1.1/Grounding.owl#"
							xmlns:j.0		= "http://is.upb.de/#"
							xml:base        = "«namespace»">
								<owl:Ontology rdf:about="">
									<owl:imports rdf:resource="http://127.0.0.1/ontology/Service.owl" />
									  	<owl:imports rdf:resource="http://127.0.0.1/ontology/Process.owl" />
									  	<owl:imports rdf:resource="http://127.0.0.1/ontology/Profile.owl" />
									<owl:imports rdf:resource="http://127.0.0.1/ontology/Grounding.owl" />
									  	<owl:imports rdf:resource="http://127.0.0.1/ontology/xsd.owl" />
									  	<owl:imports rdf:resource="«uri.namespaceDomain(host, operation.operationId, method)»" />
									  	«IF alignment !== null && !alignment.isEmpty»
									  		<owl:imports rdf:resource="http://127.0.0.1/ontology/schema.owl" />
									  	«ENDIF»
										</owl:Ontology>
							
								«handleOperation(operation, method, host)»
								<service:Service rdf:ID="Service">
									<service:presents rdf:resource="#Profile"/>
									<service:describedBy rdf:resource="#«operation.operationId»"/>
								</service:Service>
								<profile:Profile rdf:ID="Profile">
									<service:isPresentedBy rdf:resource="#Service"/>
									<profile:serviceName xml:lang="en">«operation.operationId»</profile:serviceName>
									<j.0:serviceDescription xml:lang="en"><![CDATA[«swagger.info.description»]]></j.0:serviceDescription>
									<profile:textDescription xml:lang="en"><![CDATA[«operation.description»]]></profile:textDescription>
								«FOR String output:outputs»
									<profile:hasOutput rdf:resource="«output.replace(namespace, "")»"/>
								«ENDFOR»
								«FOR String input:inputs»
									<profile:hasInput rdf:resource="«input.replace(namespace,"")»"/>
								«ENDFOR»
								«FOR String process:processes»
									<profile:has_process rdf:resource="«process.replace(namespace,"")»" />
								«ENDFOR»		    
								</profile:Profile>
								</rdf:RDF>
						'''	
	}
	
	
	
	private def String handleParameter(Operation op, String httpmethod, String host, String parametername, String parametertype, String parameterformat, String parameterdescription){
		
		
		
		var uri = UriProvider.INSTANCE;
		var namespace = uri.namespaceService(host, op.operationId, httpmethod);
		
		return
		'''
							«var input_uri = uri.namespaceService(host, op.operationId, httpmethod, parametername)»
							«{inputs.add(input_uri); ""}»
							<process:Input rdf:ID="«input_uri.replace(namespace+"#","")»">
							<j.0:parameterDescription><![CDATA[«parameterdescription»]]></j.0:parameterDescription>
							«IF alignment.containsKey(input_uri) && alignment.get(input_uri)!==null»
								<process:parameterType rdf:datatype="http://www.w3.org/2001/XMLSchema#anyURI">«alignment.get(input_uri).subject.getURI.replace("http://schema.org/", "http://127.0.0.1/ontology/schema.owl#")»</process:parameterType>
							«ELSE»
								<process:parameterType rdf:datatype="http://www.w3.org/2001/XMLSchema#anyURI">«getType(parametertype, parameterformat)»</process:parameterType>
							«ENDIF»
							<rdfs:label></rdfs:label>
							</process:Input>
						'''
		
	}


	
	protected def String handleOperation(Operation op, String httpmethod, String host){
		if(op===null){
			return "";
		}
		
		//TODO body parameter are not supported yet

		var uri = UriProvider.INSTANCE;
		var namespace = uri.namespaceService(host, op.operationId, httpmethod);
		var atomic_process_uri = uri.namespaceService(host, op.operationId, httpmethod, op.operationId);
		
		processes.add(atomic_process_uri);
		
		return 
		'''
							  <process:AtomicProcess rdf:ID="«atomic_process_uri.replace(namespace+"#","")»">
							  <service:describes rdf:resource="#Service"/>
								«FOR PathParameterSubSchema parameter : op.pathParameterSubSchema»
									«var input_uri = uri.namespaceService(host, op.operationId, httpmethod, parameter.name)»
									<process:hasInput rdf:resource="«input_uri.replace(namespace, "")»"/>
								«ENDFOR»
								«IF op.responses!==null»
									«FOR ResponseValue responveValue : op.responses.responseValue»
										«var output_uri = '''#Response'''»
										<process:hasOutput rdf:resource="«output_uri»"/>
									«ENDFOR»
								«ENDIF»
								</process:AtomicProcess>
							«FOR PathParameterSubSchema parameter : op.pathParameterSubSchema»
								«handleParameter(op, httpmethod, host, parameter.name, parameter.type, parameter.format, parameter.description)»
							«ENDFOR»
							«FOR FormDataParameterSubSchema parameter : op.formDataParameterSubSchema»
								«handleParameter(op,httpmethod, host, parameter.name, parameter.type, parameter.format, parameter.description)»
							«ENDFOR»
							«FOR HeaderParameterSubSchema parameter: op.headerParameterSubSchema»
								«handleParameter(op,httpmethod, host, parameter.name, parameter.type, parameter.format, parameter.description)»
							«ENDFOR»
							«IF op.responses!==null»
								«FOR ResponseValue responveValue : op.responses.responseValue»
									«var output_uri = uri.namespaceService(host, op.operationId, httpmethod, "Response")»
									«{outputs.add(output_uri); ""}»
									<process:Output rdf:ID="«output_uri.replace(namespace+"#","")»">
									«IF alignment.containsKey(output_uri) && alignment.get(output_uri)!==null»
										<process:parameterType rdf:datatype="http://www.w3.org/2001/XMLSchema#anyURI">«alignment.get(output_uri).subject.getURI.replace("http://schema.org/", "http://127.0.0.1/ontology/schema.owl#")»</process:parameterType>
									«ELSE»
										<process:parameterType rdf:datatype="http://www.w3.org/2001/XMLSchema#anyURI">«uri.domainRoot(host, op.operationId, httpmethod)»</process:parameterType>
									«ENDIF»
									<rdfs:label></rdfs:label>
									</process:Output>
								«ENDFOR»
							«ENDIF»
						'''
	}
	
	
	protected def getType(String type, String format){
		
		if(type.equals("integer")){
			if(format!==null && !format.empty){
				if(format.equals("int32")){
					return "http://127.0.0.1/ontology/xsd.owl#integer"
				}
				else if(format.equals("int64")){
					return "http://127.0.0.1/ontology/xsd.owl#integer";
				}	
			}
			else{
				return "http://127.0.0.1/ontology/xsd.owl#integer";
			}
		}
		else if(type.equals("number")){
			if(format!==null && !format.empty){
				if(format.equals("float")){
					return "http://127.0.0.1/ontology/xsd.owl#float";
				}
				else if(format.equals("double")){
					return "http://127.0.0.1/ontology/xsd.owl#double";
				}
			}
			else{
				"http://127.0.0.1/ontology/xsd.owl#decimal";
			}
		}
		else if(type.equals("string")){
			
			if(format!==null && !format.empty){
				if(format.equals("byte")){
					return "http://127.0.0.1/ontology/xsd.owl#byte";
				}
				else if(format.equals("binary")){
					return "http://127.0.0.1/ontology/xsd.owl#base64Binary";
				}
				else if(format.equals("date")){
					return "http://127.0.0.1/ontology/xsd.owl#date";
				}
				else if(format.equals("date-time")){
					return "http://127.0.0.1/ontology/xsd.owl#dateTime";
				}
				else if(format.equals("password")){
					return "http://127.0.0.1/ontology/xsd.owl#string";
				}
			}
			else{
				return "http://127.0.0.1/ontology/xsd.owl#string";
			}
		}
		else if(type.equals("boolean")){
			return "http://127.0.0.1/ontology/xsd.owl#boolean";
		}
	}
	


}
				