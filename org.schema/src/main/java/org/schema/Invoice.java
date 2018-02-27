package org.schema;
/**
* A statement of the money due for goods or services; a bill.
*/
public class Invoice extends Intangible{
	
	
	/**
	* The date that payment is due.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _paymentDueDate;
	
	public java.util.Date getPaymentDueDate() throws ClassCastException{
		return (java.util.Date) _paymentDueDate;
	}
	
	public void setPaymentDueDate(java.util.Date value) throws ClassCastException{
		_paymentDueDate = value;
	}
	/**
	* An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _broker;
	
	public <T> T getBroker(Class<T> c) throws ClassCastException{
		return (T) _broker;
	}
	
	public void setBroker(Organization value) throws ClassCastException{
		_broker = value;
	}
	public void setBroker(Person value) throws ClassCastException{
		_broker = value;
	}
	/**
	* The status of payment; whether the invoice has been paid or not.
	 *
	 * Ranges: PaymentStatusType, Text
	 */
	private Object _paymentStatus;
	
	public <T> T getPaymentStatus(Class<T> c) throws ClassCastException{
		return (T) _paymentStatus;
	}
	
	public void setPaymentStatus(PaymentStatusType value) throws ClassCastException{
		_paymentStatus = value;
	}
	public void setPaymentStatus(String value) throws ClassCastException{
		_paymentStatus = value;
	}
	/**
	* The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _provider;
	
	public <T> T getProvider(Class<T> c) throws ClassCastException{
		return (T) _provider;
	}
	
	public void setProvider(Organization value) throws ClassCastException{
		_provider = value;
	}
	public void setProvider(Person value) throws ClassCastException{
		_provider = value;
	}
	/**
	* The date the invoice is scheduled to be paid.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _scheduledPaymentDate;
	
	public java.util.Date getScheduledPaymentDate() throws ClassCastException{
		return (java.util.Date) _scheduledPaymentDate;
	}
	
	public void setScheduledPaymentDate(java.util.Date value) throws ClassCastException{
		_scheduledPaymentDate = value;
	}
	/**
	* An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
	 *
	 * Ranges: Text
	 */
	private String _paymentMethodId;
	
	public String getPaymentMethodId() throws ClassCastException{
		return (String) _paymentMethodId;
	}
	
	public void setPaymentMethodId(String value) throws ClassCastException{
		_paymentMethodId = value;
	}
	/**
	* The minimum payment required at this time.
	 *
	 * Ranges: MonetaryAmount, PriceSpecification
	 */
	private Object _minimumPaymentDue;
	
	public <T> T getMinimumPaymentDue(Class<T> c) throws ClassCastException{
		return (T) _minimumPaymentDue;
	}
	
	public void setMinimumPaymentDue(MonetaryAmount value) throws ClassCastException{
		_minimumPaymentDue = value;
	}
	public void setMinimumPaymentDue(PriceSpecification value) throws ClassCastException{
		_minimumPaymentDue = value;
	}
	/**
	* The time interval used to compute the invoice.
	 *
	 * Ranges: Duration
	 */
	private Duration _billingPeriod;
	
	public Duration getBillingPeriod() throws ClassCastException{
		return (Duration) _billingPeriod;
	}
	
	public void setBillingPeriod(Duration value) throws ClassCastException{
		_billingPeriod = value;
	}
	/**
	* The date that payment is due.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _paymentDue;
	
	public java.util.Date getPaymentDue() throws ClassCastException{
		return (java.util.Date) _paymentDue;
	}
	
	public void setPaymentDue(java.util.Date value) throws ClassCastException{
		_paymentDue = value;
	}
	/**
	* The identifier for the account the payment will be applied to.
	 *
	 * Ranges: Text
	 */
	private String _accountId;
	
	public String getAccountId() throws ClassCastException{
		return (String) _accountId;
	}
	
	public void setAccountId(String value) throws ClassCastException{
		_accountId = value;
	}
	/**
	* A number that confirms the given order or payment has been received.
	 *
	 * Ranges: Text
	 */
	private String _confirmationNumber;
	
	public String getConfirmationNumber() throws ClassCastException{
		return (String) _confirmationNumber;
	}
	
	public void setConfirmationNumber(String value) throws ClassCastException{
		_confirmationNumber = value;
	}
	/**
	* Party placing the order or paying the invoice.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _customer;
	
	public <T> T getCustomer(Class<T> c) throws ClassCastException{
		return (T) _customer;
	}
	
	public void setCustomer(Organization value) throws ClassCastException{
		_customer = value;
	}
	public void setCustomer(Person value) throws ClassCastException{
		_customer = value;
	}
	/**
	* A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
	 *
	 * Ranges: Text, Thing
	 */
	private Object _category;
	
	public <T> T getCategory(Class<T> c) throws ClassCastException{
		return (T) _category;
	}
	
	public void setCategory(String value) throws ClassCastException{
		_category = value;
	}
	public void setCategory(Thing value) throws ClassCastException{
		_category = value;
	}
	/**
	* The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
	 *
	 * Ranges: Order
	 */
	private Order _referencesOrder;
	
	public Order getReferencesOrder() throws ClassCastException{
		return (Order) _referencesOrder;
	}
	
	public void setReferencesOrder(Order value) throws ClassCastException{
		_referencesOrder = value;
	}
	/**
	* The name of the credit card or other method of payment for the order.
	 *
	 * Ranges: PaymentMethod
	 */
	private PaymentMethod _paymentMethod;
	
	public PaymentMethod getPaymentMethod() throws ClassCastException{
		return (PaymentMethod) _paymentMethod;
	}
	
	public void setPaymentMethod(PaymentMethod value) throws ClassCastException{
		_paymentMethod = value;
	}
	/**
	* The total amount due.
	 *
	 * Ranges: MonetaryAmount, PriceSpecification
	 */
	private Object _totalPaymentDue;
	
	public <T> T getTotalPaymentDue(Class<T> c) throws ClassCastException{
		return (T) _totalPaymentDue;
	}
	
	public void setTotalPaymentDue(MonetaryAmount value) throws ClassCastException{
		_totalPaymentDue = value;
	}
	public void setTotalPaymentDue(PriceSpecification value) throws ClassCastException{
		_totalPaymentDue = value;
	}
}
