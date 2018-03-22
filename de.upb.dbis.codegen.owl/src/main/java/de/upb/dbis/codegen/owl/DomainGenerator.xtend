package de.upb.dbis.codegen.owl

import de.upb.dbis.commons.FileWriter
import java.util.HashSet
import java.util.LinkedList
import java.util.Set
import org.apache.jena.ontology.DatatypeProperty
import org.apache.jena.ontology.ObjectProperty
import org.apache.jena.ontology.OntClass
import org.apache.jena.ontology.OntModel
import org.apache.jena.ontology.OntProperty
import org.apache.jena.rdf.model.Model
import org.apache.jena.rdf.model.RDFNode
import org.apache.jena.rdf.model.Resource
import org.apache.jena.vocabulary.OWL
import org.apache.jena.vocabulary.RDF
import org.apache.jena.vocabulary.RDFS

class DomainGenerator {
	
	private var tt = SchemaorgTypeTranslator.INSTANCE;
	private var model = null as Model;
	private FileWriter fileWriter;
	
	private Set<String> DATATYPES = #{
		"http://schema.org/Boolean",
		"http://schema.org/DataType",
		"http://schema.org/Date",
		"http://schema.org/DateTime",
		"http://schema.org/Number",
		"http://schema.org/Text",
		"http://schema.org/Time",
		"http://schema.org/Float",
		"http://schema.org/Integer",
		"http://schema.org/URL"
	};
	
	new(String filepattern, String path){
		
		fileWriter = new FileWriter(filepattern, path);
	}
	
	private def Set<Resource> listAllSuperClasses(Resource r){
	
		var queue = new LinkedList<Resource>();
		var all = new HashSet<Resource>();
		var firsts = new HashSet<Resource>();
		
		queue.add(r);
		
		while(!queue.empty){
			var first = queue.poll();
			var superclasses = model.listStatements(first, RDFS.subClassOf, null as RDFNode).map[s|s.object.asResource].toList;
			queue.addAll(superclasses);
			all.addAll(superclasses);
		}
		
		queue = new LinkedList<Resource>();
		queue.add(r);
		while(!queue.empty){
			
			var first = queue.poll();
			var superclasses = model.listStatements(first, RDFS.subClassOf, null as RDFNode).map[s|s.object.asResource].toList;
			if(!superclasses.empty){
				
				queue.add(superclasses.get(0));
				firsts.add(superclasses.get(0));
			}
		}
		
		all.removeAll(firsts);
		return all.toSet;
		
	}
	
	
	
	public def caseOntModel(OntModel model){
		
		this.model = model;
		
		var statements = model.listStatements(null, RDF.type, OWL.Class).toList;
		var classes = statements.map[s|s.subject.^as(OntClass)].toList;
		
		
		for(OntClass c:classes){
			
			if(!DATATYPES.contains(c.getURI)){
				fileWriter.write(c.localName,caseOntClass(c));
				
			}
			
		}
		
	}
	
	public def caseOntClass(OntClass c){
		
		
		var superclasses = model.listStatements(c, RDFS.subClassOf, null as RDFNode).map[s|s.object.asResource].toList;
		
		var properties = model.listStatements(null, RDFS.domain, c).map[s|s.subject].toList;
		
		var datatypeproperties = properties.filter[p|p.canAs(DatatypeProperty)].map[p|p.^as(DatatypeProperty)];
		var objectproperties = properties.filter[p|p.canAs(ObjectProperty)].map[p|p.^as(ObjectProperty)].toList;
		
		for(Resource r : listAllSuperClasses(c)){
			var properties2 = model.listStatements(null, RDFS.domain, r).map[s|s.subject].toList;
			var objectproperties2 = properties2.filter[p|p.canAs(ObjectProperty)].map[p|p.^as(ObjectProperty)];		
			objectproperties.addAll(objectproperties2);
		}
		
		
//		var datatypeproperties = model.listStatements(c, RDF.type, ).map[s|s.object.^as(OntClass)].toList;
		var classcomments = model.listStatements(c,RDFS.comment, null as RDFNode).map[s|s.object.asLiteral.string].toList
		
		return '''
			package org.schema;
			/**
			«FOR String comment:classcomments»
				* «comment»
			«ENDFOR»
			*/
			public class «c.localName»«IF superclasses.size>0» extends «superclasses.get(0).localName»«FOR superclass:superclasses.subList(1,superclasses.length) BEFORE " implements " SEPARATOR ', '»I«superclass.localName»«ENDFOR»«ENDIF»{
				
				«FOR OntProperty p:datatypeproperties»
					«var ranges = p.listRange.toList»
					public «IF ranges.size==1»«tt.translateType(ranges.get(0))»«ELSE»Object«ENDIF» «p.localName»;
				«ENDFOR»
				
				«FOR OntProperty p:objectproperties»
					«var ranges = p.listRange.toList.map[r|tt.translateType(r)].toSet»
					«var comments = model.listStatements(p,RDFS.comment, null as RDFNode).map[s|s.object.asLiteral.string].toList»
					/**
					«FOR String comment:comments»
						* «comment»
					«ENDFOR»
					*
					* Ranges: «FOR Resource range:p.listRange.toList SEPARATOR ', '»«range.localName»«ENDFOR»
					*/
					private «IF ranges.size==1»«ranges.get(0)»«ELSE»Object«ENDIF» _«p.localName»;
					
					«IF ranges.size==1»
						public «ranges.get(0)» get«p.localName.toFirstUpper»() throws ClassCastException{
							return («ranges.get(0)») _«p.localName»;
						}
					«ELSE»
						public <T> T get«p.localName.toFirstUpper»(Class<T> c) throws ClassCastException{
							return (T) _«p.localName»;
						}
					«ENDIF»
					
					«FOR String range:ranges»
						public void set«p.localName.toFirstUpper»(«range» value) throws ClassCastException{
							_«p.localName» = value;
						}
					«ENDFOR»
				«ENDFOR»
			}
		'''
	}
	

}
