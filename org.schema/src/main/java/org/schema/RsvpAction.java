package org.schema;
/**
* The act of notifying an event organizer as to whether you expect to attend the event.
*/
public class RsvpAction extends InformAction{
	
	
	/**
	* Comments, typically from users.
	 *
	 * Ranges: Comment
	 */
	private Comment _comment;
	
	public Comment getComment() throws ClassCastException{
		return (Comment) _comment;
	}
	
	public void setComment(Comment value) throws ClassCastException{
		_comment = value;
	}
	/**
	* If responding yes, the number of guests who will attend in addition to the invitee.
	 *
	 * Ranges: Number
	 */
	private Float _additionalNumberOfGuests;
	
	public Float getAdditionalNumberOfGuests() throws ClassCastException{
		return (Float) _additionalNumberOfGuests;
	}
	
	public void setAdditionalNumberOfGuests(Float value) throws ClassCastException{
		_additionalNumberOfGuests = value;
	}
	/**
	* The response (yes, no, maybe) to the RSVP.
	 *
	 * Ranges: RsvpResponseType
	 */
	private RsvpResponseType _rsvpResponse;
	
	public RsvpResponseType getRsvpResponse() throws ClassCastException{
		return (RsvpResponseType) _rsvpResponse;
	}
	
	public void setRsvpResponse(RsvpResponseType value) throws ClassCastException{
		_rsvpResponse = value;
	}
}
