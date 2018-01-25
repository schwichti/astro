package de.upb.debis.astro

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.List
import java.util.Map
import java.util.Set
import java.util.TreeMap
import org.apache.jena.ontology.OntClass
import org.apache.jena.rdf.model.Model
import org.apache.jena.rdf.model.Resource
import org.apache.jena.vocabulary.OWL
import org.apache.jena.vocabulary.RDFS
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.analysis.core.LowerCaseFilterFactory
import org.apache.lucene.analysis.core.StopFilterFactory
import org.apache.lucene.analysis.custom.CustomAnalyzer
import org.apache.lucene.analysis.en.EnglishMinimalStemFilterFactory
import org.apache.lucene.analysis.miscellaneous.PerFieldAnalyzerWrapper
import org.apache.lucene.analysis.miscellaneous.WordDelimiterGraphFilterFactory
import org.apache.lucene.analysis.pattern.PatternCaptureGroupFilterFactory
import org.apache.lucene.analysis.standard.StandardAnalyzer
import org.apache.lucene.analysis.standard.StandardFilterFactory
import org.apache.lucene.analysis.standard.StandardTokenizerFactory
import org.apache.lucene.analysis.synonym.SynonymGraphFilterFactory
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute
import org.apache.lucene.document.Document
import org.apache.lucene.document.Field
import org.apache.lucene.document.StringField
import org.apache.lucene.document.TextField
import org.apache.lucene.index.DirectoryReader
import org.apache.lucene.index.IndexWriter
import org.apache.lucene.index.IndexWriterConfig
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser
import org.apache.lucene.search.IndexSearcher
import org.apache.lucene.store.Directory
import org.apache.lucene.store.RAMDirectory

class QueryDelegator {
	
	private Analyzer analyzer = null;
	private Directory index = null;
	private MultiFieldQueryParser queryparser = null;
	
	private static int CUTOFF = 100;
	
	private static String FIELD_CLASS_LABEL = "clabel";
	private static String FIELD_CLASS_COMMENT = "ccomment";
	private static String FIELD_CLASS_SUPER = "csuper";
	private static String FIELD_CLASS_SUB = "csub";
	private static String FIELD_CLASS_PROPERTIES = "cproperties";
	private static String FIELD_PROPERTY_LABEL = "plabel";
	private static String FIELD_OBJECT_LABEL = "olabel";
	private static String FIELD_PROPERTY_COMMENT = "pcomment";
	private static String FIELD_CLASS_URI = "curi";
	private static String FIELD_PROPERTY_URI = "puri";
	private static String FIELD_OBJECT_URI = "ouri";
	private static String FIELD_CONCEPTNET_RELATED = "cnrelated";
	private static String FIELD_CONCEPTNET_SYNONYM = "cnsynonym";
	
	private static String FIELD_RESOURCE_LABEL = "resource_label";
	private static String FIELD_JSONPATH = "jsonpath";
	private static String FIELD_OPERATION_ID = "operation_id";
	private static String FIELD_OPERATION_DESCRIPTION = "operation_description";
	private static String FIELD_SERVICE_DESCRIPTION = "service_description";
	private static String FIELD_PARAMETER_DESCRIPTION = "parameter_description";
	private static String FIELD_ALL_PROPERTIES = "properties";
	private static String FIELD_ALL_INPUTS = "inputs";
	
	private String service_description = "";
	private String operation_name = "";
	private String operation_description = "";
	
	private Analyzer analyzer_id = null;
	private Analyzer analyzer_text = null;
	private Analyzer analyzer_conceptnet = null;
	private Analyzer analyzer_conceptnet_synonym = null;
	
	private List<FieldConfiguration> index_fields = new ArrayList<FieldConfiguration>();
	private List<FieldConfiguration> query_fields = new ArrayList<FieldConfiguration>();
	
	
	private Model offer;
	private Model domain;
	private Model global;
	
