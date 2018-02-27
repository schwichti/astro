package org.schema;
/**
* The act of taking money from a buyer in exchange for goods or services rendered. An agent sells an object, product, or service to a buyer for a price. Reciprocal of BuyAction.
*/
public class SellAction extends TradeAction{
	
	
	/**
	* A sub property of participant. The participant/person/organization that bought the object.
	 *
	 * Ranges: Person
	 */
	private Person _buyer;
	
	public Person getBuyer() throws ClassCastException{
		return (Person) _buyer;
	}
	
	public void setBuyer(Person value) throws ClassCastException{
		_buyer = value;
	}
	/**
	* The warranty promise(s) included in the offer.
	 *
	 * Ranges: WarrantyPromise
	 */
	private WarrantyPromise _warrantyPromise;
	
	public WarrantyPromise getWarrantyPromise() throws ClassCastException{
		return (WarrantyPromise) _warrantyPromise;
	}
	
	public void setWarrantyPromise(WarrantyPromise value) throws ClassCastException{
		_warrantyPromise = value;
	}
}
