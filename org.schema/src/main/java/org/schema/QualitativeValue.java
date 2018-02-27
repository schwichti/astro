package org.schema;
/**
* A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.
*/
public class QualitativeValue extends Enumeration{
	
	
	/**
	* This ordering relation for qualitative values indicates that the subject is lesser than the object.
	 *
	 * Ranges: QualitativeValue
	 */
	private QualitativeValue _lesser;
	
	public QualitativeValue getLesser() throws ClassCastException{
		return (QualitativeValue) _lesser;
	}
	
	public void setLesser(QualitativeValue value) throws ClassCastException{
		_lesser = value;
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
	/**
	* This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
	 *
	 * Ranges: QualitativeValue
	 */
	private QualitativeValue _greaterOrEqual;
	
	public QualitativeValue getGreaterOrEqual() throws ClassCastException{
		return (QualitativeValue) _greaterOrEqual;
	}
	
	public void setGreaterOrEqual(QualitativeValue value) throws ClassCastException{
		_greaterOrEqual = value;
	}
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
	* This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
	 *
	 * Ranges: QualitativeValue
	 */
	private QualitativeValue _lesserOrEqual;
	
	public QualitativeValue getLesserOrEqual() throws ClassCastException{
		return (QualitativeValue) _lesserOrEqual;
	}
	
	public void setLesserOrEqual(QualitativeValue value) throws ClassCastException{
		_lesserOrEqual = value;
	}
	/**
	* This ordering relation for qualitative values indicates that the subject is greater than the object.
	 *
	 * Ranges: QualitativeValue
	 */
	private QualitativeValue _greater;
	
	public QualitativeValue getGreater() throws ClassCastException{
		return (QualitativeValue) _greater;
	}
	
	public void setGreater(QualitativeValue value) throws ClassCastException{
		_greater = value;
	}
	/**
	* This ordering relation for qualitative values indicates that the subject is not equal to the object.
	 *
	 * Ranges: QualitativeValue
	 */
	private QualitativeValue _nonEqual;
	
	public QualitativeValue getNonEqual() throws ClassCastException{
		return (QualitativeValue) _nonEqual;
	}
	
	public void setNonEqual(QualitativeValue value) throws ClassCastException{
		_nonEqual = value;
	}
	/**
	* This ordering relation for qualitative values indicates that the subject is equal to the object.
	 *
	 * Ranges: QualitativeValue
	 */
	private QualitativeValue _equal;
	
	public QualitativeValue getEqual() throws ClassCastException{
		return (QualitativeValue) _equal;
	}
	
	public void setEqual(QualitativeValue value) throws ClassCastException{
		_equal = value;
	}
}
