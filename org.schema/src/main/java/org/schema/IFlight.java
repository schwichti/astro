package org.schema;
/**
* An airline flight.
*/
public interface IFlight extends IIntangible{
	
	
	/**
	 * The time when a passenger can check into the flight online.
	 *
	 */
	
	public java.util.Date getWebCheckinTime() throws ClassCastException;
	
	public void setWebCheckinTime(java.util.Date value) throws ClassCastException;
	/**
	 * The distance of the flight.
	 *
	 */
	
	public <T> T getFlightDistance(Class<T> c) throws ClassCastException;
	
	public void setFlightDistance(String value) throws ClassCastException;
	public void setFlightDistance(Distance value) throws ClassCastException;
	/**
	 * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 */
	
	public <T> T getProvider(Class<T> c) throws ClassCastException;
	
	public void setProvider(Organization value) throws ClassCastException;
	public void setProvider(Person value) throws ClassCastException;
	/**
	 * The type of boarding policy used by the airline (e.g. zone-based or group-based).
	 *
	 */
	
	public BoardingPolicyType getBoardingPolicy() throws ClassCastException;
	
	public void setBoardingPolicy(BoardingPolicyType value) throws ClassCastException;
	/**
	 * Identifier of the flight's departure gate.
	 *
	 */
	
	public String getDepartureGate() throws ClassCastException;
	
	public void setDepartureGate(String value) throws ClassCastException;
	/**
	 * Identifier of the flight's departure terminal.
	 *
	 */
	
	public String getDepartureTerminal() throws ClassCastException;
	
	public void setDepartureTerminal(String value) throws ClassCastException;
	/**
	 * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
	 *
	 */
	
	public String getFlightNumber() throws ClassCastException;
	
	public void setFlightNumber(String value) throws ClassCastException;
	/**
	 * The kind of aircraft (e.g., "Boeing 747").
	 *
	 */
	
	public <T> T getAircraft(Class<T> c) throws ClassCastException;
	
	public void setAircraft(String value) throws ClassCastException;
	public void setAircraft(Vehicle value) throws ClassCastException;
	/**
	 * The airport where the flight terminates.
	 *
	 */
	
	public Airport getArrivalAirport() throws ClassCastException;
	
	public void setArrivalAirport(Airport value) throws ClassCastException;
	/**
	 * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
	 *
	 */
	
	public <T> T getSeller(Class<T> c) throws ClassCastException;
	
	public void setSeller(Organization value) throws ClassCastException;
	public void setSeller(Person value) throws ClassCastException;
	/**
	 * The estimated time the flight will take.
	 *
	 */
	
	public <T> T getEstimatedFlightDuration(Class<T> c) throws ClassCastException;
	
	public void setEstimatedFlightDuration(String value) throws ClassCastException;
	public void setEstimatedFlightDuration(Duration value) throws ClassCastException;
	/**
	 * Identifier of the flight's arrival gate.
	 *
	 */
	
	public String getArrivalGate() throws ClassCastException;
	
	public void setArrivalGate(String value) throws ClassCastException;
	/**
	 * Identifier of the flight's arrival terminal.
	 *
	 */
	
	public String getArrivalTerminal() throws ClassCastException;
	
	public void setArrivalTerminal(String value) throws ClassCastException;
	/**
	 * Description of the meals that will be provided or available for purchase.
	 *
	 */
	
	public String getMealService() throws ClassCastException;
	
	public void setMealService(String value) throws ClassCastException;
	/**
	 * 'carrier' is an out-dated term indicating the 'provider' for parcel delivery and flights.
	 *
	 */
	
	public Organization getCarrier() throws ClassCastException;
	
	public void setCarrier(Organization value) throws ClassCastException;
	/**
	 * The expected arrival time.
	 *
	 */
	
	public java.util.Date getArrivalTime() throws ClassCastException;
	
	public void setArrivalTime(java.util.Date value) throws ClassCastException;
	/**
	 * The expected departure time.
	 *
	 */
	
	public java.util.Date getDepartureTime() throws ClassCastException;
	
	public void setDepartureTime(java.util.Date value) throws ClassCastException;
	/**
	 * The airport where the flight originates.
	 *
	 */
	
	public Airport getDepartureAirport() throws ClassCastException;
	
	public void setDepartureAirport(Airport value) throws ClassCastException;
}
