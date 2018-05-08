package de.upb.dbis.codegen.owl

import io.swagger.codegen.SwaggerCodegen
import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.ontology.OntModelSpec
import de.upb.dbis.astro.alignment.csv.CSVLoader
import java.io.File
import io.swagger.parser.SwaggerParser
import de.upb.dbis.commons.FileWriter

class Generator {
	def static void main(String[] args) {
		
		if(args.length==5){
			
			var swagger_json = args.get(0);
			var output_directory = args.get(1);
			var global_ontology_owl = args.get(2);
			var alignment_csv = args.get(3);
			var htdocs_directory = args.get(4);
			
			var swagger_arguments = '''generate -i «swagger_json» -l java -o «output_directory»''';
			SwaggerCodegen.main(swagger_arguments.split(" "));
			
			var schemaorg = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
			schemaorg.read(global_ontology_owl);
			
			var csvloader = new CSVLoader(new File(alignment_csv), schemaorg);
			csvloader.init;
			var grounding = csvloader.load();
			
    		val parser = new SwaggerParser(); 
        	val swagger = parser.read(swagger_json); 
			
			var fileWriter = new FileWriter(output_directory+"/");
			
			
			var contents = new OwlsAdapterGenerator().x(htdocs_directory, grounding, swagger);

			fileWriter.write("Adapter.java", contents);
			
			

		}
		else{
			System.out.println('''Usage: <swagger json> <output directory> <global ontology owl> <alignment csv> <htdocs directory>''');
			
		}
		
		
	}
}