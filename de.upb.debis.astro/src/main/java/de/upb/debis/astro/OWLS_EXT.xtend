package de.upb.debis.astro

import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.ontology.OntModel
import org.apache.jena.rdf.model.Property

class OWLS_EXT {
	
	private static OntModel MODEL = ModelFactory.createOntologyModel(); 
	public static Property ACTUAL_TYPE = MODEL.createProperty("http://is.upb.de/#actualtype");
	public static Property JSONPATH = MODEL.createProperty("http://is.upb.de/#jsonpath");
	public static Property SERVICE_DESCRIPTION = MODEL.createProperty("http://is.upb.de/#serviceDescription");
	public static Property PARAMETER_DESCRIPTION = MODEL.createProperty("http://is.upb.de/#parameterDescription");
	
	
}