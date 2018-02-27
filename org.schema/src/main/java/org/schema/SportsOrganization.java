package org.schema;
/**
* Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations.
*/
public class SportsOrganization extends Organization{
	
	
	/**
	* A type of sport (e.g. Baseball).
	 *
	 * Ranges: Text, URL
	 */
	private String _sport;
	
	public String getSport() throws ClassCastException{
		return (String) _sport;
	}
	
	public void setSport(String value) throws ClassCastException{
		_sport = value;
	}
}
