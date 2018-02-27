package org.schema;
/**
* Entities that have a somewhat fixed, physical extension.
*/
public class Place extends Thing{
	
	
	/**
	* The fax number.
	 *
	 * Ranges: Text
	 */
	private String _faxNumber;
	
	public String getFaxNumber() throws ClassCastException{
		return (String) _faxNumber;
	}
	
	public void setFaxNumber(String value) throws ClassCastException{
		_faxNumber = value;
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
	* A URL to a map of the place.
	 *
	 * Ranges: URL, Map
	 */
	private Object _hasMap;
	
	public <T> T getHasMap(Class<T> c) throws ClassCastException{
		return (T) _hasMap;
	}
	
	public void setHasMap(String value) throws ClassCastException{
		_hasMap = value;
	}
	public void setHasMap(Map value) throws ClassCastException{
		_hasMap = value;
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
	/**
	* A flag to signal that the <a class="localLink" href="http://schema.org/Place">Place</a> is open to public visitors.  If this property is omitted there is no assumed default boolean value
	 *
	 * Ranges: Boolean
	 */
	private Boolean _publicAccess;
	
	public Boolean getPublicAccess() throws ClassCastException{
		return (Boolean) _publicAccess;
	}
	
	public void setPublicAccess(Boolean value) throws ClassCastException{
		_publicAccess = value;
	}
	/**
	* A photograph of this place.
	 *
	 * Ranges: ImageObject, Photograph
	 */
	private Object _photo;
	
	public <T> T getPhoto(Class<T> c) throws ClassCastException{
		return (T) _photo;
	}
	
	public void setPhoto(ImageObject value) throws ClassCastException{
		_photo = value;
	}
	public void setPhoto(Photograph value) throws ClassCastException{
		_photo = value;
	}
	/**
	* The basic containment relation between a place and one that contains it.
	 *
	 * Ranges: Place
	 */
	private Place _containedIn;
	
	public Place getContainedIn() throws ClassCastException{
		return (Place) _containedIn;
	}
	
	public void setContainedIn(Place value) throws ClassCastException{
		_containedIn = value;
	}
	/**
	* The basic containment relation between a place and one that contains it.
	 *
	 * Ranges: Place
	 */
	private Place _containedInPlace;
	
	public Place getContainedInPlace() throws ClassCastException{
		return (Place) _containedInPlace;
	}
	
	public void setContainedInPlace(Place value) throws ClassCastException{
		_containedInPlace = value;
	}
	/**
	* A flag to signal that the item, event, or place is accessible for free.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _isAccessibleForFree;
	
	public Boolean getIsAccessibleForFree() throws ClassCastException{
		return (Boolean) _isAccessibleForFree;
	}
	
	public void setIsAccessibleForFree(Boolean value) throws ClassCastException{
		_isAccessibleForFree = value;
	}
	/**
	* A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.</p>
	
	<p>For example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch.
	 *
	 * Ranges: Text
	 */
	private String _branchCode;
	
	public String getBranchCode() throws ClassCastException{
		return (String) _branchCode;
	}
	
	public void setBranchCode(String value) throws ClassCastException{
		_branchCode = value;
	}
	/**
	* Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _smokingAllowed;
	
	public Boolean getSmokingAllowed() throws ClassCastException{
		return (Boolean) _smokingAllowed;
	}
	
	public void setSmokingAllowed(Boolean value) throws ClassCastException{
		_smokingAllowed = value;
	}
	/**
	* The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
	 *
	 * Ranges: Text
	 */
	private String _isicV4;
	
	public String getIsicV4() throws ClassCastException{
		return (String) _isicV4;
	}
	
	public void setIsicV4(String value) throws ClassCastException{
		_isicV4 = value;
	}
	/**
	* Review of the item.
	 *
	 * Ranges: Review
	 */
	private Review _reviews;
	
	public Review getReviews() throws ClassCastException{
		return (Review) _reviews;
	}
	
	public void setReviews(Review value) throws ClassCastException{
		_reviews = value;
	}
	/**
	* The total number of individuals that may attend an event or venue.
	 *
	 * Ranges: Integer
	 */
	private Integer _maximumAttendeeCapacity;
	
	public Integer getMaximumAttendeeCapacity() throws ClassCastException{
		return (Integer) _maximumAttendeeCapacity;
	}
	
	public void setMaximumAttendeeCapacity(Integer value) throws ClassCastException{
		_maximumAttendeeCapacity = value;
	}
	/**
	* Photographs of this place.
	 *
	 * Ranges: Photograph, ImageObject
	 */
	private Object _photos;
	
	public <T> T getPhotos(Class<T> c) throws ClassCastException{
		return (T) _photos;
	}
	
	public void setPhotos(Photograph value) throws ClassCastException{
		_photos = value;
	}
	public void setPhotos(ImageObject value) throws ClassCastException{
		_photos = value;
	}
	/**
	* Upcoming or past events associated with this place or organization.
	 *
	 * Ranges: Event
	 */
	private Event _events;
	
	public Event getEvents() throws ClassCastException{
		return (Event) _events;
	}
	
	public void setEvents(Event value) throws ClassCastException{
		_events = value;
	}
	/**
	* A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.</p>
	
	<p>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
	 *
	 * Ranges: PropertyValue
	 */
	private PropertyValue _additionalProperty;
	
	public PropertyValue getAdditionalProperty() throws ClassCastException{
		return (PropertyValue) _additionalProperty;
	}
	
	public void setAdditionalProperty(PropertyValue value) throws ClassCastException{
		_additionalProperty = value;
	}
	/**
	* The opening hours of a certain place.
	 *
	 * Ranges: OpeningHoursSpecification
	 */
	private OpeningHoursSpecification _openingHoursSpecification;
	
	public OpeningHoursSpecification getOpeningHoursSpecification() throws ClassCastException{
		return (OpeningHoursSpecification) _openingHoursSpecification;
	}
	
	public void setOpeningHoursSpecification(OpeningHoursSpecification value) throws ClassCastException{
		_openingHoursSpecification = value;
	}
	/**
	* An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
	 *
	 * Ranges: LocationFeatureSpecification
	 */
	private LocationFeatureSpecification _amenityFeature;
	
	public LocationFeatureSpecification getAmenityFeature() throws ClassCastException{
		return (LocationFeatureSpecification) _amenityFeature;
	}
	
	public void setAmenityFeature(LocationFeatureSpecification value) throws ClassCastException{
		_amenityFeature = value;
	}
	/**
	* Physical address of the item.
	 *
	 * Ranges: Text, PostalAddress
	 */
	private Object _address;
	
	public <T> T getAddress(Class<T> c) throws ClassCastException{
		return (T) _address;
	}
	
	public void setAddress(String value) throws ClassCastException{
		_address = value;
	}
	public void setAddress(PostalAddress value) throws ClassCastException{
		_address = value;
	}
	/**
	* The geo coordinates of the place.
	 *
	 * Ranges: GeoCoordinates, GeoShape
	 */
	private Object _geo;
	
	public <T> T getGeo(Class<T> c) throws ClassCastException{
		return (T) _geo;
	}
	
	public void setGeo(GeoCoordinates value) throws ClassCastException{
		_geo = value;
	}
	public void setGeo(GeoShape value) throws ClassCastException{
		_geo = value;
	}
	/**
	* The telephone number.
	 *
	 * Ranges: Text
	 */
	private String _telephone;
	
	public String getTelephone() throws ClassCastException{
		return (String) _telephone;
	}
	
	public void setTelephone(String value) throws ClassCastException{
		_telephone = value;
	}
	/**
	* The basic containment relation between a place and another that it contains.
	 *
	 * Ranges: Place
	 */
	private Place _containsPlace;
	
	public Place getContainsPlace() throws ClassCastException{
		return (Place) _containsPlace;
	}
	
	public void setContainsPlace(Place value) throws ClassCastException{
		_containsPlace = value;
	}
	/**
	* Upcoming or past event associated with this place, organization, or action.
	 *
	 * Ranges: Event
	 */
	private Event _event;
	
	public Event getEvent() throws ClassCastException{
		return (Event) _event;
	}
	
	public void setEvent(Event value) throws ClassCastException{
		_event = value;
	}
	/**
	* A URL to a map of the place.
	 *
	 * Ranges: URL
	 */
	private String _maps;
	
	public String getMaps() throws ClassCastException{
		return (String) _maps;
	}
	
	public void setMaps(String value) throws ClassCastException{
		_maps = value;
	}
	/**
	* The special opening hours of a certain place.</p>
	
	<p>Use this to explicitly override general opening hours brought in scope by <a class="localLink" href="http://schema.org/openingHoursSpecification">openingHoursSpecification</a> or <a class="localLink" href="http://schema.org/openingHours">openingHours</a>.
	 *
	 * Ranges: OpeningHoursSpecification
	 */
	private OpeningHoursSpecification _specialOpeningHoursSpecification;
	
	public OpeningHoursSpecification getSpecialOpeningHoursSpecification() throws ClassCastException{
		return (OpeningHoursSpecification) _specialOpeningHoursSpecification;
	}
	
	public void setSpecialOpeningHoursSpecification(OpeningHoursSpecification value) throws ClassCastException{
		_specialOpeningHoursSpecification = value;
	}
	/**
	* The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
	 *
	 * Ranges: Text
	 */
	private String _globalLocationNumber;
	
	public String getGlobalLocationNumber() throws ClassCastException{
		return (String) _globalLocationNumber;
	}
	
	public void setGlobalLocationNumber(String value) throws ClassCastException{
		_globalLocationNumber = value;
	}
	/**
	* A URL to a map of the place.
	 *
	 * Ranges: URL
	 */
	private String _map;
	
	public String getMap() throws ClassCastException{
		return (String) _map;
	}
	
	public void setMap(String value) throws ClassCastException{
		_map = value;
	}
}
