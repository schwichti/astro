package de.upb.debis.openapi2owls

import de.upb.debis.openapi.model.Operation
import de.upb.debis.openapi.model.PathItem
import de.upb.debis.openapi.model.ResponseValue
import de.upb.debis.openapi.model.Swagger
import de.upb.debis.openapi.model.impl.OpenapiPackageImpl
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.nio.charset.Charset
import java.util.ArrayList
import java.util.List
import org.apache.jena.ontology.OntModelSpec
import org.apache.jena.rdf.model.ModelFactory
import de.upb.debis.astro.ui.MySQLAlignmentLoader
import de.upb.debis.json2owl.Json2Owl

class Transformation {
	
	private File sourceFolder;
	private File targetFolder;
	private File targetFolder2;
	
	private List<File> sourceFiles;
	
	private OpenAPI2OWLS openapi2owls = new OpenAPI2OWLS();
	
	private String sourcePath = "";
	private String targetPath = "";
	private String schemaorgFile = "";
	
	public static def void main(String[] args){
		var transformation = new Transformation();
		
		if(args.length==2){
			transformation.sourcePath = args.get(0);
			transformation.targetPath = args.get(1);
			
			transformation.configureUnnormalized.main;
		}
		else if(args.length==3){
			transformation.sourcePath = args.get(0);
			transformation.targetPath = args.get(1);
			transformation.schemaorgFile = args.get(3);
			
			transformation.configureNormalized.main;
		}
		else{
			System.out.println("Usage: <openapi source folder> <target folder> (<path to global ontology>)?");
		}
		
		
	}
	
	private def configureUnnormalized(){
		targetFolder = new File(targetPath+"/htdocs/services");
		targetFolder2 = new File(targetPath+"/htdocs/ontology");
		sourceFiles = new ArrayList<File>(sourceFolder.listFiles);
		
		return this;
	}
	
	private def configureNormalized(){
		targetFolder = new File(targetPath+"/htdocs/services");
		targetFolder2 = new File(targetPath+"/htdocs/ontology");
		
		var schemaorg = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		schemaorg.read(schemaorgFile);
		
		var alignment = MySQLAlignmentLoader.getReferenceAlignment(schemaorg);
		openapi2owls.alignment =  (alignment);

		sourceFiles = new ArrayList<File>(sourceFolder.listFiles);
		
		return this;
		
	}
	
	
	public def void main(){
		
		OpenapiPackageImpl.init();
		
		var xmiutil = new XmiUtil();
		
		for (File fileEntry : sourceFiles) {
			
	        if (fileEntry.file && fileEntry.name.endsWith("xmi")) {
	        	
	            //TODO register resource
	            var contents = xmiutil.load(fileEntry);
	            
	            var spec = contents.get(0) as Swagger;
	            
	            if(spec.paths!==null){
	            	
		            for(PathItem path : spec.paths.pathItem){
		            	
		            	handleOperation2(spec, path.get, "get", spec.host);
		            	handleOperation2(spec, path.post, "post", spec.host);
		            	handleOperation2(spec, path.put, "put", spec.host);
		            	handleOperation2(spec, path.delete, "delete", spec.host);
		            	handleOperation2(spec, path.patch, "patch", spec.host);
		            	
		            	handleOperation(path.get, "get", spec.host);
		            	handleOperation(path.post, "post", spec.host);
		            	handleOperation(path.put, "put", spec.host);
		            	handleOperation(path.delete, "delete", spec.host);
		            	handleOperation(path.patch, "patch", spec.host);
		            	
		            }
	            }
	            else{
	            	System.out.println("no paths in "+fileEntry.absolutePath);
	            }

	        } 

	    }
	    
	    //JsonStatistics.print();
	}
	
	private def handleOperation2(Swagger swagger, Operation op, String httpmethod, String host){
		if(op===null){
			return;
		}
		
		var filename = UriProvider.INSTANCE.namespaceService(host, op.operationId, httpmethod).replace("http://127.0.0.1/services/","")
		var service_triples = openapi2owls.run(swagger, host, op, httpmethod);
	    var service_ontology = targetFolder.path + "/"+filename;
	    write(service_ontology, service_triples);
	}
	
	
	private def handleOperation(Operation op, String httpmethod, String host){
    	
    	if(op===null){ 
    		
    		return;
    	}
    	var filename = UriProvider.INSTANCE.namespaceDomain(host, op.operationId, httpmethod).replace("http://127.0.0.1/ontology/","")
    	var namespace = UriProvider.INSTANCE.namespaceDomain(host, op.operationId, httpmethod);
		var domain_triples = new Json2Owl().run(namespace, op.operationId, "{}", host, httpmethod);
	    var domain_ontology = targetFolder2.path + "/"+filename;
    	
    	if(op.responses!==null){
    		
	    	for(ResponseValue responseValue:op.responses.responseValue){
	    		
				if(responseValue.response!==null && responseValue.response.examples!==null && !responseValue.response.examples.body.nullOrEmpty){
					
	            	var json = responseValue.response.examples.body;
	            	
	            	domain_triples = new Json2Owl().run(namespace, op.operationId, json, host, httpmethod);
	            	
				}
	    	}
    	
    	}
    	
    	if(op.responses===null || op.responses.responseValue.size==0){
    		System.out.println('''WARNING: «namespace» has no responses!''');
    	}
    	else if(op.responses.responseValue.size>1){
    		System.out.println('''WARNING: «namespace» has more than one response!''');
    	}
    	
    	write(domain_ontology, domain_triples);
	}
	
	private def write(String filename, String contents){
		try {
			val char_output = new OutputStreamWriter(
				     new FileOutputStream(filename),
				     Charset.forName("UTF-8").newEncoder() 
				 );
			
			char_output.write(contents);
			char_output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
				