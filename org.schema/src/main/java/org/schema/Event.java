package org.schema;
/**
* An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the <a class="localLink" href="http://schema.org/offers">offers</a> property. Repeated events may be structured as separate Event objects.
*/
public class Event extends Thing{
	
	
	/**
	* The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/availableLanguage">availableLanguage</a>.
	 *
	 * Ranges: Text, Language
	 */
	private Object _inLanguage;
	
	public <T> T getInLanguage(Class<T> c) throws ClassCastException{
		return (T) _inLanguage;
	}
	
	public void setInLanguage(String value) throws ClassCastException{
		_inLanguage = value;
	}
	public void setInLanguage(Language value) throws ClassCastException{
		_inLanguage = value;
	}
	/**
	* A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 * Ranges: Person
	 */
	private Person _director;
	
	public Person getDirector() throws ClassCastException{
		return (Person) _director;
	}
	
	public void setDirector(Person value) throws ClassCastException{
		_director = value;
	}
	/**
	* An intended audience, i.e. a group for whom something was created.
	 *
	 * Ranges: Audience
	 */
	private Audience _audience;
	
	public Audience getAudience() throws ClassCastException{
		return (Audience) _audience;
	}
	
	public void setAudience(Audience value) throws ClassCastException{
		_audience = value;
	}
	/**
	* The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 *
	 * Ranges: Duration
	 */
	private Duration _duration;
	
	public Duration getDuration() throws ClassCastException{
		return (Duration) _duration;
	}
	
	public void setDuration(Duration value) throws ClassCastException{
		_duration = value;
	}
	/**
	* An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
	 *
	 * Ranges: Event
	 */
	private Event _superEvent;
	
	public Event getSuperEvent() throws ClassCastException{
		return (Event) _superEvent;
	}
	
	public void setSuperEvent(Event value) throws ClassCastException{
		_superEvent = value;
	}
	/**
	* Events that are a part of this event. For example, a conference event includes many presentations, each subEvents of the conference.
	 *
	 * Ranges: Event
	 */
	private Event _subEvents;
	
	public Event getSubEvents() throws ClassCastException{
		return (Event) _subEvents;
	}
	
	public void setSubEvents(Event value) throws ClassCastException{
		_subEvents = value;
	}
	/**
	* An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
	 *
	 * Ranges: EventStatusType
	 */
	private EventStatusType _eventStatus;
	
	public EventStatusType getEventStatus() throws ClassCastException{
		return (EventStatusType) _eventStatus;
	}
	
	public void setEventStatus(EventStatusType value) throws ClassCastException{
		_eventStatus = value;
	}
	/**
	* A secondary contributor to the CreativeWork or Event.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _contributor;
	
	public <T> T getContributor(Class<T> c) throws ClassCastException{
		return (T) _contributor;
	}
	
	public void setContributor(Person value) throws ClassCastException{
		_contributor = value;
	}
	public void setContributor(Organization value) throws ClassCastException{
		_contributor = value;
	}
	/**
	* The person or organization who wrote a composition, or who is the composer of a work performed at some event.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _composer;
	
	public <T> T getComposer(Class<T> c) throws ClassCastException{
		return (T) _composer;
	}
	
	public void setComposer(Person value) throws ClassCastException{
		_composer = value;
	}
	public void setComposer(Organization value) throws ClassCastException{
		_composer = value;
	}
	/**
	* A flag to signal that the item, event, or place is accessible for free.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _isAccessibleForFree;
	
	public Boolean getIsAccessibleForFree() throws ClassCastException{
		return (Boolean) _isAccessibleForFree;
	}
	
	public void setIsAccessibleForFree(Boolean value) throws ClassCastException{
		_isAccessibleForFree = value;
	}
	/**
	* A person attending the event.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _attendees;
	
	public <T> T getAttendees(Class<T> c) throws ClassCastException{
		return (T) _attendees;
	}
	
	public void setAttendees(Person value) throws ClassCastException{
		_attendees = value;
	}
	public void setAttendees(Organization value) throws ClassCastException{
		_attendees = value;
	}
	/**
	* The time admission will commence.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _doorTime;
	
	public java.util.Date getDoorTime() throws ClassCastException{
		return (java.util.Date) _doorTime;
	}
	
	public void setDoorTime(java.util.Date value) throws ClassCastException{
		_doorTime = value;
	}
	/**
	* The number of attendee places for an event that remain unallocated.
	 *
	 * Ranges: Integer
	 */
	private Integer _remainingAttendeeCapacity;
	
