package org.schema;
/**
* An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.
*/
public interface IOrder extends IIntangible{
	
	
	/**
	 * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
	 *
	 */
	
	public <T> T getSeller(Class<T> c) throws ClassCastException;
	
	public void setSeller(Organization value) throws ClassCastException;
	public void setSeller(Person value) throws ClassCastException;
	/**
	 * Was the offer accepted as a gift for someone other than the buyer.
	 *
	 */
	
	public Boolean getIsGift() throws ClassCastException;
	
	public void setIsGift(Boolean value) throws ClassCastException;
	/**
	 * Any discount applied (to an Order).
	 *
	 */
	
	public <T> T getDiscount(Class<T> c) throws ClassCastException;
	
	public void setDiscount(String value) throws ClassCastException;
	public void setDiscount(Float value) throws ClassCastException;
	/**
	 * The order is being paid as part of the referenced Invoice.
	 *
	 */
	
	public Invoice getPartOfInvoice() throws ClassCastException;
	
	public void setPartOfInvoice(Invoice value) throws ClassCastException;
	/**
	 * The currency (in 3-letter ISO 4217 format) of the discount.
	 *
	 */
	
	public String getDiscountCurrency() throws ClassCastException;
	
	public void setDiscountCurrency(String value) throws ClassCastException;
	/**
	 * The date that payment is due.
	 *
	 */
	
	public java.util.Date getPaymentDue() throws ClassCastException;
	
	public void setPaymentDue(java.util.Date value) throws ClassCastException;
	/**
	 * The URL for sending a payment.
	 *
	 */
	
	public String getPaymentUrl() throws ClassCastException;
	
	public void setPaymentUrl(String value) throws ClassCastException;
	/**
	 * The item ordered.
	 *
	 */
	
	public <T> T getOrderedItem(Class<T> c) throws ClassCastException;
	
	public void setOrderedItem(OrderItem value) throws ClassCastException;
	public void setOrderedItem(Product value) throws ClassCastException;
	/**
	 * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
	 *
	 */
	
	public <T> T getBroker(Class<T> c) throws ClassCastException;
	
	public void setBroker(Organization value) throws ClassCastException;
	public void setBroker(Person value) throws ClassCastException;
	/**
	 * The identifier of the transaction.
	 *
	 */
	
	public String getOrderNumber() throws ClassCastException;
	
	public void setOrderNumber(String value) throws ClassCastException;
	/**
	 * Code used to redeem a discount.
	 *
	 */
	
	public String getDiscountCode() throws ClassCastException;
	
	public void setDiscountCode(String value) throws ClassCastException;
	/**
	 * A number that confirms the given order or payment has been received.
	 *
	 */
	
	public String getConfirmationNumber() throws ClassCastException;
	
	public void setConfirmationNumber(String value) throws ClassCastException;
	/**
	 * The delivery of the parcel related to this order or order item.
	 *
	 */
	
	public ParcelDelivery getOrderDelivery() throws ClassCastException;
	
	public void setOrderDelivery(ParcelDelivery value) throws ClassCastException;
	/**
	 * Party placing the order or paying the invoice.
	 *
	 */
	
	public <T> T getCustomer(Class<T> c) throws ClassCastException;
	
	public void setCustomer(Organization value) throws ClassCastException;
	public void setCustomer(Person value) throws ClassCastException;
	/**
	 * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
	 *
	 */
	
	public Offer getAcceptedOffer() throws ClassCastException;
	
	public void setAcceptedOffer(Offer value) throws ClassCastException;
	/**
	 * 'merchant' is an out-dated term for 'seller'.
	 *
	 */
	
	public <T> T getMerchant(Class<T> c) throws ClassCastException;
	
	public void setMerchant(Person value) throws ClassCastException;
	public void setMerchant(Organization value) throws ClassCastException;
	/**
	 * The date that payment is due.
	 *
	 */
	
	public java.util.Date getPaymentDueDate() throws ClassCastException;
	
	public void setPaymentDueDate(java.util.Date value) throws ClassCastException;
	/**
	 * The name of the credit card or other method of payment for the order.
	 *
	 */
	
	public PaymentMethod getPaymentMethod() throws ClassCastException;
	
	public void setPaymentMethod(PaymentMethod value) throws ClassCastException;
	/**
	 * The billing address for the order.
	 *
	 */
	
	public PostalAddress getBillingAddress() throws ClassCastException;
	
	public void setBillingAddress(PostalAddress value) throws ClassCastException;
	/**
	 * The current status of the order.
	 *
	 */
	
	public OrderStatus getOrderStatus() throws ClassCastException;
	
	public void setOrderStatus(OrderStatus value) throws ClassCastException;
	/**
	 * Date order was placed.
	 *
	 */
	
	public java.util.Date getOrderDate() throws ClassCastException;
	
	public void setOrderDate(java.util.Date value) throws ClassCastException;
	/**
	 * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
	 *
	 */
	
	public String getPaymentMethodId() throws ClassCastException;
	
	public void setPaymentMethodId(String value) throws ClassCastException;
}
