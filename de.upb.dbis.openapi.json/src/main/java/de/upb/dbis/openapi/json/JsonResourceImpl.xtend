package de.upb.dbis.openapi.json

import com.google.gson.JsonObject
import de.upb.dbis.openapi.model.Swagger
import de.upb.dbis.openapi.model.OpenapiFactory
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import java.io.InputStream
import java.io.IOException
import java.util.Map
import org.eclipse.emf.common.util.URI
import com.google.gson.JsonParser
import java.io.InputStreamReader
import com.google.gson.stream.JsonReader

class JsonResourceImpl extends ResourceImpl{
	
	private JsonObject root;
	private Swagger swagger;
	
	new(URI uri) {
		super(uri);
	}
	
	override doLoad(InputStream inputStream, Map<?, ?> options) throws IOException
	{
		var reader = new JsonReader(new InputStreamReader(inputStream));
		root = new JsonParser().parse(reader).asJsonObject;
		
		swagger = OpenapiFactory.eINSTANCE.createSwagger;
		
		
		swagger.swagger = root.get("swagger")?.asString;
		
		var info = OpenapiFactory.eINSTANCE.createInfo;
		info.version = root.get("info")?.asJsonObject?.get("version")?.asString;
		info.title =  root.get("info")?.asJsonObject?.get("title")?.asString;
		info.description = root.get("info")?.asJsonObject?.get("description")?.asString;
		
		//license
			
		swagger.info = info;
		
		swagger.host = root.get("host")?.asString;
		swagger.basePath = root.get("basePath")?.asString;
		
		//securityDefinitions
		
		//definitions
		
		//schemes
		//consumes
		//produces
		
		var paths = OpenapiFactory.eINSTANCE.createPaths;
		
		for(String endpoint : root.get("paths")?.asJsonObject?.keySet){
						
			var pathitem = OpenapiFactory.eINSTANCE.createPathItem;
			pathitem.patternProperty = endpoint;
			
			for(String httpmethod : root.get("paths").asJsonObject?.get(endpoint)?.asJsonObject?.keySet){
				
				var operation = OpenapiFactory.eINSTANCE.createOperation;
				operation.description = root.get("paths").asJsonObject?.get(endpoint)?.asJsonObject?.get(httpmethod)?.asJsonObject?.get("description").asString;
				operation.summary = root.get("paths").asJsonObject?.get(endpoint)?.asJsonObject?.get(httpmethod)?.asJsonObject?.get("summary").asString;
				operation.operationId = root.get("paths").asJsonObject?.get(endpoint)?.asJsonObject?.get(httpmethod)?.asJsonObject?.get("operationId").asString;
				
				for(var iter= root.get("paths").asJsonObject?.get(endpoint)?.asJsonObject?.get(httpmethod)?.asJsonObject?.get("parameters")?.asJsonArray?.iterator; iter.hasNext;){
					
					var next = iter.next.asJsonObject;

					switch(next.get("in").asString){
						
						case "header":{
							var parameter = OpenapiFactory.eINSTANCE.createHeaderParameterSubSchema;
							parameter.name = next.get("name")?.asString;
							parameter.in = next.get("in")?.asString;
							parameter.required = next.get("required").asBoolean;
							//parameter.de = next.get("required").asBoolean;
							parameter.type = next.get("type")?.asString;
							parameter.description = next.get("description")?.asString;
							operation.headerParameterSubSchema.add(parameter);	
						}
						case "path":{
							var parameter = OpenapiFactory.eINSTANCE.createPathParameterSubSchema;
							parameter.name = next.get("name")?.asString;
							parameter.in = next.get("in")?.asString;
							parameter.required = next.get("required").asBoolean;
							//parameter.de = next.get("required").asBoolean;
							parameter.type = next.get("type")?.asString;
							parameter.description = next.get("description")?.asString;
							operation.pathParameterSubSchema.add(parameter);
							
						}
						case "query":{
							var parameter = OpenapiFactory.eINSTANCE.createQueryParameterSubSchema;
							parameter.name = next.get("name")?.asString;
							parameter.in = next.get("in")?.asString;
							parameter.required = next.get("required").asBoolean;
							//parameter.de = next.get("required").asBoolean;
							parameter.type = next.get("type")?.asString;
							parameter.description = next.get("description")?.asString;
							operation.queryParameterSubSchema.add(parameter);							
							
						}
						case "body":{
							var parameter = OpenapiFactory.eINSTANCE.createBodyParameter;
							parameter.name = next.get("name")?.asString;
							parameter.in = next.get("in")?.asString;
							parameter.required = next.get("required").asBoolean;
							//parameter.de = next.get("required").asBoolean;
							parameter.description = next.get("description")?.asString;
							operation.bodyParameter.add(parameter);		
						}
					}					
					
				}
				
				var responses = OpenapiFactory.eINSTANCE.createResponses;
				
				
				for(String responsecode: root.get("paths").asJsonObject?.get(endpoint)?.asJsonObject?.get(httpmethod)?.asJsonObject?.get("responses")?.asJsonObject?.keySet){
					
					var item = root.get("paths").asJsonObject?.get(endpoint)?.asJsonObject?.get(httpmethod)?.asJsonObject?.get("responses")?.asJsonObject?.get(responsecode)?.asJsonObject;
					
					var responseValue = OpenapiFactory.eINSTANCE.createResponseValue;
					responseValue.patternProperty = responsecode;
					
					var response = OpenapiFactory.eINSTANCE.createResponse;
					response.description = item.get("description")?.asString;
					
					var examples = OpenapiFactory.eINSTANCE.createExamples;
					examples.body = item.get("examples")?.asJsonObject?.get("application/json")?.toString;
					
					response.examples = examples;
					
					
					responseValue.response = response;
					responses.responseValue.add(responseValue);
				}
				
				operation.responses = responses;	
				
				switch(httpmethod){
					case "get":	pathitem.get = operation
					case "put": pathitem.put = operation
					case "post": pathitem.post = operation
					case "delete": pathitem.delete = operation
				}
				
				paths.pathItem.add(pathitem);
			}
			
		}
		
		swagger.paths = paths;
		
		this.getContents.add(swagger);
		
	}
	
}