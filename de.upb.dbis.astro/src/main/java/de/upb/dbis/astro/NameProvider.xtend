package de.upb.dbis.astro

import org.apache.jena.rdf.model.Resource
import org.apache.jena.ontology.OntResource
import java.util.Set
import java.util.HashSet
import org.apache.jena.rdf.model.Statement
import org.apache.jena.vocabulary.RDFS
import org.apache.jena.rdf.model.RDFNode

class NameProvider {
	
	public static def Set<String> normalize(Set<String> id){
		
		var result = new HashSet<String>();
		for(String s:id){
			
			result.add(normalize(s));
		}
		return result;
	}
	
	
	public static def String normalize(String id){
		
		var newid = id;
		
		newid = newid.trim();
//		newid = newid.replaceAll("\\d", "");
//		newid = newid.replace(" ", "_");
//		newid = newid.replace(".", "_");
//		newid = newid.replace("-", "_");
//		newid = newid.replace(":", "_");
//		newid = newid.replace("(", "_");
//		newid = newid.replace("(", "_");
		newid = newid.replaceAll("([A-Z]+)([A-Z])([a-z])", "$1_$2$3");
		newid = newid.replaceAll("([a-z]+)([A-Z])", "$1_$2");
		newid = newid.replaceAll("([^a-zA-Z]+)", "_");
		newid = newid.replaceAll("_+", "_");
		newid = newid.toLowerCase;
		
		return newid;
		
	}
	
	
	public static def String getLabel(Resource r){
		
		var result = "";
		
		if(r!=null && !r.isAnon){
			
			result = OWLUtil.getLiteral(r.model, r, RDFS.label);
			
			if(result.empty && r.localName!=null){
				result = r.localName;
			}
		}
		

		return result;
	}
	
	public static def String getNormalizedLabel(Resource r){
		return normalize(getLabel(r));
	}
	
	public static def Set<String> getNormalizedTokens(String label){
		
		var normalizedLabel = normalize(label);
		
		var result = new HashSet<String>();
		if(!normalizedLabel.isEmpty){
			result.addAll(normalizedLabel.split("_"));
		}
		
		
		return result;
	}
	
	public static def Set<String> getNormalizedTokens(Resource r){
		var label = getLabel(r);
		var normalizedLabel = normalize(label);
		
		var result = new HashSet<String>();
		if(!normalizedLabel.isEmpty){
			result.addAll(normalizedLabel.split("_"));
		}
		
		return result;
	}
	
}