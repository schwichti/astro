package org.schema;
/**
* The delivery of a parcel either via the postal service or a commercial service.
*/
public class ParcelDelivery extends Intangible{
	
	
	/**
	* Shipper's address.
	 *
	 * Ranges: PostalAddress
	 */
	private PostalAddress _originAddress;
	
	public PostalAddress getOriginAddress() throws ClassCastException{
		return (PostalAddress) _originAddress;
	}
	
	public void setOriginAddress(PostalAddress value) throws ClassCastException{
		_originAddress = value;
	}
	/**
	* Method used for delivery or shipping.
	 *
	 * Ranges: DeliveryMethod
	 */
	private DeliveryMethod _hasDeliveryMethod;
	
	public DeliveryMethod getHasDeliveryMethod() throws ClassCastException{
		return (DeliveryMethod) _hasDeliveryMethod;
	}
	
	public void setHasDeliveryMethod(DeliveryMethod value) throws ClassCastException{
		_hasDeliveryMethod = value;
	}
	/**
	* Tracking url for the parcel delivery.
	 *
	 * Ranges: URL
	 */
	private String _trackingUrl;
	
	public String getTrackingUrl() throws ClassCastException{
		return (String) _trackingUrl;
	}
	
	public void setTrackingUrl(String value) throws ClassCastException{
		_trackingUrl = value;
	}
	/**
	* Shipper tracking number.
	 *
	 * Ranges: Text
	 */
	private String _trackingNumber;
	
	public String getTrackingNumber() throws ClassCastException{
		return (String) _trackingNumber;
	}
	
	public void setTrackingNumber(String value) throws ClassCastException{
		_trackingNumber = value;
	}
	/**
	* Item(s) being shipped.
	 *
	 * Ranges: Product
	 */
	private Product _itemShipped;
	
	public Product getItemShipped() throws ClassCastException{
		return (Product) _itemShipped;
	}
	
	public void setItemShipped(Product value) throws ClassCastException{
		_itemShipped = value;
	}
	/**
	* The latest date the package may arrive.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _expectedArrivalUntil;
	
	public java.util.Date getExpectedArrivalUntil() throws ClassCastException{
		return (java.util.Date) _expectedArrivalUntil;
	}
	
	public void setExpectedArrivalUntil(java.util.Date value) throws ClassCastException{
		_expectedArrivalUntil = value;
	}
	/**
	* The overall order the items in this delivery were included in.
	 *
	 * Ranges: Order
	 */
	private Order _partOfOrder;
	
	public Order getPartOfOrder() throws ClassCastException{
		return (Order) _partOfOrder;
	}
	
	public void setPartOfOrder(Order value) throws ClassCastException{
		_partOfOrder = value;
	}
	/**
	* Destination address.
	 *
	 * Ranges: PostalAddress
	 */
	private PostalAddress _deliveryAddress;
	
	public PostalAddress getDeliveryAddress() throws ClassCastException{
		return (PostalAddress) _deliveryAddress;
	}
	
	public void setDeliveryAddress(PostalAddress value) throws ClassCastException{
		_deliveryAddress = value;
	}
	/**
	* New entry added as the package passes through each leg of its journey (from shipment to final delivery).
	 *
	 * Ranges: DeliveryEvent
	 */
	private DeliveryEvent _deliveryStatus;
	
	public DeliveryEvent getDeliveryStatus() throws ClassCastException{
		return (DeliveryEvent) _deliveryStatus;
	}
	
	public void setDeliveryStatus(DeliveryEvent value) throws ClassCastException{
		_deliveryStatus = value;
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
	* 'carrier' is an out-dated term indicating the 'provider' for parcel delivery and flights.
	 *
	 * Ranges: Organization
	 */
	private Organization _carrier;
	
	public Organization getCarrier() throws ClassCastException{
		return (Organization) _carrier;
	}
	
	public void setCarrier(Organization value) throws ClassCastException{
		_carrier = value;
	}
	/**
	* The earliest date the package may arrive.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _expectedArrivalFrom;
	
	public java.util.Date getExpectedArrivalFrom() throws ClassCastException{
		return (java.util.Date) _expectedArrivalFrom;
	}
	
	public void setExpectedArrivalFrom(java.util.Date value) throws ClassCastException{
		_expectedArrivalFrom = value;
	}
}
