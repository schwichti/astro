package de.upb.dbis.testcollection.utils

import java.util.ArrayList
import java.util.List
import de.upb.dbis.commons.AbstractLineProcessor
import java.io.File
import de.upb.dbis.commons.FileWriter
import java.util.HashMap
import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.ontology.OntModelSpec
import org.apache.jena.vocabulary.RDF
import java.util.Map

class CSV2XML extends AbstractLineProcessor{
	//id=4, name=nonrelevant, value=0
	//id=3, name=potentially relevant, value=1
	//id=2, name= relevant, value=2
	//id=1, name=highly relevant, value=3
	
	/* Copied from OWLS-TC OWL-S Service Retrieval Test Collection
	 * highly relevant (value: 3) - Any service offer that is exactly what the user asked for (or even better for him, e.g. by giving additional information)
	 * relevant (value: 2) - Any service offer that might answer the request completely or does the requested job at least partially
	 * potentially relevant (value: 1) - Any service offer that may be helpful.
	 * nonrelevant (value: 0) - Anything totally irrelevant to the service request
	 */
	public static final List<String> RELEVANCE_NAME = #['nonrelevant', 'potentially relevant', 'relevant', 'highly relevant'];
	
	
	private static boolean first = true;
	private List<String> offers=new ArrayList<String>();
	private List<String> requests= new ArrayList<String>();
	private List<List<Integer>> relevances = new ArrayList<List<Integer>>(); // service, request
	private Map<Pair, Integer> relevances2 = new HashMap<Pair, Integer>();
	//private HashMap<String, String> file2uri = new HashMap<String, String>();
	//private HashMap<String, String> file2name = new HashMap<String,String>();
	private HashMap<String, String> query2uri = new HashMap<String,String>();
	private HashMap<String, String> query2name = new HashMap<String,String>();
	private HashMap<String, String> offer2uri = new HashMap<String,String>();
	private HashMap<String, String> offer2name = new HashMap<String,String>();
	
	public static final String FOLDER = "request-owlstc-unaligned_offer-mashape-unaligned";
	
	new(File file) {
		super(file)
	}
	
	public static def void main(String[] args){
		var file = new File('''../de.upb.is.sme2/testcollections/«FOLDER»/matrix.csv''');
		new CSV2XML(file).init();
	}
	


	
	public def run(){
		
		
		return 
		'''
			<?xml version="1.0" encoding="UTF-8"?>
			<testcollection>
				<name>«FOLDER»</name>
				<authors>Simon Schwichtenberg (Paderborn University)</authors>
				<type>OWL-S 1.1</type>
				<description>My description</description>
				<htdocs>testcollections/«FOLDER»/htdocs</htdocs>
				<offers>
					«FOR String uri:offers»
						<offer>
							<uri>«offer2uri.get(uri)»</uri>
						</offer>
						«ENDFOR»
					</offers>
					<relevancegradeexport>
						<environment>
							<pool>All</pool>
						</environment>
						<binaryrelevanceset>
						«var i = 0»
						«FOR String request_uri:requests»
							<request id="«i+1»">
								<name>«query2name.get(request_uri)»</name>
								<uri>«query2uri.get(request_uri).replace("/services/","/queries/")»</uri>
								<ratings>
								«var j = 0»
								«FOR String offer_uri:offers»
									«IF relevances.get(j).get(i)>0»
										<offer id="«j+1»">
											<name>«offer2name.get(offer_uri)»</name>
											<uri>«offer2uri.get(offer_uri)»#Service</uri>
											<relevant>«IF relevances.get(j).get(i)>=0»1«ELSE»0«ENDIF»</relevant>
										</offer>
									«ENDIF»
									«{j++; ""}»
								«ENDFOR»
								</ratings>
							«{i++; ""}»
							</request>
						«ENDFOR»
						</binaryrelevanceset>
						<relevancegrades>
							<scale id="0">
							<name>4-graded</name>
							<services>
								«var k = 0»
								«FOR String request_uri:requests»
									<request id="«k+1»">
										<name>«query2name.get(request_uri)»</name>
										<uri>«query2uri.get(request_uri).replace("/services/","/queries/")»</uri>
										<ratings>
											«var l = 0»
											«FOR String offer_uri:offers»
												«var relevance = relevances.get(l).get(k)»
												«IF relevance>=0»
													<offer id="«l+1»">
														<name>«offer2name.get(offer_uri)»</name>
														<uri>«offer2uri.get(offer_uri)»#Service</uri>
														<grade id="«4-relevance»">
															<name>«RELEVANCE_NAME.get(relevance)»</name>
															<value>«relevance»</value>
														</grade>
													</offer>
												«ENDIF»
												«{l++; ""}»
											«ENDFOR»
										</ratings>
									</request>
									«{k++; ""}»
								«ENDFOR»
							</services>
						</scale>
					</relevancegrades>
					 </relevancegradeexport>
				</testcollection>
			'''
	}
	
