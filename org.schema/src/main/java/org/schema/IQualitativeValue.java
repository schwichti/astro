package org.schema;
/**
* A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.
*/
public interface IQualitativeValue extends IEnumeration{
	
	
	/**
	 * This ordering relation for qualitative values indicates that the subject is lesser than the object.
	 *
	 */
	
	public QualitativeValue getLesser() throws ClassCastException;
	
	public void setLesser(QualitativeValue value) throws ClassCastException;
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
	/**
	 * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
	 *
	 */
	
	public QualitativeValue getGreaterOrEqual() throws ClassCastException;
	
	public void setGreaterOrEqual(QualitativeValue value) throws ClassCastException;
	/**
	 * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.</p>
	 
	 <p>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
	 *
	 */
	
	public PropertyValue getAdditionalProperty() throws ClassCastException;
	
	public void setAdditionalProperty(PropertyValue value) throws ClassCastException;
	/**
	 * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
	 *
	 */
	
	public QualitativeValue getLesserOrEqual() throws ClassCastException;
	
	public void setLesserOrEqual(QualitativeValue value) throws ClassCastException;
	/**
	 * This ordering relation for qualitative values indicates that the subject is greater than the object.
	 *
	 */
	
	public QualitativeValue getGreater() throws ClassCastException;
	
	public void setGreater(QualitativeValue value) throws ClassCastException;
	/**
	 * This ordering relation for qualitative values indicates that the subject is not equal to the object.
	 *
	 */
	
	public QualitativeValue getNonEqual() throws ClassCastException;
	
	public void setNonEqual(QualitativeValue value) throws ClassCastException;
	/**
	 * This ordering relation for qualitative values indicates that the subject is equal to the object.
	 *
	 */
	
	public QualitativeValue getEqual() throws ClassCastException;
	
	public void setEqual(QualitativeValue value) throws ClassCastException;
}
