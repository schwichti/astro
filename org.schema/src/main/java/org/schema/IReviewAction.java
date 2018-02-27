package org.schema;
/**
* The act of producing a balanced opinion about the object for an audience. An agent reviews an object with participants resulting in a review.
*/
public interface IReviewAction extends IAssessAction{
	
	
	/**
	 * A sub property of result. The review that resulted in the performing of the action.
	 *
	 */
	
	public Review getResultReview() throws ClassCastException;
	
	public void setResultReview(Review value) throws ClassCastException;
}
