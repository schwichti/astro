package de.upb.debis.codegen.owl

import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.ontology.OntModelSpec

class Generator {
	def static void main(String[] args) {
		
		if(args.length==1){
			
			var sourcefile = args.get(0);
			var targetpath = args.get(1);
			
			var schemaorg = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
			schemaorg.read(sourcefile);
			
			new IDomainGenerator("I%s.java", targetpath).caseOntModel(schemaorg);
			new DomainGenerator("%s.java", targetpath).caseOntModel(schemaorg);
		}
		else{
			System.out.println('''Usage: <source owl file> <target directory>''');
			
		}
		
		
	}
}