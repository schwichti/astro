package org.schema;
/**
* The act of giving money in return for temporary use, but not ownership, of an object such as a vehicle or property. For example, an agent rents a property from a landlord in exchange for a periodic payment.
*/
public interface IRentAction extends ITradeAction{
	
	
	/**
	 * A sub property of participant. The owner of the real estate property.
	 *
	 */
	
	public <T> T getLandlord(Class<T> c) throws ClassCastException;
	
	public void setLandlord(Person value) throws ClassCastException;
	public void setLandlord(Organization value) throws ClassCastException;
	/**
	 * A sub property of participant. The real estate agent involved in the action.
	 *
	 */
	
	public RealEstateAgent getRealEstateAgent() throws ClassCastException;
	
	public void setRealEstateAgent(RealEstateAgent value) throws ClassCastException;
}
