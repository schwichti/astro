package org.schema;
/**
* A map.
*/
public interface IMap extends ICreativeWork{
	
	
	/**
	 * Indicates the kind of Map, from the MapCategoryType Enumeration.
	 *
	 */
	
	public MapCategoryType getMapType() throws ClassCastException;
	
	public void setMapType(MapCategoryType value) throws ClassCastException;
}
