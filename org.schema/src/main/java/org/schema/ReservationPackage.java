package org.schema;
/**
* A group of multiple reservations with common values for all sub-reservations.
*/
public class ReservationPackage extends Reservation{
	
	
	/**
	* The individual reservations included in the package. Typically a repeated property.
	 *
	 * Ranges: Reservation
	 */
	private Reservation _subReservation;
	
	public Reservation getSubReservation() throws ClassCastException{
		return (Reservation) _subReservation;
	}
	
	public void setSubReservation(Reservation value) throws ClassCastException{
		_subReservation = value;
	}
}
