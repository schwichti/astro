package org.schema;
/**
* A reservation for air travel.</p>

<p>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.
*/
public interface IFlightReservation extends IReservation{
	
	
	/**
	 * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
	 *
	 */
	
	public <T> T getPassengerPriorityStatus(Class<T> c) throws ClassCastException;
	
	public void setPassengerPriorityStatus(String value) throws ClassCastException;
	public void setPassengerPriorityStatus(QualitativeValue value) throws ClassCastException;
	/**
	 * The type of security screening the passenger is subject to.
	 *
	 */
	
	public String getSecurityScreening() throws ClassCastException;
	
	public void setSecurityScreening(String value) throws ClassCastException;
	/**
	 * The airline-specific indicator of boarding order / preference.
	 *
	 */
	
	public String getBoardingGroup() throws ClassCastException;
	
	public void setBoardingGroup(String value) throws ClassCastException;
	/**
	 * The passenger's sequence number as assigned by the airline.
	 *
	 */
	
	public String getPassengerSequenceNumber() throws ClassCastException;
	
	public void setPassengerSequenceNumber(String value) throws ClassCastException;
}
