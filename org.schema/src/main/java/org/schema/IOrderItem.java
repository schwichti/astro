package org.schema;
/**
* An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
*/
public interface IOrderItem extends IIntangible{
	
	
	/**
	 * The delivery of the parcel related to this order or order item.
	 *
	 */
	
	public ParcelDelivery getOrderDelivery() throws ClassCastException;
	
	public void setOrderDelivery(ParcelDelivery value) throws ClassCastException;
	/**
	 * The current status of the order item.
	 *
	 */
	
	public OrderStatus getOrderItemStatus() throws ClassCastException;
	
	public void setOrderItemStatus(OrderStatus value) throws ClassCastException;
	/**
	 * The item ordered.
	 *
	 */
	
	public <T> T getOrderedItem(Class<T> c) throws ClassCastException;
	
	public void setOrderedItem(OrderItem value) throws ClassCastException;
	public void setOrderedItem(Product value) throws ClassCastException;
	/**
	 * The number of the item ordered. If the property is not set, assume the quantity is one.
	 *
	 */
	
	public Float getOrderQuantity() throws ClassCastException;
	
	public void setOrderQuantity(Float value) throws ClassCastException;
	/**
	 * The identifier of the order item.
	 *
	 */
	
	public String getOrderItemNumber() throws ClassCastException;
	
	public void setOrderItemNumber(String value) throws ClassCastException;
}
