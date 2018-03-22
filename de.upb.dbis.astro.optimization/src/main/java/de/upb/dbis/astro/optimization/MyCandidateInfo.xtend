package de.upb.dbis.astro.optimization

import org.deeplearning4j.arbiter.optimize.runner.CandidateInfo
import org.deeplearning4j.arbiter.optimize.runner.CandidateStatus

class MyCandidateInfo extends CandidateInfo {
	
	new(CandidateStatus status){
		this.candidateStatus = status;
	}
}