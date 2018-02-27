package org.schema;
/**
* A reservation for a taxi.</p>

<p>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.
*/
public class TaxiReservation extends Reservation{
	
	
	/**
	* Number of people the reservation should accommodate.
	 *
	 * Ranges: Integer, QuantitativeValue
	 */
	private Object _partySize;
	
	public <T> T getPartySize(Class<T> c) throws ClassCastException{
		return (T) _partySize;
	}
	
	public void setPartySize(Integer value) throws ClassCastException{
		_partySize = value;
	}
	public void setPartySize(QuantitativeValue value) throws ClassCastException{
		_partySize = value;
	}
	/**
	* When a taxi will pickup a passenger or a rental car can be picked up.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _pickupTime;
	
	public java.util.Date getPickupTime() throws ClassCastException{
		return (java.util.Date) _pickupTime;
	}
	
	public void setPickupTime(java.util.Date value) throws ClassCastException{
		_pickupTime = value;
	}
	/**
	* Where a taxi will pick up a passenger or a rental car can be picked up.
	 *
	 * Ranges: Place
	 */
	private Place _pickupLocation;
	
	public Place getPickupLocation() throws ClassCastException{
		return (Place) _pickupLocation;
	}
	
	public void setPickupLocation(Place value) throws ClassCastException{
		_pickupLocation = value;
	}
}
