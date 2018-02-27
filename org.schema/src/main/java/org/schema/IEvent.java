package org.schema;
/**
* An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the <a class="localLink" href="http://schema.org/offers">offers</a> property. Repeated events may be structured as separate Event objects.
*/
public interface IEvent extends IThing{
	
	
	/**
	 * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/availableLanguage">availableLanguage</a>.
	 *
	 */
	
	public <T> T getInLanguage(Class<T> c) throws ClassCastException;
	
	public void setInLanguage(String value) throws ClassCastException;
	public void setInLanguage(Language value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirector() throws ClassCastException;
	
	public void setDirector(Person value) throws ClassCastException;
	/**
	 * An intended audience, i.e. a group for whom something was created.
	 *
	 */
	
	public Audience getAudience() throws ClassCastException;
	
	public void setAudience(Audience value) throws ClassCastException;
	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 *
	 */
	
	public Duration getDuration() throws ClassCastException;
	
	public void setDuration(Duration value) throws ClassCastException;
	/**
	 * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
	 *
	 */
	
	public Event getSuperEvent() throws ClassCastException;
	
	public void setSuperEvent(Event value) throws ClassCastException;
	/**
	 * Events that are a part of this event. For example, a conference event includes many presentations, each subEvents of the conference.
	 *
	 */
	
	public Event getSubEvents() throws ClassCastException;
	
	public void setSubEvents(Event value) throws ClassCastException;
	/**
	 * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
	 *
	 */
	
	public EventStatusType getEventStatus() throws ClassCastException;
	
	public void setEventStatus(EventStatusType value) throws ClassCastException;
	/**
	 * A secondary contributor to the CreativeWork or Event.
	 *
	 */
	
	public <T> T getContributor(Class<T> c) throws ClassCastException;
	
	public void setContributor(Person value) throws ClassCastException;
	public void setContributor(Organization value) throws ClassCastException;
	/**
	 * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
	 *
	 */
	
	public <T> T getComposer(Class<T> c) throws ClassCastException;
	
	public void setComposer(Person value) throws ClassCastException;
	public void setComposer(Organization value) throws ClassCastException;
	/**
	 * A flag to signal that the item, event, or place is accessible for free.
	 *
	 */
	
	public Boolean getIsAccessibleForFree() throws ClassCastException;
	
	public void setIsAccessibleForFree(Boolean value) throws ClassCastException;
	/**
	 * A person attending the event.
	 *
	 */
	
	public <T> T getAttendees(Class<T> c) throws ClassCastException;
	
	public void setAttendees(Person value) throws ClassCastException;
	public void setAttendees(Organization value) throws ClassCastException;
	/**
	 * The time admission will commence.
	 *
	 */
	
	public java.util.Date getDoorTime() throws ClassCastException;
	
	public void setDoorTime(java.util.Date value) throws ClassCastException;
	/**
	 * The number of attendee places for an event that remain unallocated.
	 *
	 */
	
	public Integer getRemainingAttendeeCapacity() throws ClassCastException;
	
	public void setRemainingAttendeeCapacity(Integer value) throws ClassCastException;
	/**
	 * A review of the item.
	 *
	 */
	
	public Review getReview() throws ClassCastException;
	
	public void setReview(Review value) throws ClassCastException;
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 */
	
	public AggregateRating getAggregateRating() throws ClassCastException;
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException;
	/**
	 * The subject matter of the content.
	 *
	 */
	
	public Thing getAbout() throws ClassCastException;
	
	public void setAbout(Thing value) throws ClassCastException;
	/**
	 * The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 */
	
	public java.util.Date getStartDate() throws ClassCastException;
	
	public void setStartDate(java.util.Date value) throws ClassCastException;
	/**
	 * A work performed in some event, for example a play performed in a TheaterEvent.
	 *
	 */
	
	public CreativeWork getWorkPerformed() throws ClassCastException;
	
	public void setWorkPerformed(CreativeWork value) throws ClassCastException;
	/**
	 * The CreativeWork that captured all or part of this Event.
	 *
	 */
	
	public CreativeWork getRecordedIn() throws ClassCastException;
	
	public void setRecordedIn(CreativeWork value) throws ClassCastException;
	/**
	 * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
	 *
	 */
	
	public <T> T getTranslator(Class<T> c) throws ClassCastException;
	
	public void setTranslator(Organization value) throws ClassCastException;
	public void setTranslator(Person value) throws ClassCastException;
	/**
	 * A work featured in some event, e.g. exhibited in an ExhibitionEvent.
	        Specific subproperties are available for workPerformed (e.g. a play), or a workPresented (a Movie at a ScreeningEvent).
	 *
	 */
	
	public CreativeWork getWorkFeatured() throws ClassCastException;
	
	public void setWorkFeatured(CreativeWork value) throws ClassCastException;
	/**
	 * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
	 *
	 */
	
	public java.util.Date getPreviousStartDate() throws ClassCastException;
	
	public void setPreviousStartDate(java.util.Date value) throws ClassCastException;
	/**
	 * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
	 *
	 */
	
	public <T> T getPerformer(Class<T> c) throws ClassCastException;
	
	public void setPerformer(Person value) throws ClassCastException;
	public void setPerformer(Organization value) throws ClassCastException;
	/**
	 * The location of for example where the event is happening, an organization is located, or where an action takes place.
	 *
	 */
	
	public <T> T getLocation(Class<T> c) throws ClassCastException;
	
	public void setLocation(Place value) throws ClassCastException;
	public void setLocation(PostalAddress value) throws ClassCastException;
	public void setLocation(String value) throws ClassCastException;
	/**
	 * The typical expected age range, e.g. '7-9', '11-'.
	 *
	 */
	
	public String getTypicalAgeRange() throws ClassCastException;
	
	public void setTypicalAgeRange(String value) throws ClassCastException;
	/**
	 * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
	 *
	 */
	
	public <T> T getSponsor(Class<T> c) throws ClassCastException;
	
	public void setSponsor(Person value) throws ClassCastException;
	public void setSponsor(Organization value) throws ClassCastException;
	/**
	 * The main performer or performers of the event&#x2014;for example, a presenter, musician, or actor.
	 *
	 */
	
	public <T> T getPerformers(Class<T> c) throws ClassCastException;
	
	public void setPerformers(Person value) throws ClassCastException;
	public void setPerformers(Organization value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActor() throws ClassCastException;
	
	public void setActor(Person value) throws ClassCastException;
	/**
	 * A person or organization that supports (sponsors) something through some kind of financial contribution.
	 *
	 */
	
	public <T> T getFunder(Class<T> c) throws ClassCastException;
	
	public void setFunder(Organization value) throws ClassCastException;
	public void setFunder(Person value) throws ClassCastException;
	/**
	 * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
	 *
	 */
	
	public Event getSubEvent() throws ClassCastException;
	
	public void setSubEvent(Event value) throws ClassCastException;
	/**
	 * The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 */
	
	public java.util.Date getEndDate() throws ClassCastException;
	
	public void setEndDate(java.util.Date value) throws ClassCastException;
	/**
	 * An organizer of an Event.
	 *
	 */
	
	public <T> T getOrganizer(Class<T> c) throws ClassCastException;
	
	public void setOrganizer(Organization value) throws ClassCastException;
	public void setOrganizer(Person value) throws ClassCastException;
	/**
	 * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 *
	 */
	
	public Offer getOffers() throws ClassCastException;
	
	public void setOffers(Offer value) throws ClassCastException;
	/**
	 * A person or organization attending the event.
	 *
	 */
	
	public <T> T getAttendee(Class<T> c) throws ClassCastException;
	
	public void setAttendee(Organization value) throws ClassCastException;
	public void setAttendee(Person value) throws ClassCastException;
	/**
	 * The total number of individuals that may attend an event or venue.
	 *
	 */
	
	public Integer getMaximumAttendeeCapacity() throws ClassCastException;
	
	public void setMaximumAttendeeCapacity(Integer value) throws ClassCastException;
}
