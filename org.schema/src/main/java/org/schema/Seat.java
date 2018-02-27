package org.schema;
/**
* Used to describe a seat, such as a reserved seat in an event reservation.
*/
public class Seat extends Intangible{
	
	
	/**
	* The location of the reserved seat (e.g., 27).
	 *
	 * Ranges: Text
	 */
	private String _seatNumber;
	
	public String getSeatNumber() throws ClassCastException{
		return (String) _seatNumber;
	}
	
	public void setSeatNumber(String value) throws ClassCastException{
		_seatNumber = value;
	}
	/**
	* The row location of the reserved seat (e.g., B).
	 *
	 * Ranges: Text
	 */
	private String _seatRow;
	
	public String getSeatRow() throws ClassCastException{
		return (String) _seatRow;
	}
	
	public void setSeatRow(String value) throws ClassCastException{
		_seatRow = value;
	}
	/**
	* The section location of the reserved seat (e.g. Orchestra).
	 *
	 * Ranges: Text
	 */
	private String _seatSection;
	
	public String getSeatSection() throws ClassCastException{
		return (String) _seatSection;
	}
	
	public void setSeatSection(String value) throws ClassCastException{
		_seatSection = value;
	}
	/**
	* The type/class of the seat.
	 *
	 * Ranges: QualitativeValue, Text
	 */
	private Object _seatingType;
	
	public <T> T getSeatingType(Class<T> c) throws ClassCastException{
		return (T) _seatingType;
	}
	
	public void setSeatingType(QualitativeValue value) throws ClassCastException{
		_seatingType = value;
	}
	public void setSeatingType(String value) throws ClassCastException{
		_seatingType = value;
	}
}
