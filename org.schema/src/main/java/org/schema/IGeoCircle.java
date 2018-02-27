package org.schema;
/**
* A GeoCircle is a GeoShape representing a circular geographic area. As it is a GeoShape
          it provides the simple textual property 'circle', but also allows the combination of postalCode alongside geoRadius.
          The center of the circle can be indicated via the 'geoMidpoint' property, or more approximately using 'address', 'postalCode'.
*/
public interface IGeoCircle extends IGeoShape{
	
	
	/**
	 * Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.
	 *
	 */
	
	public GeoCoordinates getGeoMidpoint() throws ClassCastException;
	
	public void setGeoMidpoint(GeoCoordinates value) throws ClassCastException;
	/**
	 * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
	 *
	 */
	
	public <T> T getGeoRadius(Class<T> c) throws ClassCastException;
	
	public void setGeoRadius(Distance value) throws ClassCastException;
	public void setGeoRadius(String value) throws ClassCastException;
	public void setGeoRadius(Float value) throws ClassCastException;
}
