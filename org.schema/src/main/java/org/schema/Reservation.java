package org.schema;
/**
* Describes a reservation for travel, dining or an event. Some reservations require tickets. </p>

<p>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.
*/
public class Reservation extends Intangible{
	
	
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
	* The date and time the reservation was booked.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _bookingTime;
	
	public java.util.Date getBookingTime() throws ClassCastException{
		return (java.util.Date) _bookingTime;
	}
	
	public void setBookingTime(java.util.Date value) throws ClassCastException{
		_bookingTime = value;
	}
	/**
	* 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _bookingAgent;
	
	public <T> T getBookingAgent(Class<T> c) throws ClassCastException{
		return (T) _bookingAgent;
	}
	
	public void setBookingAgent(Person value) throws ClassCastException{
		_bookingAgent = value;
	}
	public void setBookingAgent(Organization value) throws ClassCastException{
		_bookingAgent = value;
	}
	/**
	* A ticket associated with the reservation.
	 *
	 * Ranges: Ticket
	 */
	private Ticket _reservedTicket;
	
	public Ticket getReservedTicket() throws ClassCastException{
		return (Ticket) _reservedTicket;
	}
	
	public void setReservedTicket(Ticket value) throws ClassCastException{
		_reservedTicket = value;
	}
	/**
	* The thing -- flight, event, restaurant,etc. being reserved.
	 *
	 * Ranges: Thing
	 */
	private Thing _reservationFor;
	
	public Thing getReservationFor() throws ClassCastException{
		return (Thing) _reservationFor;
	}
	
	public void setReservationFor(Thing value) throws ClassCastException{
		_reservationFor = value;
	}
	/**
	* The date and time the reservation was modified.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _modifiedTime;
	
	public java.util.Date getModifiedTime() throws ClassCastException{
		return (java.util.Date) _modifiedTime;
	}
	
	public void setModifiedTime(java.util.Date value) throws ClassCastException{
		_modifiedTime = value;
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
	* A unique identifier for the reservation.
	 *
	 * Ranges: Text
	 */
	private String _reservationId;
	
	public String getReservationId() throws ClassCastException{
		return (String) _reservationId;
	}
	
	public void setReservationId(String value) throws ClassCastException{
		_reservationId = value;
	}
	/**
	* The current status of the reservation.
	 *
	 * Ranges: ReservationStatusType
	 */
	private ReservationStatusType _reservationStatus;
	
	public ReservationStatusType getReservationStatus() throws ClassCastException{
		return (ReservationStatusType) _reservationStatus;
	}
	
	public void setReservationStatus(ReservationStatusType value) throws ClassCastException{
		_reservationStatus = value;
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
	* Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
	 *
	 * Ranges: ProgramMembership
	 */
	private ProgramMembership _programMembershipUsed;
	
	public ProgramMembership getProgramMembershipUsed() throws ClassCastException{
		return (ProgramMembership) _programMembershipUsed;
	}
	
	public void setProgramMembershipUsed(ProgramMembership value) throws ClassCastException{
		_programMembershipUsed = value;
	}
}
