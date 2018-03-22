package de.upb.dbis.astro

import org.apache.jena.rdf.model.Resource

class Triple {
	
	public Resource subject;
	public Resource predicate;
	public Resource object;
	
	new(Triple copy){
		this.subject = copy.subject;
		this.predicate= copy.predicate;
		this.object = copy.object;
	}
	
	new(Resource subject, Resource predicate, Resource object) {
		
		this.subject = subject;
		this.predicate = predicate;
		this.object = object;
		
	}
	
	new() {
	}
	
	override boolean equals(Object obj){
		
		if (obj === null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		var other = obj as Triple;
		if (object === null) {
			if (other.object !== null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		if (predicate === null) {
			if (other.predicate !== null)
				return false;
		} else if (!predicate.equals(other.predicate))
			return false;
		if (subject === null) {
			if (other.subject !== null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	
	override hashCode(){
		val int prime = 31;
		var result = 1;
		result = prime * result + if(object===null){0}else{object.URI.hashCode()};
		result = prime * result + if(predicate===null){0}else{predicate.URI.hashCode()};
		result = prime * result + if(object===null){0}else{object.URI.hashCode()};
		return result;
	}
	
	override toString(){
		
		var s = if(subject!==null){subject.localName}else{"?"};
		var p = if(predicate!==null){predicate.localName}else{"?"};
		var o = if(object!==null){object.localName}else{"?"};
		
		return '''<«s», «p», «o»>''';
	}
	
}