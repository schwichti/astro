package de.upb.dbis.codegen.owl

import org.apache.jena.rdf.model.Resource
import org.apache.jena.rdf.model.Model
import de.upb.dbis.openapi.model.Operation
import de.upb.dbis.astro.OWLUtil
import de.upb.dbis.astro.Triple
import de.upb.dbis.astro.OWLS
import de.upb.dbis.astro.ReferenceAlignment
import de.upb.dbis.astro.OWLS_EXT

class OwlsAdapterGenerator {
	
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
	
 	public def sig(Operation operation, Model servicemodel, Model domainmodel, ReferenceAlignment grounding){
		
		var output = OWLUtil.listInstances(servicemodel, OWLS.OUTPUT).iterator.next;
		//FIXME assure there is at most one output
		var output_parametertype = OWLUtil.getLiteral(servicemodel, output, OWLS.PARAMETER_TYPE)
		var inputs = OWLUtil.listInstances(servicemodel, OWLS.INPUT);
		var triple2 = null as Triple;
		var datatypeproperty = null;
		'''
			import org.schema;
			import com.jayway.jsonpath.JsonPath;
			import io.swagger.client.ApiException;
			import io.swagger.client.api.DefaultApi;
			
			public class OwlsAdapter{
				
				private DefaultApi openapi = new DefaultApi();
				
				public «output_parametertype» «operation.operationId» (
					«FOR Resource input : inputs SEPARATOR ', '»
						«OWLUtil.getLiteral(servicemodel, input, OWLS.PARAMETER_TYPE)» «input»
					«ENDFOR»){
					
					
					//lowering (OWLS to OpenAPI)
					«FOR param: operation.pathParameterSubSchema»
						«IF grounding.containsKey(param.name)»
							«var triple = grounding.get(param.name)»
							«convertType(param.type, param.format)» «param.name» = «triple.subject».get«triple.predicate.localName.toFirstUpper»();
						«ENDIF»
					«ENDFOR»
					String response = openapi.«operation.operationId»(«FOR param: operation.pathParameterSubSchema SEPARATOR ', '»«param.name»«ENDFOR»);
					
					//lifting (OpenAPI to OWLS)
					«output_parametertype» result = new «output_parametertype»();
					
					
					/*lefturi -> <Subject, Predicate, Object>*/
					«triple2.subject.localName» «triple2.subject.localName.toFirstLower» = new «triple2.subject.localName»();
					«triple2.subject.localName.toFirstLower».set«triple2.predicate»(JsonPath.parse(response).read(«OWLUtil.getLiteral(domainmodel, datatypeproperty, OWLS_EXT.JSONPATH)»", String.class));
					
					return result;
				}
			}
		'''
	}
}
