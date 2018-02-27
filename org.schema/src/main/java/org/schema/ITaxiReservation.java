package org.schema;
/**
* A reservation for a taxi.</p>

<p>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.
*/
public interface ITaxiReservation extends IReservation{
	
	
	/**
	 * Number of people the reservation should accommodate.
	 *
	 */
	
	public <T> T getPartySize(Class<T> c) throws ClassCastException;
	
	public void setPartySize(Integer value) throws ClassCastException;
	public void setPartySize(QuantitativeValue value) throws ClassCastException;
	/**
	 * When a taxi will pickup a passenger or a rental car can be picked up.
	 *
	 */
	
	public java.util.Date getPickupTime() throws ClassCastException;
	
	public void setPickupTime(java.util.Date value) throws ClassCastException;
	/**
	 * Where a taxi will pick up a passenger or a rental car can be picked up.
	 *
	 */
	
	public Place getPickupLocation() throws ClassCastException;
	
	public void setPickupLocation(Place value) throws ClassCastException;
}
