package org.schema;
/**
* A brand is a name used by an organization or business person for labeling a product, product group, or similar.
*/
public class Brand extends Intangible{
	
	
	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 * Ranges: AggregateRating
	 */
	private AggregateRating _aggregateRating;
	
	public AggregateRating getAggregateRating() throws ClassCastException{
		return (AggregateRating) _aggregateRating;
	}
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException{
		_aggregateRating = value;
	}
	/**
	* A review of the item.
	 *
	 * Ranges: Review
	 */
	private Review _review;
	
	public Review getReview() throws ClassCastException{
		return (Review) _review;
	}
	
	public void setReview(Review value) throws ClassCastException{
		_review = value;
	}
	/**
	* An associated logo.
	 *
	 * Ranges: ImageObject, URL
	 */
	private Object _logo;
	
	public <T> T getLogo(Class<T> c) throws ClassCastException{
		return (T) _logo;
	}
	
	public void setLogo(ImageObject value) throws ClassCastException{
		_logo = value;
	}
	public void setLogo(String value) throws ClassCastException{
		_logo = value;
	}
}