	public def Alignment align(){
		
		var result = new Alignment();
		
        var reader = DirectoryReader.open(index);
        var searcher = new IndexSearcher(reader);
        
        var arguments = new ArrayList<Resource>();
        arguments.addAll(OWLUtil.listDatatypeProperties(domain));
        arguments.addAll(OWLUtil.listInstances(offer, OWLS.INPUT));
        
		for(Resource p:arguments){
			
			System.out.println('''«NameProvider.getLabel(p)»''');
			
			var querystring = buildQueryString(p);
			var query = queryparser.parse(querystring);
	        var docs = searcher.search(query, CUTOFF);
	        var hits = docs.scoreDocs;
	        
	        var score = 0d;
	        var treemap = new TreeMap<Double, HashMap<Triple, FeatureVector>>();
	        
	        
	        for(var i=0; i<hits.length; i++) {
	            var docId = hits.get(i).doc;
	            
	            score = hits.get(i).score;
	            var d = searcher.doc(docId);
	            var curi = d.get(FIELD_CLASS_URI);
	            var puri = d.get(FIELD_PROPERTY_URI);
	            var ouri = d.get(FIELD_OBJECT_URI);
	            
	            var prop = global.getResource(puri);
	            var clas = global.getResource(curi);
	            var range = global.getResource(ouri);


				if(!treemap.containsKey(score)){
					
					treemap.put(score, new HashMap<Triple, FeatureVector>());
				}
	            
	            var list = treemap.get(score);
	            list.put(new Triple(clas, prop, range), null);
		        treemap.put(score, list);
	        }
	        
            result.put(p.URI, treemap);
	        
		}
		reader.close;
		
		return result;
	}
	
	public def query(Resource r){
		
		var querystring = buildQueryString(r);
		var query = queryparser.parse(querystring);
        var reader = DirectoryReader.open(index);
        var searcher = new IndexSearcher(reader);
        var docs = searcher.search(query, CUTOFF);
        var hits = docs.scoreDocs;
        
        reader.close;
        
        return hits;
		
	}
	
	
	private def buildQueryString(Resource r){
		//https://lucene.apache.org/core/6_5_1/queries/org/apache/lucene/queries/function/FunctionScoreQuery.html
		//https://lucene.apache.org/core/2_9_4/queryparsersyntax.html#Boosting a Term
		//https://lucene.apache.org/solr/guide/6_6/understanding-analyzers-tokenizers-and-filters.html
		
		var query = new LinkedHashMap<Set<String>, Float>();
		var duplicates = new HashSet<String>();
		
		var terms = null as HashSet<String>;
		var input = null as String;
		
		for(FieldConfiguration field: query_fields){
			
			input = "";
			if(field.enabled){
				
				switch(field.id){
					case FIELD_RESOURCE_LABEL: input = NameProvider.getLabel(r)
					case FIELD_JSONPATH:input = OWLUtil.getLiteral(r, OWLS_EXT.JSONPATH)
					case FIELD_OPERATION_ID:input = operation_name
					case FIELD_OPERATION_DESCRIPTION: input=operation_description
					case FIELD_SERVICE_DESCRIPTION: input=service_description
					case FIELD_PARAMETER_DESCRIPTION: input = OWLUtil.getLiteral(r, OWLS_EXT.PARAMETER_DESCRIPTION)
					case FIELD_ALL_PROPERTIES: input = resources2string(OWLUtil.listInstances(domain, OWL.DatatypeProperty))
					case FIELD_ALL_INPUTS: input = resources2string(OWLUtil.listInstances(offer, OWLS.INPUT))
					default:{
						throw new IllegalStateException('''Unable to access data for index query field '«field.id»'. Check query field configuration.''');
					}	
				}
				
				input = input.replace(":"," ");//at this stage, colons are not allowed, as they address index fields
				terms = normalize(field.analyzer, input);
				
				if(!terms.empty){
					terms.removeAll(duplicates);
					query.put(terms, field.weight);
					duplicates.addAll(terms);
					
				}
				
			}
		}
		
		return concat(query);
				
	}
	
	private static def normalize(Analyzer a, String s){
		return normalize(a,"",s);
	}
	
