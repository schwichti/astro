package org.schema;
/**
* A monetary value or range. This type can be used to describe an amount of money such as $50 USD, or a range as in describing a bank account being suitable for a balance between £1,000 and £1,000,000 GBP, or the value of a salary, etc. It is recommended to use <a class="localLink" href="http://schema.org/PriceSpecification">PriceSpecification</a> Types to describe the price of an Offer, Invoice, etc.
*/
public interface IMonetaryAmount extends IStructuredValue{
	
	
	/**
	 * The currency in which the monetary amount is expressed (in 3-letter <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> format).
	 *
	 */
	
	public String getCurrency() throws ClassCastException;
	
	public void setCurrency(String value) throws ClassCastException;
	/**
	 * <p>The value of the quantitative value or property value node.</p>
	 
	 <ul>
	 <li>For <a class="localLink" href="http://schema.org/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
	 <li>For <a class="localLink" href="http://schema.org/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
	 </ul>
	 *
	 */
	
	public <T> T getValue(Class<T> c) throws ClassCastException;
	
	public void setValue(Boolean value) throws ClassCastException;
	public void setValue(String value) throws ClassCastException;
	public void setValue(StructuredValue value) throws ClassCastException;
	public void setValue(Float value) throws ClassCastException;
	/**
	 * The date when the item becomes valid.
	 *
	 */
	
	public java.util.Date getValidFrom() throws ClassCastException;
	
	public void setValidFrom(java.util.Date value) throws ClassCastException;
	/**
	 * The upper value of some characteristic or property.
	 *
	 */
	
	public Float getMaxValue() throws ClassCastException;
	
	public void setMaxValue(Float value) throws ClassCastException;
	/**
	 * The lower value of some characteristic or property.
	 *
	 */
	
	public Float getMinValue() throws ClassCastException;
	
	public void setMinValue(Float value) throws ClassCastException;
	/**
	 * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 */
	
	public java.util.Date getValidThrough() throws ClassCastException;
	
	public void setValidThrough(java.util.Date value) throws ClassCastException;
}
