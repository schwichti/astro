package org.schema;
/**
* An agent orders an object/product/service to be delivered/sent.
*/
public interface IOrderAction extends ITradeAction{
	
	
	/**
	 * A sub property of instrument. The method of delivery.
	 *
	 */
	
	public DeliveryMethod getDeliveryMethod() throws ClassCastException;
	
	public void setDeliveryMethod(DeliveryMethod value) throws ClassCastException;
}
