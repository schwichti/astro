package org.schema;
/**
* Used to describe a ticket to an event, a flight, a bus ride, etc.
*/
public interface ITicket extends IIntangible{
	
	
	/**
	 * The person or organization the reservation or ticket is for.
	 *
	 */
	
	public <T> T getUnderName(Class<T> c) throws ClassCastException;
	
	public void setUnderName(Organization value) throws ClassCastException;
	public void setUnderName(Person value) throws ClassCastException;
	/**
	 * The seat associated with the ticket.
	 *
	 */
	
	public Seat getTicketedSeat() throws ClassCastException;
	
	public void setTicketedSeat(Seat value) throws ClassCastException;
	/**
	 * The organization issuing the ticket or permit.
	 *
	 */
	
	public Organization getIssuedBy() throws ClassCastException;
	
	public void setIssuedBy(Organization value) throws ClassCastException;
	/**
	 * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to <a class="localLink" href="http://schema.org/PriceSpecification">PriceSpecification</a> and its subtypes.
	 *
	 */
	
	public String getPriceCurrency() throws ClassCastException;
	
	public void setPriceCurrency(String value) throws ClassCastException;
	/**
	 * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
	 *
	 */
	
	public <T> T getTotalPrice(Class<T> c) throws ClassCastException;
	
	public void setTotalPrice(String value) throws ClassCastException;
	public void setTotalPrice(Float value) throws ClassCastException;
	public void setTotalPrice(PriceSpecification value) throws ClassCastException;
	/**
	 * The date the ticket was issued.
	 *
	 */
	
	public java.util.Date getDateIssued() throws ClassCastException;
	
	public void setDateIssued(java.util.Date value) throws ClassCastException;
	/**
	 * The unique identifier for the ticket.
	 *
	 */
	
	public String getTicketNumber() throws ClassCastException;
	
	public void setTicketNumber(String value) throws ClassCastException;
	/**
	 * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
	 *
	 */
	
	public String getTicketToken() throws ClassCastException;
	
	public void setTicketToken(String value) throws ClassCastException;
}
