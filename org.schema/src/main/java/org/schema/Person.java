package org.schema;
/**
* A person (alive, dead, undead, or fictional).
*/
public class Person extends Thing{
	
	
	/**
	* A parents of the person.
	 *
	 * Ranges: Person
	 */
	private Person _parents;
	
	public Person getParents() throws ClassCastException{
		return (Person) _parents;
	}
	
	public void setParents(Person value) throws ClassCastException{
		_parents = value;
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
	* Event that this person is a performer or participant in.
	 *
	 * Ranges: Event
	 */
	private Event _performerIn;
	
	public Event getPerformerIn() throws ClassCastException{
		return (Event) _performerIn;
	}
	
	public void setPerformerIn(Event value) throws ClassCastException{
		_performerIn = value;
	}
	/**
	* The most generic familial relation.
	 *
	 * Ranges: Person
	 */
	private Person _relatedTo;
	
	public Person getRelatedTo() throws ClassCastException{
		return (Person) _relatedTo;
	}
	
	public void setRelatedTo(Person value) throws ClassCastException{
		_relatedTo = value;
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
	* The place where the person was born.
	 *
	 * Ranges: Place
	 */
	private Place _birthPlace;
	
	public Place getBirthPlace() throws ClassCastException{
		return (Place) _birthPlace;
	}
	
	public void setBirthPlace(Place value) throws ClassCastException{
		_birthPlace = value;
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
	* A child of the person.
	 *
	 * Ranges: Person
	 */
	private Person _children;
	
	public Person getChildren() throws ClassCastException{
		return (Person) _children;
	}
	
	public void setChildren(Person value) throws ClassCastException{
		_children = value;
	}
	/**
	* An organization that the person is an alumni of.
	 *
	 * Ranges: EducationalOrganization, Organization
	 */
	private Object _alumniOf;
	
	public <T> T getAlumniOf(Class<T> c) throws ClassCastException{
		return (T) _alumniOf;
	}
	
	public void setAlumniOf(EducationalOrganization value) throws ClassCastException{
		_alumniOf = value;
	}
	public void setAlumniOf(Organization value) throws ClassCastException{
		_alumniOf = value;
	}
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
	* A sibling of the person.
	 *
	 * Ranges: Person
	 */
	private Person _sibling;
	
	public Person getSibling() throws ClassCastException{
		return (Person) _sibling;
	}
	
	public void setSibling(Person value) throws ClassCastException{
		_sibling = value;
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
	* Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
	 *
	 * Ranges: Text
	 */
	private String _familyName;
	
	public String getFamilyName() throws ClassCastException{
		return (String) _familyName;
	}
	
	public void setFamilyName(String value) throws ClassCastException{
		_familyName = value;
	}
	/**
	* The person's spouse.
	 *
	 * Ranges: Person
	 */
	private Person _spouse;
	
	public Person getSpouse() throws ClassCastException{
		return (Person) _spouse;
	}
	
	public void setSpouse(Person value) throws ClassCastException{
		_spouse = value;
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
	* Date of birth.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _birthDate;
	
	public java.util.Date getBirthDate() throws ClassCastException{
		return (java.util.Date) _birthDate;
	}
	
	public void setBirthDate(java.util.Date value) throws ClassCastException{
		_birthDate = value;
	}
	/**
	* The total financial value of the person as calculated by subtracting assets from liabilities.
	 *
	 * Ranges: MonetaryAmount, PriceSpecification
	 */
	private Object _netWorth;
	
	public <T> T getNetWorth(Class<T> c) throws ClassCastException{
		return (T) _netWorth;
	}
	
	public void setNetWorth(MonetaryAmount value) throws ClassCastException{
		_netWorth = value;
	}
	public void setNetWorth(PriceSpecification value) throws ClassCastException{
		_netWorth = value;
	}
	/**
	* Nationality of the person.
	 *
	 * Ranges: Country
	 */
	private Country _nationality;
	
	public Country getNationality() throws ClassCastException{
		return (Country) _nationality;
	}
	
	public void setNationality(Country value) throws ClassCastException{
		_nationality = value;
	}
	/**
	* The weight of the product or person.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _weight;
	
	public QuantitativeValue getWeight() throws ClassCastException{
		return (QuantitativeValue) _weight;
	}
	
	public void setWeight(QuantitativeValue value) throws ClassCastException{
		_weight = value;
	}
	/**
	* A parent of this person.
	 *
	 * Ranges: Person
	 */
	private Person _parent;
	
	public Person getParent() throws ClassCastException{
		return (Person) _parent;
	}
	
	public void setParent(Person value) throws ClassCastException{
		_parent = value;
	}
	/**
	* A colleague of the person.
	 *
	 * Ranges: URL, Person
	 */
	private Object _colleague;
	
	public <T> T getColleague(Class<T> c) throws ClassCastException{
		return (T) _colleague;
	}
	
	public void setColleague(String value) throws ClassCastException{
		_colleague = value;
	}
	public void setColleague(Person value) throws ClassCastException{
		_colleague = value;
	}
	/**
	* The place where the person died.
	 *
	 * Ranges: Place
	 */
	private Place _deathPlace;
	
	public Place getDeathPlace() throws ClassCastException{
		return (Place) _deathPlace;
	}
	
	public void setDeathPlace(Place value) throws ClassCastException{
		_deathPlace = value;
	}
	/**
	* A colleague of the person.
	 *
	 * Ranges: Person
	 */
	private Person _colleagues;
	
	public Person getColleagues() throws ClassCastException{
		return (Person) _colleagues;
	}
	
	public void setColleagues(Person value) throws ClassCastException{
		_colleagues = value;
	}
	/**
	* Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.
	 *
	 * Ranges: Text, GenderType
	 */
	private Object _gender;
	
	public <T> T getGender(Class<T> c) throws ClassCastException{
		return (T) _gender;
	}
	
	public void setGender(String value) throws ClassCastException{
		_gender = value;
	}
	public void setGender(GenderType value) throws ClassCastException{
		_gender = value;
	}
	/**
	* A contact location for a person's residence.
	 *
	 * Ranges: Place, ContactPoint
	 */
	private Object _homeLocation;
	
	public <T> T getHomeLocation(Class<T> c) throws ClassCastException{
		return (T) _homeLocation;
	}
	
	public void setHomeLocation(Place value) throws ClassCastException{
		_homeLocation = value;
	}
	public void setHomeLocation(ContactPoint value) throws ClassCastException{
		_homeLocation = value;
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
	* An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
	 *
	 * Ranges: Text
	 */
	private String _honorificSuffix;
	
	public String getHonorificSuffix() throws ClassCastException{
		return (String) _honorificSuffix;
	}
	
	public void setHonorificSuffix(String value) throws ClassCastException{
		_honorificSuffix = value;
	}
	/**
	* The most generic uni-directional social relation.
	 *
	 * Ranges: Person
	 */
	private Person _follows;
	
	public Person getFollows() throws ClassCastException{
		return (Person) _follows;
	}
	
	public void setFollows(Person value) throws ClassCastException{
		_follows = value;
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
	* Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
	 *
	 * Ranges: Text
	 */
	private String _givenName;
	
	public String getGivenName() throws ClassCastException{
		return (String) _givenName;
	}
	
	public void setGivenName(String value) throws ClassCastException{
		_givenName = value;
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
	* Date of death.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _deathDate;
	
	public java.util.Date getDeathDate() throws ClassCastException{
		return (java.util.Date) _deathDate;
	}
	
	public void setDeathDate(java.util.Date value) throws ClassCastException{
		_deathDate = value;
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
	* The most generic bi-directional social/work relation.
	 *
	 * Ranges: Person
	 */
	private Person _knows;
	
	public Person getKnows() throws ClassCastException{
		return (Person) _knows;
	}
	
	public void setKnows(Person value) throws ClassCastException{
		_knows = value;
	}
	/**
	* An organization that this person is affiliated with. For example, a school/university, a club, or a team.
	 *
	 * Ranges: Organization
	 */
	private Organization _affiliation;
	
	public Organization getAffiliation() throws ClassCastException{
		return (Organization) _affiliation;
	}
	
	public void setAffiliation(Organization value) throws ClassCastException{
		_affiliation = value;
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
	* An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
	 *
	 * Ranges: Text
	 */
	private String _honorificPrefix;
	
	public String getHonorificPrefix() throws ClassCastException{
		return (String) _honorificPrefix;
	}
	
	public void setHonorificPrefix(String value) throws ClassCastException{
		_honorificPrefix = value;
	}
	/**
	* The job title of the person (for example, Financial Manager).
	 *
	 * Ranges: Text
	 */
	private String _jobTitle;
	
	public String getJobTitle() throws ClassCastException{
		return (String) _jobTitle;
	}
	
	public void setJobTitle(String value) throws ClassCastException{
		_jobTitle = value;
	}
	/**
	* A sibling of the person.
	 *
	 * Ranges: Person
	 */
	private Person _siblings;
	
	public Person getSiblings() throws ClassCastException{
		return (Person) _siblings;
	}
	
	public void setSiblings(Person value) throws ClassCastException{
		_siblings = value;
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
	* An additional name for a Person, can be used for a middle name.
	 *
	 * Ranges: Text
	 */
	private String _additionalName;
	
	public String getAdditionalName() throws ClassCastException{
		return (String) _additionalName;
	}
	
	public void setAdditionalName(String value) throws ClassCastException{
		_additionalName = value;
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
	* The height of the item.
	 *
	 * Ranges: Distance, QuantitativeValue
	 */
	private Object _height;
	
	public <T> T getHeight(Class<T> c) throws ClassCastException{
		return (T) _height;
	}
	
	public void setHeight(Distance value) throws ClassCastException{
		_height = value;
	}
	public void setHeight(QuantitativeValue value) throws ClassCastException{
		_height = value;
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
	* Organizations that the person works for.
	 *
	 * Ranges: Organization
	 */
	private Organization _worksFor;
	
	public Organization getWorksFor() throws ClassCastException{
		return (Organization) _worksFor;
	}
	
	public void setWorksFor(Organization value) throws ClassCastException{
		_worksFor = value;
	}
	/**
	* A contact location for a person's place of work.
	 *
	 * Ranges: Place, ContactPoint
	 */
	private Object _workLocation;
	
	public <T> T getWorkLocation(Class<T> c) throws ClassCastException{
		return (T) _workLocation;
	}
	
	public void setWorkLocation(Place value) throws ClassCastException{
		_workLocation = value;
	}
	public void setWorkLocation(ContactPoint value) throws ClassCastException{
		_workLocation = value;
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
}
