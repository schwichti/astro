package de.upb.dbis.testcollection.utils

import java.io.File
import de.upb.dbis.commons.FileWriter

class CSVGenerator {
	
	
	public static def void main(String[] args){
		
		new CSVGenerator().run();
	}
	
	public def run(){
		
		var services_folder = new File("../de.upb.is.sme2/testcollections/unnormalized/htdocs/services");
		var query_folder = new File("../de.upb.is.sme2/testcollections/unnormalized/htdocs/queries");
		var stringbuffer = new StringBuffer();
		
		//header
		stringbuffer.append(''',''');
		var query_iterator = query_folder.listFiles.iterator;
		while(query_iterator.hasNext){
			var query = query_iterator.next;
			stringbuffer.append('''«query.name»''');
			
			if(query_iterator.hasNext){
	        	stringbuffer.append(",");
	        }
		}
		stringbuffer.append("\n");
		
		//table
	    var service_iterator = services_folder.listFiles.iterator;
    	
    	while(service_iterator.hasNext){
    		var service = service_iterator.next;
    		
    		stringbuffer.append('''«service.name»,''');
    		
    		query_iterator = query_folder.listFiles.iterator;
    		
    		while(query_iterator.hasNext){
    			
    			query_iterator.next;
    			
    			stringbuffer.append('''-1''');
    			
    			if(query_iterator.hasNext){
    				stringbuffer.append(",");
    			}
    			
    		}
    		stringbuffer.append("\n");

    	}
		
	   
	   new FileWriter("../de.upb.is.sme2/testcollections/unnormalized/").write("matrix.csv", stringbuffer.toString);
	}
}
