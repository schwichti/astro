package org.schema;
/**
* A service provided by an organization, e.g. delivery service, print services, etc.
*/
public class Service extends Intangible{
	
	
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
	* A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
	 *
	 * Ranges: Text, Thing
	 */
	private Object _category;
	
	public <T> T getCategory(Class<T> c) throws ClassCastException{
		return (T) _category;
	}
	
	public void setCategory(String value) throws ClassCastException{
		_category = value;
	}
	public void setCategory(Thing value) throws ClassCastException{
		_category = value;
	}
	/**
	* A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
	 *
	 * Ranges: ServiceChannel
	 */
	private ServiceChannel _availableChannel;
	
	public ServiceChannel getAvailableChannel() throws ClassCastException{
		return (ServiceChannel) _availableChannel;
	}
	
	public void setAvailableChannel(ServiceChannel value) throws ClassCastException{
		_availableChannel = value;
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
	* The tangible thing generated by the service, e.g. a passport, permit, etc.
	 *
	 * Ranges: Thing
	 */
	private Thing _serviceOutput;
	
	public Thing getServiceOutput() throws ClassCastException{
		return (Thing) _serviceOutput;
	}
	
	public void setServiceOutput(Thing value) throws ClassCastException{
		_serviceOutput = value;
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
	* The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _provider;
	
	public <T> T getProvider(Class<T> c) throws ClassCastException{
		return (T) _provider;
	}
	
	public void setProvider(Organization value) throws ClassCastException{
		_provider = value;
	}
	public void setProvider(Person value) throws ClassCastException{
		_provider = value;
	}
	/**
	* An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 *
	 * Ranges: Offer
	 */
	private Offer _offers;
	
	public Offer getOffers() throws ClassCastException{
		return (Offer) _offers;
	}
	
	public void setOffers(Offer value) throws ClassCastException{
		_offers = value;
	}
	/**
	* A pointer to another, somehow related product (or multiple products).
	 *
	 * Ranges: Product, Service
	 */
	private Object _isRelatedTo;
	
	public <T> T getIsRelatedTo(Class<T> c) throws ClassCastException{
		return (T) _isRelatedTo;
	}
	
	public void setIsRelatedTo(Product value) throws ClassCastException{
		_isRelatedTo = value;
	}
	public void setIsRelatedTo(Service value) throws ClassCastException{
		_isRelatedTo = value;
	}
	/**
	* The tangible thing generated by the service, e.g. a passport, permit, etc.
	 *
	 * Ranges: Thing
	 */
	private Thing _produces;
	
	public Thing getProduces() throws ClassCastException{
		return (Thing) _produces;
	}
	
	public void setProduces(Thing value) throws ClassCastException{
		_produces = value;
	}
	/**
	* Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
	 *
	 * Ranges: Text
	 */
	private String _providerMobility;
	
	public String getProviderMobility() throws ClassCastException{
		return (String) _providerMobility;
	}
	
	public void setProviderMobility(String value) throws ClassCastException{
		_providerMobility = value;
	}
	/**
	* A pointer to another, functionally similar product (or multiple products).
	 *
	 * Ranges: Product, Service
	 */
	private Object _isSimilarTo;
	
	public <T> T getIsSimilarTo(Class<T> c) throws ClassCastException{
		return (T) _isSimilarTo;
	}
	
	public void setIsSimilarTo(Product value) throws ClassCastException{
		_isSimilarTo = value;
	}
	public void setIsSimilarTo(Service value) throws ClassCastException{
		_isSimilarTo = value;
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
	* The audience eligible for this service.
	 *
	 * Ranges: Audience
	 */
	private Audience _serviceAudience;
	
	public Audience getServiceAudience() throws ClassCastException{
		return (Audience) _serviceAudience;
	}
	
	public void setServiceAudience(Audience value) throws ClassCastException{
		_serviceAudience = value;
	}
	/**
	* An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _broker;
	
	public <T> T getBroker(Class<T> c) throws ClassCastException{
		return (T) _broker;
	}
	
	public void setBroker(Organization value) throws ClassCastException{
		_broker = value;
	}
	public void setBroker(Person value) throws ClassCastException{
		_broker = value;
	}
	/**
	* The hours during which this service or contact is available.
	 *
	 * Ranges: OpeningHoursSpecification
	 */
	private OpeningHoursSpecification _hoursAvailable;
	
	public OpeningHoursSpecification getHoursAvailable() throws ClassCastException{
		return (OpeningHoursSpecification) _hoursAvailable;
	}
	
	public void setHoursAvailable(OpeningHoursSpecification value) throws ClassCastException{
		_hoursAvailable = value;
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
	* The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
	 *
	 * Ranges: Text
	 */
	private String _serviceType;
	
	public String getServiceType() throws ClassCastException{
		return (String) _serviceType;
	}
	
	public void setServiceType(String value) throws ClassCastException{
		_serviceType = value;
	}
}
