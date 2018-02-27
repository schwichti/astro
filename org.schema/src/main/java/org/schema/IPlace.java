package org.schema;
/**
* Entities that have a somewhat fixed, physical extension.
*/
public interface IPlace extends IThing{
	
	
	/**
	 * The fax number.
	 *
	 */
	
	public String getFaxNumber() throws ClassCastException;
	
	public void setFaxNumber(String value) throws ClassCastException;
	/**
	 * A review of the item.
	 *
	 */
	
	public Review getReview() throws ClassCastException;
	
	public void setReview(Review value) throws ClassCastException;
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 */
	
	public AggregateRating getAggregateRating() throws ClassCastException;
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException;
	/**
	 * A URL to a map of the place.
	 *
	 */
	
	public <T> T getHasMap(Class<T> c) throws ClassCastException;
	
	public void setHasMap(String value) throws ClassCastException;
	public void setHasMap(Map value) throws ClassCastException;
	/**
	 * An associated logo.
	 *
	 */
	
	public <T> T getLogo(Class<T> c) throws ClassCastException;
	
	public void setLogo(ImageObject value) throws ClassCastException;
	public void setLogo(String value) throws ClassCastException;
	/**
	 * A flag to signal that the <a class="localLink" href="http://schema.org/Place">Place</a> is open to public visitors.  If this property is omitted there is no assumed default boolean value
	 *
	 */
	
	public Boolean getPublicAccess() throws ClassCastException;
	
	public void setPublicAccess(Boolean value) throws ClassCastException;
	/**
	 * A photograph of this place.
	 *
	 */
	
	public <T> T getPhoto(Class<T> c) throws ClassCastException;
	
	public void setPhoto(ImageObject value) throws ClassCastException;
	public void setPhoto(Photograph value) throws ClassCastException;
	/**
	 * The basic containment relation between a place and one that contains it.
	 *
	 */
	
	public Place getContainedIn() throws ClassCastException;
	
	public void setContainedIn(Place value) throws ClassCastException;
	/**
	 * The basic containment relation between a place and one that contains it.
	 *
	 */
	
	public Place getContainedInPlace() throws ClassCastException;
	
	public void setContainedInPlace(Place value) throws ClassCastException;
	/**
	 * A flag to signal that the item, event, or place is accessible for free.
	 *
	 */
	
	public Boolean getIsAccessibleForFree() throws ClassCastException;
	
	public void setIsAccessibleForFree(Boolean value) throws ClassCastException;
	/**
	 * A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.</p>
	 
	 <p>For example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch.
	 *
	 */
	
	public String getBranchCode() throws ClassCastException;
	
	public void setBranchCode(String value) throws ClassCastException;
	/**
	 * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
	 *
	 */
	
	public Boolean getSmokingAllowed() throws ClassCastException;
	
	public void setSmokingAllowed(Boolean value) throws ClassCastException;
	/**
	 * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
	 *
	 */
	
	public String getIsicV4() throws ClassCastException;
	
	public void setIsicV4(String value) throws ClassCastException;
	/**
	 * Review of the item.
	 *
	 */
	
	public Review getReviews() throws ClassCastException;
	
	public void setReviews(Review value) throws ClassCastException;
	/**
	 * The total number of individuals that may attend an event or venue.
	 *
	 */
	
	public Integer getMaximumAttendeeCapacity() throws ClassCastException;
	
	public void setMaximumAttendeeCapacity(Integer value) throws ClassCastException;
	/**
	 * Photographs of this place.
	 *
	 */
	
	public <T> T getPhotos(Class<T> c) throws ClassCastException;
	
	public void setPhotos(Photograph value) throws ClassCastException;
	public void setPhotos(ImageObject value) throws ClassCastException;
	/**
	 * Upcoming or past events associated with this place or organization.
	 *
	 */
	
	public Event getEvents() throws ClassCastException;
	
	public void setEvents(Event value) throws ClassCastException;
	/**
	 * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.</p>
	 
	 <p>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
	 *
	 */
	
	public PropertyValue getAdditionalProperty() throws ClassCastException;
	
	public void setAdditionalProperty(PropertyValue value) throws ClassCastException;
	/**
	 * The opening hours of a certain place.
	 *
	 */
	
	public OpeningHoursSpecification getOpeningHoursSpecification() throws ClassCastException;
	
	public void setOpeningHoursSpecification(OpeningHoursSpecification value) throws ClassCastException;
	/**
	 * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
	 *
	 */
	
	public LocationFeatureSpecification getAmenityFeature() throws ClassCastException;
	
	public void setAmenityFeature(LocationFeatureSpecification value) throws ClassCastException;
	/**
	 * Physical address of the item.
	 *
	 */
	
	public <T> T getAddress(Class<T> c) throws ClassCastException;
	
	public void setAddress(String value) throws ClassCastException;
	public void setAddress(PostalAddress value) throws ClassCastException;
	/**
	 * The geo coordinates of the place.
	 *
	 */
	
	public <T> T getGeo(Class<T> c) throws ClassCastException;
	
	public void setGeo(GeoCoordinates value) throws ClassCastException;
	public void setGeo(GeoShape value) throws ClassCastException;
	/**
	 * The telephone number.
	 *
	 */
	
	public String getTelephone() throws ClassCastException;
	
	public void setTelephone(String value) throws ClassCastException;
	/**
	 * The basic containment relation between a place and another that it contains.
	 *
	 */
	
	public Place getContainsPlace() throws ClassCastException;
	
	public void setContainsPlace(Place value) throws ClassCastException;
	/**
	 * Upcoming or past event associated with this place, organization, or action.
	 *
	 */
	
	public Event getEvent() throws ClassCastException;
	
	public void setEvent(Event value) throws ClassCastException;
	/**
	 * A URL to a map of the place.
	 *
	 */
	
	public String getMaps() throws ClassCastException;
	
	public void setMaps(String value) throws ClassCastException;
	/**
	 * The special opening hours of a certain place.</p>
	 
	 <p>Use this to explicitly override general opening hours brought in scope by <a class="localLink" href="http://schema.org/openingHoursSpecification">openingHoursSpecification</a> or <a class="localLink" href="http://schema.org/openingHours">openingHours</a>.
	 *
	 */
	
	public OpeningHoursSpecification getSpecialOpeningHoursSpecification() throws ClassCastException;
	
	public void setSpecialOpeningHoursSpecification(OpeningHoursSpecification value) throws ClassCastException;
	/**
	 * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
	 *
	 */
	
	public String getGlobalLocationNumber() throws ClassCastException;
	
	public void setGlobalLocationNumber(String value) throws ClassCastException;
	/**
	 * A URL to a map of the place.
	 *
	 */
	
	public String getMap() throws ClassCastException;
	
	public void setMap(String value) throws ClassCastException;
}
