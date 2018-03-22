package de.upb.dbis.astro.optimization

import org.deeplearning4j.arbiter.optimize.api.TaskCreator
import org.deeplearning4j.arbiter.optimize.api.Candidate
import org.deeplearning4j.arbiter.optimize.api.data.DataProvider
import org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction
import java.util.List
import org.deeplearning4j.arbiter.optimize.runner.listener.StatusListener
import org.deeplearning4j.arbiter.optimize.api.OptimizationResult
import java.util.concurrent.Callable
import org.deeplearning4j.arbiter.optimize.runner.CandidateInfo
import org.deeplearning4j.arbiter.optimize.runner.CandidateStatus

class RunAstroTask implements TaskCreator, Callable<OptimizationResult> {
	
	
	private Candidate candidate;
	private DataProvider dataProvider;
	private ScoreFunction scoreFunction;
	private List<StatusListener> statusListeners;
	
	override create(Candidate candidate, DataProvider dataProvider, ScoreFunction scoreFunction, List<StatusListener> statusListeners) {
		
		this.candidate = candidate;
		this.dataProvider = dataProvider;
		this.scoreFunction = scoreFunction;
		this.statusListeners = statusListeners;
		
		return this;
	}
	
	override call() throws Exception {
		
		//TODO call Astro with parameters
		
		var score = scoreFunction.score(candidate.value, dataProvider, null);
		
		
		var result = new OptimizationResult(candidate, null, score, candidate.index, null, new MyCandidateInfo(CandidateStatus.Complete));
		
		return result;
		
	}
	
}