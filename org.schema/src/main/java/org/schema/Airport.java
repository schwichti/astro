package org.schema;
/**
* An airport.
*/
public class Airport extends CivicStructure{
	
	
	/**
	* ICAO identifier for an airport.
	 *
	 * Ranges: Text
	 */
	private String _icaoCode;
	
	public String getIcaoCode() throws ClassCastException{
		return (String) _icaoCode;
	}
	
	public void setIcaoCode(String value) throws ClassCastException{
		_icaoCode = value;
	}
	/**
	* IATA identifier for an airline or airport.
	 *
	 * Ranges: Text
	 */
	private String _iataCode;
	
	public String getIataCode() throws ClassCastException{
		return (String) _iataCode;
	}
	
	public void setIataCode(String value) throws ClassCastException{
		_iataCode = value;
	}
}
