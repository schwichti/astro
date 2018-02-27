package org.schema;
/**
* A trip on a commercial train line.
*/
public interface ITrainTrip extends IIntangible{
	
	
	/**
	 * The platform from which the train departs.
	 *
	 */
	
	public String getDeparturePlatform() throws ClassCastException;
	
	public void setDeparturePlatform(String value) throws ClassCastException;
	/**
	 * The station where the train trip ends.
	 *
	 */
	
	public TrainStation getArrivalStation() throws ClassCastException;
	
	public void setArrivalStation(TrainStation value) throws ClassCastException;
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
	 * The unique identifier for the train.
	 *
	 */
	
	public String getTrainNumber() throws ClassCastException;
	
	public void setTrainNumber(String value) throws ClassCastException;
	/**
	 * The platform where the train arrives.
	 *
	 */
	
	public String getArrivalPlatform() throws ClassCastException;
	
	public void setArrivalPlatform(String value) throws ClassCastException;
	/**
	 * The expected departure time.
	 *
	 */
	
	public java.util.Date getDepartureTime() throws ClassCastException;
	
	public void setDepartureTime(java.util.Date value) throws ClassCastException;
	/**
	 * The name of the train (e.g. The Orient Express).
	 *
	 */
	
	public String getTrainName() throws ClassCastException;
	
	public void setTrainName(String value) throws ClassCastException;
	/**
	 * The station from which the train departs.
	 *
	 */
	
	public TrainStation getDepartureStation() throws ClassCastException;
	
	public void setDepartureStation(TrainStation value) throws ClassCastException;
}
