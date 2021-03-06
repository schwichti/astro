package org.schema;
/**
* A camping site, campsite, or campground is a place used for overnight stay in the outdoors. In British English a campsite is an area, usually divided into a number of pitches, where people can camp overnight using tents or camper vans or caravans; this British English use of the word is synonymous with the American English expression campground. In American English the term campsite generally means an area where an individual, family, group, or military unit can pitch a tent or parks a camper; a campground may contain many campsites (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Campsite">http://en.wikipedia.org/wiki/Campsite</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.
*/
public class Campground extends CivicStructure implements ILodgingBusiness{
	
	
	/**
	* The North American Industry Classification System (NAICS) code for a particular organization or business person.
	 *
	 * Ranges: Text
	 */
	private String _naics;
	
	public String getNaics() throws ClassCastException{
		return (String) _naics;
	}
	
	public void setNaics(String value) throws ClassCastException{
		_naics = value;
	}
	/**
	* People working for this organization.
	 *
	 * Ranges: Person
	 */
	private Person _employees;
	
	public Person getEmployees() throws ClassCastException{
		return (Person) _employees;
	}
	
	public void setEmployees(Person value) throws ClassCastException{
		_employees = value;
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
	* An award won by or for this item.
	 *
	 * Ranges: Text
	 */
	private String _award;
	
	public String getAward() throws ClassCastException{
		return (String) _award;
	}
	
	public void setAward(String value) throws ClassCastException{
		_award = value;
	}
	/**
	* The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
	 *
	 * Ranges: Brand, Organization
	 */
	private Object _brand;
	
	public <T> T getBrand(Class<T> c) throws ClassCastException{
		return (T) _brand;
	}
	
	public void setBrand(Brand value) throws ClassCastException{
		_brand = value;
	}
	public void setBrand(Organization value) throws ClassCastException{
		_brand = value;
	}
	/**
	* A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
	 *
	 * Ranges: Organization
	 */
	private Organization _subOrganization;
	
	public Organization getSubOrganization() throws ClassCastException{
		return (Organization) _subOrganization;
	}
	
	public void setSubOrganization(Organization value) throws ClassCastException{
		_subOrganization = value;
	}
	/**
	* The official name of the organization, e.g. the registered company name.
	 *
	 * Ranges: Text
	 */
	private String _legalName;
	
	public String getLegalName() throws ClassCastException{
		return (String) _legalName;
	}
	
	public void setLegalName(String value) throws ClassCastException{
		_legalName = value;
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
	* The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
	 *
	 * Ranges: Text
	 */
	private String _taxID;
	
	public String getTaxID() throws ClassCastException{
		return (String) _taxID;
	}
	
	public void setTaxID(String value) throws ClassCastException{
		_taxID = value;
	}
	/**
	* Someone working for this organization.
	 *
	 * Ranges: Person
	 */
	private Person _employee;
	
	public Person getEmployee() throws ClassCastException{
		return (Person) _employee;
	}
	
	public void setEmployee(Person value) throws ClassCastException{
		_employee = value;
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
	* An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.
	 *
	 * Ranges: Text
	 */
	private String _leiCode;
	
	public String getLeiCode() throws ClassCastException{
		return (String) _leiCode;
	}
	
	public void setLeiCode(String value) throws ClassCastException{
		_leiCode = value;
	}
	/**
	* A person or organization that supports (sponsors) something through some kind of financial contribution.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _funder;
	
	public <T> T getFunder(Class<T> c) throws ClassCastException{
		return (T) _funder;
	}
	
	public void setFunder(Organization value) throws ClassCastException{
		_funder = value;
	}
	public void setFunder(Person value) throws ClassCastException{
		_funder = value;
	}
	/**
	* Awards won by or for this item.
	 *
	 * Ranges: Text
	 */
	private String _awards;
	
	public String getAwards() throws ClassCastException{
		return (String) _awards;
	}
	
	public void setAwards(String value) throws ClassCastException{
		_awards = value;
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
	* The date that this organization was founded.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _foundingDate;
	
	public java.util.Date getFoundingDate() throws ClassCastException{
		return (java.util.Date) _foundingDate;
	}
	
	public void setFoundingDate(java.util.Date value) throws ClassCastException{
		_foundingDate = value;
	}
	/**
	* The publishingPrinciples property indicates (typically via <a class="localLink" href="http://schema.org/URL">URL</a>) a document describing the editorial principles of an <a class="localLink" href="http://schema.org/Organization">Organization</a> (or individual e.g. a <a class="localLink" href="http://schema.org/Person">Person</a> writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a> (e.g. <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a>) the principles are those of the party primarily responsible for the creation of the <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a>.</p>
	
	<p>While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a <a class="localLink" href="http://schema.org/funder">funder</a>) can be expressed using schema.org terminology.
	 *
	 * Ranges: CreativeWork, URL
	 */
	private Object _publishingPrinciples;
	
	public <T> T getPublishingPrinciples(Class<T> c) throws ClassCastException{
		return (T) _publishingPrinciples;
	}
	
	public void setPublishingPrinciples(CreativeWork value) throws ClassCastException{
		_publishingPrinciples = value;
	}
	public void setPublishingPrinciples(String value) throws ClassCastException{
		_publishingPrinciples = value;
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
	* Points-of-Sales operated by the organization or person.
	 *
	 * Ranges: Place
	 */
	private Place _hasPOS;
	
	public Place getHasPOS() throws ClassCastException{
		return (Place) _hasPOS;
	}
	
	public void setHasPOS(Place value) throws ClassCastException{
		_hasPOS = value;
	}
	/**
	* A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
	 *
	 * Ranges: Organization
	 */
	private Organization _department;
	
	public Organization getDepartment() throws ClassCastException{
		return (Organization) _department;
	}
	
	public void setDepartment(Organization value) throws ClassCastException{
		_department = value;
	}
	/**
	* Indicates an OfferCatalog listing for this Organization, Person, or Service.
	 *
	 * Ranges: OfferCatalog
	 */
	private OfferCatalog _hasOfferCatalog;
	
	public OfferCatalog getHasOfferCatalog() throws ClassCastException{
		return (OfferCatalog) _hasOfferCatalog;
	}
	
	public void setHasOfferCatalog(OfferCatalog value) throws ClassCastException{
		_hasOfferCatalog = value;
	}
	/**
	* A contact point for a person or organization.
	 *
	 * Ranges: ContactPoint
	 */
	private ContactPoint _contactPoints;
	
	public ContactPoint getContactPoints() throws ClassCastException{
		return (ContactPoint) _contactPoints;
	}
	
	public void setContactPoints(ContactPoint value) throws ClassCastException{
		_contactPoints = value;
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
	* A person who founded this organization.
	 *
	 * Ranges: Person
	 */
	private Person _founder;
	
	public Person getFounder() throws ClassCastException{
		return (Person) _founder;
	}
	
	public void setFounder(Person value) throws ClassCastException{
		_founder = value;
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
	* Products owned by the organization or person.
	 *
	 * Ranges: OwnershipInfo, Product
	 */
	private Object _owns;
	
	public <T> T getOwns(Class<T> c) throws ClassCastException{
		return (T) _owns;
	}
	
	public void setOwns(OwnershipInfo value) throws ClassCastException{
		_owns = value;
	}
	public void setOwns(Product value) throws ClassCastException{
		_owns = value;
	}
	/**
	* A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _sponsor;
	
	public <T> T getSponsor(Class<T> c) throws ClassCastException{
		return (T) _sponsor;
	}
	
	public void setSponsor(Person value) throws ClassCastException{
		_sponsor = value;
	}
	public void setSponsor(Organization value) throws ClassCastException{
		_sponsor = value;
	}
	/**
	* Email address.
	 *
	 * Ranges: Text
	 */
	private String _email;
	
	public String getEmail() throws ClassCastException{
		return (String) _email;
	}
	
	public void setEmail(String value) throws ClassCastException{
		_email = value;
	}
	/**
	* A contact point for a person or organization.
	 *
	 * Ranges: ContactPoint
	 */
	private ContactPoint _contactPoint;
	
	public ContactPoint getContactPoint() throws ClassCastException{
		return (ContactPoint) _contactPoint;
	}
	
	public void setContactPoint(ContactPoint value) throws ClassCastException{
		_contactPoint = value;
	}
	/**
	* A person who founded this organization.
	 *
	 * Ranges: Person
	 */
	private Person _founders;
	
	public Person getFounders() throws ClassCastException{
		return (Person) _founders;
	}
	
	public void setFounders(Person value) throws ClassCastException{
		_founders = value;
	}
	/**
	* A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _member;
	
	public <T> T getMember(Class<T> c) throws ClassCastException{
		return (T) _member;
	}
	
	public void setMember(Organization value) throws ClassCastException{
		_member = value;
	}
	public void setMember(Person value) throws ClassCastException{
		_member = value;
	}
	/**
	* The larger organization that this organization is a <a class="localLink" href="http://schema.org/subOrganization">subOrganization</a> of, if any.
	 *
	 * Ranges: Organization
	 */
	private Organization _parentOrganization;
	
	public Organization getParentOrganization() throws ClassCastException{
		return (Organization) _parentOrganization;
	}
	
	public void setParentOrganization(Organization value) throws ClassCastException{
		_parentOrganization = value;
	}
	/**
	* The Value-added Tax ID of the organization or person.
	 *
	 * Ranges: Text
	 */
	private String _vatID;
	
	public String getVatID() throws ClassCastException{
		return (String) _vatID;
	}
	
	public void setVatID(String value) throws ClassCastException{
		_vatID = value;
	}
	/**
	* The geographic area where the service is provided.
	 *
	 * Ranges: GeoShape, Place, AdministrativeArea
	 */
	private Object _serviceArea;
	
	public <T> T getServiceArea(Class<T> c) throws ClassCastException{
		return (T) _serviceArea;
	}
	
	public void setServiceArea(GeoShape value) throws ClassCastException{
		_serviceArea = value;
	}
	public void setServiceArea(Place value) throws ClassCastException{
		_serviceArea = value;
	}
	public void setServiceArea(AdministrativeArea value) throws ClassCastException{
		_serviceArea = value;
	}
	/**
	* The date that this organization was dissolved.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _dissolutionDate;
	
	public java.util.Date getDissolutionDate() throws ClassCastException{
		return (java.util.Date) _dissolutionDate;
	}
	
	public void setDissolutionDate(java.util.Date value) throws ClassCastException{
		_dissolutionDate = value;
	}
	/**
	* The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
	 *
	 * Ranges: Text
	 */
	private String _duns;
	
	public String getDuns() throws ClassCastException{
		return (String) _duns;
	}
	
	public void setDuns(String value) throws ClassCastException{
		_duns = value;
	}
	/**
	* The place where the Organization was founded.
	 *
	 * Ranges: Place
	 */
	private Place _foundingLocation;
	
	public Place getFoundingLocation() throws ClassCastException{
		return (Place) _foundingLocation;
	}
	
	public void setFoundingLocation(Place value) throws ClassCastException{
		_foundingLocation = value;
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
	* The number of employees in an organization e.g. business.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _numberOfEmployees;
	
	public QuantitativeValue getNumberOfEmployees() throws ClassCastException{
		return (QuantitativeValue) _numberOfEmployees;
	}
	
	public void setNumberOfEmployees(QuantitativeValue value) throws ClassCastException{
		_numberOfEmployees = value;
	}
	/**
	* The location of for example where the event is happening, an organization is located, or where an action takes place.
	 *
	 * Ranges: Place, PostalAddress, Text
	 */
	private Object _location;
	
	public <T> T getLocation(Class<T> c) throws ClassCastException{
		return (T) _location;
	}
	
	public void setLocation(Place value) throws ClassCastException{
		_location = value;
	}
	public void setLocation(PostalAddress value) throws ClassCastException{
		_location = value;
	}
	public void setLocation(String value) throws ClassCastException{
		_location = value;
	}
	/**
	* Alumni of an organization.
	 *
	 * Ranges: Person
	 */
	private Person _alumni;
	
	public Person getAlumni() throws ClassCastException{
		return (Person) _alumni;
	}
	
	public void setAlumni(Person value) throws ClassCastException{
		_alumni = value;
	}
	/**
	* A member of this organization.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _members;
	
	public <T> T getMembers(Class<T> c) throws ClassCastException{
		return (T) _members;
	}
	
	public void setMembers(Organization value) throws ClassCastException{
		_members = value;
	}
	public void setMembers(Person value) throws ClassCastException{
		_members = value;
	}
	/**
	* The geographic area where a service or offered item is provided.
	 *
	 * Ranges: Text, AdministrativeArea, GeoShape, Place
	 */
	private Object _areaServed;
	
	public <T> T getAreaServed(Class<T> c) throws ClassCastException{
		return (T) _areaServed;
	}
	
	public void setAreaServed(String value) throws ClassCastException{
		_areaServed = value;
	}
	public void setAreaServed(AdministrativeArea value) throws ClassCastException{
		_areaServed = value;
	}
	public void setAreaServed(GeoShape value) throws ClassCastException{
		_areaServed = value;
	}
	public void setAreaServed(Place value) throws ClassCastException{
		_areaServed = value;
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
	* A pointer to products or services sought by the organization or person (demand).
	 *
	 * Ranges: Demand
	 */
	private Demand _seeks;
	
	public Demand getSeeks() throws ClassCastException{
		return (Demand) _seeks;
	}
	
	public void setSeeks(Demand value) throws ClassCastException{
		_seeks = value;
	}
	/**
	* An Organization (or ProgramMembership) to which this Person or Organization belongs.
	 *
	 * Ranges: Organization, ProgramMembership
	 */
	private Object _memberOf;
	
	public <T> T getMemberOf(Class<T> c) throws ClassCastException{
		return (T) _memberOf;
	}
	
	public void setMemberOf(Organization value) throws ClassCastException{
		_memberOf = value;
	}
	public void setMemberOf(ProgramMembership value) throws ClassCastException{
		_memberOf = value;
	}
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
	* A pointer to products or services offered by the organization or person.
	 *
	 * Ranges: Offer
	 */
	private Offer _makesOffer;
	
	public Offer getMakesOffer() throws ClassCastException{
		return (Offer) _makesOffer;
	}
	
	public void setMakesOffer(Offer value) throws ClassCastException{
		_makesOffer = value;
	}
	/**
	* The latest someone may check out of a lodging establishment.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _checkoutTime;
	
	public java.util.Date getCheckoutTime() throws ClassCastException{
		return (java.util.Date) _checkoutTime;
	}
	
	public void setCheckoutTime(java.util.Date value) throws ClassCastException{
		_checkoutTime = value;
	}
	/**
	* An intended audience, i.e. a group for whom something was created.
	 *
	 * Ranges: Audience
	 */
	private Audience _audience;
	
	public Audience getAudience() throws ClassCastException{
		return (Audience) _audience;
	}
	
	public void setAudience(Audience value) throws ClassCastException{
		_audience = value;
	}
	/**
	* An official rating for a lodging business or food establishment, e.g. from national associations or standards bodies. Use the author property to indicate the rating organization, e.g. as an Organization with name such as (e.g. HOTREC, DEHOGA, WHR, or Hotelstars).
	 *
	 * Ranges: Rating
	 */
	private Rating _starRating;
	
	public Rating getStarRating() throws ClassCastException{
		return (Rating) _starRating;
	}
	
	public void setStarRating(Rating value) throws ClassCastException{
		_starRating = value;
	}
	/**
	* Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
	 *
	 * Ranges: Text, Boolean
	 */
	private Object _petsAllowed;
	
	public <T> T getPetsAllowed(Class<T> c) throws ClassCastException{
		return (T) _petsAllowed;
	}
	
	public void setPetsAllowed(String value) throws ClassCastException{
		_petsAllowed = value;
	}
	public void setPetsAllowed(Boolean value) throws ClassCastException{
		_petsAllowed = value;
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
	* The earliest someone may check into a lodging establishment.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _checkinTime;
	
	public java.util.Date getCheckinTime() throws ClassCastException{
		return (java.util.Date) _checkinTime;
	}
	
	public void setCheckinTime(java.util.Date value) throws ClassCastException{
		_checkinTime = value;
	}
	/**
	* A language someone may use with or at the item, service or place. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/inLanguage">inLanguage</a>
	 *
	 * Ranges: Language, Text
	 */
	private Object _availableLanguage;
	
	public <T> T getAvailableLanguage(Class<T> c) throws ClassCastException{
		return (T) _availableLanguage;
	}
	
	public void setAvailableLanguage(Language value) throws ClassCastException{
		_availableLanguage = value;
	}
	public void setAvailableLanguage(String value) throws ClassCastException{
		_availableLanguage = value;
	}
	/**
	* <p>The general opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.</p>
	
	<ul>
	<li>Days are specified using the following two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>, <code>Fr</code>, <code>Sa</code>, <code>Su</code>.</li>
	<li>Times are specified using 24:00 time. For example, 3pm is specified as <code>15:00</code>. </li>
	<li>Here is an example: <code>&lt;time itemprop="openingHours" datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>.</li>
	<li>If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.</li>
	</ul>
	 *
	 * Ranges: Text
	 */
	private String _openingHours;
	
	public String getOpeningHours() throws ClassCastException{
		return (String) _openingHours;
	}
	
	public void setOpeningHours(String value) throws ClassCastException{
		_openingHours = value;
	}
	/**
	* The currency accepted (in <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 currency format</a>).
	 *
	 * Ranges: Text
	 */
	private String _currenciesAccepted;
	
	public String getCurrenciesAccepted() throws ClassCastException{
		return (String) _currenciesAccepted;
	}
	
	public void setCurrenciesAccepted(String value) throws ClassCastException{
		_currenciesAccepted = value;
	}
	/**
	* The price range of the business, for example <code>$$$</code>.
	 *
	 * Ranges: Text
	 */
	private String _priceRange;
	
	public String getPriceRange() throws ClassCastException{
		return (String) _priceRange;
	}
	
	public void setPriceRange(String value) throws ClassCastException{
		_priceRange = value;
	}
	/**
	* Cash, credit card, etc.
	 *
	 * Ranges: Text
	 */
	private String _paymentAccepted;
	
	public String getPaymentAccepted() throws ClassCastException{
		return (String) _paymentAccepted;
	}
	
	public void setPaymentAccepted(String value) throws ClassCastException{
		_paymentAccepted = value;
	}
	/**
	* The larger organization that this local business is a branch of, if any. Not to be confused with (anatomical)<a class="localLink" href="http://schema.org/branch">branch</a>.
	 *
	 * Ranges: Organization
	 */
	private Organization _branchOf;
	
	public Organization getBranchOf() throws ClassCastException{
		return (Organization) _branchOf;
	}
	
	public void setBranchOf(Organization value) throws ClassCastException{
		_branchOf = value;
	}
}
