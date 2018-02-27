package org.schema;
/**
* A statement of the money due for goods or services; a bill.
*/
public interface IInvoice extends IIntangible{
	
	
	/**
	 * The date that payment is due.
	 *
	 */
	
	public java.util.Date getPaymentDueDate() throws ClassCastException;
	
	public void setPaymentDueDate(java.util.Date value) throws ClassCastException;
	/**
	 * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
	 *
	 */
	
	public <T> T getBroker(Class<T> c) throws ClassCastException;
	
	public void setBroker(Organization value) throws ClassCastException;
	public void setBroker(Person value) throws ClassCastException;
	/**
	 * The status of payment; whether the invoice has been paid or not.
	 *
	 */
	
	public <T> T getPaymentStatus(Class<T> c) throws ClassCastException;
	
	public void setPaymentStatus(PaymentStatusType value) throws ClassCastException;
	public void setPaymentStatus(String value) throws ClassCastException;
	/**
	 * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 */
	
	public <T> T getProvider(Class<T> c) throws ClassCastException;
	
	public void setProvider(Organization value) throws ClassCastException;
	public void setProvider(Person value) throws ClassCastException;
	/**
	 * The date the invoice is scheduled to be paid.
	 *
	 */
	
	public java.util.Date getScheduledPaymentDate() throws ClassCastException;
	
	public void setScheduledPaymentDate(java.util.Date value) throws ClassCastException;
	/**
	 * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
	 *
	 */
	
	public String getPaymentMethodId() throws ClassCastException;
	
	public void setPaymentMethodId(String value) throws ClassCastException;
	/**
	 * The minimum payment required at this time.
	 *
	 */
	
	public <T> T getMinimumPaymentDue(Class<T> c) throws ClassCastException;
	
	public void setMinimumPaymentDue(MonetaryAmount value) throws ClassCastException;
	public void setMinimumPaymentDue(PriceSpecification value) throws ClassCastException;
	/**
	 * The time interval used to compute the invoice.
	 *
	 */
	
	public Duration getBillingPeriod() throws ClassCastException;
	
	public void setBillingPeriod(Duration value) throws ClassCastException;
	/**
	 * The date that payment is due.
	 *
	 */
	
	public java.util.Date getPaymentDue() throws ClassCastException;
	
	public void setPaymentDue(java.util.Date value) throws ClassCastException;
	/**
	 * The identifier for the account the payment will be applied to.
	 *
	 */
	
	public String getAccountId() throws ClassCastException;
	
	public void setAccountId(String value) throws ClassCastException;
	/**
	 * A number that confirms the given order or payment has been received.
	 *
	 */
	
	public String getConfirmationNumber() throws ClassCastException;
	
	public void setConfirmationNumber(String value) throws ClassCastException;
	/**
	 * Party placing the order or paying the invoice.
	 *
	 */
	
	public <T> T getCustomer(Class<T> c) throws ClassCastException;
	
	public void setCustomer(Organization value) throws ClassCastException;
	public void setCustomer(Person value) throws ClassCastException;
	/**
	 * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
	 *
	 */
	
	public <T> T getCategory(Class<T> c) throws ClassCastException;
	
	public void setCategory(String value) throws ClassCastException;
	public void setCategory(Thing value) throws ClassCastException;
	/**
	 * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
	 *
	 */
	
	public Order getReferencesOrder() throws ClassCastException;
	
	public void setReferencesOrder(Order value) throws ClassCastException;
	/**
	 * The name of the credit card or other method of payment for the order.
	 *
	 */
	
	public PaymentMethod getPaymentMethod() throws ClassCastException;
	
	public void setPaymentMethod(PaymentMethod value) throws ClassCastException;
	/**
	 * The total amount due.
	 *
	 */
	
	public <T> T getTotalPaymentDue(Class<T> c) throws ClassCastException;
	
	public void setTotalPaymentDue(MonetaryAmount value) throws ClassCastException;
	public void setTotalPaymentDue(PriceSpecification value) throws ClassCastException;
}
