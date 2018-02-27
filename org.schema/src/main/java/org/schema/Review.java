package org.schema;
/**
* A review of an item - for example, of a restaurant, movie, or store.
*/
public class Review extends CreativeWork{
	
	
	/**
	* The actual body of the review.
	 *
	 * Ranges: Text
	 */
	private String _reviewBody;
	
	public String getReviewBody() throws ClassCastException{
		return (String) _reviewBody;
	}
	
	public void setReviewBody(String value) throws ClassCastException{
		_reviewBody = value;
	}
	/**
	* The rating given in this review. Note that reviews can themselves be rated. The <code>reviewRating</code> applies to rating given by the review. The <a class="localLink" href="http://schema.org/aggregateRating">aggregateRating</a> property applies to the review itself, as a creative work.
	 *
	 * Ranges: Rating
	 */
	private Rating _reviewRating;
	
	public Rating getReviewRating() throws ClassCastException{
		return (Rating) _reviewRating;
	}
	
	public void setReviewRating(Rating value) throws ClassCastException{
		_reviewRating = value;
	}
	/**
	* The item that is being reviewed/rated.
	 *
	 * Ranges: Thing
	 */
	private Thing _itemReviewed;
	
	public Thing getItemReviewed() throws ClassCastException{
		return (Thing) _itemReviewed;
	}
	
	public void setItemReviewed(Thing value) throws ClassCastException{
		_itemReviewed = value;
	}
}
