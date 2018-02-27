package org.schema;
/**
* Describes a reservation for travel, dining or an event. Some reservations require tickets. </p>

<p>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.
*/
public interface IReservation extends IIntangible{
	
	
	/**
	 * The person or organization the reservation or ticket is for.
	 *
	 */
	
	public <T> T getUnderName(Class<T> c) throws ClassCastException;
	
	public void setUnderName(Organization value) throws ClassCastException;
	public void setUnderName(Person value) throws ClassCastException;
	/**
	 * The date and time the reservation was booked.
	 *
	 */
	
	public java.util.Date getBookingTime() throws ClassCastException;
	
	public void setBookingTime(java.util.Date value) throws ClassCastException;
	/**
	 * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
	 *
	 */
	
	public <T> T getBookingAgent(Class<T> c) throws ClassCastException;
	
	public void setBookingAgent(Person value) throws ClassCastException;
	public void setBookingAgent(Organization value) throws ClassCastException;
	/**
	 * A ticket associated with the reservation.
	 *
	 */
	
	public Ticket getReservedTicket() throws ClassCastException;
	
	public void setReservedTicket(Ticket value) throws ClassCastException;
	/**
	 * The thing -- flight, event, restaurant,etc. being reserved.
	 *
	 */
	
	public Thing getReservationFor() throws ClassCastException;
	
	public void setReservationFor(Thing value) throws ClassCastException;
	/**
	 * The date and time the reservation was modified.
	 *
	 */
	
	public java.util.Date getModifiedTime() throws ClassCastException;
	
	public void setModifiedTime(java.util.Date value) throws ClassCastException;
	/**
	 * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to <a class="localLink" href="http://schema.org/PriceSpecification">PriceSpecification</a> and its subtypes.
	 *
	 */
	
	public String getPriceCurrency() throws ClassCastException;
	
	public void setPriceCurrency(String value) throws ClassCastException;
	/**
	 * A unique identifier for the reservation.
	 *
	 */
	
	public String getReservationId() throws ClassCastException;
	
	public void setReservationId(String value) throws ClassCastException;
	/**
	 * The current status of the reservation.
	 *
	 */
	
	public ReservationStatusType getReservationStatus() throws ClassCastException;
	
	public void setReservationStatus(ReservationStatusType value) throws ClassCastException;
	/**
	 * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
	 *
	 */
	
	public <T> T getProvider(Class<T> c) throws ClassCastException;
	
	public void setProvider(Organization value) throws ClassCastException;
	public void setProvider(Person value) throws ClassCastException;
	/**
	 * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
	 *
	 */
	
	public <T> T getTotalPrice(Class<T> c) throws ClassCastException;
	
	public void setTotalPrice(String value) throws ClassCastException;
	public void setTotalPrice(Float value) throws ClassCastException;
	public void setTotalPrice(PriceSpecification value) throws ClassCastException;
	/**
	 * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
	 *
	 */
	
	public <T> T getBroker(Class<T> c) throws ClassCastException;
	
	public void setBroker(Organization value) throws ClassCastException;
	public void setBroker(Person value) throws ClassCastException;
	/**
	 * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
	 *
	 */
	
	public ProgramMembership getProgramMembershipUsed() throws ClassCastException;
	
	public void setProgramMembershipUsed(ProgramMembership value) throws ClassCastException;
}
