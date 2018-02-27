package org.schema;
/**
* A GeoCircle is a GeoShape representing a circular geographic area. As it is a GeoShape
          it provides the simple textual property 'circle', but also allows the combination of postalCode alongside geoRadius.
          The center of the circle can be indicated via the 'geoMidpoint' property, or more approximately using 'address', 'postalCode'.
*/
public class GeoCircle extends GeoShape{
	
	
	/**
	* Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.
	 *
	 * Ranges: GeoCoordinates
	 */
	private GeoCoordinates _geoMidpoint;
	
	public GeoCoordinates getGeoMidpoint() throws ClassCastException{
		return (GeoCoordinates) _geoMidpoint;
	}
	
	public void setGeoMidpoint(GeoCoordinates value) throws ClassCastException{
		_geoMidpoint = value;
	}
	/**
	* Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
	 *
	 * Ranges: Distance, Text, Number
	 */
	private Object _geoRadius;
	
	public <T> T getGeoRadius(Class<T> c) throws ClassCastException{
		return (T) _geoRadius;
	}
	
	public void setGeoRadius(Distance value) throws ClassCastException{
		_geoRadius = value;
	}
	public void setGeoRadius(String value) throws ClassCastException{
		_geoRadius = value;
	}
	public void setGeoRadius(Float value) throws ClassCastException{
		_geoRadius = value;
	}
}
