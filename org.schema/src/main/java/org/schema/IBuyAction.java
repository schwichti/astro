package org.schema;
/**
* The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.
*/
public interface IBuyAction extends ITradeAction{
	
	
	/**
	 * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
	 *
	 */
	
	public <T> T getSeller(Class<T> c) throws ClassCastException;
	
	public void setSeller(Organization value) throws ClassCastException;
	public void setSeller(Person value) throws ClassCastException;
	/**
	 * 'vendor' is an earlier term for 'seller'.
	 *
	 */
	
	public <T> T getVendor(Class<T> c) throws ClassCastException;
	
	public void setVendor(Organization value) throws ClassCastException;
	public void setVendor(Person value) throws ClassCastException;
	/**
	 * The warranty promise(s) included in the offer.
	 *
	 */
	
	public WarrantyPromise getWarrantyPromise() throws ClassCastException;
	
	public void setWarrantyPromise(WarrantyPromise value) throws ClassCastException;
}
