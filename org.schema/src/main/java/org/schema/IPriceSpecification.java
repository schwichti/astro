package org.schema;
/**
* A structured value representing a price or price range. Typically, only the subclasses of this type are used for markup. It is recommended to use <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a> to describe independent amounts of money such as a salary, credit card limits, etc.
*/
public interface IPriceSpecification extends IStructuredValue{
	
	
	/**
	 * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
	 *
	 */
	
	public PriceSpecification getEligibleTransactionVolume() throws ClassCastException;
	
	public void setEligibleTransactionVolume(PriceSpecification value) throws ClassCastException;
	/**
	 * The lowest price if the price is a range.
	 *
	 */
	
	public Float getMinPrice() throws ClassCastException;
	
	public void setMinPrice(Float value) throws ClassCastException;
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
	 * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to <a class="localLink" href="http://schema.org/PriceSpecification">PriceSpecification</a> and its subtypes.
	 *
	 */
	
	public String getPriceCurrency() throws ClassCastException;
	
	public void setPriceCurrency(String value) throws ClassCastException;
	/**
	 * The highest price if the price is a range.
	 *
	 */
	
	public Float getMaxPrice() throws ClassCastException;
	
	public void setMaxPrice(Float value) throws ClassCastException;
	/**
	 * The date when the item becomes valid.
	 *
	 */
	
	public java.util.Date getValidFrom() throws ClassCastException;
	
	public void setValidFrom(java.util.Date value) throws ClassCastException;
	/**
	 * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 */
	
	public java.util.Date getValidThrough() throws ClassCastException;
	
	public void setValidThrough(java.util.Date value) throws ClassCastException;
	/**
	 * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
	 *
	 */
	
	public QuantitativeValue getEligibleQuantity() throws ClassCastException;
	
	public void setEligibleQuantity(QuantitativeValue value) throws ClassCastException;
	/**
	 * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
	 *
	 */
	
	public Boolean getValueAddedTaxIncluded() throws ClassCastException;
	
	public void setValueAddedTaxIncluded(Boolean value) throws ClassCastException;
}
