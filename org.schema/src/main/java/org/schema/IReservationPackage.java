package org.schema;
/**
* A group of multiple reservations with common values for all sub-reservations.
*/
public interface IReservationPackage extends IReservation{
	
	
	/**
	 * The individual reservations included in the package. Typically a repeated property.
	 *
	 */
	
	public Reservation getSubReservation() throws ClassCastException;
	
	public void setSubReservation(Reservation value) throws ClassCastException;
}
