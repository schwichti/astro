package org.schema;
/**
* The average rating based on multiple ratings or reviews.
*/
public interface IAggregateRating extends IRating{
	
	
	/**
	 * The count of total number of reviews.
	 *
	 */
	
	public Integer getReviewCount() throws ClassCastException;
	
	public void setReviewCount(Integer value) throws ClassCastException;
	/**
	 * The item that is being reviewed/rated.
	 *
	 */
	
	public Thing getItemReviewed() throws ClassCastException;
	
	public void setItemReviewed(Thing value) throws ClassCastException;
	/**
	 * The count of total number of ratings.
	 *
	 */
	
	public Integer getRatingCount() throws ClassCastException;
	
	public void setRatingCount(Integer value) throws ClassCastException;
}
