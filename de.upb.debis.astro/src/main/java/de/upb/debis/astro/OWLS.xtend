package de.upb.debis.astro

import org.apache.jena.rdf.model.Resource
import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.ontology.OntModel
import org.apache.jena.rdf.model.Property

class OWLS {
	
	private static OntModel MODEL = ModelFactory.createOntologyModel(); 
	
	public static Resource SERVICE = MODEL.createResource("http://www.daml.org/services/owl-s/1.1/Service.owl#Service");
	public static Resource SERVICE_PROFILE = MODEL.createResource("http://www.daml.org/services/owl-s/1.1/Service.owl#ServiceProfile");
	public static Resource ATOMIC_PROCESS = MODEL.createResource("http://www.daml.org/services/owl-s/1.1/Process.owl#AtomicProcess");
	public static Resource INPUT = MODEL.createResource("http://www.daml.org/services/owl-s/1.1/Process.owl#Input");
	public static Resource OUTPUT = MODEL.createResource("http://www.daml.org/services/owl-s/1.1/Process.owl#Output");
	
	public static Property SERVICE_MODEL = MODEL.createProperty("http://www.daml.org/services/owl-s/1.1/Service.owl#ServiceModel");
	public static Property TEXT_DESCRIPTION = MODEL.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#textDescription");
	public static Property SERVICE_NAME = MODEL.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#serviceName");
	public static Property PRESENTS = MODEL.createProperty("http://www.daml.org/services/owl-s/1.1/Service.owl#presents");
	public static Property DESCRIBED_BY = MODEL.createProperty("http://www.daml.org/services/owl-s/1.1/Service.owl#describedBy");
	public static Property HAS_PROCESS = MODEL.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#has_process");
	public static Property HAS_INPUT = MODEL.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#hasInput");
	public static Property HAS_OUTPUT = MODEL.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#hasOutput");
	public static Property PARAMETER_TYPE = MODEL.createProperty("http://www.daml.org/services/owl-s/1.1/Process.owl#parameterType");
	
	
}