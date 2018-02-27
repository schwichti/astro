package org.schema;
/**
* A person (alive, dead, undead, or fictional).
*/
public interface IPerson extends IThing{
	
	
	/**
	 * A parents of the person.
	 *
	 */
	
	public Person getParents() throws ClassCastException;
	
	public void setParents(Person value) throws ClassCastException;
	/**
	 * A contact point for a person or organization.
	 *
	 */
	
	public ContactPoint getContactPoint() throws ClassCastException;
	
	public void setContactPoint(ContactPoint value) throws ClassCastException;
	/**
	 * Event that this person is a performer or participant in.
	 *
	 */
	
	public Event getPerformerIn() throws ClassCastException;
	
	public void setPerformerIn(Event value) throws ClassCastException;
	/**
	 * The most generic familial relation.
	 *
	 */
	
	public Person getRelatedTo() throws ClassCastException;
	
	public void setRelatedTo(Person value) throws ClassCastException;
	/**
	 * The telephone number.
	 *
	 */
	
	public String getTelephone() throws ClassCastException;
	
	public void setTelephone(String value) throws ClassCastException;
	/**
	 * Awards won by or for this item.
	 *
	 */
	
	public String getAwards() throws ClassCastException;
	
	public void setAwards(String value) throws ClassCastException;
	/**
	 * The place where the person was born.
	 *
	 */
	
	public Place getBirthPlace() throws ClassCastException;
	
	public void setBirthPlace(Place value) throws ClassCastException;
	/**
	 * An Organization (or ProgramMembership) to which this Person or Organization belongs.
	 *
	 */
	
	public <T> T getMemberOf(Class<T> c) throws ClassCastException;
	
	public void setMemberOf(Organization value) throws ClassCastException;
	public void setMemberOf(ProgramMembership value) throws ClassCastException;
	/**
	 * The Value-added Tax ID of the organization or person.
	 *
	 */
	
	public String getVatID() throws ClassCastException;
	
	public void setVatID(String value) throws ClassCastException;
	/**
	 * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
	 *
	 */
	
	public <T> T getSponsor(Class<T> c) throws ClassCastException;
	
	public void setSponsor(Person value) throws ClassCastException;
	public void setSponsor(Organization value) throws ClassCastException;
	/**
	 * A contact point for a person or organization.
	 *
	 */
	
	public ContactPoint getContactPoints() throws ClassCastException;
	
	public void setContactPoints(ContactPoint value) throws ClassCastException;
	/**
	 * A child of the person.
	 *
	 */
	
	public Person getChildren() throws ClassCastException;
	
	public void setChildren(Person value) throws ClassCastException;
	/**
	 * An organization that the person is an alumni of.
	 *
	 */
	
	public <T> T getAlumniOf(Class<T> c) throws ClassCastException;
	
	public void setAlumniOf(EducationalOrganization value) throws ClassCastException;
	public void setAlumniOf(Organization value) throws ClassCastException;
	/**
	 * The North American Industry Classification System (NAICS) code for a particular organization or business person.
	 *
	 */
	
	public String getNaics() throws ClassCastException;
	
	public void setNaics(String value) throws ClassCastException;
	/**
	 * A sibling of the person.
	 *
	 */
	
	public Person getSibling() throws ClassCastException;
	
	public void setSibling(Person value) throws ClassCastException;
	/**
	 * Products owned by the organization or person.
	 *
	 */
	
	public <T> T getOwns(Class<T> c) throws ClassCastException;
	
	public void setOwns(OwnershipInfo value) throws ClassCastException;
	public void setOwns(Product value) throws ClassCastException;
	/**
	 * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
	 *
	 */
	
	public String getFamilyName() throws ClassCastException;
	
	public void setFamilyName(String value) throws ClassCastException;
	/**
	 * The person's spouse.
	 *
	 */
	
	public Person getSpouse() throws ClassCastException;
	
	public void setSpouse(Person value) throws ClassCastException;
	/**
	 * Physical address of the item.
	 *
	 */
	
	public <T> T getAddress(Class<T> c) throws ClassCastException;
	
