package de.upb.debis.openapi2owls

class UriProvider {
	
	public static UriProvider INSTANCE = new UriProvider();
	
	private new(){
		
	}
	
	public def String json2property(String namespace, String path){
		
		var path_ = path.replaceAll("[^a-zA-Z0-9-_]", "_");
		path_ = path.toLowerCase;
		return '''«namespace»#«path_»''';
		
	}
	
	public def String json2propertyOld(String namespace, String path){
		
		var path_ = path.replaceAll("[^a-zA-Z0-9-_]", "_");
		return '''«namespace»#«path_»''';
		
	}	
	
	public def String json2class(String namespace, String path){
		
		var path_ = path.replaceAll("[^a-zA-Z0-9-_]", "_");
		path_ = path_.toLowerCase.toFirstUpper;
		return '''«namespace»#«path_»''';
		
	}
	public def String json2classOld(String namespace, String path){
		var path_ = path.replaceAll("[^a-zA-Z0-9-_]", "_");
		return '''«namespace»#«path_»''';
		
	}	
	
	public def String namespaceREMOVE(String host, String operationId, String method, String lastSegment){
		
		var lastSegment_ = lastSegment.replace(" ", "+");
		lastSegment_ = lastSegment_.replace("|","%7C");
		return '''http://127.0.0.1/services/«host».owls#«operationId»/«method»/«lastSegment_»''';
		
	}
	
	public def String namespaceService(String host, String operationId, String method){
		return '''http://127.0.0.1/services/«host»-«operationId»-«method».owls''';
	}
	
	public def String namespaceService(String host, String operationId, String method, String classname){
		var classname_ = classname.replaceAll("[^a-zA-Z0-9-_]", "_");
		return '''http://127.0.0.1/services/«host»-«operationId»-«method».owls#«classname_»''';
	}
	
	public def String namespaceDomain(String host, String operationId, String method){
		return '''http://127.0.0.1/ontology/«host»-«operationId»-«method».owl''';
	}
	
	public def String namespaceREMOVE(String host){
		return '''http://127.0.0.1/services/«host».owls''';
	}
	
	public def String domainRoot(String host, String operationId, String method){
		
		var id = operationId.replaceAll("[^a-zA-Z0-9-_]", "_");
		id = id.toFirstUpper;
		
		return '''http://127.0.0.1/ontology/«host»-«operationId»-«method».owl#«id»''';
	}
	
}
