package org.schema;
/**
* Used to describe a seat, such as a reserved seat in an event reservation.
*/
public interface ISeat extends IIntangible{
	
	
	/**
	 * The location of the reserved seat (e.g., 27).
	 *
	 */
	
	public String getSeatNumber() throws ClassCastException;
	
	public void setSeatNumber(String value) throws ClassCastException;
	/**
	 * The row location of the reserved seat (e.g., B).
	 *
	 */
	
	public String getSeatRow() throws ClassCastException;
	
	public void setSeatRow(String value) throws ClassCastException;
	/**
	 * The section location of the reserved seat (e.g. Orchestra).
	 *
	 */
	
	public String getSeatSection() throws ClassCastException;
	
	public void setSeatSection(String value) throws ClassCastException;
	/**
	 * The type/class of the seat.
	 *
	 */
	
	public <T> T getSeatingType(Class<T> c) throws ClassCastException;
	
	public void setSeatingType(QualitativeValue value) throws ClassCastException;
	public void setSeatingType(String value) throws ClassCastException;
}
