package org.schema;
/**
* An organization such as a school, NGO, corporation, club, etc.
*/
public interface IOrganization extends IThing{
	
	
	/**
	 * The North American Industry Classification System (NAICS) code for a particular organization or business person.
	 *
	 */
	
	public String getNaics() throws ClassCastException;
	
	public void setNaics(String value) throws ClassCastException;
	/**
	 * People working for this organization.
	 *
	 */
	
	public Person getEmployees() throws ClassCastException;
	
	public void setEmployees(Person value) throws ClassCastException;
	/**
	 * Physical address of the item.
	 *
	 */
	
	public <T> T getAddress(Class<T> c) throws ClassCastException;
	
	public void setAddress(String value) throws ClassCastException;
	public void setAddress(PostalAddress value) throws ClassCastException;
	/**
	 * An award won by or for this item.
	 *
	 */
	
	public String getAward() throws ClassCastException;
	
	public void setAward(String value) throws ClassCastException;
	/**
	 * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
	 *
	 */
	
	public <T> T getBrand(Class<T> c) throws ClassCastException;
	
	public void setBrand(Brand value) throws ClassCastException;
	public void setBrand(Organization value) throws ClassCastException;
	/**
	 * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
	 *
	 */
	
	public Organization getSubOrganization() throws ClassCastException;
	
	public void setSubOrganization(Organization value) throws ClassCastException;
	/**
	 * The official name of the organization, e.g. the registered company name.
	 *
	 */
	
	public String getLegalName() throws ClassCastException;
	
	public void setLegalName(String value) throws ClassCastException;
	/**
	 * Upcoming or past events associated with this place or organization.
	 *
	 */
	
	public Event getEvents() throws ClassCastException;
	
	public void setEvents(Event value) throws ClassCastException;
	/**
	 * Upcoming or past event associated with this place, organization, or action.
	 *
	 */
	
	public Event getEvent() throws ClassCastException;
	
	public void setEvent(Event value) throws ClassCastException;
	/**
	 * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
	 *
	 */
	
	public String getTaxID() throws ClassCastException;
	
	public void setTaxID(String value) throws ClassCastException;
	/**
	 * Someone working for this organization.
	 *
	 */
	
	public Person getEmployee() throws ClassCastException;
	
	public void setEmployee(Person value) throws ClassCastException;
	/**
	 * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
	 *
	 */
	
	public String getGlobalLocationNumber() throws ClassCastException;
	
	public void setGlobalLocationNumber(String value) throws ClassCastException;
	/**
	 * An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.
	 *
	 */
	
	public String getLeiCode() throws ClassCastException;
	
	public void setLeiCode(String value) throws ClassCastException;
	/**
	 * A person or organization that supports (sponsors) something through some kind of financial contribution.
	 *
	 */
	
	public <T> T getFunder(Class<T> c) throws ClassCastException;
	
	public void setFunder(Organization value) throws ClassCastException;
	public void setFunder(Person value) throws ClassCastException;
	/**
	 * Awards won by or for this item.
	 *
	 */
	
	public String getAwards() throws ClassCastException;
	
	public void setAwards(String value) throws ClassCastException;
	/**
	 * An associated logo.
	 *
	 */
	
	public <T> T getLogo(Class<T> c) throws ClassCastException;
	
	public void setLogo(ImageObject value) throws ClassCastException;
	public void setLogo(String value) throws ClassCastException;
	/**
	 * The date that this organization was founded.
	 *
	 */
	
	public java.util.Date getFoundingDate() throws ClassCastException;
	
	public void setFoundingDate(java.util.Date value) throws ClassCastException;
	/**
	 * The publishingPrinciples property indicates (typically via <a class="localLink" href="http://schema.org/URL">URL</a>) a document describing the editorial principles of an <a class="localLink" href="http://schema.org/Organization">Organization</a> (or individual e.g. a <a class="localLink" href="http://schema.org/Person">Person</a> writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a> (e.g. <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a>) the principles are those of the party primarily responsible for the creation of the <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a>.</p>
	 
	 <p>While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a <a class="localLink" href="http://schema.org/funder">funder</a>) can be expressed using schema.org terminology.
	 *
	 */
	
	public <T> T getPublishingPrinciples(Class<T> c) throws ClassCastException;
	
	public void setPublishingPrinciples(CreativeWork value) throws ClassCastException;
	public void setPublishingPrinciples(String value) throws ClassCastException;
	/**
	 * A review of the item.
	 *
	 */
	
	public Review getReview() throws ClassCastException;
	
	public void setReview(Review value) throws ClassCastException;
	/**
	 * Points-of-Sales operated by the organization or person.
	 *
	 */
	
	public Place getHasPOS() throws ClassCastException;
	
	public void setHasPOS(Place value) throws ClassCastException;
	/**
	 * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
	 *
	 */
	
	public Organization getDepartment() throws ClassCastException;
	
	public void setDepartment(Organization value) throws ClassCastException;
	/**
	 * Indicates an OfferCatalog listing for this Organization, Person, or Service.
	 *
	 */
	
	public OfferCatalog getHasOfferCatalog() throws ClassCastException;
	
	public void setHasOfferCatalog(OfferCatalog value) throws ClassCastException;
	/**
	 * A contact point for a person or organization.
	 *
	 */
	
	public ContactPoint getContactPoints() throws ClassCastException;
	
	public void setContactPoints(ContactPoint value) throws ClassCastException;
	/**
	 * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
	 *
	 */
	
	public String getIsicV4() throws ClassCastException;
	
	public void setIsicV4(String value) throws ClassCastException;
	/**
	 * A person who founded this organization.
	 *
	 */
	
