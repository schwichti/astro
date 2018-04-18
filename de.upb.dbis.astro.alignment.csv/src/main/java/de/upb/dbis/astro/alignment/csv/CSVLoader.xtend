package de.upb.dbis.astro.alignment.csv

import de.upb.dbis.commons.AbstractLineProcessor
import de.upb.dbis.astro.ReferenceAlignment
import java.io.File
import de.upb.dbis.astro.Triple
import org.apache.jena.rdf.model.Model

class CSVLoader extends AbstractLineProcessor{
	
	
	private ReferenceAlignment alignment = new ReferenceAlignment();
	private Model schemaorg;
	new(File file, Model schemaorg) {
		super(file)
		this.schemaorg = schemaorg;
	}
	
	public def ReferenceAlignment load(){
		
		return alignment;
		
	}
	
	override readLine(String line) {
		
		var parts = line.split(";");
		
		if(parts.size===4){
			
			var lefturi = parts.get(0);
			var subject = parts.get(1);
			var predicate = parts.get(2);
			var object = parts.get(3);
			
			var t = new Triple();
			t.subject = schemaorg.getResource("http://schema.org/"+subject);
			t.predicate = schemaorg.getResource("http://schema.org/"+predicate);
			t.object = schemaorg.getResource("http://schema.org/"+object);
			
			alignment.put(lefturi, t)
		}		
		
	}
	
	override finish() {
	}
	
	
}