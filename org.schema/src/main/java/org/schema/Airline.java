package org.schema;
/**
* An organization that provides flights for passengers.
*/
public class Airline extends Organization{
	
	
	/**
	* The type of boarding policy used by the airline (e.g. zone-based or group-based).
	 *
	 * Ranges: BoardingPolicyType
	 */
	private BoardingPolicyType _boardingPolicy;
	
	public BoardingPolicyType getBoardingPolicy() throws ClassCastException{
		return (BoardingPolicyType) _boardingPolicy;
	}
	
	public void setBoardingPolicy(BoardingPolicyType value) throws ClassCastException{
		_boardingPolicy = value;
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
