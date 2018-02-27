package org.schema;
/**
* An agent orders an object/product/service to be delivered/sent.
*/
public class OrderAction extends TradeAction{
	
	
	/**
	* A sub property of instrument. The method of delivery.
	 *
	 * Ranges: DeliveryMethod
	 */
	private DeliveryMethod _deliveryMethod;
	
	public DeliveryMethod getDeliveryMethod() throws ClassCastException{
		return (DeliveryMethod) _deliveryMethod;
	}
	
	public void setDeliveryMethod(DeliveryMethod value) throws ClassCastException{
		_deliveryMethod = value;
	}
}
