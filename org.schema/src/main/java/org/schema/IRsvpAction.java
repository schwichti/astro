package org.schema;
/**
* The act of notifying an event organizer as to whether you expect to attend the event.
*/
public interface IRsvpAction extends IInformAction{
	
	
	/**
	 * Comments, typically from users.
	 *
	 */
	
	public Comment getComment() throws ClassCastException;
	
	public void setComment(Comment value) throws ClassCastException;
	/**
	 * If responding yes, the number of guests who will attend in addition to the invitee.
	 *
	 */
	
	public Float getAdditionalNumberOfGuests() throws ClassCastException;
	
	public void setAdditionalNumberOfGuests(Float value) throws ClassCastException;
	/**
	 * The response (yes, no, maybe) to the RSVP.
	 *
	 */
	
	public RsvpResponseType getRsvpResponse() throws ClassCastException;
	
	public void setRsvpResponse(RsvpResponseType value) throws ClassCastException;
}
