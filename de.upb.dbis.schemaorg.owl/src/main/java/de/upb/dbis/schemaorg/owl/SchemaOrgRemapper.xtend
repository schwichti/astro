package de.upb.dbis.schemaorg.owl


import java.io.File
import java.util.Set


import org.apache.jena.ontology.OntModel
import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.ontology.OntModelSpec
import org.apache.jena.rdf.model.RDFNode
import org.apache.jena.rdf.model.Statement
import java.util.HashMap
import java.util.HashSet
import org.apache.jena.vocabulary.RDFS
import org.apache.jena.ontology.OntClass
import org.apache.jena.ontology.OntProperty
import org.apache.jena.vocabulary.OWL
import org.apache.jena.vocabulary.RDF
import de.upb.dbis.commons.AbstractLineProcessor
import de.upb.dbis.commons.FileWriter

/**
 * Changes maps the RDF concepts of the schema.org ontology to equivalent OWL concepts
 * 
 * <http://www.w3.org/2000/01/rdf-schema#Class> => <http://www.w3.org/2002/07/owl#Class>
 * <http://www.w3.org/1999/02/22-rdf-syntax-ns#Property> => <http://www.w3.org/2002/07/owl#ObjectProperty>
 * <http://schema.org/domainIncludes> => <http://www.w3.org/2000/01/rdf-schema#domain>
 * <http://schema.org/rangeIncludes> => <http://www.w3.org/2000/01/rdf-schema#range>
 * 
 */
class SchemaOrgRemapper extends AbstractLineProcessor {
	
