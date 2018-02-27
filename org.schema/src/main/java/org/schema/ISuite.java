package org.schema;
/**
* A suite in a hotel or other public accommodation, denotes a class of luxury accommodations, the key feature of which is multiple rooms (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Suite_(hotel)">http://en.wikipedia.org/wiki/Suite_(hotel)</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.
*/
public interface ISuite extends IAccommodation{
	
	
	/**
	 * The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
	       If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
	 *
	 */
	
	public <T> T getBed(Class<T> c) throws ClassCastException;
	
	public void setBed(BedDetails value) throws ClassCastException;
	public void setBed(String value) throws ClassCastException;
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
