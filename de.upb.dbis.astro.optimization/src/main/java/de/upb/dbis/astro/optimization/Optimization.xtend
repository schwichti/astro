package de.upb.dbis.astro.optimization

import java.util.concurrent.TimeUnit
import org.deeplearning4j.arbiter.optimize.api.termination.MaxTimeCondition
import org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration
import org.deeplearning4j.arbiter.optimize.generator.RandomSearchGenerator
import org.deeplearning4j.arbiter.optimize.parameter.integer.IntegerParameterSpace
import org.deeplearning4j.arbiter.optimize.runner.LocalOptimizationRunner

class Optimization {
	
	
	public static def main(String[] args){
		
		//var parameterspace = new ContinuousParameterSpace(1, 10);
		
		var parameterspace = new VectorSpace();
		parameterspace.nestedSpaces.put("a", new IntegerParameterSpace(1, 2));
		//parameterspace.nestedSpaces.put("b", new IntegerParameterSpace(1, 2));
		
		
		var candidateGenerator = new RandomSearchGenerator(parameterspace, null);
		
		var scoreFunction = new MAPScore();
		
		var terminationCondition = new MaxTimeCondition(1, TimeUnit.MINUTES);
		
		var configuration = new OptimizationConfiguration.Builder()
                .candidateGenerator(candidateGenerator)
                //.dataProvider(dataProvider)
                //.modelSaver(modelSaver)
                .scoreFunction(scoreFunction)
                .terminationConditions(terminationCondition)
                .build();
                
        
        var runner = new LocalOptimizationRunner(configuration, new RunAstroTask());
        
        
		runner.execute();
		
	}
}