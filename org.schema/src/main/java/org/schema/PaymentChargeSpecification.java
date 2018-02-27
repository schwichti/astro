package org.schema;
/**
* The costs of settling the payment using a particular payment method.
*/
public class PaymentChargeSpecification extends PriceSpecification{
	
	
	/**
	* The delivery method(s) to which the delivery charge or payment charge specification applies.
	 *
	 * Ranges: DeliveryMethod
	 */
	private DeliveryMethod _appliesToDeliveryMethod;
	
	public DeliveryMethod getAppliesToDeliveryMethod() throws ClassCastException{
		return (DeliveryMethod) _appliesToDeliveryMethod;
	}
	
	public void setAppliesToDeliveryMethod(DeliveryMethod value) throws ClassCastException{
		_appliesToDeliveryMethod = value;
	}
	/**
	* The payment method(s) to which the payment charge specification applies.
	 *
	 * Ranges: PaymentMethod
	 */
	private PaymentMethod _appliesToPaymentMethod;
	
	public PaymentMethod getAppliesToPaymentMethod() throws ClassCastException{
		return (PaymentMethod) _appliesToPaymentMethod;
	}
	
	public void setAppliesToPaymentMethod(PaymentMethod value) throws ClassCastException{
		_appliesToPaymentMethod = value;
	}
}
