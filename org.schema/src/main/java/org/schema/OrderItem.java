package org.schema;
/**
* An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
*/
public class OrderItem extends Intangible{
	
	
	/**
	* The delivery of the parcel related to this order or order item.
	 *
	 * Ranges: ParcelDelivery
	 */
	private ParcelDelivery _orderDelivery;
	
	public ParcelDelivery getOrderDelivery() throws ClassCastException{
		return (ParcelDelivery) _orderDelivery;
	}
	
	public void setOrderDelivery(ParcelDelivery value) throws ClassCastException{
		_orderDelivery = value;
	}
	/**
	* The current status of the order item.
	 *
	 * Ranges: OrderStatus
	 */
	private OrderStatus _orderItemStatus;
	
	public OrderStatus getOrderItemStatus() throws ClassCastException{
		return (OrderStatus) _orderItemStatus;
	}
	
	public void setOrderItemStatus(OrderStatus value) throws ClassCastException{
		_orderItemStatus = value;
	}
	/**
	* The item ordered.
	 *
	 * Ranges: OrderItem, Product
	 */
	private Object _orderedItem;
	
	public <T> T getOrderedItem(Class<T> c) throws ClassCastException{
		return (T) _orderedItem;
	}
	
	public void setOrderedItem(OrderItem value) throws ClassCastException{
		_orderedItem = value;
	}
	public void setOrderedItem(Product value) throws ClassCastException{
		_orderedItem = value;
	}
	/**
	* The number of the item ordered. If the property is not set, assume the quantity is one.
	 *
	 * Ranges: Number
	 */
	private Float _orderQuantity;
	
	public Float getOrderQuantity() throws ClassCastException{
		return (Float) _orderQuantity;
	}
	
	public void setOrderQuantity(Float value) throws ClassCastException{
		_orderQuantity = value;
	}
	/**
	* The identifier of the order item.
	 *
	 * Ranges: Text
	 */
	private String _orderItemNumber;
	
	public String getOrderItemNumber() throws ClassCastException{
		return (String) _orderItemNumber;
	}
	
	public void setOrderItemNumber(String value) throws ClassCastException{
		_orderItemNumber = value;
	}
}
