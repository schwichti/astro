package org.schema;
/**
* Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc.
*/
public class ProgramMembership extends Intangible{
	
	
	/**
	* The organization (airline, travelers' club, etc.) the membership is made with.
	 *
	 * Ranges: Organization
	 */
	private Organization _hostingOrganization;
	
	public Organization getHostingOrganization() throws ClassCastException{
		return (Organization) _hostingOrganization;
	}
	
	public void setHostingOrganization(Organization value) throws ClassCastException{
		_hostingOrganization = value;
	}
	/**
	* A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _member;
	
	public <T> T getMember(Class<T> c) throws ClassCastException{
		return (T) _member;
	}
	
	public void setMember(Organization value) throws ClassCastException{
		_member = value;
	}
	public void setMember(Person value) throws ClassCastException{
		_member = value;
	}
	/**
	* A member of this organization.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _members;
	
	public <T> T getMembers(Class<T> c) throws ClassCastException{
		return (T) _members;
	}
	
	public void setMembers(Organization value) throws ClassCastException{
		_members = value;
	}
	public void setMembers(Person value) throws ClassCastException{
		_members = value;
	}
	/**
	* The program providing the membership.
	 *
	 * Ranges: Text
	 */
	private String _programName;
	
	public String getProgramName() throws ClassCastException{
		return (String) _programName;
	}
	
	public void setProgramName(String value) throws ClassCastException{
		_programName = value;
	}
	/**
	* A unique identifier for the membership.
	 *
	 * Ranges: Text
	 */
	private String _membershipNumber;
	
	public String getMembershipNumber() throws ClassCastException{
		return (String) _membershipNumber;
	}
	
	public void setMembershipNumber(String value) throws ClassCastException{
		_membershipNumber = value;
	}
}
