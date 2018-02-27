package org.schema;
/**
* The costs of settling the payment using a particular payment method.
*/
public interface IPaymentChargeSpecification extends IPriceSpecification{
	
	
	/**
	 * The delivery method(s) to which the delivery charge or payment charge specification applies.
	 *
	 */
	
	public DeliveryMethod getAppliesToDeliveryMethod() throws ClassCastException;
	
	public void setAppliesToDeliveryMethod(DeliveryMethod value) throws ClassCastException;
	/**
	 * The payment method(s) to which the payment charge specification applies.
	 *
	 */
	
	public PaymentMethod getAppliesToPaymentMethod() throws ClassCastException;
	
	public void setAppliesToPaymentMethod(PaymentMethod value) throws ClassCastException;
}
