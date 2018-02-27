package org.schema;
/**
* Residence type: Single-family home.
*/
public interface ISingleFamilyResidence extends IHouse{
	
	
	/**
	 * The allowed total occupancy for the accommodation in persons (including infants etc). For individual accommodations, this is not necessarily the legal maximum but defines the permitted usage as per the contractual agreement (e.g. a double room used by a single person).
	 Typical unit code(s): C62 for person
	 *
	 */
	
	public QuantitativeValue getOccupancy() throws ClassCastException;
	
	public void setOccupancy(QuantitativeValue value) throws ClassCastException;
	/**
	 * The number of rooms (excluding bathrooms and closets) of the acccommodation or lodging business.
	 Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
	 *
	 */
	
	public <T> T getNumberOfRooms(Class<T> c) throws ClassCastException;
	
	public void setNumberOfRooms(QuantitativeValue value) throws ClassCastException;
	public void setNumberOfRooms(Float value) throws ClassCastException;
}