	private StringBuffer output = new StringBuffer();
	private OntModel model;
	private int classes = 0;
	private int properties = 0;
	private int datatypeproperties = 0;
	private int objectproperties = 0;
	private HashSet<String> props = new HashSet<String>();
	
	
	private static Set<String> DATATYPESdd = #{
	"<http://schema.org/Boolean>",
	"<http://schema.org/Date>",
	"<http://schema.org/DateTime>",
	"<http://schema.org/Number>",
	"<http://schema.org/Float>",
	"<http://schema.org/Integer>",
	"<http://schema.org/Text>",
	"<http://schema.org/URL>",
	"<http://schema.org/Time>"
	};
	
	private static HashMap<String, String> DATATYPES2dd = newHashMap(
	"http://schema.org/Boolean" -> "http://www.w3.org/2001/XMLSchema#boolean",
	"http://schema.org/Date" -> "http://www.w3.org/2001/XMLSchema#date",
	"http://schema.org/DateTime" -> "http://www.w3.org/2001/XMLSchema#dateTime",
	"http://schema.org/Number" -> "http://www.w3.org/2001/XMLSchema#decimal",
	"http://schema.org/Float" -> "http://www.w3.org/2001/XMLSchema#float",
	"http://schema.org/Integer" -> "http://www.w3.org/2001/XMLSchema#integer",
	"http://schema.org/Text" -> "http://www.w3.org/2001/XMLSchema#string",
	"http://schema.org/URL" -> "http://www.w3.org/2001/XMLSchema#anyURI",
	"http://schema.org/Time" -> "http://www.w3.org/2001/XMLSchema#dateTime",
	"http://schema.org/DataType" -> ""
	);
	
	
	private File file = null;

	
	new(File file) {
		super(file);
		this.file = file;
	}
	
	public static def main(String[] args){
		
		var remapper = new SchemaOrgRemapper(new File("data/schema.nt"));
		remapper.init2();
		
	}
	
	override init(){
		
		output.append("<http://schema.org/> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#Ontology> .");
		output.append("\n");
		super.init();
		
		
		
	}
	
	public def void init2(){
		output.append("<http://schema.org/> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#Ontology> .");
		output.append("\n");

		model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		model.read(file.absolutePath);
		
		val range = model.createProperty("http://schema.org/rangeIncludes");
		val domain = model.createProperty("http://schema.org/domainIncludes");
		//val label = model.createProperty("http://www.w3.org/2000/01/rdf-schema#label");
		//val comment = model.createProperty("http://www.w3.org/2000/01/rdf-schema#comment");
		
		var stmt = model.listStatements();
		
		while(stmt.hasNext){
			var next = stmt.next;
			
			var subject = next.subject;
			var predicate = next.predicate;
			var object = next.object;
			

				if(predicate.URI.equals(RDF.type.URI) && object.URIResource && object.asResource.URI.equals(RDFS.Class.URI)){
					
					/*	
					var labels = model.listStatements(subject, RDFS.label, null as String).toList.map[Statement s| s.object];
					var comments = model.listStatements(subject, RDFS.comment, null as String).toList.map[Statement s| s.object];
					
					if(labels.size==1){
						output.append('''<«subject»> <http://www.w3.org/2000/01/rdf-schema#label> "«labels.get(0)»" .''');
						output.append("\n");
					}else if(labels.size>1){
						
						System.out.println('''WARNING: «subject.URI» has more than one label''');
					}
					
					if(comments.size==1){
						output.append('''<«subject»> <http://www.w3.org/2000/01/rdf-schema#comment> """«comments.get(0)»"""@en .''');
						output.append("\n");
					}
					else if(comments.size>1){
						System.out.println('''WARNING: «subject.URI» has more than one comment''');
						
					}
					*/
					
					output.append('''<«subject»> <«RDF.type.URI»> <«OWL.Class.URI»> .''');
					output.append("\n");
					
					
					
					classes++;
					
				}
				else if(predicate.URI.equals(domain.URI) ){
						output.append('''<«subject.URI»> <«RDFS.domain.URI»> <«object.asResource.URI»> .''');
						output.append("\n");	
				}
				else if(predicate.URI.equals(range.URI) ){
						output.append('''<«subject.URI»> <«RDFS.range.URI»> <«object.asResource.URI»> .''');
						output.append("\n");	
				}
				else if(predicate.URI.equals(RDFS.label.URI) ){
						output.append('''<«subject.URI»> <«RDFS.label.URI»> "«object.asLiteral.string»" .''');
						output.append("\n");	
				}
				else if(predicate.URI.equals(RDFS.comment.URI) ){
						output.append('''<«subject.URI»> <«RDFS.comment.URI»> "«object.asLiteral.string.replace("\"", "\\\"").replace("\n","\\n")»" .''');
						output.append("\n");	
				}
				else if(predicate.URI.equals(RDFS.subPropertyOf.URI) ){
						output.append('''<«subject.URI»> <«RDFS.subPropertyOf.URI»> <«object.asResource.URI»> .''');
						output.append("\n");	
				}
				else if(predicate.URI.equals("http://schema.org/inverseOf") ){
						output.append('''<«subject.URI»> <«OWL.inverseOf.URI»> <«object.asResource»> .''');
						output.append("\n");	
				}
				else if(predicate.URI.equals("http://schema.org/sameAs") ){
						output.append('''<«subject.URI»> <«OWL.sameAs.URI»> <«object.asResource»> .''');
						output.append("\n");	
				}
				else if(predicate.URI.equals(RDF.type.URI) && object.URIResource && object.asResource.URI.equals(RDF.Property.URI)){
					
					var domains = model.listStatements(subject, domain, null as RDFNode).toList.map[Statement s| s.object.asResource.URI];
					var ranges = model.listStatements(subject, range, null as RDFNode).toList.map[Statement s| s.object.asResource.URI];
					var labels = model.listStatements(subject, RDFS.label, null as String).toList.map[Statement s| s.object];
					var comments = model.listStatements(subject, RDFS.comment, null as String).toList.map[Statement s| s.object];
					
					properties++;
					
					if(labels.size>1){
						System.out.println('''WARNING: «subject.URI» has more than one label''');
					}
					
					if(comments.size>1){
						System.out.println('''WARNING: «subject.URI» has more than one comment''');
					}
					

					output.append('''<«subject.URI»> <«RDF.type.URI»> <«OWL.ObjectProperty.URI»> .''');
					output.append("\n");
					props.add(subject.URI);
					
					/*
					if(!labels.empty){
								
						output.append('''<«subject.URI»> <http://www.w3.org/2000/01/rdf-schema#label> "«labels.get(0)»" .''');
						output.append("\n");
					}
						
					if(!comments.empty){
								
						output.append('''<«subject.URI»> <http://www.w3.org/2000/01/rdf-schema#comment> """«comments.get(0)»"""@en .''');
						output.append("\n");
					}
					
					for(String domainURI : domains){
						output.append('''<«subject.URI»> <«RDFS.domain»> <«domainURI»> .''');
						output.append("\n");
					}
					
					for(String rangeURI:ranges){
						output.append('''<«subject.URI»> <«RDFS.range»> <«rangeURI»> .''');
						output.append("\n");	
					}
					*/
					
					/*
					for(String domainURI : domains){
						
						for(String rangeURI : ranges){
							
							var type = if(DATATYPES2.keySet.contains(rangeURI)) "http://www.w3.org/2002/07/owl#DatatypeProperty" else "http://www.w3.org/2002/07/owl#ObjectProperty";
							var rangeURI2 = if(DATATYPES2.keySet.contains(rangeURI)) DATATYPES2.get(rangeURI) else rangeURI;
							var subjectURI = if(ranges.size==1) subject.URI else subject.URI+"As"+rangeURI.replace("http://schema.org/","")
							
							if(DATATYPES2.keySet.contains(rangeURI)) datatypeproperties++ else objectproperties++;
							
							if(!props.contains(subjectURI)){
								
								output.append('''<«subjectURI»> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <«type»> .''');
								output.append("\n");
								
								props.add(subjectURI);
							}
							
							
							output.append('''<«subjectURI»> <http://www.w3.org/2000/01/rdf-schema#domain> <«domainURI»> .''');
							output.append("\n");
							
							output.append('''<«subjectURI»> <http://www.w3.org/2000/01/rdf-schema#range> <«rangeURI2»> .''');
							output.append("\n");
							
							if(!labels.empty){
								
								output.append('''<«subjectURI»> <http://www.w3.org/2000/01/rdf-schema#label> "«labels.get(0)»" .''');
								output.append("\n");
							}
							
							if(!comments.empty){
								
								output.append('''<«subjectURI»> <http://www.w3.org/2000/01/rdf-schema#comment> """«comments.get(0)»"""@en .''');
								output.append("\n");
							}
						}
						
					}
					*/
					
				}
				else if(predicate.URI.equals(RDFS.subClassOf.URI)){
					output.append('''<«subject»> <«RDFS.subClassOf.URI»> <«object.asResource.URI»> .''');
					output.append("\n");
				}
				else if(predicate.URI.equals(RDF.type.URI) && object.URIResource && object.asResource.URI.equals("http://schema.org/DataType")){
					output.append('''<«subject»> <«RDFS.subClassOf.URI»> <«object.asResource.URI»> .''');
					output.append("\n");
				}

				else if(predicate.URI.equals("http://schema.org/supersededBy")){
					
					//A supersededBy B
					//A overridden by B
					//B supersedes A 
					//B overrides A
					//A equivalentClass B
					
					
					if(subject.canAs(OntClass) && object.canAs(OntClass)){
						output.append('''<«subject»> <«OWL.equivalentClass.URI»> <«object.asResource.URI»> .''');
						output.append("\n");	
					}
					else if(subject.canAs(OntProperty) && object.canAs(OntProperty)){
						
						output.append('''<«subject»> <«OWL.equivalentProperty.URI»> <«object.asResource.URI»> .''');
						output.append("\n");	
						
						//TODO 
						
						/*
						var ranges = model.listStatements(subject, range, null as RDFNode).toList.map[Statement s| s.object.asResource.URI];
						
						for(String rangeURI : ranges){
							
						}
						
						output.append('''<«subject»> <http://www.w3.org/2000/01/rdf-schema#equivalentProperty> <«object2»> .''');
						output.append("\n");
						
						*/
						
					}
					else{
						System.out.println(
						'''A classes must supersede classes and properties must supersede properties:
						«next»'''
						);
					}
				}
				else{
					System.out.println('''Warning: triple ignored "«next»"''');
				}
				/*
				else if(predicate.URI.equals("http://www.w3.org/2000/01/rdf-schema#subPropertyOf")){
					
					//TODO introduce restrictions that limit the ranges/domains
					
					var superprop = object2;
					var subprop = subject;
					var ranges = model.listStatements(superprop, range, null as RDFNode).toList.map[Statement s| s.object.asResource.URI];
					
					for(String rangeURI : ranges){
						output.append('''<«subject»> <http://www.w3.org/2000/01/rdf-schema#subPropertyOf> <«object2»> .''');
						output.append("\n");
					}
				}
				*/
			
		}
		
		finish;
		
		
	}
	
	
	
	override void readLine(String line) {
		
		var _triple = line.split(" ");

		if(_triple.size==4){
			
			
			var subject = _triple.get(0);
			
			var predicate = _triple.get(1);
			
			var object = _triple.get(2);
			
			
			if(predicate.equals("<http://schema.org/domainIncludes>")){
				output.append('''«subject» <http://www.w3.org/2000/01/rdf-schema#domain> «object» .''');
				output.append("\n");
				
			}
			else if(predicate.equals("<http://schema.org/rangeIncludes>")){
				output.append('''«subject» <http://www.w3.org/2000/01/rdf-schema#range> «object» .''');
				output.append("\n");
				
			}
			else if(predicate.equals("<http://www.w3.org/1999/02/22-rdf-syntax-ns#type>") && object.equals("<http://www.w3.org/2000/01/rdf-schema#Class>" )){
				output.append('''«subject» <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#Class> .''');
				output.append("\n");
			}
			else if(predicate.equals("<http://www.w3.org/1999/02/22-rdf-syntax-ns#type>") && object.equals("<http://www.w3.org/1999/02/22-rdf-syntax-ns#Property>" )){
				output.append('''«subject» <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#ObjectProperty> .''');
				output.append("\n");
				
			}
			else{
				output.append('''«subject» «predicate» «object» .''');
				output.append("\n");
			}
			
			
		}
	}
	
	
	override finish() {

		
		var path = file.parent+"/";
		var filename = file.name.replace(".nt", ".owl.nt");
		
		new FileWriter(path).write(filename, output.toString);
		
		System.out.println(
		'''
			schema.org Core 3.3
			Classes: «classes»
			Properties: «properties»
			DatatypeProperties: «datatypeproperties»
			ObjectProperties: «objectproperties»
		''');
	}
	
}
								