	public Integer getRemainingAttendeeCapacity() throws ClassCastException{
		return (Integer) _remainingAttendeeCapacity;
	}
	
	public void setRemainingAttendeeCapacity(Integer value) throws ClassCastException{
		_remainingAttendeeCapacity = value;
	}
	/**
	* A review of the item.
	 *
	 * Ranges: Review
	 */
	private Review _review;
	
	public Review getReview() throws ClassCastException{
		return (Review) _review;
	}
	
	public void setReview(Review value) throws ClassCastException{
		_review = value;
	}
	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 * Ranges: AggregateRating
	 */
	private AggregateRating _aggregateRating;
	
	public AggregateRating getAggregateRating() throws ClassCastException{
		return (AggregateRating) _aggregateRating;
	}
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException{
		_aggregateRating = value;
	}
	/**
	* The subject matter of the content.
	 *
	 * Ranges: Thing
	 */
	private Thing _about;
	
	public Thing getAbout() throws ClassCastException{
		return (Thing) _about;
	}
	
	public void setAbout(Thing value) throws ClassCastException{
		_about = value;
	}
	/**
	* The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 * Ranges: Date, DateTime
	 */
	private java.util.Date _startDate;
	
	public java.util.Date getStartDate() throws ClassCastException{
		return (java.util.Date) _startDate;
	}
	
	public void setStartDate(java.util.Date value) throws ClassCastException{
		_startDate = value;
	}
	/**
	* A work performed in some event, for example a play performed in a TheaterEvent.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _workPerformed;
	
	public CreativeWork getWorkPerformed() throws ClassCastException{
		return (CreativeWork) _workPerformed;
	}
	
	public void setWorkPerformed(CreativeWork value) throws ClassCastException{
		_workPerformed = value;
	}
	/**
	* The CreativeWork that captured all or part of this Event.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _recordedIn;
	
	public CreativeWork getRecordedIn() throws ClassCastException{
		return (CreativeWork) _recordedIn;
	}
	
	public void setRecordedIn(CreativeWork value) throws ClassCastException{
		_recordedIn = value;
	}
	/**
	* Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _translator;
	
	public <T> T getTranslator(Class<T> c) throws ClassCastException{
		return (T) _translator;
	}
	
	public void setTranslator(Organization value) throws ClassCastException{
		_translator = value;
	}
	public void setTranslator(Person value) throws ClassCastException{
		_translator = value;
	}
	/**
	* A work featured in some event, e.g. exhibited in an ExhibitionEvent.
	       Specific subproperties are available for workPerformed (e.g. a play), or a workPresented (a Movie at a ScreeningEvent).
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _workFeatured;
	
	public CreativeWork getWorkFeatured() throws ClassCastException{
		return (CreativeWork) _workFeatured;
	}
	
	public void setWorkFeatured(CreativeWork value) throws ClassCastException{
		_workFeatured = value;
	}
	/**
	* Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _previousStartDate;
	
	public java.util.Date getPreviousStartDate() throws ClassCastException{
		return (java.util.Date) _previousStartDate;
	}
	
	public void setPreviousStartDate(java.util.Date value) throws ClassCastException{
		_previousStartDate = value;
	}
	/**
	* A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _performer;
	
	public <T> T getPerformer(Class<T> c) throws ClassCastException{
		return (T) _performer;
	}
	
	public void setPerformer(Person value) throws ClassCastException{
		_performer = value;
	}
	public void setPerformer(Organization value) throws ClassCastException{
		_performer = value;
	}
	/**
	* The location of for example where the event is happening, an organization is located, or where an action takes place.
	 *
	 * Ranges: Place, PostalAddress, Text
	 */
	private Object _location;
	
