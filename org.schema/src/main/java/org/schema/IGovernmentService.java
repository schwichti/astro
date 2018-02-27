package org.schema;
/**
* A service provided by a government organization, e.g. food stamps, veterans benefits, etc.
*/
public interface IGovernmentService extends IService{
	
	
	/**
	 * The operating organization, if different from the provider.  This enables the representation of services that are provided by an organization, but operated by another organization like a subcontractor.
	 *
	 */
	
	public Organization getServiceOperator() throws ClassCastException;
	
	public void setServiceOperator(Organization value) throws ClassCastException;
}
