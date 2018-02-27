package org.schema;
/**
* A trip on a commercial bus line.
*/
public interface IBusTrip extends IIntangible{
	
	
	/**
	 * The unique identifier for the bus.
	 *
	 */
	
	public String getBusNumber() throws ClassCastException;
	
	public void setBusNumber(String value) throws ClassCastException;
	/**
	 * The stop or station from which the bus arrives.
	 *
	 */
	
	public <T> T getArrivalBusStop(Class<T> c) throws ClassCastException;
	
	public void setArrivalBusStop(BusStop value) throws ClassCastException;
	public void setArrivalBusStop(BusStation value) throws ClassCastException;
	/**
	 * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 */
	
	public <T> T getProvider(Class<T> c) throws ClassCastException;
	
	public void setProvider(Organization value) throws ClassCastException;
	public void setProvider(Person value) throws ClassCastException;
	/**
	 * The expected arrival time.
	 *
	 */
	
	public java.util.Date getArrivalTime() throws ClassCastException;
	
	public void setArrivalTime(java.util.Date value) throws ClassCastException;
	/**
	 * The name of the bus (e.g. Bolt Express).
	 *
	 */
	
	public String getBusName() throws ClassCastException;
	
	public void setBusName(String value) throws ClassCastException;
	/**
	 * The expected departure time.
	 *
	 */
	
	public java.util.Date getDepartureTime() throws ClassCastException;
	
	public void setDepartureTime(java.util.Date value) throws ClassCastException;
	/**
	 * The stop or station from which the bus departs.
	 *
	 */
	
	public <T> T getDepartureBusStop(Class<T> c) throws ClassCastException;
	
	public void setDepartureBusStop(BusStop value) throws ClassCastException;
	public void setDepartureBusStop(BusStation value) throws ClassCastException;
}
