package org.schema;
/**
* An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.
*/
public class Order extends Intangible{
	
	
	/**
	* An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _seller;
	
	public <T> T getSeller(Class<T> c) throws ClassCastException{
		return (T) _seller;
	}
	
	public void setSeller(Organization value) throws ClassCastException{
		_seller = value;
	}
	public void setSeller(Person value) throws ClassCastException{
		_seller = value;
	}
	/**
	* Was the offer accepted as a gift for someone other than the buyer.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _isGift;
	
	public Boolean getIsGift() throws ClassCastException{
		return (Boolean) _isGift;
	}
	
	public void setIsGift(Boolean value) throws ClassCastException{
		_isGift = value;
	}
	/**
	* Any discount applied (to an Order).
	 *
	 * Ranges: Text, Number
	 */
	private Object _discount;
	
	public <T> T getDiscount(Class<T> c) throws ClassCastException{
		return (T) _discount;
	}
	
	public void setDiscount(String value) throws ClassCastException{
		_discount = value;
	}
	public void setDiscount(Float value) throws ClassCastException{
		_discount = value;
	}
	/**
	* The order is being paid as part of the referenced Invoice.
	 *
	 * Ranges: Invoice
	 */
	private Invoice _partOfInvoice;
	
	public Invoice getPartOfInvoice() throws ClassCastException{
		return (Invoice) _partOfInvoice;
	}
	
	public void setPartOfInvoice(Invoice value) throws ClassCastException{
		_partOfInvoice = value;
	}
	/**
	* The currency (in 3-letter ISO 4217 format) of the discount.
	 *
	 * Ranges: Text
	 */
	private String _discountCurrency;
	
	public String getDiscountCurrency() throws ClassCastException{
		return (String) _discountCurrency;
	}
	
	public void setDiscountCurrency(String value) throws ClassCastException{
		_discountCurrency = value;
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
	* The URL for sending a payment.
	 *
	 * Ranges: URL
	 */
	private String _paymentUrl;
	
	public String getPaymentUrl() throws ClassCastException{
		return (String) _paymentUrl;
	}
	
	public void setPaymentUrl(String value) throws ClassCastException{
		_paymentUrl = value;
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
	* The identifier of the transaction.
	 *
	 * Ranges: Text
	 */
	private String _orderNumber;
	
	public String getOrderNumber() throws ClassCastException{
		return (String) _orderNumber;
	}
	
	public void setOrderNumber(String value) throws ClassCastException{
		_orderNumber = value;
	}
	/**
	* Code used to redeem a discount.
	 *
	 * Ranges: Text
	 */
	private String _discountCode;
	
	public String getDiscountCode() throws ClassCastException{
		return (String) _discountCode;
	}
	
	public void setDiscountCode(String value) throws ClassCastException{
		_discountCode = value;
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
	* The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
	 *
	 * Ranges: Offer
	 */
	private Offer _acceptedOffer;
	
	public Offer getAcceptedOffer() throws ClassCastException{
		return (Offer) _acceptedOffer;
	}
	
	public void setAcceptedOffer(Offer value) throws ClassCastException{
		_acceptedOffer = value;
	}
	/**
	* 'merchant' is an out-dated term for 'seller'.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _merchant;
	
	public <T> T getMerchant(Class<T> c) throws ClassCastException{
		return (T) _merchant;
	}
	
	public void setMerchant(Person value) throws ClassCastException{
		_merchant = value;
	}
	public void setMerchant(Organization value) throws ClassCastException{
		_merchant = value;
	}
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
	* The billing address for the order.
	 *
	 * Ranges: PostalAddress
	 */
	private PostalAddress _billingAddress;
	
	public PostalAddress getBillingAddress() throws ClassCastException{
		return (PostalAddress) _billingAddress;
	}
	
	public void setBillingAddress(PostalAddress value) throws ClassCastException{
		_billingAddress = value;
	}
	/**
	* The current status of the order.
	 *
	 * Ranges: OrderStatus
	 */
	private OrderStatus _orderStatus;
	
	public OrderStatus getOrderStatus() throws ClassCastException{
		return (OrderStatus) _orderStatus;
	}
	
	public void setOrderStatus(OrderStatus value) throws ClassCastException{
		_orderStatus = value;
	}
	/**
	* Date order was placed.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _orderDate;
	
	public java.util.Date getOrderDate() throws ClassCastException{
		return (java.util.Date) _orderDate;
	}
	
	public void setOrderDate(java.util.Date value) throws ClassCastException{
		_orderDate = value;
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
}
