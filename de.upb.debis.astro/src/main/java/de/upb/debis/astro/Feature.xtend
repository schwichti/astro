package de.upb.debis.astro

import org.apache.jena.rdf.model.Resource
import java.util.Map

interface Feature {
	
	
	public def double sigma(Resource resource, Resource subject, Resource predicate, Resource object, Map<String, Object> attributes);
	
}