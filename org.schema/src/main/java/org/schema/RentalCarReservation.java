package org.schema;
/**
* A reservation for a rental car.</p>

<p>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
*/
public class RentalCarReservation extends Reservation{
	
	
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
	/**
	* When a rental car can be dropped off.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _dropoffTime;
	
	public java.util.Date getDropoffTime() throws ClassCastException{
		return (java.util.Date) _dropoffTime;
	}
	
	public void setDropoffTime(java.util.Date value) throws ClassCastException{
		_dropoffTime = value;
	}
	/**
	* Where a rental car can be dropped off.
	 *
	 * Ranges: Place
	 */
	private Place _dropoffLocation;
	
	public Place getDropoffLocation() throws ClassCastException{
		return (Place) _dropoffLocation;
	}
	
	public void setDropoffLocation(Place value) throws ClassCastException{
		_dropoffLocation = value;
	}
}
