package org.schema;
/**
* An offer to transfer some rights to an item or to provide a service — for example, an offer to sell tickets to an event, to rent the DVD of a movie, to stream a TV show over the internet, to repair a motorcycle, or to loan a book.</p>

<p>For <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GTIN</a>-related fields, see <a href="http://www.gs1.org/barcodes/support/check_digit_calculator">Check Digit calculator</a> and <a href="http://www.gs1us.org/resources/standards/gtin-validation-guide">validation guide</a> from <a href="http://www.gs1.org/">GS1</a>.
*/
public interface IOffer extends IIntangible{
	
	
	/**
	 * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
	 *
	 */
	
	public BusinessFunction getBusinessFunction() throws ClassCastException;
	
	public void setBusinessFunction(BusinessFunction value) throws ClassCastException;
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin12() throws ClassCastException;
	
	public void setGtin12(String value) throws ClassCastException;
	/**
	 * The date when the item becomes valid.
	 *
	 */
	
	public java.util.Date getValidFrom() throws ClassCastException;
	
	public void setValidFrom(java.util.Date value) throws ClassCastException;
	/**
	 * A review of the item.
	 *
	 */
	
	public Review getReview() throws ClassCastException;
	
	public void setReview(Review value) throws ClassCastException;
	/**
	 * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
	 *
	 */
	
	public QuantitativeValue getEligibleQuantity() throws ClassCastException;
	
	public void setEligibleQuantity(QuantitativeValue value) throws ClassCastException;
	/**
	 * <p>The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.</p>
	 
	 <p>Usage guidelines:</p>
	 
	 <ul>
	 <li>Use the <a class="localLink" href="http://schema.org/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
	   including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.</li>
	 <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
	 <li>Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.</li>
	 <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
	 </ul>
	 *
	 */
	
	public <T> T getPrice(Class<T> c) throws ClassCastException;
	
	public void setPrice(String value) throws ClassCastException;
	public void setPrice(Float value) throws ClassCastException;
	/**
	 * The item being offered.
	 *
	 */
	
	public <T> T getItemOffered(Class<T> c) throws ClassCastException;
	
	public void setItemOffered(Service value) throws ClassCastException;
	public void setItemOffered(Product value) throws ClassCastException;
	/**
	 * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
	 *
	 */
	
	public OfferItemCondition getItemCondition() throws ClassCastException;
	
	public void setItemCondition(OfferItemCondition value) throws ClassCastException;
	/**
	 * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
	 *
	 */
	
	public QuantitativeValue getAdvanceBookingRequirement() throws ClassCastException;
	
	public void setAdvanceBookingRequirement(QuantitativeValue value) throws ClassCastException;
	/**
	 * The current approximate inventory level for the item or items.
	 *
	 */
	
	public QuantitativeValue getInventoryLevel() throws ClassCastException;
	
	public void setInventoryLevel(QuantitativeValue value) throws ClassCastException;
	/**
	 * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to <a class="localLink" href="http://schema.org/PriceSpecification">PriceSpecification</a> and its subtypes.
	 *
	 */
	
	public String getPriceCurrency() throws ClassCastException;
	
	public void setPriceCurrency(String value) throws ClassCastException;
	/**
	 * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
	 *
	 */
	
	public <T> T getCategory(Class<T> c) throws ClassCastException;
	
	public void setCategory(String value) throws ClassCastException;
	public void setCategory(Thing value) throws ClassCastException;
	/**
	 * The end of the availability of the product or service included in the offer.
	 *
	 */
	
	public java.util.Date getAvailabilityEnds() throws ClassCastException;
	
	public void setAvailabilityEnds(java.util.Date value) throws ClassCastException;
	/**
	 * Review of the item.
	 *
	 */
	
	public Review getReviews() throws ClassCastException;
	
	public void setReviews(Review value) throws ClassCastException;
	/**
	 * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
	 *
	 */
	
	public PriceSpecification getEligibleTransactionVolume() throws ClassCastException;
	
	public void setEligibleTransactionVolume(PriceSpecification value) throws ClassCastException;
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin13() throws ClassCastException;
	
	public void setGtin13(String value) throws ClassCastException;
	/**
	 * The payment method(s) accepted by seller for this offer.
	 *
	 */
	
	public <T> T getAcceptedPaymentMethod(Class<T> c) throws ClassCastException;
	
