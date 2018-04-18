package de.upb.dbis.astro.evaluation

import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.ontology.OntModelSpec
import de.upb.dbis.astro.QueryDelegator
import de.upb.dbis.astro.Triple
import de.upb.dbis.astro.alignment.mysql.SQLConnection
import de.upb.dbis.astro.alignment.mysql.MySQLAlignmentLoader
import java.util.Map
import org.apache.jena.rdf.model.Model
import org.apache.lucene.store.Directory
import java.util.HashMap
import java.util.ArrayList
import de.upb.dbis.commons.FileWriter

class Evaluation {
	
	
	private String path_global_ontology = "C:/Users/Simon/Data/git2/dissertation/implementation/de.upb.is.schemaorg.owl/data/schema.owl.nt";
	private String path_testcollection = "C:/Users/Simon/Data/git2/dissertation/implementation/de.upb.is.sme2/testcollections/unnormalized/htdocs/"; 
	private Map<String, Float> weights;
	private static Model schemaorg;
	private static Directory index;
	
	public static def void main(String[] args){
		
		
		if(args.size!=2){
			
			System.out.println(
			'''
			Error: No arguments given
			Usage: <path_global_ontology> <path_testcollection>
			path_global_ontology: Absolute path of file (*.owl, *.nt) that contains global ontology
			path_testcollection: Absolute path to directory of testcollection. Directory is expected to contain folders "services" and "ontologies"
			''');
			
			System.exit(-1);
		}
		else{
			
			//leave_one_out(args.get(0), args.get(1));
			//all_one(args.get(0), args.get(1));
			
			var weights = #{
				QueryDelegator.FIELD_CLASS_LABEL -> 7f,
				QueryDelegator.FIELD_CLASS_COMMENT -> 2f,
				QueryDelegator.FIELD_CLASS_SUPER -> 0f,
				QueryDelegator.FIELD_CLASS_SUB -> 5f,
				QueryDelegator.FIELD_CLASS_PROPERTIES -> 9f,
				QueryDelegator.FIELD_PROPERTY_LABEL -> 6f,
				QueryDelegator.FIELD_PROPERTY_COMMENT -> 3f,
				QueryDelegator.FIELD_OBJECT_LABEL -> 7f,
				QueryDelegator.FIELD_CONCEPTNET_RELATED -> 11f,
				QueryDelegator.FIELD_CONCEPTNET_SYNONYM -> 10f,
				
				QueryDelegator.FIELD_RESOURCE_LABEL->6f,
				QueryDelegator.FIELD_JSONPATH -> 5f,
				QueryDelegator.FIELD_PARAMETER_DESCRIPTION -> 5f,
				QueryDelegator.FIELD_OPERATION_ID -> 4f,
				QueryDelegator.FIELD_OPERATION_DESCRIPTION-> 0f,
				QueryDelegator.FIELD_SERVICE_DESCRIPTION -> 0f,
				QueryDelegator.FIELD_ALL_PROPERTIES -> 0f,
				QueryDelegator.FIELD_ALL_INPUTS -> 1f
			};
//			
			new Evaluation(args.get(0), args.get(1),weights).run();
			
			
		}
		
	}
	
	new(String globalontology, String testcollection){
		this.path_global_ontology = globalontology;
		this.path_testcollection = testcollection;
		
		if(schemaorg===null){
			
			schemaorg = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
			schemaorg.read(path_global_ontology);
		}
		
	}
	
	new(String globalontology, String testcollection, Map<String, Float> weights){
		this.path_global_ontology = globalontology;
		this.path_testcollection = testcollection;
		this.weights = weights;
		if(schemaorg===null){
			
			schemaorg = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
			schemaorg.read(path_global_ontology);
		}
	}
	
	public static def all_one(String globalontology, String testcollection){
		var weights = #{
			QueryDelegator.FIELD_CLASS_LABEL -> 1f,
			QueryDelegator.FIELD_CLASS_COMMENT -> 1f,
			QueryDelegator.FIELD_CLASS_SUPER -> 1f,
			QueryDelegator.FIELD_CLASS_SUB -> 1f,
			QueryDelegator.FIELD_CLASS_PROPERTIES -> 1f,
			QueryDelegator.FIELD_PROPERTY_LABEL -> 1f,
			QueryDelegator.FIELD_PROPERTY_COMMENT -> 1f,
			QueryDelegator.FIELD_OBJECT_LABEL -> 1f,
			QueryDelegator.FIELD_CONCEPTNET_RELATED -> 1f,
			QueryDelegator.FIELD_CONCEPTNET_SYNONYM -> 1f,
			
			QueryDelegator.FIELD_RESOURCE_LABEL->1f,
			QueryDelegator.FIELD_JSONPATH -> 1f,
			QueryDelegator.FIELD_PARAMETER_DESCRIPTION -> 1f,
			QueryDelegator.FIELD_OPERATION_ID -> 1f,
			QueryDelegator.FIELD_OPERATION_DESCRIPTION-> 1f,
			QueryDelegator.FIELD_SERVICE_DESCRIPTION -> 1f,
			QueryDelegator.FIELD_ALL_PROPERTIES -> 1f,
			QueryDelegator.FIELD_ALL_INPUTS -> 1f
		};
		
		new Evaluation(globalontology, testcollection, weights).run();
	}
	
	public static def leave_one_out(String globalontology, String testcollection){

		var filename = "leaveoneout.csv";
		
		var weights = #{
			QueryDelegator.FIELD_CLASS_LABEL -> 7f,
			QueryDelegator.FIELD_CLASS_COMMENT -> 2f,
			QueryDelegator.FIELD_CLASS_SUPER -> 4f,
			QueryDelegator.FIELD_CLASS_SUB -> 0f,
			QueryDelegator.FIELD_CLASS_PROPERTIES -> 9f,
			QueryDelegator.FIELD_PROPERTY_LABEL -> 6f,
			QueryDelegator.FIELD_PROPERTY_COMMENT -> 0f,
			QueryDelegator.FIELD_OBJECT_LABEL -> 0f,
			QueryDelegator.FIELD_CONCEPTNET_RELATED -> 11f,
			QueryDelegator.FIELD_CONCEPTNET_SYNONYM -> 10f,
			
			QueryDelegator.FIELD_RESOURCE_LABEL->6f,
			QueryDelegator.FIELD_JSONPATH -> 5f,
			QueryDelegator.FIELD_PARAMETER_DESCRIPTION -> 5f,
			QueryDelegator.FIELD_OPERATION_ID -> 4f,
			QueryDelegator.FIELD_OPERATION_DESCRIPTION-> 0f,
			QueryDelegator.FIELD_SERVICE_DESCRIPTION -> 2f,
			QueryDelegator.FIELD_ALL_PROPERTIES -> 0f,
			QueryDelegator.FIELD_ALL_INPUTS -> 0f
		};
		
		var keys = new ArrayList<String>(weights.keySet);
		
		var buffer = new StringBuffer();
		
		for(String key :keys){
			
			buffer.append('''"«key»";''');
		}
		buffer.append("score\n");
		
		new FileWriter("./").write(filename, buffer.toString, false);
		
		
		for(String key: weights.keySet){
			
			buffer = new StringBuffer();
			
			var weights_prime = new HashMap<String, Float>(weights);
			
			weights_prime.put(key, 0f);
			
			var evaluation = new Evaluation(globalontology, testcollection, weights_prime);
			var result = evaluation.run();
			
			for(String key2 :keys){
			
				buffer.append('''"«weights_prime.get(key2)»";''');
				
			}
			
			buffer.append(result+"\n");
			
			new FileWriter("./").write(filename, buffer.toString, true);
		}
		
	}
	
	
	
	/*
	public def validate(){
		if(path_global_ontology.endsWith("owl")||path_global_ontology.endsWith("nt")){
			
		}
		
		if(new File(path_global_ontology).exists ){
			
		}
		
		new Evaluation().run();
		
	}
	*/
	
	
	public def double run(){
		
		var actual_true_positives = 0d;
		var actual_true_negatives = 0d;
		var actual_false_positives = 0d;
		var actual_false_negatives = 0d;
		var queries = 0d;
		var summerized_average_precision = 0d;
		
		
		
		var matcher2 = null as QueryDelegator;
		
		if(weights!==null){
			
			matcher2 = new QueryDelegator(weights);
		}
		else{
			matcher2 = new QueryDelegator();
		}
		
		matcher2.init();
		
		
		if(index===null){
			
			index = matcher2.init(schemaorg);
		}
		else{
			matcher2.setGlobal(schemaorg);
			matcher2.init(index);
		}
				
		
		var map = new AveragePrecision();
		
		
		//var matcher = MatcherConfigurations.propertyMatcher;

		var preparedStatement3 = SQLConnection.getConnection().prepareStatement("SELECT id, namespace FROM offers o WHERE EXISTS (SELECT offerid FROM mappings m WHERE o.id=m.offerid)");

		var offers = preparedStatement3.executeQuery();
		while(offers.next){
			var offerid = offers.getString("id");
			
			var namespace = offers.getString("namespace");
			
			map.servicename = namespace;
			
			var referenceAlignment = MySQLAlignmentLoader.getReferenceAlignment(offerid, true, true, false, schemaorg);
			
			map.referenceAlignment = referenceAlignment;
			
			var domainPath = namespace.replace("http://127.0.0.1/services/", "C:/Users/Simon/Data/git2/dissertation/implementation/de.upb.is.sme2/testcollections/unnormalized/htdocs/ontology/").replace(".owls",".owl");
			var offerPath = namespace.replace("http://127.0.0.1/services/", "C:/Users/Simon/Data/git2/dissertation/implementation/de.upb.is.sme2/testcollections/unnormalized/htdocs/services/");
			
			var offer = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
			offer.read(offerPath);
			
			var domain = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
			domain.read(domainPath);
			
			/*
			var servicename = OWLUtil.getLiteral(offer, OWLS.SERVICE_NAME);
			var opdesc = OWLUtil.getLiteral(offer, OWLS.TEXT_DESCRIPTION);
			var servicedesc = OWLUtil.getLiteral(offer, OWLS_EXT.SERVICE_DESCRIPTION);
			var txt = servicename+" "+opdesc+" "+servicedesc;
			var tf = new TFIDF(txt);
			
			matcher.attributes.clear();
			var attributes = new HashMap<String, Object>();
			attributes.put(OWLS.SERVICE_NAME.getURI(), OWLUtil.getLiteral(offer, OWLS.SERVICE_NAME));
			attributes.put(OWLS.TEXT_DESCRIPTION.getURI(), OWLUtil.getLiteral(offer, OWLS.TEXT_DESCRIPTION));
			attributes.put(OWLS_EXT.SERVICE_DESCRIPTION.getURI(), OWLUtil.getLiteral(offer, OWLS_EXT.SERVICE_DESCRIPTION));
			attributes.put("TERM_FREQ", tf);
			matcher.attributes.putAll(attributes);
			*/
			
			matcher2.init(offer, domain);
			
			//var alignment = matcher.match(offer,domain,schemaorg);
			
			var alignment = matcher2.align();
			
			map.actualAlignment = alignment;
				
			var averagePrecision2 = map.averagePrecision2();
			var averagePrecision = AveragePrecision.averagePrecision(referenceAlignment, alignment);
			


			summerized_average_precision += averagePrecision;
			
			for(String lefturi : referenceAlignment.keySet){
				System.out.println(lefturi);
				
				var expectedTriple = referenceAlignment.get(lefturi);
				
				
				var actualTriple = null as Triple;
				
				actualTriple = alignment.getBest(lefturi);
				
				
				var type = Comparator.eval(expectedTriple, actualTriple);
				
				if(expectedTriple!=null){
					queries++;
				}
				
				switch(type){
					case Comparator.Match.TRUE_POSITIVE: {
						//A=A
						actual_true_positives++
						
					}
					case Comparator.Match.FALSE_POSITIVE:{
						//A=B
						//null=B
						actual_false_positives++;
					}
					case Comparator.Match.TRUE_NEGATIVE:{
						//null=null
						//ignore
						actual_true_negatives++;
					}
					case Comparator.Match.FALSE_NEGATIVE:{
						//A=null
						actual_false_negatives++;
					}
					default: throw new IllegalStateException()
				}
			}
			
						
		}
		
		var precision = actual_true_positives / (actual_true_positives+actual_false_positives);
		var recall = actual_true_positives / queries;
		var fmeasure = (2d* precision*recall)/(precision+recall);
		var mean_average_precision = summerized_average_precision / queries;
		
		map.printTop(200);
		
		System.out.println(
			'''
								#True positives: «actual_true_positives»
								#False positives: «actual_false_positives»
								#True negatives: «actual_true_negatives»
								#False negatives: «actual_false_negatives»
								Precision: «precision»
								Recall: «recall»
								FMeasure: «fmeasure»
								Mean Average Precision: «mean_average_precision»
								Mean Average Precision2: «mean_average_precision»
							'''
		);
		
		return mean_average_precision;
		
	}
	
}
				