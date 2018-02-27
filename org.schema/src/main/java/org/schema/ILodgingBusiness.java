package org.schema;
/**
* A lodging business, such as a motel, hotel, or inn.
*/
public interface ILodgingBusiness extends ILocalBusiness{
	
	
	/**
	 * The latest someone may check out of a lodging establishment.
	 *
	 */
	
	public java.util.Date getCheckoutTime() throws ClassCastException;
	
	public void setCheckoutTime(java.util.Date value) throws ClassCastException;
	/**
	 * An intended audience, i.e. a group for whom something was created.
	 *
	 */
	
	public Audience getAudience() throws ClassCastException;
	
	public void setAudience(Audience value) throws ClassCastException;
	/**
	 * An official rating for a lodging business or food establishment, e.g. from national associations or standards bodies. Use the author property to indicate the rating organization, e.g. as an Organization with name such as (e.g. HOTREC, DEHOGA, WHR, or Hotelstars).
	 *
	 */
	
	public Rating getStarRating() throws ClassCastException;
	
	public void setStarRating(Rating value) throws ClassCastException;
	/**
	 * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
	 *
	 */
	
	public <T> T getPetsAllowed(Class<T> c) throws ClassCastException;
	
	public void setPetsAllowed(String value) throws ClassCastException;
	public void setPetsAllowed(Boolean value) throws ClassCastException;
	/**
	 * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
	 *
	 */
	
	public LocationFeatureSpecification getAmenityFeature() throws ClassCastException;
	
	public void setAmenityFeature(LocationFeatureSpecification value) throws ClassCastException;
	/**
	 * The earliest someone may check into a lodging establishment.
	 *
	 */
	
	public java.util.Date getCheckinTime() throws ClassCastException;
	
	public void setCheckinTime(java.util.Date value) throws ClassCastException;
	/**
	 * A language someone may use with or at the item, service or place. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/inLanguage">inLanguage</a>
	 *
	 */
	
	public <T> T getAvailableLanguage(Class<T> c) throws ClassCastException;
	
	public void setAvailableLanguage(Language value) throws ClassCastException;
	public void setAvailableLanguage(String value) throws ClassCastException;
}
