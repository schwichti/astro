package org.schema;
/**
* A reservation for a rental car.</p>

<p>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
*/
public interface IRentalCarReservation extends IReservation{
	
	
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
	/**
	 * When a rental car can be dropped off.
	 *
	 */
	
	public java.util.Date getDropoffTime() throws ClassCastException;
	
	public void setDropoffTime(java.util.Date value) throws ClassCastException;
	/**
	 * Where a rental car can be dropped off.
	 *
	 */
	
	public Place getDropoffLocation() throws ClassCastException;
	
	public void setDropoffLocation(Place value) throws ClassCastException;
}
