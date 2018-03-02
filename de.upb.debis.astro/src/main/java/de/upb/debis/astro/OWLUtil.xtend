package de.upb.debis.astro

import org.apache.jena.rdf.model.Property;
import org.apache.jena.vocabulary.RDFS
import org.apache.jena.rdf.model.Resource
import org.apache.jena.rdf.model.Statement
import java.util.ArrayList
import org.apache.jena.rdf.model.Model
import org.apache.jena.rdf.model.RDFNode
import org.apache.jena.ontology.OntProperty
import java.util.List
import org.apache.jena.ontology.OntResource
import org.apache.jena.vocabulary.OWL
import org.apache.jena.vocabulary.RDF
import org.apache.jena.ontology.DatatypeProperty
import org.apache.jena.ontology.OntClass
import java.util.LinkedList
import java.util.HashSet
import java.util.Set
import org.apache.jena.ontology.ObjectProperty

class OWLUtil {
	
	public static def getDomains33(Property property){
		
		var statements = property.model.listStatements(property, RDFS.domain, null as Resource);
		var result = new ArrayList<Resource>();
		for(Statement stmt:statements.toList){
			result.add(stmt.object.asResource);
		}
		return result;
	}
	
	public static def listRange(Resource r){
		
		var statements = r.model.listStatements(r, RDFS.range, null as Resource);
		var result = new ArrayList<Resource>();
		for(Statement stmt:statements.toList){
			result.add(stmt.object.asResource);
		}
		return result;
	}
	
	public static def listDomain(Resource r){
		
		var statements = r.model.listStatements(r, RDFS.domain, null as Resource);
		var result = new ArrayList<Resource>();
		for(Statement stmt:statements.toList){
			result.add(stmt.object.asResource);
		}
		return result;
	}	
	
	public static def listProperties(Resource c){
		
		var statements = c.model.listStatements(null, RDFS.domain, c);
		var result = new ArrayList<Resource>();
		
		for(var iter=statements;iter.hasNext;){
			var next = iter.next;
			result.add(next.subject);
		}
		
		return result;
	}
	
	public static def boolean isSuperClassOf(Resource r1, Resource r2){
		
		if(r1.canAs(OntClass) && r2.canAs(OntClass)){
			
			return isSuperClassOf(r1.^as(OntClass), r2.^as(OntClass));
		}
		return false;
	}
	
	public static def boolean isSuperClassOf(OntClass r1, OntClass r2){
		
		var result = new LinkedList<Resource>();
		
		result.addAll(listSuperClasses(r2));
		
		while(!result.empty){
			
			var first = result.poll();
			
			if(first.equals(r1)){
				return true;
			}
			
			for(Resource next:listSuperClasses(first)){
					
				result.add(next);
			}
			
		}
		return false;
	}
	
	public static def List<Resource> listSuperClasses(Resource c){
		
		var result = new ArrayList<Resource>();
		
		for(var iter=c.model.listStatements(c, RDFS.subClassOf, null as RDFNode); iter.hasNext;){
			
			var next = iter.next;
			result.add(next.object.asResource);
			
		}
		return result;
	}
	
	public static def List<Resource> listSubClasses(Resource c){
		
		var result = new ArrayList<Resource>();
		
		for(var iter=c.model.listStatements(null, RDFS.subClassOf, c); iter.hasNext;){
			
			var next = iter.next;
			result.add(next.object.asResource);
			
		}
		return result;
	}	
	
	
	
	public static def Set<OntClass> getSubclassClosure(OntClass r){
		var result = new HashSet<OntClass>();
	
		var queue = new LinkedList<OntClass>();
		queue.add(r);
		
		while(!queue.empty){
			
			var first = queue.poll();
			
			result.add(first);
			queue.addAll(first.listSubClasses.toList);
			
		}
		return result;
		
	}
	
	public static def Set<Resource> listAllSuperClasses(Resource r){
		var result = new HashSet<Resource>();
	
		var queue = new LinkedList<Resource>();
		queue.add(r);
		
		while(!queue.empty){
			
			var first = queue.poll();
			
			result.add(first);
			queue.addAll(listSuperClasses(first));
			
		}
		return result;
		
	}	
	
	public static def getResource(Model model, String URI){
		
		if(model!==null){
			
			if(URI!==null){
				return model.getResource(URI);	
			}
		}
		else{
			return null;
		}
	}
	