	public <T> T getLocation(Class<T> c) throws ClassCastException{
		return (T) _location;
	}
	
	public void setLocation(Place value) throws ClassCastException{
		_location = value;
	}
	public void setLocation(PostalAddress value) throws ClassCastException{
		_location = value;
	}
	public void setLocation(String value) throws ClassCastException{
		_location = value;
	}
	/**
	* The typical expected age range, e.g. '7-9', '11-'.
	 *
	 * Ranges: Text
	 */
	private String _typicalAgeRange;
	
	public String getTypicalAgeRange() throws ClassCastException{
		return (String) _typicalAgeRange;
	}
	
	public void setTypicalAgeRange(String value) throws ClassCastException{
		_typicalAgeRange = value;
	}
	/**
	* A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _sponsor;
	
	public <T> T getSponsor(Class<T> c) throws ClassCastException{
		return (T) _sponsor;
	}
	
	public void setSponsor(Person value) throws ClassCastException{
		_sponsor = value;
	}
	public void setSponsor(Organization value) throws ClassCastException{
		_sponsor = value;
	}
	/**
	* The main performer or performers of the event&#x2014;for example, a presenter, musician, or actor.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _performers;
	
	public <T> T getPerformers(Class<T> c) throws ClassCastException{
		return (T) _performers;
	}
	
	public void setPerformers(Person value) throws ClassCastException{
		_performers = value;
	}
	public void setPerformers(Organization value) throws ClassCastException{
		_performers = value;
	}
	/**
	* An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 * Ranges: Person
	 */
	private Person _actor;
	
	public Person getActor() throws ClassCastException{
		return (Person) _actor;
	}
	
	public void setActor(Person value) throws ClassCastException{
		_actor = value;
	}
	/**
	* A person or organization that supports (sponsors) something through some kind of financial contribution.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _funder;
	
	public <T> T getFunder(Class<T> c) throws ClassCastException{
		return (T) _funder;
	}
	
	public void setFunder(Organization value) throws ClassCastException{
		_funder = value;
	}
	public void setFunder(Person value) throws ClassCastException{
		_funder = value;
	}
	/**
	* An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
	 *
	 * Ranges: Event
	 */
	private Event _subEvent;
	
	public Event getSubEvent() throws ClassCastException{
		return (Event) _subEvent;
	}
	
	public void setSubEvent(Event value) throws ClassCastException{
		_subEvent = value;
	}
	/**
	* The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 * Ranges: DateTime, Date
	 */
	private java.util.Date _endDate;
	
	public java.util.Date getEndDate() throws ClassCastException{
		return (java.util.Date) _endDate;
	}
	
	public void setEndDate(java.util.Date value) throws ClassCastException{
		_endDate = value;
	}
	/**
	* An organizer of an Event.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _organizer;
	
	public <T> T getOrganizer(Class<T> c) throws ClassCastException{
		return (T) _organizer;
	}
	
	public void setOrganizer(Organization value) throws ClassCastException{
		_organizer = value;
	}
	public void setOrganizer(Person value) throws ClassCastException{
		_organizer = value;
	}
	/**
	* An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 *
	 * Ranges: Offer
	 */
	private Offer _offers;
	
	public Offer getOffers() throws ClassCastException{
		return (Offer) _offers;
	}
	
	public void setOffers(Offer value) throws ClassCastException{
		_offers = value;
	}
	/**
	* A person or organization attending the event.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _attendee;
	
	public <T> T getAttendee(Class<T> c) throws ClassCastException{
		return (T) _attendee;
	}
	
	public void setAttendee(Organization value) throws ClassCastException{
		_attendee = value;
	}
	public void setAttendee(Person value) throws ClassCastException{
		_attendee = value;
	}
	/**
	* The total number of individuals that may attend an event or venue.
	 *
	 * Ranges: Integer
	 */
	private Integer _maximumAttendeeCapacity;
	
	public Integer getMaximumAttendeeCapacity() throws ClassCastException{
		return (Integer) _maximumAttendeeCapacity;
	}
	
	public void setMaximumAttendeeCapacity(Integer value) throws ClassCastException{
		_maximumAttendeeCapacity = value;
	}
}
