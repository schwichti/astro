package org.schema;
/**
* An airline flight.
*/
public class Flight extends Intangible{
	
	
	/**
	* The time when a passenger can check into the flight online.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _webCheckinTime;
	
	public java.util.Date getWebCheckinTime() throws ClassCastException{
		return (java.util.Date) _webCheckinTime;
	}
	
	public void setWebCheckinTime(java.util.Date value) throws ClassCastException{
		_webCheckinTime = value;
	}
	/**
	* The distance of the flight.
	 *
	 * Ranges: Text, Distance
	 */
	private Object _flightDistance;
	
	public <T> T getFlightDistance(Class<T> c) throws ClassCastException{
		return (T) _flightDistance;
	}
	
	public void setFlightDistance(String value) throws ClassCastException{
		_flightDistance = value;
	}
	public void setFlightDistance(Distance value) throws ClassCastException{
		_flightDistance = value;
	}
	/**
	* The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _provider;
	
	public <T> T getProvider(Class<T> c) throws ClassCastException{
		return (T) _provider;
	}
	
	public void setProvider(Organization value) throws ClassCastException{
		_provider = value;
	}
	public void setProvider(Person value) throws ClassCastException{
		_provider = value;
	}
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
	* Identifier of the flight's departure gate.
	 *
	 * Ranges: Text
	 */
	private String _departureGate;
	
	public String getDepartureGate() throws ClassCastException{
		return (String) _departureGate;
	}
	
	public void setDepartureGate(String value) throws ClassCastException{
		_departureGate = value;
	}
	/**
	* Identifier of the flight's departure terminal.
	 *
	 * Ranges: Text
	 */
	private String _departureTerminal;
	
	public String getDepartureTerminal() throws ClassCastException{
		return (String) _departureTerminal;
	}
	
	public void setDepartureTerminal(String value) throws ClassCastException{
		_departureTerminal = value;
	}
	/**
	* The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
	 *
	 * Ranges: Text
	 */
	private String _flightNumber;
	
	public String getFlightNumber() throws ClassCastException{
		return (String) _flightNumber;
	}
	
	public void setFlightNumber(String value) throws ClassCastException{
		_flightNumber = value;
	}
	/**
	* The kind of aircraft (e.g., "Boeing 747").
	 *
	 * Ranges: Text, Vehicle
	 */
	private Object _aircraft;
	
	public <T> T getAircraft(Class<T> c) throws ClassCastException{
		return (T) _aircraft;
	}
	
	public void setAircraft(String value) throws ClassCastException{
		_aircraft = value;
	}
	public void setAircraft(Vehicle value) throws ClassCastException{
		_aircraft = value;
	}
	/**
	* The airport where the flight terminates.
	 *
	 * Ranges: Airport
	 */
	private Airport _arrivalAirport;
	
	public Airport getArrivalAirport() throws ClassCastException{
		return (Airport) _arrivalAirport;
	}
	
	public void setArrivalAirport(Airport value) throws ClassCastException{
		_arrivalAirport = value;
	}
	/**
	* An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _seller;
	
	public <T> T getSeller(Class<T> c) throws ClassCastException{
		return (T) _seller;
	}
	
	public void setSeller(Organization value) throws ClassCastException{
		_seller = value;
	}
	public void setSeller(Person value) throws ClassCastException{
		_seller = value;
	}
	/**
	* The estimated time the flight will take.
	 *
	 * Ranges: Text, Duration
	 */
	private Object _estimatedFlightDuration;
	
	public <T> T getEstimatedFlightDuration(Class<T> c) throws ClassCastException{
		return (T) _estimatedFlightDuration;
	}
	
	public void setEstimatedFlightDuration(String value) throws ClassCastException{
		_estimatedFlightDuration = value;
	}
	public void setEstimatedFlightDuration(Duration value) throws ClassCastException{
		_estimatedFlightDuration = value;
	}
	/**
	* Identifier of the flight's arrival gate.
	 *
	 * Ranges: Text
	 */
	private String _arrivalGate;
	
	public String getArrivalGate() throws ClassCastException{
		return (String) _arrivalGate;
	}
	
	public void setArrivalGate(String value) throws ClassCastException{
		_arrivalGate = value;
	}
	/**
	* Identifier of the flight's arrival terminal.
	 *
	 * Ranges: Text
	 */
	private String _arrivalTerminal;
	
	public String getArrivalTerminal() throws ClassCastException{
		return (String) _arrivalTerminal;
	}
	
	public void setArrivalTerminal(String value) throws ClassCastException{
		_arrivalTerminal = value;
	}
	/**
	* Description of the meals that will be provided or available for purchase.
	 *
	 * Ranges: Text
	 */
	private String _mealService;
	
	public String getMealService() throws ClassCastException{
		return (String) _mealService;
	}
	
	public void setMealService(String value) throws ClassCastException{
		_mealService = value;
	}
	/**
	* 'carrier' is an out-dated term indicating the 'provider' for parcel delivery and flights.
	 *
	 * Ranges: Organization
	 */
	private Organization _carrier;
	
	public Organization getCarrier() throws ClassCastException{
		return (Organization) _carrier;
	}
	
	public void setCarrier(Organization value) throws ClassCastException{
		_carrier = value;
	}
	/**
	* The expected arrival time.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _arrivalTime;
	
	public java.util.Date getArrivalTime() throws ClassCastException{
		return (java.util.Date) _arrivalTime;
	}
	
	public void setArrivalTime(java.util.Date value) throws ClassCastException{
		_arrivalTime = value;
	}
	/**
	* The expected departure time.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _departureTime;
	
	public java.util.Date getDepartureTime() throws ClassCastException{
		return (java.util.Date) _departureTime;
	}
	
	public void setDepartureTime(java.util.Date value) throws ClassCastException{
		_departureTime = value;
	}
	/**
	* The airport where the flight originates.
	 *
	 * Ranges: Airport
	 */
	private Airport _departureAirport;
	
	public Airport getDepartureAirport() throws ClassCastException{
		return (Airport) _departureAirport;
	}
	
	public void setDepartureAirport(Airport value) throws ClassCastException{
		_departureAirport = value;
	}
}
