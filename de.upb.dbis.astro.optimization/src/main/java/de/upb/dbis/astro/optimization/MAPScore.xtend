package de.upb.dbis.astro.optimization

import org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction
import org.deeplearning4j.arbiter.optimize.api.data.DataProvider
import java.util.Map
import de.upb.dbis.astro.evaluation.Evaluation

class MAPScore implements ScoreFunction {
	
	override getSupportedDataTypes() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getSupportedModelTypes() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override minimize() {
		return false;
	}
	
	override score(Object model, DataProvider dataProvider, Map<String, Object> dataParameters) {
		
		System.out.println("start");
		if(model instanceof Map){
			var path_global_ontology = "C:/Users/Simon/Data/git2/dissertation/implementation/de.upb.is.schemaorg.owl/data/schema.owl.nt";
			var path_testcollection = "C:/Users/Simon/Data/git2/dissertation/implementation/de.upb.is.sme2/testcollections/unnormalized/htdocs/";
			
			var score = new Evaluation(path_global_ontology,path_testcollection, model).run();
			
			System.out.println('''score: «score»''');
			
			return score;
		}
		
		return 0;
	}
	
}