package org.schema;
/**
* A reservation for lodging at a hotel, motel, inn, etc.</p>

<p>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
*/
public interface ILodgingReservation extends IReservation{
	
	
	/**
	 * Textual description of the unit type (including suite vs. room, size of bed, etc.).
	 *
	 */
	
	public <T> T getLodgingUnitType(Class<T> c) throws ClassCastException;
	
	public void setLodgingUnitType(String value) throws ClassCastException;
	public void setLodgingUnitType(QualitativeValue value) throws ClassCastException;
	/**
	 * The earliest someone may check into a lodging establishment.
	 *
	 */
	
	public java.util.Date getCheckinTime() throws ClassCastException;
	
	public void setCheckinTime(java.util.Date value) throws ClassCastException;
	/**
	 * The number of children staying in the unit.
	 *
	 */
	
	public <T> T getNumChildren(Class<T> c) throws ClassCastException;
	
	public void setNumChildren(QuantitativeValue value) throws ClassCastException;
	public void setNumChildren(Integer value) throws ClassCastException;
	/**
	 * The number of adults staying in the unit.
	 *
	 */
	
	public <T> T getNumAdults(Class<T> c) throws ClassCastException;
	
	public void setNumAdults(QuantitativeValue value) throws ClassCastException;
	public void setNumAdults(Integer value) throws ClassCastException;
	/**
	 * The latest someone may check out of a lodging establishment.
	 *
	 */
	
	public java.util.Date getCheckoutTime() throws ClassCastException;
	
	public void setCheckoutTime(java.util.Date value) throws ClassCastException;
	/**
	 * A full description of the lodging unit.
	 *
	 */
	
	public String getLodgingUnitDescription() throws ClassCastException;
	
	public void setLodgingUnitDescription(String value) throws ClassCastException;
}
