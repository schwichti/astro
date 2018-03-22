package de.upb.dbis.astro.optimization

import org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction
import org.deeplearning4j.arbiter.optimize.api.data.DataProvider
import java.util.Map

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
		return 0.2;
	}
	
}