	public void setAddress(String value) throws ClassCastException;
	public void setAddress(PostalAddress value) throws ClassCastException;
	/**
	 * A pointer to products or services sought by the organization or person (demand).
	 *
	 */
	
	public Demand getSeeks() throws ClassCastException;
	
	public void setSeeks(Demand value) throws ClassCastException;
	/**
	 * Date of birth.
	 *
	 */
	
	public java.util.Date getBirthDate() throws ClassCastException;
	
	public void setBirthDate(java.util.Date value) throws ClassCastException;
	/**
	 * The total financial value of the person as calculated by subtracting assets from liabilities.
	 *
	 */
	
	public <T> T getNetWorth(Class<T> c) throws ClassCastException;
	
	public void setNetWorth(MonetaryAmount value) throws ClassCastException;
	public void setNetWorth(PriceSpecification value) throws ClassCastException;
	/**
	 * Nationality of the person.
	 *
	 */
	
	public Country getNationality() throws ClassCastException;
	
	public void setNationality(Country value) throws ClassCastException;
	/**
	 * The weight of the product or person.
	 *
	 */
	
	public QuantitativeValue getWeight() throws ClassCastException;
	
	public void setWeight(QuantitativeValue value) throws ClassCastException;
	/**
	 * A parent of this person.
	 *
	 */
	
	public Person getParent() throws ClassCastException;
	
	public void setParent(Person value) throws ClassCastException;
	/**
	 * A colleague of the person.
	 *
	 */
	
	public <T> T getColleague(Class<T> c) throws ClassCastException;
	
	public void setColleague(String value) throws ClassCastException;
	public void setColleague(Person value) throws ClassCastException;
	/**
	 * The place where the person died.
	 *
	 */
	
	public Place getDeathPlace() throws ClassCastException;
	
	public void setDeathPlace(Place value) throws ClassCastException;
	/**
	 * A colleague of the person.
	 *
	 */
	
	public Person getColleagues() throws ClassCastException;
	
	public void setColleagues(Person value) throws ClassCastException;
	/**
	 * Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.
	 *
	 */
	
	public <T> T getGender(Class<T> c) throws ClassCastException;
	
	public void setGender(String value) throws ClassCastException;
	public void setGender(GenderType value) throws ClassCastException;
	/**
	 * A contact location for a person's residence.
	 *
	 */
	
	public <T> T getHomeLocation(Class<T> c) throws ClassCastException;
	
	public void setHomeLocation(Place value) throws ClassCastException;
	public void setHomeLocation(ContactPoint value) throws ClassCastException;
	/**
	 * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
	 *
	 */
	
	public String getGlobalLocationNumber() throws ClassCastException;
	
	public void setGlobalLocationNumber(String value) throws ClassCastException;
	/**
	 * Email address.
	 *
	 */
	
	public String getEmail() throws ClassCastException;
	
	public void setEmail(String value) throws ClassCastException;
	/**
	 * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
	 *
	 */
	
	public String getTaxID() throws ClassCastException;
	
	public void setTaxID(String value) throws ClassCastException;
	/**
	 * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
	 *
	 */
	
	public String getHonorificSuffix() throws ClassCastException;
	
	public void setHonorificSuffix(String value) throws ClassCastException;
	/**
	 * The most generic uni-directional social relation.
	 *
	 */
	
	public Person getFollows() throws ClassCastException;
	
	public void setFollows(Person value) throws ClassCastException;
	/**
	 * A pointer to products or services offered by the organization or person.
	 *
	 */
	
	public Offer getMakesOffer() throws ClassCastException;
	
	public void setMakesOffer(Offer value) throws ClassCastException;
	/**
	 * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
	 *
	 */
	
	public String getGivenName() throws ClassCastException;
	
	public void setGivenName(String value) throws ClassCastException;
	/**
	 * Points-of-Sales operated by the organization or person.
	 *
	 */
	
	public Place getHasPOS() throws ClassCastException;
	
