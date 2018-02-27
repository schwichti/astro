package org.schema;
/**
* A reservation for air travel.</p>

<p>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.
*/
public class FlightReservation extends Reservation{
	
	
	/**
	* The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
	 *
	 * Ranges: Text, QualitativeValue
	 */
	private Object _passengerPriorityStatus;
	
	public <T> T getPassengerPriorityStatus(Class<T> c) throws ClassCastException{
		return (T) _passengerPriorityStatus;
	}
	
	public void setPassengerPriorityStatus(String value) throws ClassCastException{
		_passengerPriorityStatus = value;
	}
	public void setPassengerPriorityStatus(QualitativeValue value) throws ClassCastException{
		_passengerPriorityStatus = value;
	}
	/**
	* The type of security screening the passenger is subject to.
	 *
	 * Ranges: Text
	 */
	private String _securityScreening;
	
	public String getSecurityScreening() throws ClassCastException{
		return (String) _securityScreening;
	}
	
	public void setSecurityScreening(String value) throws ClassCastException{
		_securityScreening = value;
	}
	/**
	* The airline-specific indicator of boarding order / preference.
	 *
	 * Ranges: Text
	 */
	private String _boardingGroup;
	
	public String getBoardingGroup() throws ClassCastException{
		return (String) _boardingGroup;
	}
	
	public void setBoardingGroup(String value) throws ClassCastException{
		_boardingGroup = value;
	}
	/**
	* The passenger's sequence number as assigned by the airline.
	 *
	 * Ranges: Text
	 */
	private String _passengerSequenceNumber;
	
	public String getPassengerSequenceNumber() throws ClassCastException{
		return (String) _passengerSequenceNumber;
	}
	
	public void setPassengerSequenceNumber(String value) throws ClassCastException{
		_passengerSequenceNumber = value;
	}
}