	private static def normalize(Analyzer a, String field, String s){
		
		var result = new HashSet<String>();
		var tokenStream = a.tokenStream(field, s);
		var charTermAttribute = tokenStream.addAttribute(CharTermAttribute);
		
		tokenStream.reset();
		while (tokenStream.incrementToken()) {
		    var term = charTermAttribute.toString();
		    result.add(term);
		}
		tokenStream.end();
		tokenStream.close();
		
		return result;
	}
	
	
	private def concat(Map<Set<String>, Float> tokenSets){
		
		var sb = new StringBuilder();
		for(var iter=tokenSets.keySet.iterator;iter.hasNext;){	
			var group = iter.next;
			var boost = tokenSets.get(group);
				
			for(var iter2=group.iterator;iter2.hasNext;){
				var next = iter2.next;
				
				sb.append('''«next»^«boost»''');
				
				if(iter2.hasNext ){
					
					sb.append(" ");
				}
			}
				
			
			if(!group.empty && iter.hasNext){
				sb.append(" ");
			}
			
		}
		return sb.toString;
	}
	
	public def init(Model offer, Model domain){
		
		this.offer = offer;
		this.domain = domain;
		
		operation_name = OWLUtil.getLiteral(offer, OWLS.SERVICE_NAME);
		operation_description = OWLUtil.getLiteral(offer, OWLS.TEXT_DESCRIPTION);
		
		service_description = OWLUtil.getLiteral(offer, OWLS_EXT.SERVICE_DESCRIPTION);
	}
	
	private static def resources2string(List<Resource> resources){
		
		var result = new StringBuilder();
		
		for(var iter=resources.iterator;iter.hasNext;){
			
			result.append(NameProvider.getLabel(iter.next));
			
			if(iter.hasNext){
				
				result.append(" ");
			}
		}
		
		return result.toString;
		
		
	}
	