	public void setHasPOS(Place value) throws ClassCastException;
	/**
	 * The publishingPrinciples property indicates (typically via <a class="localLink" href="http://schema.org/URL">URL</a>) a document describing the editorial principles of an <a class="localLink" href="http://schema.org/Organization">Organization</a> (or individual e.g. a <a class="localLink" href="http://schema.org/Person">Person</a> writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a> (e.g. <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a>) the principles are those of the party primarily responsible for the creation of the <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a>.</p>
	 
	 <p>While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a <a class="localLink" href="http://schema.org/funder">funder</a>) can be expressed using schema.org terminology.
	 *
	 */
	
	public <T> T getPublishingPrinciples(Class<T> c) throws ClassCastException;
	
	public void setPublishingPrinciples(CreativeWork value) throws ClassCastException;
	public void setPublishingPrinciples(String value) throws ClassCastException;
	/**
	 * Date of death.
	 *
	 */
	
	public java.util.Date getDeathDate() throws ClassCastException;
	
	public void setDeathDate(java.util.Date value) throws ClassCastException;
	/**
	 * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
	 *
	 */
	
	public <T> T getBrand(Class<T> c) throws ClassCastException;
	
	public void setBrand(Brand value) throws ClassCastException;
	public void setBrand(Organization value) throws ClassCastException;
	/**
	 * The most generic bi-directional social/work relation.
	 *
	 */
	
	public Person getKnows() throws ClassCastException;
	
	public void setKnows(Person value) throws ClassCastException;
	/**
	 * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
	 *
	 */
	
	public Organization getAffiliation() throws ClassCastException;
	
	public void setAffiliation(Organization value) throws ClassCastException;
	/**
	 * A person or organization that supports (sponsors) something through some kind of financial contribution.
	 *
	 */
	
	public <T> T getFunder(Class<T> c) throws ClassCastException;
	
	public void setFunder(Organization value) throws ClassCastException;
	public void setFunder(Person value) throws ClassCastException;
	/**
	 * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
	 *
	 */
	
	public String getHonorificPrefix() throws ClassCastException;
	
	public void setHonorificPrefix(String value) throws ClassCastException;
	/**
	 * The job title of the person (for example, Financial Manager).
	 *
	 */
	
	public String getJobTitle() throws ClassCastException;
	
	public void setJobTitle(String value) throws ClassCastException;
	/**
	 * A sibling of the person.
	 *
	 */
	
	public Person getSiblings() throws ClassCastException;
	
	public void setSiblings(Person value) throws ClassCastException;
	/**
	 * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
	 *
	 */
	
	public String getIsicV4() throws ClassCastException;
	
	public void setIsicV4(String value) throws ClassCastException;
	/**
	 * The fax number.
	 *
	 */
	
	public String getFaxNumber() throws ClassCastException;
	
	public void setFaxNumber(String value) throws ClassCastException;
	/**
	 * An additional name for a Person, can be used for a middle name.
	 *
	 */
	
	public String getAdditionalName() throws ClassCastException;
	
	public void setAdditionalName(String value) throws ClassCastException;
	/**
	 * An award won by or for this item.
	 *
	 */
	
	public String getAward() throws ClassCastException;
	
	public void setAward(String value) throws ClassCastException;
	/**
	 * The height of the item.
	 *
	 */
	
	public <T> T getHeight(Class<T> c) throws ClassCastException;
	
	public void setHeight(Distance value) throws ClassCastException;
	public void setHeight(QuantitativeValue value) throws ClassCastException;
	/**
	 * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
	 *
	 */
	
	public String getDuns() throws ClassCastException;
	
	public void setDuns(String value) throws ClassCastException;
	/**
	 * Organizations that the person works for.
	 *
	 */
	
	public Organization getWorksFor() throws ClassCastException;
	
	public void setWorksFor(Organization value) throws ClassCastException;
	/**
	 * A contact location for a person's place of work.
	 *
	 */
	
	public <T> T getWorkLocation(Class<T> c) throws ClassCastException;
	
	public void setWorkLocation(Place value) throws ClassCastException;
	public void setWorkLocation(ContactPoint value) throws ClassCastException;
	/**
	 * Indicates an OfferCatalog listing for this Organization, Person, or Service.
	 *
	 */
	
	public OfferCatalog getHasOfferCatalog() throws ClassCastException;
	
	public void setHasOfferCatalog(OfferCatalog value) throws ClassCastException;
}
