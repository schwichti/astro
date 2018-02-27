package org.schema;
/**
* A brand is a name used by an organization or business person for labeling a product, product group, or similar.
*/
public interface IBrand extends IIntangible{
	
	
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 */
	
	public AggregateRating getAggregateRating() throws ClassCastException;
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException;
	/**
	 * A review of the item.
	 *
	 */
	
	public Review getReview() throws ClassCastException;
	
	public void setReview(Review value) throws ClassCastException;
	/**
	 * An associated logo.
	 *
	 */
	
	public <T> T getLogo(Class<T> c) throws ClassCastException;
	
	public void setLogo(ImageObject value) throws ClassCastException;
	public void setLogo(String value) throws ClassCastException;
}
