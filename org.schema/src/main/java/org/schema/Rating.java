package org.schema;
/**
* A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
*/
public class Rating extends Intangible{
	
	
	/**
	* The rating for the content.
	 *
	 * Ranges: Text, Number
	 */
	private Object _ratingValue;
	
	public <T> T getRatingValue(Class<T> c) throws ClassCastException{
		return (T) _ratingValue;
	}
	
	public void setRatingValue(String value) throws ClassCastException{
		_ratingValue = value;
	}
	public void setRatingValue(Float value) throws ClassCastException{
		_ratingValue = value;
	}
	/**
	* The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
	 *
	 * Ranges: Number, Text
	 */
	private Object _bestRating;
	
	public <T> T getBestRating(Class<T> c) throws ClassCastException{
		return (T) _bestRating;
	}
	
	public void setBestRating(Float value) throws ClassCastException{
		_bestRating = value;
	}
	public void setBestRating(String value) throws ClassCastException{
		_bestRating = value;
	}
	/**
	* The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
	 *
	 * Ranges: Text, Number
	 */
	private Object _worstRating;
	
	public <T> T getWorstRating(Class<T> c) throws ClassCastException{
		return (T) _worstRating;
	}
	
	public void setWorstRating(String value) throws ClassCastException{
		_worstRating = value;
	}
	public void setWorstRating(Float value) throws ClassCastException{
		_worstRating = value;
	}
	/**
	* The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _author;
	
	public <T> T getAuthor(Class<T> c) throws ClassCastException{
		return (T) _author;
	}
	
	public void setAuthor(Person value) throws ClassCastException{
		_author = value;
	}
	public void setAuthor(Organization value) throws ClassCastException{
		_author = value;
	}
}
