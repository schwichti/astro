package org.schema;
/**
* The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.
*/
public class BuyAction extends TradeAction{
	
	
	/**
	* An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _seller;
	
	public <T> T getSeller(Class<T> c) throws ClassCastException{
		return (T) _seller;
	}
	
	public void setSeller(Organization value) throws ClassCastException{
		_seller = value;
	}
	public void setSeller(Person value) throws ClassCastException{
		_seller = value;
	}
	/**
	* 'vendor' is an earlier term for 'seller'.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _vendor;
	
	public <T> T getVendor(Class<T> c) throws ClassCastException{
		return (T) _vendor;
	}
	
	public void setVendor(Organization value) throws ClassCastException{
		_vendor = value;
	}
	public void setVendor(Person value) throws ClassCastException{
		_vendor = value;
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
