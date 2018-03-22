package de.upb.dbis.json2owl


class IdentifierProvider {
	
	
	public def caseClass(String name){
		return name.toFirstUpper;
	}
	
	public def caseProperty(String name){
		return name.toFirstLower;
	}
	
	public def caseList(String name){
		return name.toFirstUpper+"List";
	}
	
}
