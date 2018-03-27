package de.upb.dbis.astro.optimization

import java.util.concurrent.TimeUnit
import org.deeplearning4j.arbiter.optimize.api.termination.MaxTimeCondition
import org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration
import org.deeplearning4j.arbiter.optimize.generator.RandomSearchGenerator
import org.deeplearning4j.arbiter.optimize.parameter.integer.IntegerParameterSpace
import org.deeplearning4j.arbiter.optimize.runner.LocalOptimizationRunner
import de.upb.dbis.astro.QueryDelegator

class Optimization {
	
	
	public static def main(String[] args){
		
		
		var min = 0;
		var max = 10;
		
		var parameterspace = new VectorSpace();
		//index fields:
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_CLASS_LABEL, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_CLASS_COMMENT, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_CLASS_SUPER, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_CLASS_SUB, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_CLASS_PROPERTIES, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_PROPERTY_LABEL, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_PROPERTY_COMMENT, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_OBJECT_LABEL, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_CONCEPTNET_RELATED, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_CONCEPTNET_SYNONYM, new IntegerParameterSpace(min, max));
		//query parts:
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_RESOURCE_LABEL, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_JSONPATH, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_PARAMETER_DESCRIPTION, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_OPERATION_ID, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_OPERATION_DESCRIPTION, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_SERVICE_DESCRIPTION, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_ALL_PROPERTIES, new IntegerParameterSpace(min, max));
		parameterspace.nestedSpaces.put(QueryDelegator.FIELD_ALL_INPUTS, new IntegerParameterSpace(min, max));
		
		
		//parameterspace.nestedSpaces.put("b", new IntegerParameterSpace(1, 2));
		
		
		var candidateGenerator = new RandomSearchGenerator(parameterspace, null);
		
		var scoreFunction = new MAPScore();
		
		var terminationCondition = new MaxTimeCondition(10, TimeUnit.MINUTES);
		
		var configuration = new OptimizationConfiguration.Builder()
                .candidateGenerator(candidateGenerator)
                //.dataProvider(dataProvider)
                //.modelSaver(modelSaver)
                .modelSaver(new CSVResultSaver())
                .scoreFunction(scoreFunction)
                .terminationConditions(terminationCondition)
                .build();
                
        
        var runner = new LocalOptimizationRunner(8, configuration, new RunAstroTask());
        
        
		runner.execute();
		
	}
}