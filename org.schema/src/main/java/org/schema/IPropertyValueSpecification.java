package org.schema;
/**
* A Property value specification.
*/
public interface IPropertyValueSpecification extends IIntangible{
	
	
	/**
	 * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
	 *
	 */
	
	public String getValueName() throws ClassCastException;
	
	public void setValueName(String value) throws ClassCastException;
	/**
	 * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
	 *
	 */
	
	public <T> T getDefaultValue(Class<T> c) throws ClassCastException;
	
	public void setDefaultValue(String value) throws ClassCastException;
	public void setDefaultValue(Thing value) throws ClassCastException;
	/**
	 * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
	 *
	 */
	
	public Boolean getReadonlyValue() throws ClassCastException;
	
	public void setReadonlyValue(Boolean value) throws ClassCastException;
	/**
	 * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
	 *
	 */
	
	public Float getStepValue() throws ClassCastException;
	
	public void setStepValue(Float value) throws ClassCastException;
	/**
	 * The lower value of some characteristic or property.
	 *
	 */
	
	public Float getMinValue() throws ClassCastException;
	
	public void setMinValue(Float value) throws ClassCastException;
	/**
	 * Specifies a regular expression for testing literal values according to the HTML spec.
	 *
	 */
	
	public String getValuePattern() throws ClassCastException;
	
	public void setValuePattern(String value) throws ClassCastException;
	/**
	 * Specifies the allowed range for number of characters in a literal value.
	 *
	 */
	
	public Float getValueMaxLength() throws ClassCastException;
	
	public void setValueMaxLength(Float value) throws ClassCastException;
	/**
	 * Specifies the minimum allowed range for number of characters in a literal value.
	 *
	 */
	
	public Float getValueMinLength() throws ClassCastException;
	
	public void setValueMinLength(Float value) throws ClassCastException;
	/**
	 * The upper value of some characteristic or property.
	 *
	 */
	
	public Float getMaxValue() throws ClassCastException;
	
	public void setMaxValue(Float value) throws ClassCastException;
	/**
	 * Whether multiple values are allowed for the property.  Default is false.
	 *
	 */
	
	public Boolean getMultipleValues() throws ClassCastException;
	
	public void setMultipleValues(Boolean value) throws ClassCastException;
	/**
	 * Whether the property must be filled in to complete the action.  Default is false.
	 *
	 */
	
	public Boolean getValueRequired() throws ClassCastException;
	
	public void setValueRequired(Boolean value) throws ClassCastException;
}
