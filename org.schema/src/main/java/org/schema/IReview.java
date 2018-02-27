package org.schema;
/**
* A review of an item - for example, of a restaurant, movie, or store.
*/
public interface IReview extends ICreativeWork{
	
	
	/**
	 * The actual body of the review.
	 *
	 */
	
	public String getReviewBody() throws ClassCastException;
	
	public void setReviewBody(String value) throws ClassCastException;
	/**
	 * The rating given in this review. Note that reviews can themselves be rated. The <code>reviewRating</code> applies to rating given by the review. The <a class="localLink" href="http://schema.org/aggregateRating">aggregateRating</a> property applies to the review itself, as a creative work.
	 *
	 */
	
	public Rating getReviewRating() throws ClassCastException;
	
	public void setReviewRating(Rating value) throws ClassCastException;
	/**
	 * The item that is being reviewed/rated.
	 *
	 */
	
	public Thing getItemReviewed() throws ClassCastException;
	
	public void setItemReviewed(Thing value) throws ClassCastException;
}