	override finish() {
		
		var contents = run();
		new FileWriter('''../de.upb.is.sme2/testcollections/«FOLDER»/''').write("owls-tc4.xml", contents);
		System.out.println('''finished''');		
	}
	
	override readLine(String line) {
		var parts = line.split(",");
		
		
//		var request = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
//		var offer = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		
		
		
		if(first){
			first=false;
			
			for(var i=1;i<parts.length;i++){
				
				var filename = parts.get(i).replace("\"","");
				System.out.println('''processing queries/«filename»...''');
				
				requests.add(filename);
				
				var request2 = new OWLParser(new File('''../de.upb.is.sme2/testcollections/«FOLDER»/htdocs/queries/1.1/«filename»'''));
				request2.init;
				query2name.put(filename, request2.serviceName);
				query2uri.put(filename, request2.baseUri+"#"+request2.serviceId);
				
//				request = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
//				request.read('''../de.upb.is.sme2/testcollections/unnormalized/queries/«filename»''');
//				
//				var object = request.createResource("http://www.daml.org/services/owl-s/1.1/Service.owl#Service");
//				
//				var statement = request.listStatements(null, RDF.type, object).toList.get(0);
//				
//				file2uri.put(filename, statement.subject.URI);
//				
//				var servicename = request.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#serviceName");
//				statement = request.listStatements(null, servicename , null as String).toList.get(0);
//				
//				file2name.put(filename, statement.object.asLiteral.string);
				
			}
			
		}
		else{
			var filename = parts.get(0).replace("\"","")
			offers.add(filename);
			
				
			
			
			try{
				
				System.out.println('''processing services/«filename»...''');
				
				var offer2 = new OWLParser(new File('''../de.upb.is.sme2/testcollections/«FOLDER»/htdocs/services/«filename»'''));
				offer2.init;
				offer2name.put(filename, offer2.serviceName);
				offer2uri.put(filename, offer2.baseUri);
				
//				offer = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
//				offer.read('''../de.upb.is.sme2/testcollections/unnormalized/services/«filename»''');
//				var object = offer.createResource("http://www.daml.org/services/owl-s/1.1/Service.owl#Service");
//				var statement = offer.listStatements(null, RDF.type, object).toList.get(0);
//				file2uri.put(filename, statement.subject.URI);
//				var servicename = offer.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#serviceName");
//				statement = offer.listStatements(null, servicename , null as String).toList.get(0);
//				file2name.put(filename, statement.object.asLiteral.string);
				
				var array = new ArrayList<Integer>();
				
				for(var i=1;i<parts.length;i++){
					
					var r = Integer.parseInt(parts.get(i));
					
					array.add(r);
				}
				relevances.add(array);	
			}
			catch(Exception e){
				System.out.println('''Error in «filename»''');
				e.printStackTrace;
			}

		}
		
	}
	
}
