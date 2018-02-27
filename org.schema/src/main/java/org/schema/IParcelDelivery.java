package org.schema;
/**
* The delivery of a parcel either via the postal service or a commercial service.
*/
public interface IParcelDelivery extends IIntangible{
	
	
	/**
	 * Shipper's address.
	 *
	 */
	
	public PostalAddress getOriginAddress() throws ClassCastException;
	
	public void setOriginAddress(PostalAddress value) throws ClassCastException;
	/**
	 * Method used for delivery or shipping.
	 *
	 */
	
	public DeliveryMethod getHasDeliveryMethod() throws ClassCastException;
	
	public void setHasDeliveryMethod(DeliveryMethod value) throws ClassCastException;
	/**
	 * Tracking url for the parcel delivery.
	 *
	 */
	
	public String getTrackingUrl() throws ClassCastException;
	
	public void setTrackingUrl(String value) throws ClassCastException;
	/**
	 * Shipper tracking number.
	 *
	 */
	
	public String getTrackingNumber() throws ClassCastException;
	
	public void setTrackingNumber(String value) throws ClassCastException;
	/**
	 * Item(s) being shipped.
	 *
	 */
	
	public Product getItemShipped() throws ClassCastException;
	
	public void setItemShipped(Product value) throws ClassCastException;
	/**
	 * The latest date the package may arrive.
	 *
	 */
	
	public java.util.Date getExpectedArrivalUntil() throws ClassCastException;
	
	public void setExpectedArrivalUntil(java.util.Date value) throws ClassCastException;
	/**
	 * The overall order the items in this delivery were included in.
	 *
	 */
	
	public Order getPartOfOrder() throws ClassCastException;
	
	public void setPartOfOrder(Order value) throws ClassCastException;
	/**
	 * Destination address.
	 *
	 */
	
	public PostalAddress getDeliveryAddress() throws ClassCastException;
	
	public void setDeliveryAddress(PostalAddress value) throws ClassCastException;
	/**
	 * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
	 *
	 */
	
	public DeliveryEvent getDeliveryStatus() throws ClassCastException;
	
	public void setDeliveryStatus(DeliveryEvent value) throws ClassCastException;
	/**
	 * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 */
	
	public <T> T getProvider(Class<T> c) throws ClassCastException;
	
	public void setProvider(Organization value) throws ClassCastException;
	public void setProvider(Person value) throws ClassCastException;
	/**
	 * 'carrier' is an out-dated term indicating the 'provider' for parcel delivery and flights.
	 *
	 */
	
	public Organization getCarrier() throws ClassCastException;
	
	public void setCarrier(Organization value) throws ClassCastException;
	/**
	 * The earliest date the package may arrive.
	 *
	 */
	
	public java.util.Date getExpectedArrivalFrom() throws ClassCastException;
	
	public void setExpectedArrivalFrom(java.util.Date value) throws ClassCastException;
}
