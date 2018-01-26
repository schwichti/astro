package de.upb.debis.codegen.owl

import de.upb.debis.commons.FileWriter
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

class IDomainGenerator {
	
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
	
	
	public def caseOntModel(OntModel model){
		
		this.model = model;
		
		var statements = model.listStatements(null, RDF.type, OWL.Class).toList;
		var classes = statements.map[s|s.subject.^as(OntClass)].toList;
		
		
		for(OntClass c:classes){
			if(!DATATYPES.contains(c.URI)){
				fileWriter.write(c.localName,caseOntClass(c));
				
			}
		}
		
	}
	
	public def caseOntClass(OntClass c){
		
		
		var superclasses = model.listStatements(c, RDFS.subClassOf, null as RDFNode).map[s|s.object.asResource].toList;
		
		var properties = model.listStatements(null, RDFS.domain, c).map[s|s.subject].toList;
			
		
		var datatypeproperties = properties.filter[p|p.canAs(DatatypeProperty)].map[p|p.^as(DatatypeProperty)];
		var objectproperties = properties.filter[p|p.canAs(ObjectProperty)].map[p|p.^as(ObjectProperty)];
		
		
//		var datatypeproperties = model.listStatements(c, RDF.type, ).map[s|s.object.^as(OntClass)].toList;
		var classcomments = model.listStatements(c,RDFS.comment, null as RDFNode).map[s|s.object.asLiteral.string].toList
		
		return '''
			package org.schema;
			/**
			«FOR String comment:classcomments»
				* «comment»
			«ENDFOR»
			*/
			public interface I«c.localName»«FOR Resource superclass:superclasses BEFORE " extends " SEPARATOR ', '»I«superclass.localName»«ENDFOR»{
				
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
					 */
					
					«IF ranges.size==1»
						public «ranges.get(0)» get«p.localName.toFirstUpper»() throws ClassCastException;
					«ELSE»
						public <T> T get«p.localName.toFirstUpper»(Class<T> c) throws ClassCastException;
					«ENDIF»
					
					«FOR String range:ranges»
						public void set«p.localName.toFirstUpper»(«range» value) throws ClassCastException;
					«ENDFOR»
				«ENDFOR»
			}
		'''
	}
	

}