	public def init(){
		index = new RAMDirectory();
		
		//index = FSDirectory.open(Paths.get("index.lucene"));
		
		analyzer_text = CustomAnalyzer.builder()
   			.withTokenizer(StandardTokenizerFactory)
   			.addTokenFilter(StandardFilterFactory)
   			.addTokenFilter(LowerCaseFilterFactory)
   			.addTokenFilter(EnglishMinimalStemFilterFactory)
			.addTokenFilter(StopFilterFactory, "ignoreCase", "true", "words", "stopwords.txt", "format", "wordset")
			.build();
			
		analyzer_id = CustomAnalyzer.builder()
   			.withTokenizer(StandardTokenizerFactory)
   			.addTokenFilter(StandardFilterFactory)
   			.addTokenFilter(WordDelimiterGraphFilterFactory, 
   				"preserveOriginal", "0",
   				"splitOnNumerics", "1",
   				"splitOnCaseChange", "1", 
   				"catenateWords", "0",
   				"catenateNumbers", "0",
   				"catenateAll", "0",
   				"generateWordParts", "1",
   				"generateNumberParts", "0",
   				"stemEnglishPossessive", "0"
   				)
   			.addTokenFilter(LowerCaseFilterFactory)
   			.addTokenFilter(EnglishMinimalStemFilterFactory)
//   			.addTokenFilter(EnglishPossessiveFilterFactory)
//   			.addTokenFilter(PorterStemFilterFactory)
//			.addTokenFilter(KStemFilterFactory)
			.addTokenFilter(PatternCaptureGroupFilterFactory, "preserve_original", "true", "pattern", "(([a-z]+)(id$)|(brand)|(info))")
   			.addTokenFilter(SynonymGraphFilterFactory, "synonyms", "synonyms.txt", "format", "solr", "ignoreCase", "false", "expand", "true")
			.addTokenFilter(StopFilterFactory, "ignoreCase", "true", "words", "stopwords.txt", "format", "wordset")
			.build();
			
		
		analyzer_conceptnet = CustomAnalyzer.builder()
   			.withTokenizer(StandardTokenizerFactory)
   			.addTokenFilter(StandardFilterFactory)
   			.addTokenFilter(WordDelimiterGraphFilterFactory, 
   				"preserveOriginal", "0",
   				"splitOnNumerics", "1",
   				"splitOnCaseChange", "1", 
   				"catenateWords", "0",
   				"catenateNumbers", "0",
   				"catenateAll", "0",
   				"generateWordParts", "1",
   				"generateNumberParts", "0",
   				"stemEnglishPossessive", "0"
   				)
   			.addTokenFilter(LowerCaseFilterFactory)
   			.addTokenFilter(SynonymGraphFilterFactory, "synonyms", "conceptnet.relatedto.txt", "format", "solr", "ignoreCase", "false", "expand", "true")
   			.addTokenFilter(EnglishMinimalStemFilterFactory)
			.addTokenFilter(StopFilterFactory, "ignoreCase", "true", "words", "stopwords.txt", "format", "wordset")
			.build();
			
		analyzer_conceptnet_synonym = CustomAnalyzer.builder()
   			.withTokenizer(StandardTokenizerFactory)
   			.addTokenFilter(StandardFilterFactory)
   			.addTokenFilter(WordDelimiterGraphFilterFactory, 
   				"preserveOriginal", "0",
   				"splitOnNumerics", "1",
   				"splitOnCaseChange", "1", 
   				"catenateWords", "0",
   				"catenateNumbers", "0",
   				"catenateAll", "0",
   				"generateWordParts", "1",
   				"generateNumberParts", "0",
   				"stemEnglishPossessive", "0"
   				)
   			.addTokenFilter(LowerCaseFilterFactory)
   			.addTokenFilter(SynonymGraphFilterFactory, "synonyms", "conceptnet.synonym.txt", "format", "solr", "ignoreCase", "false", "expand", "true")
   			.addTokenFilter(EnglishMinimalStemFilterFactory)
			.addTokenFilter(StopFilterFactory, "ignoreCase", "true", "words", "stopwords.txt", "format", "wordset")
			.build();			
		
		index_fields.add(new FieldConfiguration(FIELD_CLASS_LABEL, true, 7f, analyzer_id));
		index_fields.add(new FieldConfiguration(FIELD_CLASS_COMMENT, true, 2f, analyzer_text));
		index_fields.add(new FieldConfiguration(FIELD_CLASS_SUPER, true, 4f, analyzer_id));
		index_fields.add(new FieldConfiguration(FIELD_CLASS_SUB, true, 5f, analyzer_id));
		index_fields.add(new FieldConfiguration(FIELD_CLASS_PROPERTIES, true, 9f, analyzer_id));
		index_fields.add(new FieldConfiguration(FIELD_PROPERTY_LABEL, true, 6f, analyzer_id));
		index_fields.add(new FieldConfiguration(FIELD_PROPERTY_COMMENT, true, 3f, analyzer_text));
		index_fields.add(new FieldConfiguration(FIELD_OBJECT_LABEL, true, 7f, analyzer_text));
		index_fields.add(new FieldConfiguration(FIELD_CONCEPTNET_RELATED, true, 11f, analyzer_conceptnet));
		index_fields.add(new FieldConfiguration(FIELD_CONCEPTNET_SYNONYM, true, 10f, analyzer_conceptnet_synonym));
		
		query_fields.add(new FieldConfiguration(FIELD_RESOURCE_LABEL, true, 6f, analyzer_id));
		query_fields.add(new FieldConfiguration(FIELD_JSONPATH, true, 5f, analyzer_id));
		query_fields.add(new FieldConfiguration(FIELD_PARAMETER_DESCRIPTION, true, 5f, analyzer_text));
		query_fields.add(new FieldConfiguration(FIELD_OPERATION_ID, true, 4f, analyzer_id));
		query_fields.add(new FieldConfiguration(FIELD_OPERATION_DESCRIPTION, false, 3f, analyzer_text));
		query_fields.add(new FieldConfiguration(FIELD_SERVICE_DESCRIPTION, false, 2f, analyzer_text));
		query_fields.add(new FieldConfiguration(FIELD_ALL_PROPERTIES, false, 1f, analyzer_id));
		query_fields.add(new FieldConfiguration(FIELD_ALL_INPUTS, true, 1f, analyzer_id));

		
		Collections.sort(query_fields, new Comparator<FieldConfiguration>(){
			override compare(FieldConfiguration arg0, FieldConfiguration arg1) {
				if(arg0.weight==arg1.weight){
					return 0;
				}
				else if(arg0.weight>arg1.weight){
					return 1;
				}
				else{
					return -1;
				}
			}
		});
		
		Collections.reverse(query_fields);
		
		buildAnalyzer(index_fields);
		buildQueryParser(index_fields);

		return;
	}
	
