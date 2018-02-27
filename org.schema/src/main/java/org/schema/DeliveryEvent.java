package org.schema;
/**
* An event involving the delivery of an item.
*/
public class DeliveryEvent extends Event{
	
	
	/**
	* Method used for delivery or shipping.
	 *
	 * Ranges: DeliveryMethod
	 */
	private DeliveryMethod _hasDeliveryMethod;
	
	public DeliveryMethod getHasDeliveryMethod() throws ClassCastException{
		return (DeliveryMethod) _hasDeliveryMethod;
	}
	
	public void setHasDeliveryMethod(DeliveryMethod value) throws ClassCastException{
		_hasDeliveryMethod = value;
	}
	/**
	* Password, PIN, or access code needed for delivery (e.g. from a locker).
	 *
	 * Ranges: Text
	 */
	private String _accessCode;
	
	public String getAccessCode() throws ClassCastException{
		return (String) _accessCode;
	}
	
	public void setAccessCode(String value) throws ClassCastException{
		_accessCode = value;
	}
	/**
	* When the item is available for pickup from the store, locker, etc.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _availableFrom;
	
	public java.util.Date getAvailableFrom() throws ClassCastException{
		return (java.util.Date) _availableFrom;
	}
	
	public void setAvailableFrom(java.util.Date value) throws ClassCastException{
		_availableFrom = value;
	}
	/**
	* After this date, the item will no longer be available for pickup.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _availableThrough;
	
	public java.util.Date getAvailableThrough() throws ClassCastException{
		return (java.util.Date) _availableThrough;
	}
	
	public void setAvailableThrough(java.util.Date value) throws ClassCastException{
		_availableThrough = value;
	}
}
