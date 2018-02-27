package org.schema;
/**
* A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
*/
public interface IRating extends IIntangible{
	
	
	/**
	 * The rating for the content.
	 *
	 */
	
	public <T> T getRatingValue(Class<T> c) throws ClassCastException;
	
	public void setRatingValue(String value) throws ClassCastException;
	public void setRatingValue(Float value) throws ClassCastException;
	/**
	 * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
	 *
	 */
	
	public <T> T getBestRating(Class<T> c) throws ClassCastException;
	
	public void setBestRating(Float value) throws ClassCastException;
	public void setBestRating(String value) throws ClassCastException;
	/**
	 * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
	 *
	 */
	
	public <T> T getWorstRating(Class<T> c) throws ClassCastException;
	
	public void setWorstRating(String value) throws ClassCastException;
	public void setWorstRating(Float value) throws ClassCastException;
	/**
	 * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
	 *
	 */
	
	public <T> T getAuthor(Class<T> c) throws ClassCastException;
	
	public void setAuthor(Person value) throws ClassCastException;
	public void setAuthor(Organization value) throws ClassCastException;
}
