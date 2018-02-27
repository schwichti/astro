package org.schema;
/**
* A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.
*/
public class Demand extends Intangible{
	
	
	/**
	* The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 * Ranges: Text
	 */
	private String _gtin13;
	
	public String getGtin13() throws ClassCastException{
		return (String) _gtin13;
	}
	
	public void setGtin13(String value) throws ClassCastException{
		_gtin13 = value;
	}
	/**
	* The delivery method(s) available for this offer.
	 *
	 * Ranges: DeliveryMethod
	 */
	private DeliveryMethod _availableDeliveryMethod;
	
	public DeliveryMethod getAvailableDeliveryMethod() throws ClassCastException{
		return (DeliveryMethod) _availableDeliveryMethod;
	}
	
	public void setAvailableDeliveryMethod(DeliveryMethod value) throws ClassCastException{
		_availableDeliveryMethod = value;
	}
	/**
	* The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.</p>
	
	<p>See also <a class="localLink" href="http://schema.org/eligibleRegion">eligibleRegion</a>.
	 *
	 * Ranges: Text, GeoShape, Place
	 */
	private Object _ineligibleRegion;
	
	public <T> T getIneligibleRegion(Class<T> c) throws ClassCastException{
		return (T) _ineligibleRegion;
	}
	
	public void setIneligibleRegion(String value) throws ClassCastException{
		_ineligibleRegion = value;
	}
	public void setIneligibleRegion(GeoShape value) throws ClassCastException{
		_ineligibleRegion = value;
	}
	public void setIneligibleRegion(Place value) throws ClassCastException{
		_ineligibleRegion = value;
	}
	/**
	* The payment method(s) accepted by seller for this offer.
	 *
	 * Ranges: PaymentMethod, LoanOrCredit
	 */
	private Object _acceptedPaymentMethod;
	
	public <T> T getAcceptedPaymentMethod(Class<T> c) throws ClassCastException{
		return (T) _acceptedPaymentMethod;
	}
	
	public void setAcceptedPaymentMethod(PaymentMethod value) throws ClassCastException{
		_acceptedPaymentMethod = value;
	}
	public void setAcceptedPaymentMethod(LoanOrCredit value) throws ClassCastException{
		_acceptedPaymentMethod = value;
	}
	/**
	* The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _deliveryLeadTime;
	
	public QuantitativeValue getDeliveryLeadTime() throws ClassCastException{
		return (QuantitativeValue) _deliveryLeadTime;
	}
	
	public void setDeliveryLeadTime(QuantitativeValue value) throws ClassCastException{
		_deliveryLeadTime = value;
	}
	/**
	* The item being offered.
	 *
	 * Ranges: Service, Product
	 */
	private Object _itemOffered;
	
	public <T> T getItemOffered(Class<T> c) throws ClassCastException{
		return (T) _itemOffered;
	}
	
	public void setItemOffered(Service value) throws ClassCastException{
		_itemOffered = value;
	}
	public void setItemOffered(Product value) throws ClassCastException{
		_itemOffered = value;
	}
	/**
	* The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _validThrough;
	
	public java.util.Date getValidThrough() throws ClassCastException{
		return (java.util.Date) _validThrough;
	}
	
	public void setValidThrough(java.util.Date value) throws ClassCastException{
		_validThrough = value;
	}
	/**
	* An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _seller;
	
	public <T> T getSeller(Class<T> c) throws ClassCastException{
		return (T) _seller;
	}
	
	public void setSeller(Organization value) throws ClassCastException{
		_seller = value;
	}
	public void setSeller(Person value) throws ClassCastException{
		_seller = value;
	}
	/**
	* The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
	 *
	 * Ranges: BusinessFunction
	 */
	private BusinessFunction _businessFunction;
	
	public BusinessFunction getBusinessFunction() throws ClassCastException{
		return (BusinessFunction) _businessFunction;
	}
	
	public void setBusinessFunction(BusinessFunction value) throws ClassCastException{
		_businessFunction = value;
	}
	/**
	* A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
	 *
	 * Ranges: OfferItemCondition
	 */
	private OfferItemCondition _itemCondition;
	
