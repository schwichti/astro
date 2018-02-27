package org.schema;
/**
* A reservation for lodging at a hotel, motel, inn, etc.</p>

<p>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
*/
public class LodgingReservation extends Reservation{
	
	
	/**
	* Textual description of the unit type (including suite vs. room, size of bed, etc.).
	 *
	 * Ranges: Text, QualitativeValue
	 */
	private Object _lodgingUnitType;
	
	public <T> T getLodgingUnitType(Class<T> c) throws ClassCastException{
		return (T) _lodgingUnitType;
	}
	
	public void setLodgingUnitType(String value) throws ClassCastException{
		_lodgingUnitType = value;
	}
	public void setLodgingUnitType(QualitativeValue value) throws ClassCastException{
		_lodgingUnitType = value;
	}
	/**
	* The earliest someone may check into a lodging establishment.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _checkinTime;
	
	public java.util.Date getCheckinTime() throws ClassCastException{
		return (java.util.Date) _checkinTime;
	}
	
	public void setCheckinTime(java.util.Date value) throws ClassCastException{
		_checkinTime = value;
	}
	/**
	* The number of children staying in the unit.
	 *
	 * Ranges: QuantitativeValue, Integer
	 */
	private Object _numChildren;
	
	public <T> T getNumChildren(Class<T> c) throws ClassCastException{
		return (T) _numChildren;
	}
	
	public void setNumChildren(QuantitativeValue value) throws ClassCastException{
		_numChildren = value;
	}
	public void setNumChildren(Integer value) throws ClassCastException{
		_numChildren = value;
	}
	/**
	* The number of adults staying in the unit.
	 *
	 * Ranges: QuantitativeValue, Integer
	 */
	private Object _numAdults;
	
	public <T> T getNumAdults(Class<T> c) throws ClassCastException{
		return (T) _numAdults;
	}
	
	public void setNumAdults(QuantitativeValue value) throws ClassCastException{
		_numAdults = value;
	}
	public void setNumAdults(Integer value) throws ClassCastException{
		_numAdults = value;
	}
	/**
	* The latest someone may check out of a lodging establishment.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _checkoutTime;
	
	public java.util.Date getCheckoutTime() throws ClassCastException{
		return (java.util.Date) _checkoutTime;
	}
	
	public void setCheckoutTime(java.util.Date value) throws ClassCastException{
		_checkoutTime = value;
	}
	/**
	* A full description of the lodging unit.
	 *
	 * Ranges: Text
	 */
	private String _lodgingUnitDescription;
	
	public String getLodgingUnitDescription() throws ClassCastException{
		return (String) _lodgingUnitDescription;
	}
	
	public void setLodgingUnitDescription(String value) throws ClassCastException{
		_lodgingUnitDescription = value;
	}
}
