package de.upb.dbis.astro.ui

import java.util.Map

class HTMLRenderer {
	
	public static def render(Map<String, String> titleDescription){
		'''
			<html>
			<body>
			«FOR String key:titleDescription.keySet»
				<h3>«key»</h3>
				<p>«titleDescription.get(key)»</p>
			«ENDFOR»
			</body>
			</html>
		'''
	}
}
