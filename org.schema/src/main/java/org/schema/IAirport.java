package org.schema;
/**
* An airport.
*/
public interface IAirport extends ICivicStructure{
	
	
	/**
	 * ICAO identifier for an airport.
	 *
	 */
	
	public String getIcaoCode() throws ClassCastException;
	
	public void setIcaoCode(String value) throws ClassCastException;
	/**
	 * IATA identifier for an airline or airport.
	 *
	 */
	
	public String getIataCode() throws ClassCastException;
	
	public void setIataCode(String value) throws ClassCastException;
}
