package org.schema;
/**
* Used to describe a ticket to an event, a flight, a bus ride, etc.
*/
public class Ticket extends Intangible{
	
	
	/**
	* The person or organization the reservation or ticket is for.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _underName;
	
	public <T> T getUnderName(Class<T> c) throws ClassCastException{
		return (T) _underName;
	}
	
	public void setUnderName(Organization value) throws ClassCastException{
		_underName = value;
	}
	public void setUnderName(Person value) throws ClassCastException{
		_underName = value;
	}
	/**
	* The seat associated with the ticket.
	 *
	 * Ranges: Seat
	 */
	private Seat _ticketedSeat;
	
	public Seat getTicketedSeat() throws ClassCastException{
		return (Seat) _ticketedSeat;
	}
	
	public void setTicketedSeat(Seat value) throws ClassCastException{
		_ticketedSeat = value;
	}
	/**
	* The organization issuing the ticket or permit.
	 *
	 * Ranges: Organization
	 */
	private Organization _issuedBy;
	
	public Organization getIssuedBy() throws ClassCastException{
		return (Organization) _issuedBy;
	}
	
	public void setIssuedBy(Organization value) throws ClassCastException{
		_issuedBy = value;
	}
	/**
	* The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to <a class="localLink" href="http://schema.org/PriceSpecification">PriceSpecification</a> and its subtypes.
	 *
	 * Ranges: Text
	 */
	private String _priceCurrency;
	
	public String getPriceCurrency() throws ClassCastException{
		return (String) _priceCurrency;
	}
	
	public void setPriceCurrency(String value) throws ClassCastException{
		_priceCurrency = value;
	}
	/**
	* The total price for the reservation or ticket, including applicable taxes, shipping, etc.
	 *
	 * Ranges: Text, Number, PriceSpecification
	 */
	private Object _totalPrice;
	
	public <T> T getTotalPrice(Class<T> c) throws ClassCastException{
		return (T) _totalPrice;
	}
	
	public void setTotalPrice(String value) throws ClassCastException{
		_totalPrice = value;
	}
	public void setTotalPrice(Float value) throws ClassCastException{
		_totalPrice = value;
	}
	public void setTotalPrice(PriceSpecification value) throws ClassCastException{
		_totalPrice = value;
	}
	/**
	* The date the ticket was issued.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _dateIssued;
	
	public java.util.Date getDateIssued() throws ClassCastException{
		return (java.util.Date) _dateIssued;
	}
	
	public void setDateIssued(java.util.Date value) throws ClassCastException{
		_dateIssued = value;
	}
	/**
	* The unique identifier for the ticket.
	 *
	 * Ranges: Text
	 */
	private String _ticketNumber;
	
	public String getTicketNumber() throws ClassCastException{
		return (String) _ticketNumber;
	}
	
	public void setTicketNumber(String value) throws ClassCastException{
		_ticketNumber = value;
	}
	/**
	* Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
	 *
	 * Ranges: Text, URL
	 */
	private String _ticketToken;
	
	public String getTicketToken() throws ClassCastException{
		return (String) _ticketToken;
	}
	
	public void setTicketToken(String value) throws ClassCastException{
		_ticketToken = value;
	}
}