	public void setAcceptedPaymentMethod(PaymentMethod value) throws ClassCastException;
	public void setAcceptedPaymentMethod(LoanOrCredit value) throws ClassCastException;
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin8() throws ClassCastException;
	
	public void setGtin8(String value) throws ClassCastException;
	/**
	 * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
	 *
	 */
	
	public String getSku() throws ClassCastException;
	
	public void setSku(String value) throws ClassCastException;
	/**
	 * The place(s) from which the offer can be obtained (e.g. store locations).
	 *
	 */
	
	public Place getAvailableAtOrFrom() throws ClassCastException;
	
	public void setAvailableAtOrFrom(Place value) throws ClassCastException;
	/**
	 * The beginning of the availability of the product or service included in the offer.
	 *
	 */
	
	public java.util.Date getAvailabilityStarts() throws ClassCastException;
	
	public void setAvailabilityStarts(java.util.Date value) throws ClassCastException;
	/**
	 * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
	 *
	 */
	
	public String getSerialNumber() throws ClassCastException;
	
	public void setSerialNumber(String value) throws ClassCastException;
	/**
	 * The date after which the price is no longer available.
	 *
	 */
	
	public java.util.Date getPriceValidUntil() throws ClassCastException;
	
	public void setPriceValidUntil(java.util.Date value) throws ClassCastException;
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
	 * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
	 *
	 */
	
	public PriceSpecification getPriceSpecification() throws ClassCastException;
	
	public void setPriceSpecification(PriceSpecification value) throws ClassCastException;
	/**
	 * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).
	 *
	 */
	
	public Offer getAddOn() throws ClassCastException;
	
	public void setAddOn(Offer value) throws ClassCastException;
	/**
	 * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
	 *
	 */
	
	public <T> T getSeller(Class<T> c) throws ClassCastException;
	
	public void setSeller(Organization value) throws ClassCastException;
	public void setSeller(Person value) throws ClassCastException;
	/**
	 * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 */
	
	public java.util.Date getValidThrough() throws ClassCastException;
	
	public void setValidThrough(java.util.Date value) throws ClassCastException;
	/**
	 * The type(s) of customers for which the given offer is valid.
	 *
	 */
	
	public BusinessEntityType getEligibleCustomerType() throws ClassCastException;
	
	public void setEligibleCustomerType(BusinessEntityType value) throws ClassCastException;
	/**
	 * The delivery method(s) available for this offer.
	 *
	 */
	
	public DeliveryMethod getAvailableDeliveryMethod() throws ClassCastException;
	
	public void setAvailableDeliveryMethod(DeliveryMethod value) throws ClassCastException;
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
	 * This links to a node or nodes indicating the exact quantity of the products included in the offer.
	 *
	 */
	
	public TypeAndQuantityNode getIncludesObject() throws ClassCastException;
	
	public void setIncludesObject(TypeAndQuantityNode value) throws ClassCastException;
	/**
	 * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
	 *
	 */
	
	public String getMpn() throws ClassCastException;
	
	public void setMpn(String value) throws ClassCastException;
	/**
	 * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
	 *
	 */
	
	public QuantitativeValue getDeliveryLeadTime() throws ClassCastException;
	
	public void setDeliveryLeadTime(QuantitativeValue value) throws ClassCastException;
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
	 * The warranty promise(s) included in the offer.
	 *
	 */
	
	public WarrantyPromise getWarranty() throws ClassCastException;
	
	public void setWarranty(WarrantyPromise value) throws ClassCastException;
	/**
	 * The duration for which the given offer is valid.
	 *
	 */
	
	public QuantitativeValue getEligibleDuration() throws ClassCastException;
	
	public void setEligibleDuration(QuantitativeValue value) throws ClassCastException;
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin14() throws ClassCastException;
	
	public void setGtin14(String value) throws ClassCastException;
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 */
	
	public AggregateRating getAggregateRating() throws ClassCastException;
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException;
	/**
	 * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
	 *
	 */
	
	public ItemAvailability getAvailability() throws ClassCastException;
	
	public void setAvailability(ItemAvailability value) throws ClassCastException;
	/**
	 * A pointer to the organization or person making the offer.
	 *
	 */
	
	public <T> T getOfferedBy(Class<T> c) throws ClassCastException;
	
	public void setOfferedBy(Person value) throws ClassCastException;
	public void setOfferedBy(Organization value) throws ClassCastException;
}
