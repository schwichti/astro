package org.schema;
/**
* Represents additional information about a relationship or property. For example a Role can be used to say that a 'member' role linking some SportsTeam to a player occurred during a particular time period. Or that a Person's 'actor' role in a Movie was for some particular characterName. Such properties can be attached to a Role entity, which is then associated with the main entities using ordinary properties like 'member' or 'actor'.</p>

<p>See also <a href="http://blog.schema.org/2014/06/introducing-role.html">blog post</a>.
*/
public interface IRole extends IIntangible{
	
	
	/**
	 * The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 */
	
	public java.util.Date getEndDate() throws ClassCastException;
	
	public void setEndDate(java.util.Date value) throws ClassCastException;
	/**
	 * A position played, performed or filled by a person or organization, as part of an organization. For example, an athlete in a SportsTeam might play in the position named 'Quarterback'.
	 *
	 */
	
	public String getNamedPosition() throws ClassCastException;
	
	public void setNamedPosition(String value) throws ClassCastException;
	/**
	 * The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 */
	
	public java.util.Date getStartDate() throws ClassCastException;
	
	public void setStartDate(java.util.Date value) throws ClassCastException;
	/**
	 * A role played, performed or filled by a person or organization. For example, the team of creators for a comic book might fill the roles named 'inker', 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the position named 'Quarterback'.
	 *
	 */
	
	public String getRoleName() throws ClassCastException;
	
	public void setRoleName(String value) throws ClassCastException;
}
