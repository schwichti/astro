package org.schema;
/**
* The act of giving money in return for temporary use, but not ownership, of an object such as a vehicle or property. For example, an agent rents a property from a landlord in exchange for a periodic payment.
*/
public class RentAction extends TradeAction{
	
	
	/**
	* A sub property of participant. The owner of the real estate property.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _landlord;
	
	public <T> T getLandlord(Class<T> c) throws ClassCastException{
		return (T) _landlord;
	}
	
	public void setLandlord(Person value) throws ClassCastException{
		_landlord = value;
	}
	public void setLandlord(Organization value) throws ClassCastException{
		_landlord = value;
	}
	/**
	* A sub property of participant. The real estate agent involved in the action.
	 *
	 * Ranges: RealEstateAgent
	 */
	private RealEstateAgent _realEstateAgent;
	
	public RealEstateAgent getRealEstateAgent() throws ClassCastException{
		return (RealEstateAgent) _realEstateAgent;
	}
	
	public void setRealEstateAgent(RealEstateAgent value) throws ClassCastException{
		_realEstateAgent = value;
	}
}
