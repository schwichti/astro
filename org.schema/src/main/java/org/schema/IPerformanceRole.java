package org.schema;
/**
* A PerformanceRole is a Role that some entity places with regard to a theatrical performance, e.g. in a Movie, TVSeries etc.
*/
public interface IPerformanceRole extends IRole{
	
	
	/**
	 * The name of a character played in some acting or performing role, i.e. in a PerformanceRole.
	 *
	 */
	
	public String getCharacterName() throws ClassCastException;
	
	public void setCharacterName(String value) throws ClassCastException;
}
