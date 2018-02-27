package org.schema;
/**
* A PerformanceRole is a Role that some entity places with regard to a theatrical performance, e.g. in a Movie, TVSeries etc.
*/
public class PerformanceRole extends Role{
	
	
	/**
	* The name of a character played in some acting or performing role, i.e. in a PerformanceRole.
	 *
	 * Ranges: Text
	 */
	private String _characterName;
	
	public String getCharacterName() throws ClassCastException{
		return (String) _characterName;
	}
	
	public void setCharacterName(String value) throws ClassCastException{
		_characterName = value;
	}
}
