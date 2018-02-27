package org.schema;
/**
* A fact-checking review of claims made (or reported) in some creative work (referenced via itemReviewed).
*/
public interface IClaimReview extends IReview{
	
	
	/**
	 * A short summary of the specific claims reviewed in a ClaimReview.
	 *
	 */
	
	public String getClaimReviewed() throws ClassCastException;
	
	public void setClaimReviewed(String value) throws ClassCastException;
}
