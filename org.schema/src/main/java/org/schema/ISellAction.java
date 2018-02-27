package org.schema;
/**
* The act of taking money from a buyer in exchange for goods or services rendered. An agent sells an object, product, or service to a buyer for a price. Reciprocal of BuyAction.
*/
public interface ISellAction extends ITradeAction{
	
	
	/**
	 * A sub property of participant. The participant/person/organization that bought the object.
	 *
	 */
	
	public Person getBuyer() throws ClassCastException;
	
	public void setBuyer(Person value) throws ClassCastException;
	/**
	 * The warranty promise(s) included in the offer.
	 *
	 */
	
	public WarrantyPromise getWarrantyPromise() throws ClassCastException;
	
	public void setWarrantyPromise(WarrantyPromise value) throws ClassCastException;
}