	public def buildQueryParser(List<FieldConfiguration> config){
		
		var boosts = new HashMap<String, Float>();
		var fields = new ArrayList<String>();
		for(FieldConfiguration field:config){
			
			if(field.enabled){
				boosts.put(field.id, field.weight);
				fields.add(field.id);
			}
		}
		
		queryparser = new MultiFieldQueryParser(fields, analyzer, boosts);		
	}
	
	public def buildAnalyzer(List<FieldConfiguration> config){
		
		var analyzerMap = new HashMap<String, Analyzer>();
		
		for(FieldConfiguration field:config){
			
			if(field.enabled){
				analyzerMap.put(field.id, field.analyzer);
			}
		}
		
		analyzer = new PerFieldAnalyzerWrapper(new StandardAnalyzer(), analyzerMap);
	}
	
	public def init(Model global){
	
		this.global = global;
		
		//http://lucene.apache.org/core/4_3_0/core/org/apache/lucene/search/package-summary.html#scoringBasics
		var config = new IndexWriterConfig(analyzer);
		var writer = new IndexWriter(index, config);
		var count =0;
		for(OntClass c:OWLUtil.listClasses(global)){
			
			var class_label = NameProvider.getLabel(c);
			var class_comment = OWLUtil.getLiteral(c, RDFS.comment);
			var class_super = resources2string(OWLUtil.listSuperClasses(c));
			var class_sub = resources2string(OWLUtil.listSubClasses(c));
			var class_properties = resources2string(OWLUtil.listProperties2(c));

			for(Resource p:OWLUtil.listAllProperties(c)){
				var property_label = NameProvider.getLabel(p);
				var property_comment = OWLUtil.getLiteral(p, RDFS.comment);
				var related = class_label+" "+NameProvider.getLabel(p);
				var synonyms = class_label+" "+NameProvider.getLabel(p);

				for(Resource range:OWLUtil.listRange(p)){
					
					var doc = new Document();
					for(FieldConfiguration field:index_fields){
						
						if(field.enabled){
							var input = "";
							switch(field.id){
								case FIELD_CLASS_LABEL: input = class_label
								case FIELD_CLASS_COMMENT: input = class_comment
								case FIELD_CLASS_SUPER: input = class_super
								case FIELD_CLASS_SUB: input=class_sub
								case FIELD_CLASS_PROPERTIES: input = class_properties
								case FIELD_PROPERTY_LABEL: input = property_label
								case FIELD_PROPERTY_COMMENT: input = property_comment
								case FIELD_OBJECT_LABEL: input = NameProvider.getLabel(range)
								case FIELD_CONCEPTNET_RELATED: input = related
								case FIELD_CONCEPTNET_SYNONYM: input = synonyms
								default:{
									throw new IllegalStateException('''Unknown field discovered: «field.id»''');
								}
							}
							
							doc.add(new TextField(field.id, input, Field.Store.YES));
						}
					}
					
					doc.add(new StringField(FIELD_CLASS_URI, c.URI, Field.Store.YES));
					doc.add(new StringField(FIELD_PROPERTY_URI, p.URI, Field.Store.YES));
					doc.add(new StringField(FIELD_OBJECT_URI, range.URI, Field.Store.YES));	
					writer.addDocument(doc);
					count++;
				}
				
			}
			
		}
		
		writer.close;
	}
	
}