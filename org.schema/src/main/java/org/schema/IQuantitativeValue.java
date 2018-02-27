package org.schema;
/**
* A point value or interval for product characteristics and other purposes.
*/
public interface IQuantitativeValue extends IStructuredValue{
	
	
	/**
	 * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.</p>
	 
	 <p>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
	 *
	 */
	
	public PropertyValue getAdditionalProperty() throws ClassCastException;
	
	public void setAdditionalProperty(PropertyValue value) throws ClassCastException;
	/**
	 * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
	 <a href='unitCode'>unitCode</a>.
	 *
	 */
	
	public String getUnitText() throws ClassCastException;
	
	public void setUnitText(String value) throws ClassCastException;
	/**
	 * The upper value of some characteristic or property.
	 *
	 */
	
	public Float getMaxValue() throws ClassCastException;
	
	public void setMaxValue(Float value) throws ClassCastException;
	/**
	 * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
	 *
	 */
	
	public String getUnitCode() throws ClassCastException;
	
	public void setUnitCode(String value) throws ClassCastException;
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
	 * The lower value of some characteristic or property.
	 *
	 */
	
	public Float getMinValue() throws ClassCastException;
	
	public void setMinValue(Float value) throws ClassCastException;
	/**
	 * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
	 *
	 */
	
	public <T> T getValueReference(Class<T> c) throws ClassCastException;
	
	public void setValueReference(StructuredValue value) throws ClassCastException;
	public void setValueReference(QuantitativeValue value) throws ClassCastException;
	public void setValueReference(PropertyValue value) throws ClassCastException;
	public void setValueReference(QualitativeValue value) throws ClassCastException;
	public void setValueReference(Enumeration value) throws ClassCastException;
}
