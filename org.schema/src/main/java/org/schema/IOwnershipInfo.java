package org.schema;
/**
* A structured value providing information about when a certain organization or person owned a certain product.
*/
public interface IOwnershipInfo extends IStructuredValue{
	
	
	/**
	 * The product that this structured value is referring to.
	 *
	 */
	
	public <T> T getTypeOfGood(Class<T> c) throws ClassCastException;
	
	public void setTypeOfGood(Service value) throws ClassCastException;
	public void setTypeOfGood(Product value) throws ClassCastException;
	/**
	 * The date and time of giving up ownership on the product.
	 *
	 */
	
	public java.util.Date getOwnedThrough() throws ClassCastException;
	
	public void setOwnedThrough(java.util.Date value) throws ClassCastException;
	/**
	 * The organization or person from which the product was acquired.
	 *
	 */
	
	public <T> T getAcquiredFrom(Class<T> c) throws ClassCastException;
	
	public void setAcquiredFrom(Organization value) throws ClassCastException;
	public void setAcquiredFrom(Person value) throws ClassCastException;
	/**
	 * The date and time of obtaining the product.
	 *
	 */
	
	public java.util.Date getOwnedFrom() throws ClassCastException;
	
	public void setOwnedFrom(java.util.Date value) throws ClassCastException;
}
