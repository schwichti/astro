package org.schema;
/**
* A Property value specification.
*/
public class PropertyValueSpecification extends Intangible{
	
	
	/**
	* Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
	 *
	 * Ranges: Text
	 */
	private String _valueName;
	
	public String getValueName() throws ClassCastException{
		return (String) _valueName;
	}
	
	public void setValueName(String value) throws ClassCastException{
		_valueName = value;
	}
	/**
	* The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
	 *
	 * Ranges: Text, Thing
	 */
	private Object _defaultValue;
	
	public <T> T getDefaultValue(Class<T> c) throws ClassCastException{
		return (T) _defaultValue;
	}
	
	public void setDefaultValue(String value) throws ClassCastException{
		_defaultValue = value;
	}
	public void setDefaultValue(Thing value) throws ClassCastException{
		_defaultValue = value;
	}
	/**
	* Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _readonlyValue;
	
	public Boolean getReadonlyValue() throws ClassCastException{
		return (Boolean) _readonlyValue;
	}
	
	public void setReadonlyValue(Boolean value) throws ClassCastException{
		_readonlyValue = value;
	}
	/**
	* The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
	 *
	 * Ranges: Number
	 */
	private Float _stepValue;
	
	public Float getStepValue() throws ClassCastException{
		return (Float) _stepValue;
	}
	
	public void setStepValue(Float value) throws ClassCastException{
		_stepValue = value;
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
	* Specifies a regular expression for testing literal values according to the HTML spec.
	 *
	 * Ranges: Text
	 */
	private String _valuePattern;
	
	public String getValuePattern() throws ClassCastException{
		return (String) _valuePattern;
	}
	
	public void setValuePattern(String value) throws ClassCastException{
		_valuePattern = value;
	}
	/**
	* Specifies the allowed range for number of characters in a literal value.
	 *
	 * Ranges: Number
	 */
	private Float _valueMaxLength;
	
	public Float getValueMaxLength() throws ClassCastException{
		return (Float) _valueMaxLength;
	}
	
	public void setValueMaxLength(Float value) throws ClassCastException{
		_valueMaxLength = value;
	}
	/**
	* Specifies the minimum allowed range for number of characters in a literal value.
	 *
	 * Ranges: Number
	 */
	private Float _valueMinLength;
	
	public Float getValueMinLength() throws ClassCastException{
		return (Float) _valueMinLength;
	}
	
	public void setValueMinLength(Float value) throws ClassCastException{
		_valueMinLength = value;
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
	* Whether multiple values are allowed for the property.  Default is false.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _multipleValues;
	
	public Boolean getMultipleValues() throws ClassCastException{
		return (Boolean) _multipleValues;
	}
	
	public void setMultipleValues(Boolean value) throws ClassCastException{
		_multipleValues = value;
	}
	/**
	* Whether the property must be filled in to complete the action.  Default is false.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _valueRequired;
	
	public Boolean getValueRequired() throws ClassCastException{
		return (Boolean) _valueRequired;
	}
	
	public void setValueRequired(Boolean value) throws ClassCastException{
		_valueRequired = value;
	}
}
