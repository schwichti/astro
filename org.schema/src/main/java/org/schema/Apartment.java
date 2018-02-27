package org.schema;
/**
* An apartment (in American English) or flat (in British English) is a self-contained housing unit (a type of residential real estate) that occupies only part of a building (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Apartment">http://en.wikipedia.org/wiki/Apartment</a>).
*/
public class Apartment extends Accommodation{
	
	
	/**
	* The allowed total occupancy for the accommodation in persons (including infants etc). For individual accommodations, this is not necessarily the legal maximum but defines the permitted usage as per the contractual agreement (e.g. a double room used by a single person).
	Typical unit code(s): C62 for person
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _occupancy;
	
	public QuantitativeValue getOccupancy() throws ClassCastException{
		return (QuantitativeValue) _occupancy;
	}
	
	public void setOccupancy(QuantitativeValue value) throws ClassCastException{
		_occupancy = value;
	}
	/**
	* The number of rooms (excluding bathrooms and closets) of the acccommodation or lodging business.
	Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
	 *
	 * Ranges: QuantitativeValue, Number
	 */
	private Object _numberOfRooms;
	
	public <T> T getNumberOfRooms(Class<T> c) throws ClassCastException{
		return (T) _numberOfRooms;
	}
	
	public void setNumberOfRooms(QuantitativeValue value) throws ClassCastException{
		_numberOfRooms = value;
	}
	public void setNumberOfRooms(Float value) throws ClassCastException{
		_numberOfRooms = value;
	}
}