	public static def List<DatatypeProperty> listDatatypeProperties(Model model){
		
		var result = new ArrayList<DatatypeProperty>();
		
		for(var iter = model.listStatements(null, RDF.type, OWL.DatatypeProperty);iter.hasNext;){
			
			var s = iter.next;
			if(s.subject.canAs(DatatypeProperty)){
				
				result.add(s.subject.^as(DatatypeProperty));
			}
			
		}
		
		return result;
	}
	public static def List<ObjectProperty> listObjectProperties(Model model){
		
		var result = new ArrayList<ObjectProperty>();
		
		for(var iter = model.listStatements(null, RDF.type, OWL.ObjectProperty);iter.hasNext;){
			
			var s = iter.next;
			if(s.subject.canAs(ObjectProperty)){
				
				result.add(s.subject.^as(ObjectProperty));
			}
			
		}
		
		return result;
	}	
	
	public static def List<OntClass> listClasses(Model model){
		
		var result = new ArrayList<OntClass>();
		
		for(var iter = model.listStatements(null, RDF.type, OWL.Class);iter.hasNext;){
			
			var s = iter.next;
			if(s.subject.canAs(OntClass)){
				
				result.add(s.subject.^as(OntClass));
			}
			
		}
		
		return result;
	}
	
	public static def List<Resource> listProperties2(OntResource c){
		
		var model = c.model;
		var result = new ArrayList<Resource>();
		
		for(var iter = model.listStatements(null, RDFS.domain, c);iter.hasNext;){
			
			var s = iter.next;
			
			result.add(s.subject);
			
		}
		
		return result;
	}	
	
	
	public static def List<Resource> listAllProperties(OntResource c){
		
		var result = new ArrayList<Resource>();
		var superclasses = listAllSuperClasses(c);
		
		for(Resource r:superclasses){
			
			for(Resource p:listProperties(r)){
				
				result.add(p);
			}
		}
		
		return result;
	}
	
	public static def List<OntProperty> listProperties(OntResource c){
		
		var model = c.model;
		var result = new ArrayList<OntProperty>();
		
		for(var iter = model.listStatements(null, RDFS.domain, c);iter.hasNext;){
			
			var s = iter.next;
			
			if(s.subject.canAs(OntProperty)){
				
				result.add(s.subject.^as(OntProperty));
			}
			
			
		}
		
		return result;
	}
	
	public static def getServiceName(Model model){
			
		var property = model.createProperty("http://www.daml.org/services/owl-s/1.1/Profile.owl#serviceName");
		
		for(Statement stmt : model.listStatements(null, property, null as RDFNode).toList){
			
			if(stmt.object.isLiteral){
				
				//TODO check if the type is string or can be casted to string
				var literal = stmt.object.asLiteral.string;
				
				return literal;
								
			}
		}
		return "";
	}
	
	public static def List<Resource> listInstances(Model model, Resource type){
		
		var result = new ArrayList<Resource>();
		for(var iter=model.listStatements(null, RDF.type, type);iter.hasNext;){
			var s = iter.next;
			if(s.subject.isResource){
				
				result.add(s.subject.asResource);
			}
		}
		return result;
	}
	
	public static def String getLiteral(Resource subject, Property predicate){
		return getLiteral(subject.model, subject, predicate);
	}
	
	public static def List<Resource> getResource(Resource subject, Property predicate){
		
		var result = new ArrayList<Resource>();
		
		var model = subject.model;
		
		
		for(var iter = model.listStatements(subject, predicate, null as RDFNode); iter.hasNext;){
			
			var stmt = iter.next;
			
			if(stmt.object.isResource){
				
				result.add(stmt.object.asResource);	
			}
			
		}
		
		return result;
		
	}
	
	public static def String getLiteral(Model model, Resource subject, Property predicate){
		
		
		var statement = model.listStatements(subject, predicate, null as RDFNode).toList;
		
		try{
			
			var object = statement.get(0).object;
			if(object.isLiteral){
				
				return statement.get(0).object.asLiteral.string;
			}
			else if(object.isResource){
				return statement.get(0).object.asResource.URI;
			}
			else{
				System.out.println("Error: " +subject+" "+predicate+": Object is no literal or resource");
				return "";	
			}
			
		}
		catch(Exception e){
			System.out.println("Error: " +subject+" "+predicate+" "+e.getMessage());
			return "";
		}
	}
	
	public static def String getLiteral(Model model, Property predicate){
		return getLiteral(model, null, predicate);
	}
	
	
	

}