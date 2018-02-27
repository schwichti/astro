package org.schema;
/**
* A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.</p>

<p>Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.
*/
public class PropertyValue extends StructuredValue{
	
	
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
	* A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. propertyID can be
	(1) a prefixed string, mainly meant to be used with standards for product properties; (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), or (3)
	a URL indicating the type of the property, either pointing to an external vocabulary, or a Web resource that describes the property (e.g. a glossary entry).
	Standards bodies should promote a standard prefix for the identifiers of properties from their standards.
	 *
	 * Ranges: URL, Text
	 */
	private String _propertyID;
	
	public String getPropertyID() throws ClassCastException{
		return (String) _propertyID;
	}
	
	public void setPropertyID(String value) throws ClassCastException{
		_propertyID = value;
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
