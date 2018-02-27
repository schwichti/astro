package org.schema;
/**
* A house is a building or structure that has the ability to be occupied for habitation by humans or other creatures (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/House">http://en.wikipedia.org/wiki/House</a>).
*/
public interface IHouse extends IAccommodation{
	
	
	/**
	 * The number of rooms (excluding bathrooms and closets) of the acccommodation or lodging business.
	 Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
	 *
	 */
	
	public <T> T getNumberOfRooms(Class<T> c) throws ClassCastException;
	
	public void setNumberOfRooms(QuantitativeValue value) throws ClassCastException;
	public void setNumberOfRooms(Float value) throws ClassCastException;
}
