package org.schema;
/**
* A fact-checking review of claims made (or reported) in some creative work (referenced via itemReviewed).
*/
public class ClaimReview extends Review{
	
	
	/**
	* A short summary of the specific claims reviewed in a ClaimReview.
	 *
	 * Ranges: Text
	 */
	private String _claimReviewed;
	
	public String getClaimReviewed() throws ClassCastException{
		return (String) _claimReviewed;
	}
	
	public void setClaimReviewed(String value) throws ClassCastException{
		_claimReviewed = value;
	}
}
