package org.schema;
/**
* A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.
*/
public interface IDemand extends IIntangible{
	
	
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin13() throws ClassCastException;
	
	public void setGtin13(String value) throws ClassCastException;
	/**
	 * The delivery method(s) available for this offer.
	 *
	 */
	
	public DeliveryMethod getAvailableDeliveryMethod() throws ClassCastException;
	
	public void setAvailableDeliveryMethod(DeliveryMethod value) throws ClassCastException;
	/**
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.</p>
	 
	 <p>See also <a class="localLink" href="http://schema.org/eligibleRegion">eligibleRegion</a>.
	 *
	 */
	
	public <T> T getIneligibleRegion(Class<T> c) throws ClassCastException;
	
	public void setIneligibleRegion(String value) throws ClassCastException;
	public void setIneligibleRegion(GeoShape value) throws ClassCastException;
	public void setIneligibleRegion(Place value) throws ClassCastException;
	/**
	 * The payment method(s) accepted by seller for this offer.
	 *
	 */
	
	public <T> T getAcceptedPaymentMethod(Class<T> c) throws ClassCastException;
	
	public void setAcceptedPaymentMethod(PaymentMethod value) throws ClassCastException;
	public void setAcceptedPaymentMethod(LoanOrCredit value) throws ClassCastException;
	/**
	 * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
	 *
	 */
	
	public QuantitativeValue getDeliveryLeadTime() throws ClassCastException;
	
	public void setDeliveryLeadTime(QuantitativeValue value) throws ClassCastException;
	/**
	 * The item being offered.
	 *
	 */
	
	public <T> T getItemOffered(Class<T> c) throws ClassCastException;
	
	public void setItemOffered(Service value) throws ClassCastException;
	public void setItemOffered(Product value) throws ClassCastException;
	/**
	 * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 */
	
	public java.util.Date getValidThrough() throws ClassCastException;
	
	public void setValidThrough(java.util.Date value) throws ClassCastException;
	/**
	 * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
	 *
	 */
	
	public <T> T getSeller(Class<T> c) throws ClassCastException;
	
	public void setSeller(Organization value) throws ClassCastException;
	public void setSeller(Person value) throws ClassCastException;
	/**
	 * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
	 *
	 */
	
	public BusinessFunction getBusinessFunction() throws ClassCastException;
	
	public void setBusinessFunction(BusinessFunction value) throws ClassCastException;
	/**
	 * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
	 *
	 */
	
	public OfferItemCondition getItemCondition() throws ClassCastException;
	
	public void setItemCondition(OfferItemCondition value) throws ClassCastException;
	/**
	 * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
	 *
	 */
	
	public QuantitativeValue getEligibleQuantity() throws ClassCastException;
	
	public void setEligibleQuantity(QuantitativeValue value) throws ClassCastException;
	/**
	 * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
	 *
	 */
	
	public PriceSpecification getPriceSpecification() throws ClassCastException;
	
	public void setPriceSpecification(PriceSpecification value) throws ClassCastException;
	/**
	 * The warranty promise(s) included in the offer.
	 *
	 */
	
	public WarrantyPromise getWarranty() throws ClassCastException;
	
	public void setWarranty(WarrantyPromise value) throws ClassCastException;
	/**
	 * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
	 *
	 */
	
	public ItemAvailability getAvailability() throws ClassCastException;
	
	public void setAvailability(ItemAvailability value) throws ClassCastException;
	/**
	 * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
	 *
	 */
	
	public String getMpn() throws ClassCastException;
	
	public void setMpn(String value) throws ClassCastException;
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
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin8() throws ClassCastException;
	
	public void setGtin8(String value) throws ClassCastException;
	/**
	 * The duration for which the given offer is valid.
	 *
	 */
	
	public QuantitativeValue getEligibleDuration() throws ClassCastException;
	
	public void setEligibleDuration(QuantitativeValue value) throws ClassCastException;
	/**
	 * The place(s) from which the offer can be obtained (e.g. store locations).
	 *
	 */
	
	public Place getAvailableAtOrFrom() throws ClassCastException;
	
	public void setAvailableAtOrFrom(Place value) throws ClassCastException;
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin14() throws ClassCastException;
	
	public void setGtin14(String value) throws ClassCastException;
	/**
	 * The current approximate inventory level for the item or items.
	 *
	 */
	
	public QuantitativeValue getInventoryLevel() throws ClassCastException;
	
	public void setInventoryLevel(QuantitativeValue value) throws ClassCastException;
	/**
	 * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
	 *
	 */
	
	public QuantitativeValue getAdvanceBookingRequirement() throws ClassCastException;
	
	public void setAdvanceBookingRequirement(QuantitativeValue value) throws ClassCastException;
	/**
	 * This links to a node or nodes indicating the exact quantity of the products included in the offer.
	 *
	 */
	
	public TypeAndQuantityNode getIncludesObject() throws ClassCastException;
	
	public void setIncludesObject(TypeAndQuantityNode value) throws ClassCastException;
	/**
	 * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
	 *
	 */
	
	public String getSku() throws ClassCastException;
	
	public void setSku(String value) throws ClassCastException;
	/**
	 * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
	 *
	 */
	
	public PriceSpecification getEligibleTransactionVolume() throws ClassCastException;
	
	public void setEligibleTransactionVolume(PriceSpecification value) throws ClassCastException;
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin12() throws ClassCastException;
	
	public void setGtin12(String value) throws ClassCastException;
	/**
	 * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
	 *
	 */
	
	public String getSerialNumber() throws ClassCastException;
	
	public void setSerialNumber(String value) throws ClassCastException;
	/**
	 * The end of the availability of the product or service included in the offer.
	 *
	 */
	
	public java.util.Date getAvailabilityEnds() throws ClassCastException;
	
	public void setAvailabilityEnds(java.util.Date value) throws ClassCastException;
	/**
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.</p>
	 
	 <p>See also <a class="localLink" href="http://schema.org/ineligibleRegion">ineligibleRegion</a>.
	 *
	 */
	
	public <T> T getEligibleRegion(Class<T> c) throws ClassCastException;
	
	public void setEligibleRegion(Place value) throws ClassCastException;
	public void setEligibleRegion(GeoShape value) throws ClassCastException;
	public void setEligibleRegion(String value) throws ClassCastException;
	/**
	 * The beginning of the availability of the product or service included in the offer.
	 *
	 */
	
	public java.util.Date getAvailabilityStarts() throws ClassCastException;
	
	public void setAvailabilityStarts(java.util.Date value) throws ClassCastException;
	/**
	 * The type(s) of customers for which the given offer is valid.
	 *
	 */
	
	public BusinessEntityType getEligibleCustomerType() throws ClassCastException;
	
	public void setEligibleCustomerType(BusinessEntityType value) throws ClassCastException;
	/**
	 * The date when the item becomes valid.
	 *
	 */
	
	public java.util.Date getValidFrom() throws ClassCastException;
	
	public void setValidFrom(java.util.Date value) throws ClassCastException;
}
