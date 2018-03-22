package de.upb.dbis.astro.evaluation;

import org.apache.jena.rdf.model.Resource
import de.upb.dbis.astro.Triple

class Comparator {
	
	public static enum Match{TRUE_POSITIVE, TRUE_NEGATIVE, FALSE_POSITIVE, FALSE_NEGATIVE}
	
	public static def Match eval(Triple expectedTriple, Triple actualTriple){
		
		if(expectedTriple===null && actualTriple===null){
			return Match.TRUE_NEGATIVE;
		}
		else if(expectedTriple!==null && actualTriple===null){
			return Match.FALSE_NEGATIVE;
		}
		else if(expectedTriple===null && actualTriple!==null){
			return Match.FALSE_POSITIVE;
		}
		else if(expectedTriple!==null && actualTriple!==null && !expectedTriple.equals(actualTriple)){
			return Match.FALSE_POSITIVE;
		}
		else if(expectedTriple!==null && actualTriple!=null && expectedTriple.equals(actualTriple)){
			return Match.TRUE_POSITIVE;
			
		}
		else{
			throw new IllegalStateException();
		}
	}
	
	public static def Match eval(Resource expectedResource, Resource actualResource){
		
		if(expectedResource===null && actualResource===null){
			return Match.TRUE_NEGATIVE;
		}
		else if(expectedResource!==null && actualResource===null){
			return Match.FALSE_NEGATIVE;
		}
		else if(expectedResource===null && actualResource!==null){
			return Match.FALSE_POSITIVE;
		}
		else if(expectedResource!==null && actualResource!==null && !expectedResource.equals(actualResource)){
			return Match.FALSE_POSITIVE;
		}
		else if(expectedResource!==null && actualResource!==null && expectedResource.equals(actualResource)){
			return Match.TRUE_POSITIVE;
			
		}		
	}
}