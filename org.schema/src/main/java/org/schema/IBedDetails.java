package org.schema;
/**
* An entity holding detailed information about the available bed types, e.g. the quantity of twin beds for a hotel room. For the single case of just one bed of a certain type, you can use bed directly with a text. See also <a class="localLink" href="http://schema.org/BedType">BedType</a> (under development).
*/
public interface IBedDetails extends IIntangible{
	
	
	/**
	 * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
	 *
	 */
	
	public Float getNumberOfBeds() throws ClassCastException;
	
	public void setNumberOfBeds(Float value) throws ClassCastException;
	/**
	 * The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity.
	 *
	 */
	
	public String getTypeOfBed() throws ClassCastException;
	
	public void setTypeOfBed(String value) throws ClassCastException;
}
