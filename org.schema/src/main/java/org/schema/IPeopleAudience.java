package org.schema;
/**
* A set of characteristics belonging to people, e.g. who compose an item's target audience.
*/
public interface IPeopleAudience extends IAudience{
	
	
	/**
	 * The gender of the person or audience.
	 *
	 */
	
	public String getSuggestedGender() throws ClassCastException;
	
	public void setSuggestedGender(String value) throws ClassCastException;
	/**
	 * Audiences defined by a person's gender.
	 *
	 */
	
	public String getRequiredGender() throws ClassCastException;
	
	public void setRequiredGender(String value) throws ClassCastException;
	/**
	 * Minimal age recommended for viewing content.
	 *
	 */
	
	public Float getSuggestedMinAge() throws ClassCastException;
	
	public void setSuggestedMinAge(Float value) throws ClassCastException;
	/**
	 * Audiences defined by a person's maximum age.
	 *
	 */
	
	public Integer getRequiredMaxAge() throws ClassCastException;
	
	public void setRequiredMaxAge(Integer value) throws ClassCastException;
	/**
	 * Maximal age recommended for viewing content.
	 *
	 */
	
	public Float getSuggestedMaxAge() throws ClassCastException;
	
	public void setSuggestedMaxAge(Float value) throws ClassCastException;
	/**
	 * Audiences defined by a person's minimum age.
	 *
	 */
	
	public Integer getRequiredMinAge() throws ClassCastException;
	
	public void setRequiredMinAge(Integer value) throws ClassCastException;
}
