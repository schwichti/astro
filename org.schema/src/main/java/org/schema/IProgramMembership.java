package org.schema;
/**
* Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc.
*/
public interface IProgramMembership extends IIntangible{
	
	
	/**
	 * The organization (airline, travelers' club, etc.) the membership is made with.
	 *
	 */
	
	public Organization getHostingOrganization() throws ClassCastException;
	
	public void setHostingOrganization(Organization value) throws ClassCastException;
	/**
	 * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
	 *
	 */
	
	public <T> T getMember(Class<T> c) throws ClassCastException;
	
	public void setMember(Organization value) throws ClassCastException;
	public void setMember(Person value) throws ClassCastException;
	/**
	 * A member of this organization.
	 *
	 */
	
	public <T> T getMembers(Class<T> c) throws ClassCastException;
	
	public void setMembers(Organization value) throws ClassCastException;
	public void setMembers(Person value) throws ClassCastException;
	/**
	 * The program providing the membership.
	 *
	 */
	
	public String getProgramName() throws ClassCastException;
	
	public void setProgramName(String value) throws ClassCastException;
	/**
	 * A unique identifier for the membership.
	 *
	 */
	
	public String getMembershipNumber() throws ClassCastException;
	
	public void setMembershipNumber(String value) throws ClassCastException;
}
