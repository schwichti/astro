package org.schema;
/**
* A trip on a commercial train line.
*/
public class TrainTrip extends Intangible{
	
	
	/**
	* The platform from which the train departs.
	 *
	 * Ranges: Text
	 */
	private String _departurePlatform;
	
	public String getDeparturePlatform() throws ClassCastException{
		return (String) _departurePlatform;
	}
	
	public void setDeparturePlatform(String value) throws ClassCastException{
		_departurePlatform = value;
	}
	/**
	* The station where the train trip ends.
	 *
	 * Ranges: TrainStation
	 */
	private TrainStation _arrivalStation;
	
	public TrainStation getArrivalStation() throws ClassCastException{
		return (TrainStation) _arrivalStation;
	}
	
	public void setArrivalStation(TrainStation value) throws ClassCastException{
		_arrivalStation = value;
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
	* The unique identifier for the train.
	 *
	 * Ranges: Text
	 */
	private String _trainNumber;
	
	public String getTrainNumber() throws ClassCastException{
		return (String) _trainNumber;
	}
	
	public void setTrainNumber(String value) throws ClassCastException{
		_trainNumber = value;
	}
	/**
	* The platform where the train arrives.
	 *
	 * Ranges: Text
	 */
	private String _arrivalPlatform;
	
	public String getArrivalPlatform() throws ClassCastException{
		return (String) _arrivalPlatform;
	}
	
	public void setArrivalPlatform(String value) throws ClassCastException{
		_arrivalPlatform = value;
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
	* The name of the train (e.g. The Orient Express).
	 *
	 * Ranges: Text
	 */
	private String _trainName;
	
	public String getTrainName() throws ClassCastException{
		return (String) _trainName;
	}
	
	public void setTrainName(String value) throws ClassCastException{
		_trainName = value;
	}
	/**
	* The station from which the train departs.
	 *
	 * Ranges: TrainStation
	 */
	private TrainStation _departureStation;
	
	public TrainStation getDepartureStation() throws ClassCastException{
		return (TrainStation) _departureStation;
	}
	
	public void setDepartureStation(TrainStation value) throws ClassCastException{
		_departureStation = value;
	}
}
