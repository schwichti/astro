package org.schema;
/**
* A set of characteristics belonging to people, e.g. who compose an item's target audience.
*/
public class PeopleAudience extends Audience{
	
	
	/**
	* The gender of the person or audience.
	 *
	 * Ranges: Text
	 */
	private String _suggestedGender;
	
	public String getSuggestedGender() throws ClassCastException{
		return (String) _suggestedGender;
	}
	
	public void setSuggestedGender(String value) throws ClassCastException{
		_suggestedGender = value;
	}
	/**
	* Audiences defined by a person's gender.
	 *
	 * Ranges: Text
	 */
	private String _requiredGender;
	
	public String getRequiredGender() throws ClassCastException{
		return (String) _requiredGender;
	}
	
	public void setRequiredGender(String value) throws ClassCastException{
		_requiredGender = value;
	}
	/**
	* Minimal age recommended for viewing content.
	 *
	 * Ranges: Number
	 */
	private Float _suggestedMinAge;
	
	public Float getSuggestedMinAge() throws ClassCastException{
		return (Float) _suggestedMinAge;
	}
	
	public void setSuggestedMinAge(Float value) throws ClassCastException{
		_suggestedMinAge = value;
	}
	/**
	* Audiences defined by a person's maximum age.
	 *
	 * Ranges: Integer
	 */
	private Integer _requiredMaxAge;
	
	public Integer getRequiredMaxAge() throws ClassCastException{
		return (Integer) _requiredMaxAge;
	}
	
	public void setRequiredMaxAge(Integer value) throws ClassCastException{
		_requiredMaxAge = value;
	}
	/**
	* Maximal age recommended for viewing content.
	 *
	 * Ranges: Number
	 */
	private Float _suggestedMaxAge;
	
	public Float getSuggestedMaxAge() throws ClassCastException{
		return (Float) _suggestedMaxAge;
	}
	
	public void setSuggestedMaxAge(Float value) throws ClassCastException{
		_suggestedMaxAge = value;
	}
	/**
	* Audiences defined by a person's minimum age.
	 *
	 * Ranges: Integer
	 */
	private Integer _requiredMinAge;
	
	public Integer getRequiredMinAge() throws ClassCastException{
		return (Integer) _requiredMinAge;
	}
	
	public void setRequiredMinAge(Integer value) throws ClassCastException{
		_requiredMinAge = value;
	}
}