	public OfferItemCondition getItemCondition() throws ClassCastException{
		return (OfferItemCondition) _itemCondition;
	}
	
	public void setItemCondition(OfferItemCondition value) throws ClassCastException{
		_itemCondition = value;
	}
	/**
	* The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _eligibleQuantity;
	
	public QuantitativeValue getEligibleQuantity() throws ClassCastException{
		return (QuantitativeValue) _eligibleQuantity;
	}
	
	public void setEligibleQuantity(QuantitativeValue value) throws ClassCastException{
		_eligibleQuantity = value;
	}
	/**
	* One or more detailed price specifications, indicating the unit price and delivery or payment charges.
	 *
	 * Ranges: PriceSpecification
	 */
	private PriceSpecification _priceSpecification;
	
	public PriceSpecification getPriceSpecification() throws ClassCastException{
		return (PriceSpecification) _priceSpecification;
	}
	
	public void setPriceSpecification(PriceSpecification value) throws ClassCastException{
		_priceSpecification = value;
	}
	/**
	* The warranty promise(s) included in the offer.
	 *
	 * Ranges: WarrantyPromise
	 */
	private WarrantyPromise _warranty;
	
	public WarrantyPromise getWarranty() throws ClassCastException{
		return (WarrantyPromise) _warranty;
	}
	
	public void setWarranty(WarrantyPromise value) throws ClassCastException{
		_warranty = value;
	}
	/**
	* The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
	 *
	 * Ranges: ItemAvailability
	 */
	private ItemAvailability _availability;
	
	public ItemAvailability getAvailability() throws ClassCastException{
		return (ItemAvailability) _availability;
	}
	
	public void setAvailability(ItemAvailability value) throws ClassCastException{
		_availability = value;
	}
	/**
	* The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
	 *
	 * Ranges: Text
	 */
	private String _mpn;
	
	public String getMpn() throws ClassCastException{
		return (String) _mpn;
	}
	
