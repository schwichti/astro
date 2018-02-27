package org.schema;
/**
* A service provided by an organization, e.g. delivery service, print services, etc.
*/
public interface IService extends IIntangible{
	
	
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 */
	
	public AggregateRating getAggregateRating() throws ClassCastException;
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException;
	/**
	 * An associated logo.
	 *
	 */
	
	public <T> T getLogo(Class<T> c) throws ClassCastException;
	
	public void setLogo(ImageObject value) throws ClassCastException;
	public void setLogo(String value) throws ClassCastException;
	/**
	 * An award won by or for this item.
	 *
	 */
	
	public String getAward() throws ClassCastException;
	
	public void setAward(String value) throws ClassCastException;
	/**
	 * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
	 *
	 */
	
	public <T> T getCategory(Class<T> c) throws ClassCastException;
	
	public void setCategory(String value) throws ClassCastException;
	public void setCategory(Thing value) throws ClassCastException;
	/**
	 * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
	 *
	 */
	
	public ServiceChannel getAvailableChannel() throws ClassCastException;
	
	public void setAvailableChannel(ServiceChannel value) throws ClassCastException;
	/**
	 * A review of the item.
	 *
	 */
	
	public Review getReview() throws ClassCastException;
	
	public void setReview(Review value) throws ClassCastException;
	/**
	 * The geographic area where the service is provided.
	 *
	 */
	
	public <T> T getServiceArea(Class<T> c) throws ClassCastException;
	
	public void setServiceArea(GeoShape value) throws ClassCastException;
	public void setServiceArea(Place value) throws ClassCastException;
	public void setServiceArea(AdministrativeArea value) throws ClassCastException;
	/**
	 * The tangible thing generated by the service, e.g. a passport, permit, etc.
	 *
	 */
	
	public Thing getServiceOutput() throws ClassCastException;
	
	public void setServiceOutput(Thing value) throws ClassCastException;
	/**
	 * An intended audience, i.e. a group for whom something was created.
	 *
	 */
	
	public Audience getAudience() throws ClassCastException;
	
	public void setAudience(Audience value) throws ClassCastException;
	/**
	 * Indicates an OfferCatalog listing for this Organization, Person, or Service.
	 *
	 */
	
	public OfferCatalog getHasOfferCatalog() throws ClassCastException;
	
	public void setHasOfferCatalog(OfferCatalog value) throws ClassCastException;
	/**
	 * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 */
	
	public <T> T getProvider(Class<T> c) throws ClassCastException;
	
	public void setProvider(Organization value) throws ClassCastException;
	public void setProvider(Person value) throws ClassCastException;
	/**
	 * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 *
	 */
	
	public Offer getOffers() throws ClassCastException;
	
	public void setOffers(Offer value) throws ClassCastException;
	/**
	 * A pointer to another, somehow related product (or multiple products).
	 *
	 */
	
	public <T> T getIsRelatedTo(Class<T> c) throws ClassCastException;
	
	public void setIsRelatedTo(Product value) throws ClassCastException;
	public void setIsRelatedTo(Service value) throws ClassCastException;
	/**
	 * The tangible thing generated by the service, e.g. a passport, permit, etc.
	 *
	 */
	
	public Thing getProduces() throws ClassCastException;
	
	public void setProduces(Thing value) throws ClassCastException;
	/**
	 * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
	 *
	 */
	
	public String getProviderMobility() throws ClassCastException;
	
	public void setProviderMobility(String value) throws ClassCastException;
	/**
	 * A pointer to another, functionally similar product (or multiple products).
	 *
	 */
	
	public <T> T getIsSimilarTo(Class<T> c) throws ClassCastException;
	
	public void setIsSimilarTo(Product value) throws ClassCastException;
	public void setIsSimilarTo(Service value) throws ClassCastException;
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
	 * The audience eligible for this service.
	 *
	 */
	
	public Audience getServiceAudience() throws ClassCastException;
	
	public void setServiceAudience(Audience value) throws ClassCastException;
	/**
	 * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
	 *
	 */
	
	public <T> T getBroker(Class<T> c) throws ClassCastException;
	
	public void setBroker(Organization value) throws ClassCastException;
	public void setBroker(Person value) throws ClassCastException;
	/**
	 * The hours during which this service or contact is available.
	 *
	 */
	
	public OpeningHoursSpecification getHoursAvailable() throws ClassCastException;
	
	public void setHoursAvailable(OpeningHoursSpecification value) throws ClassCastException;
	/**
	 * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
	 *
	 */
	
	public <T> T getBrand(Class<T> c) throws ClassCastException;
	
	public void setBrand(Brand value) throws ClassCastException;
	public void setBrand(Organization value) throws ClassCastException;
	/**
	 * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
	 *
	 */
	
	public String getServiceType() throws ClassCastException;
	
	public void setServiceType(String value) throws ClassCastException;
}
