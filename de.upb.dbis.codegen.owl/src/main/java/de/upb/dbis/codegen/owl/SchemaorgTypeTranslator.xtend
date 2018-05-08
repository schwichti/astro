package de.upb.dbis.codegen.owl

import java.util.Set
import org.apache.jena.rdf.model.Resource

class SchemaorgTypeTranslator {
	
	public static SchemaorgTypeTranslator INSTANCE = new SchemaorgTypeTranslator();
	
	public final static Set<String> DATATYPES = #{
	"http://schema.org/Boolean",
	"http://schema.org/Date",
	"http://schema.org/DateTime",
	"http://schema.org/Number",
	"http://schema.org/Float",
	"http://schema.org/Integer",
	"http://schema.org/Text",
	"http://schema.org/URL",
	"http://schema.org/Time"
	};
	
	def isDatatype(Resource r){
		return isDatatype(r.getURI);
	}
	
	def isDatatype(String id_){
		
		return DATATYPES.contains(id_);
	}
	

	
	def translateType(Resource r){
		switch(r.getURI){
			case "http://schema.org/Boolean": return "Boolean"
			case "http://schema.org/Date": return "java.util.Date"
			case "http://schema.org/DateTime": return "java.util.Date"
			case "http://schema.org/Number": return "Float"
			case "http://schema.org/Float": return "Float"
			case "http://schema.org/Integer": return "Integer"
			case "http://schema.org/Text": return "String"
			case "http://schema.org/URL": return "String"
			case "http://schema.org/Time": return "java.util.Date"
			default: return r.localName
			
		}
	}
	
	
	def defaultValue(String uri){
		switch(uri){
			case "http://schema.org/Boolean": return "false"
			case "http://schema.org/Date": return "null"
			case "http://schema.org/DateTime": return "null"
			case "http://schema.org/Number": return "0.0"
			case "http://schema.org/Float": return "0.0"
			case "http://schema.org/Integer": return "0"
			case "http://schema.org/Text": return '''""''' 
			case "http://schema.org/URL": return '''""'''
			case "http://schema.org/Time": return "null"
			default: return "null"
			
		}
	}
}
