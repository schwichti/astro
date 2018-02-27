package org.schema;
/**
* The average rating based on multiple ratings or reviews.
*/
public class AggregateRating extends Rating{
	
	
	/**
	* The count of total number of reviews.
	 *
	 * Ranges: Integer
	 */
	private Integer _reviewCount;
	
	public Integer getReviewCount() throws ClassCastException{
		return (Integer) _reviewCount;
	}
	
	public void setReviewCount(Integer value) throws ClassCastException{
		_reviewCount = value;
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
	/**
	* The count of total number of ratings.
	 *
	 * Ranges: Integer
	 */
	private Integer _ratingCount;
	
	public Integer getRatingCount() throws ClassCastException{
		return (Integer) _ratingCount;
	}
	
	public void setRatingCount(Integer value) throws ClassCastException{
		_ratingCount = value;
	}
}
