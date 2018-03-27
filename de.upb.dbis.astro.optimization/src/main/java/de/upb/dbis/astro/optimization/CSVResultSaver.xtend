package de.upb.dbis.astro.optimization

import org.deeplearning4j.arbiter.optimize.api.saving.ResultSaver
import org.deeplearning4j.arbiter.optimize.api.OptimizationResult
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Map
import de.upb.dbis.commons.FileWriter
import org.deeplearning4j.arbiter.optimize.api.saving.ResultReference

class CSVResultSaver implements ResultSaver {
	
	override getSupportedCandidateTypes() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getSupportedModelTypes() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override saveModel(OptimizationResult result) throws IOException {
		
		var dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		var date = new Date();
		var timestamp = dateFormat.format(date);
		
		var buffer = new StringBuilder();
		
		buffer.append('''"«timestamp»"''');
		buffer.append(";");

		var candidate = result.candidate.value;		
		
		if(candidate instanceof Map){
			
			for(var iter=candidate.keySet.iterator; iter.hasNext;){
				var key = iter.next;
				var value = candidate.get(key);
				
				buffer.append(value);
				
				buffer.append(";");
				
			}
			
			buffer.append(result.score);
			buffer.append("\n");
			
			new FileWriter("./").write("results.csv", buffer.toString, true);
		}
		
		return new CsvResult(result);
		
	}
	
	private static class CsvResult implements ResultReference {
        private OptimizationResult result;

		new(OptimizationResult r){
			this.result = r;
		}
		
        override getResult() throws IOException {
            return result;
        }
    }
	
}