	public Person getFounder() throws ClassCastException;
	
	public void setFounder(Person value) throws ClassCastException;
	/**
	 * The telephone number.
	 *
	 */
	
	public String getTelephone() throws ClassCastException;
	
	public void setTelephone(String value) throws ClassCastException;
	/**
	 * Products owned by the organization or person.
	 *
	 */
	
	public <T> T getOwns(Class<T> c) throws ClassCastException;
	
	public void setOwns(OwnershipInfo value) throws ClassCastException;
	public void setOwns(Product value) throws ClassCastException;
	/**
	 * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
	 *
	 */
	
	public <T> T getSponsor(Class<T> c) throws ClassCastException;
	
	public void setSponsor(Person value) throws ClassCastException;
	public void setSponsor(Organization value) throws ClassCastException;
	/**
	 * Email address.
	 *
	 */
	
	public String getEmail() throws ClassCastException;
	
	public void setEmail(String value) throws ClassCastException;
	/**
	 * A contact point for a person or organization.
	 *
	 */
	
	public ContactPoint getContactPoint() throws ClassCastException;
	
	public void setContactPoint(ContactPoint value) throws ClassCastException;
	/**
	 * A person who founded this organization.
	 *
	 */
	
	public Person getFounders() throws ClassCastException;
	
	public void setFounders(Person value) throws ClassCastException;
	/**
	 * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
	 *
	 */
	
	public <T> T getMember(Class<T> c) throws ClassCastException;
	
	public void setMember(Organization value) throws ClassCastException;
	public void setMember(Person value) throws ClassCastException;
	/**
	 * The larger organization that this organization is a <a class="localLink" href="http://schema.org/subOrganization">subOrganization</a> of, if any.
	 *
	 */
	
	public Organization getParentOrganization() throws ClassCastException;
	
	public void setParentOrganization(Organization value) throws ClassCastException;
	/**
	 * The Value-added Tax ID of the organization or person.
	 *
	 */
	
	public String getVatID() throws ClassCastException;
	
	public void setVatID(String value) throws ClassCastException;
	/**
	 * The geographic area where the service is provided.
	 *
	 */
	
	public <T> T getServiceArea(Class<T> c) throws ClassCastException;
	
	public void setServiceArea(GeoShape value) throws ClassCastException;
	public void setServiceArea(Place value) throws ClassCastException;
	public void setServiceArea(AdministrativeArea value) throws ClassCastException;
	/**
	 * The date that this organization was dissolved.
	 *
	 */
	
	public java.util.Date getDissolutionDate() throws ClassCastException;
	
	public void setDissolutionDate(java.util.Date value) throws ClassCastException;
	/**
	 * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
	 *
	 */
	
	public String getDuns() throws ClassCastException;
	
	public void setDuns(String value) throws ClassCastException;
	/**
	 * The place where the Organization was founded.
	 *
	 */
	
	public Place getFoundingLocation() throws ClassCastException;
	
	public void setFoundingLocation(Place value) throws ClassCastException;
	/**
	 * Review of the item.
	 *
	 */
	
	public Review getReviews() throws ClassCastException;
	
	public void setReviews(Review value) throws ClassCastException;
	/**
	 * The number of employees in an organization e.g. business.
	 *
	 */
	
	public QuantitativeValue getNumberOfEmployees() throws ClassCastException;
	
	public void setNumberOfEmployees(QuantitativeValue value) throws ClassCastException;
	/**
	 * The location of for example where the event is happening, an organization is located, or where an action takes place.
	 *
	 */
	
	public <T> T getLocation(Class<T> c) throws ClassCastException;
	
	public void setLocation(Place value) throws ClassCastException;
	public void setLocation(PostalAddress value) throws ClassCastException;
	public void setLocation(String value) throws ClassCastException;
	/**
	 * Alumni of an organization.
	 *
	 */
	
	public Person getAlumni() throws ClassCastException;
	
	public void setAlumni(Person value) throws ClassCastException;
	/**
	 * A member of this organization.
	 *
	 */
	
	public <T> T getMembers(Class<T> c) throws ClassCastException;
	
	public void setMembers(Organization value) throws ClassCastException;
	public void setMembers(Person value) throws ClassCastException;
	/**
	 * The geographic area where a service or offered item is provided.
	 *
	 */
	
	public <T> T getAreaServed(Class<T> c) throws ClassCastException;
	
	public void setAreaServed(String value) throws ClassCastException;
	public void setAreaServed(AdministrativeArea value) throws ClassCastException;
	public void setAreaServed(GeoShape value) throws ClassCastException;
	public void setAreaServed(Place value) throws ClassCastException;
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 */
	
	public AggregateRating getAggregateRating() throws ClassCastException;
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException;
	/**
	 * A pointer to products or services sought by the organization or person (demand).
	 *
	 */
	
	public Demand getSeeks() throws ClassCastException;
	
	public void setSeeks(Demand value) throws ClassCastException;
	/**
	 * An Organization (or ProgramMembership) to which this Person or Organization belongs.
	 *
	 */
	
	public <T> T getMemberOf(Class<T> c) throws ClassCastException;
	
	public void setMemberOf(Organization value) throws ClassCastException;
	public void setMemberOf(ProgramMembership value) throws ClassCastException;
	/**
	 * The fax number.
	 *
	 */
	
	public String getFaxNumber() throws ClassCastException;
	
	public void setFaxNumber(String value) throws ClassCastException;
	/**
	 * A pointer to products or services offered by the organization or person.
	 *
	 */
	
	public Offer getMakesOffer() throws ClassCastException;
	
	public void setMakesOffer(Offer value) throws ClassCastException;
}
