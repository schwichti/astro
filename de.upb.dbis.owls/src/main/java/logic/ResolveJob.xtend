package logic

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature

class ResolveJob {
	
	
	private EObject owner;
	private String feature;
	private Object value;
	
	new(EObject owner, String feature, Object value){
		this.owner = owner;
		this.feature = feature;
		this.value = value;
	}
	
	public def EObject getOwner(){
		return owner;
	}
	
	public def String getEStructuralFeature(){
		return feature;
	}
	
	public def Object getValue(){
		return value;
	}
}