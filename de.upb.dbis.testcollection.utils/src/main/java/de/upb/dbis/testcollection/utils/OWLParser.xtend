package de.upb.dbis.testcollection.utils

import de.upb.dbis.commons.AbstractLineProcessor
import java.io.File
import java.util.regex.Pattern
import java.util.regex.Matcher
import java.util.regex.PatternSyntaxException

class OWLParser extends AbstractLineProcessor {
	
	public String serviceName = "";
	public String serviceId = "";
	public String baseUri = "";
	
	new(File file) {
		super(file)
	}
	
	override finish() {
	}
	
	override readLine(String line) {

	   try {
	   		//<http://127.0.0.1/services/1.1/flight.owls#FLIGHT_PROFILE> <http://www.daml.org/services/owl-s/1.1/Profile.owl#serviceName> "Flight"@en .
            var regex = Pattern.compile('''<profile:serviceName xml:lang="en">(.*)</profile:serviceName>''');
            var regex2 = Pattern.compile('''<service:Service rdf:ID="(.*)">''');
            var regex3 = Pattern.compile('''xml:base\s*= "(.*)">''');
            
            if(line!=null && line.length()>0){
            	
                var regexMatcher = regex.matcher(line);
                var regexMatcher2 = regex2.matcher(line);
                var regexMatcher3 = regex3.matcher(line);
                
                if (regexMatcher.find()) {
            		var match = regexMatcher.group(1);
            		serviceName = match;
                }
                
                if (regexMatcher2.find()) {
            		var match = regexMatcher2.group(1);
            		serviceId = match;
                }
                
                if (regexMatcher3.find()) {
            		var match = regexMatcher3.group(1);
            		//serviceUri = match +"#" + serviceUri;
            		baseUri = match;
                }
                
            }
        } catch (PatternSyntaxException ex) {
            // Syntax error in the regular expression
        }
	}
	
}
