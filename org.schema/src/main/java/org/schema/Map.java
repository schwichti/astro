package org.schema;
/**
* A map.
*/
public class Map extends CreativeWork{
	
	
	/**
	* Indicates the kind of Map, from the MapCategoryType Enumeration.
	 *
	 * Ranges: MapCategoryType
	 */
	private MapCategoryType _mapType;
	
	public MapCategoryType getMapType() throws ClassCastException{
		return (MapCategoryType) _mapType;
	}
	
	public void setMapType(MapCategoryType value) throws ClassCastException{
		_mapType = value;
	}
}
