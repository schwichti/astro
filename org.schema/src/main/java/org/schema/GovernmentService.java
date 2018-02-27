package org.schema;
/**
* A service provided by a government organization, e.g. food stamps, veterans benefits, etc.
*/
public class GovernmentService extends Service{
	
	
	/**
	* The operating organization, if different from the provider.  This enables the representation of services that are provided by an organization, but operated by another organization like a subcontractor.
	 *
	 * Ranges: Organization
	 */
	private Organization _serviceOperator;
	
	public Organization getServiceOperator() throws ClassCastException{
		return (Organization) _serviceOperator;
	}
	
	public void setServiceOperator(Organization value) throws ClassCastException{
		_serviceOperator = value;
	}
}
