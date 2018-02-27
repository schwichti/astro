package org.schema;
/**
* A structured value providing information about when a certain organization or person owned a certain product.
*/
public class OwnershipInfo extends StructuredValue{
	
	
	/**
	* The product that this structured value is referring to.
	 *
	 * Ranges: Service, Product
	 */
	private Object _typeOfGood;
	
	public <T> T getTypeOfGood(Class<T> c) throws ClassCastException{
		return (T) _typeOfGood;
	}
	
	public void setTypeOfGood(Service value) throws ClassCastException{
		_typeOfGood = value;
	}
	public void setTypeOfGood(Product value) throws ClassCastException{
		_typeOfGood = value;
	}
	/**
	* The date and time of giving up ownership on the product.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _ownedThrough;
	
	public java.util.Date getOwnedThrough() throws ClassCastException{
		return (java.util.Date) _ownedThrough;
	}
	
	public void setOwnedThrough(java.util.Date value) throws ClassCastException{
		_ownedThrough = value;
	}
	/**
	* The organization or person from which the product was acquired.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _acquiredFrom;
	
	public <T> T getAcquiredFrom(Class<T> c) throws ClassCastException{
		return (T) _acquiredFrom;
	}
	
	public void setAcquiredFrom(Organization value) throws ClassCastException{
		_acquiredFrom = value;
	}
	public void setAcquiredFrom(Person value) throws ClassCastException{
		_acquiredFrom = value;
	}
	/**
	* The date and time of obtaining the product.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _ownedFrom;
	
	public java.util.Date getOwnedFrom() throws ClassCastException{
		return (java.util.Date) _ownedFrom;
	}
	
	public void setOwnedFrom(java.util.Date value) throws ClassCastException{
		_ownedFrom = value;
	}
}
