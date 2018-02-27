package org.schema;
/**
* An organization that provides flights for passengers.
*/
public interface IAirline extends IOrganization{
	
	
	/**
	 * The type of boarding policy used by the airline (e.g. zone-based or group-based).
	 *
	 */
	
	public BoardingPolicyType getBoardingPolicy() throws ClassCastException;
	
	public void setBoardingPolicy(BoardingPolicyType value) throws ClassCastException;
	/**
	 * IATA identifier for an airline or airport.
	 *
	 */
	
	public String getIataCode() throws ClassCastException;
	
	public void setIataCode(String value) throws ClassCastException;
}
