package org.schema;
/**
* An event involving the delivery of an item.
*/
public interface IDeliveryEvent extends IEvent{
	
	
	/**
	 * Method used for delivery or shipping.
	 *
	 */
	
	public DeliveryMethod getHasDeliveryMethod() throws ClassCastException;
	
	public void setHasDeliveryMethod(DeliveryMethod value) throws ClassCastException;
	/**
	 * Password, PIN, or access code needed for delivery (e.g. from a locker).
	 *
	 */
	
	public String getAccessCode() throws ClassCastException;
	
	public void setAccessCode(String value) throws ClassCastException;
	/**
	 * When the item is available for pickup from the store, locker, etc.
	 *
	 */
	
	public java.util.Date getAvailableFrom() throws ClassCastException;
	
	public void setAvailableFrom(java.util.Date value) throws ClassCastException;
	/**
	 * After this date, the item will no longer be available for pickup.
	 *
	 */
	
	public java.util.Date getAvailableThrough() throws ClassCastException;
	
	public void setAvailableThrough(java.util.Date value) throws ClassCastException;
}
