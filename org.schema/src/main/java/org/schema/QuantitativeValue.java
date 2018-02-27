package org.schema;
/**
* A point value or interval for product characteristics and other purposes.
*/
public class QuantitativeValue extends StructuredValue{
	
	
	/**
	* A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.</p>
	
	<p>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
	 *
	 * Ranges: PropertyValue
	 */
	private PropertyValue _additionalProperty;
	
	public PropertyValue getAdditionalProperty() throws ClassCastException{
		return (PropertyValue) _additionalProperty;
	}
	
	public void setAdditionalProperty(PropertyValue value) throws ClassCastException{
		_additionalProperty = value;
	}
	/**
	* A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
	<a href='unitCode'>unitCode</a>.
	 *
	 * Ranges: Text
	 */
	private String _unitText;
	
	public String getUnitText() throws ClassCastException{
		return (String) _unitText;
	}
	
	public void setUnitText(String value) throws ClassCastException{
		_unitText = value;
	}
	/**
	* The upper value of some characteristic or property.
	 *
	 * Ranges: Number
	 */
	private Float _maxValue;
	
	public Float getMaxValue() throws ClassCastException{
		return (Float) _maxValue;
	}
	
	public void setMaxValue(Float value) throws ClassCastException{
		_maxValue = value;
	}
	/**
	* The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
	 *
	 * Ranges: URL, Text
	 */
	private String _unitCode;
	
	public String getUnitCode() throws ClassCastException{
		return (String) _unitCode;
	}
	
	public void setUnitCode(String value) throws ClassCastException{
		_unitCode = value;
	}
	/**
	* <p>The value of the quantitative value or property value node.</p>
	
	<ul>
	<li>For <a class="localLink" href="http://schema.org/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
	<li>For <a class="localLink" href="http://schema.org/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
	</ul>
	 *
	 * Ranges: Boolean, Text, StructuredValue, Number
	 */
	private Object _value;
	
	public <T> T getValue(Class<T> c) throws ClassCastException{
		return (T) _value;
	}
	
	public void setValue(Boolean value) throws ClassCastException{
		_value = value;
	}
	public void setValue(String value) throws ClassCastException{
		_value = value;
	}
	public void setValue(StructuredValue value) throws ClassCastException{
		_value = value;
	}
	public void setValue(Float value) throws ClassCastException{
		_value = value;
	}
	/**
	* The lower value of some characteristic or property.
	 *
	 * Ranges: Number
	 */
	private Float _minValue;
	
	public Float getMinValue() throws ClassCastException{
		return (Float) _minValue;
	}
	
	public void setMinValue(Float value) throws ClassCastException{
		_minValue = value;
	}
	/**
	* A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
	 *
	 * Ranges: StructuredValue, QuantitativeValue, PropertyValue, QualitativeValue, Enumeration
	 */
	private Object _valueReference;
	
	public <T> T getValueReference(Class<T> c) throws ClassCastException{
		return (T) _valueReference;
	}
	
	public void setValueReference(StructuredValue value) throws ClassCastException{
		_valueReference = value;
	}
	public void setValueReference(QuantitativeValue value) throws ClassCastException{
		_valueReference = value;
	}
	public void setValueReference(PropertyValue value) throws ClassCastException{
		_valueReference = value;
	}
	public void setValueReference(QualitativeValue value) throws ClassCastException{
		_valueReference = value;
	}
	public void setValueReference(Enumeration value) throws ClassCastException{
		_valueReference = value;
	}
}
