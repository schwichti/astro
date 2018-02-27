package org.schema;
/**
* The act of producing a balanced opinion about the object for an audience. An agent reviews an object with participants resulting in a review.
*/
public class ReviewAction extends AssessAction{
	
	
	/**
	* A sub property of result. The review that resulted in the performing of the action.
	 *
	 * Ranges: Review
	 */
	private Review _resultReview;
	
	public Review getResultReview() throws ClassCastException{
		return (Review) _resultReview;
	}
	
	public void setResultReview(Review value) throws ClassCastException{
		_resultReview = value;
	}
}