	public void setMpn(String value) throws ClassCastException{
		_mpn = value;
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
	* The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 * Ranges: Text
	 */
	private String _gtin8;
	
	public String getGtin8() throws ClassCastException{
		return (String) _gtin8;
	}
	
	public void setGtin8(String value) throws ClassCastException{
		_gtin8 = value;
	}
	/**
	* The duration for which the given offer is valid.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _eligibleDuration;
	
	public QuantitativeValue getEligibleDuration() throws ClassCastException{
		return (QuantitativeValue) _eligibleDuration;
	}
	
	public void setEligibleDuration(QuantitativeValue value) throws ClassCastException{
		_eligibleDuration = value;
	}
	/**
	* The place(s) from which the offer can be obtained (e.g. store locations).
	 *
	 * Ranges: Place
	 */
	private Place _availableAtOrFrom;
	
	public Place getAvailableAtOrFrom() throws ClassCastException{
		return (Place) _availableAtOrFrom;
	}
	
	public void setAvailableAtOrFrom(Place value) throws ClassCastException{
		_availableAtOrFrom = value;
	}
	/**
	* The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 * Ranges: Text
	 */
	private String _gtin14;
	
	public String getGtin14() throws ClassCastException{
		return (String) _gtin14;
	}
	
	public void setGtin14(String value) throws ClassCastException{
		_gtin14 = value;
	}
	/**
	* The current approximate inventory level for the item or items.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _inventoryLevel;
	
	public QuantitativeValue getInventoryLevel() throws ClassCastException{
		return (QuantitativeValue) _inventoryLevel;
	}
	
	public void setInventoryLevel(QuantitativeValue value) throws ClassCastException{
		_inventoryLevel = value;
	}
	/**
	* The amount of time that is required between accepting the offer and the actual usage of the resource or service.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _advanceBookingRequirement;
	
	public QuantitativeValue getAdvanceBookingRequirement() throws ClassCastException{
		return (QuantitativeValue) _advanceBookingRequirement;
	}
	
	public void setAdvanceBookingRequirement(QuantitativeValue value) throws ClassCastException{
		_advanceBookingRequirement = value;
	}
	/**
	* This links to a node or nodes indicating the exact quantity of the products included in the offer.
	 *
	 * Ranges: TypeAndQuantityNode
	 */
	private TypeAndQuantityNode _includesObject;
	
	public TypeAndQuantityNode getIncludesObject() throws ClassCastException{
		return (TypeAndQuantityNode) _includesObject;
	}
	
	public void setIncludesObject(TypeAndQuantityNode value) throws ClassCastException{
		_includesObject = value;
	}
	/**
	* The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
	 *
	 * Ranges: Text
	 */
	private String _sku;
	
	public String getSku() throws ClassCastException{
		return (String) _sku;
	}
	
	public void setSku(String value) throws ClassCastException{
		_sku = value;
	}
	/**
	* The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
	 *
	 * Ranges: PriceSpecification
	 */
	private PriceSpecification _eligibleTransactionVolume;
	
	public PriceSpecification getEligibleTransactionVolume() throws ClassCastException{
		return (PriceSpecification) _eligibleTransactionVolume;
	}
	
	public void setEligibleTransactionVolume(PriceSpecification value) throws ClassCastException{
		_eligibleTransactionVolume = value;
	}
	/**
	* The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 * Ranges: Text
	 */
	private String _gtin12;
	
	public String getGtin12() throws ClassCastException{
		return (String) _gtin12;
	}
	
	public void setGtin12(String value) throws ClassCastException{
		_gtin12 = value;
	}
	/**
	* The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
	 *
	 * Ranges: Text
	 */
	private String _serialNumber;
	
	public String getSerialNumber() throws ClassCastException{
		return (String) _serialNumber;
	}
	
	public void setSerialNumber(String value) throws ClassCastException{
		_serialNumber = value;
	}
	/**
	* The end of the availability of the product or service included in the offer.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _availabilityEnds;
	
	public java.util.Date getAvailabilityEnds() throws ClassCastException{
		return (java.util.Date) _availabilityEnds;
	}
	
	public void setAvailabilityEnds(java.util.Date value) throws ClassCastException{
		_availabilityEnds = value;
	}
	/**
	* The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.</p>
	
	<p>See also <a class="localLink" href="http://schema.org/ineligibleRegion">ineligibleRegion</a>.
	 *
	 * Ranges: Place, GeoShape, Text
	 */
	private Object _eligibleRegion;
	
	public <T> T getEligibleRegion(Class<T> c) throws ClassCastException{
		return (T) _eligibleRegion;
	}
	
	public void setEligibleRegion(Place value) throws ClassCastException{
		_eligibleRegion = value;
	}
	public void setEligibleRegion(GeoShape value) throws ClassCastException{
		_eligibleRegion = value;
	}
	public void setEligibleRegion(String value) throws ClassCastException{
		_eligibleRegion = value;
	}
	/**
	* The beginning of the availability of the product or service included in the offer.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _availabilityStarts;
	
	public java.util.Date getAvailabilityStarts() throws ClassCastException{
		return (java.util.Date) _availabilityStarts;
	}
	
	public void setAvailabilityStarts(java.util.Date value) throws ClassCastException{
		_availabilityStarts = value;
	}
	/**
	* The type(s) of customers for which the given offer is valid.
	 *
	 * Ranges: BusinessEntityType
	 */
	private BusinessEntityType _eligibleCustomerType;
	
	public BusinessEntityType getEligibleCustomerType() throws ClassCastException{
		return (BusinessEntityType) _eligibleCustomerType;
	}
	
	public void setEligibleCustomerType(BusinessEntityType value) throws ClassCastException{
		_eligibleCustomerType = value;
	}
	/**
	* The date when the item becomes valid.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _validFrom;
	
	public java.util.Date getValidFrom() throws ClassCastException{
		return (java.util.Date) _validFrom;
	}
	
	public void setValidFrom(java.util.Date value) throws ClassCastException{
		_validFrom = value;
	}
}
