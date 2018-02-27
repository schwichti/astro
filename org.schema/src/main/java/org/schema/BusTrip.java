package org.schema;
/**
* A trip on a commercial bus line.
*/
public class BusTrip extends Intangible{
	
	
	/**
	* The unique identifier for the bus.
	 *
	 * Ranges: Text
	 */
	private String _busNumber;
	
	public String getBusNumber() throws ClassCastException{
		return (String) _busNumber;
	}
	
	public void setBusNumber(String value) throws ClassCastException{
		_busNumber = value;
	}
	/**
	* The stop or station from which the bus arrives.
	 *
	 * Ranges: BusStop, BusStation
	 */
	private Object _arrivalBusStop;
	
	public <T> T getArrivalBusStop(Class<T> c) throws ClassCastException{
		return (T) _arrivalBusStop;
	}
	
	public void setArrivalBusStop(BusStop value) throws ClassCastException{
		_arrivalBusStop = value;
	}
	public void setArrivalBusStop(BusStation value) throws ClassCastException{
		_arrivalBusStop = value;
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
	* The name of the bus (e.g. Bolt Express).
	 *
	 * Ranges: Text
	 */
	private String _busName;
	
	public String getBusName() throws ClassCastException{
		return (String) _busName;
	}
	
	public void setBusName(String value) throws ClassCastException{
		_busName = value;
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
	* The stop or station from which the bus departs.
	 *
	 * Ranges: BusStop, BusStation
	 */
	private Object _departureBusStop;
	
	public <T> T getDepartureBusStop(Class<T> c) throws ClassCastException{
		return (T) _departureBusStop;
	}
	
	public void setDepartureBusStop(BusStop value) throws ClassCastException{
		_departureBusStop = value;
	}
	public void setDepartureBusStop(BusStation value) throws ClassCastException{
		_departureBusStop = value;
	}
}
