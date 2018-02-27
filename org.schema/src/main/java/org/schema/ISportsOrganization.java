package org.schema;
/**
* Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations.
*/
public interface ISportsOrganization extends IOrganization{
	
	
	/**
	 * A type of sport (e.g. Baseball).
	 *
	 */
	
	public String getSport() throws ClassCastException;
	
	public void setSport(String value) throws ClassCastException;
}
