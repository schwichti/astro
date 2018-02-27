package org.schema;
/**
* The act of asking someone to attend an event. Reciprocal of RsvpAction.
*/
public class InviteAction extends CommunicateAction{
	
	
	/**
	* Upcoming or past event associated with this place, organization, or action.
	 *
	 * Ranges: Event
	 */
	private Event _event;
	
	public Event getEvent() throws ClassCastException{
		return (Event) _event;
	}
	
	public void setEvent(Event value) throws ClassCastException{
		_event = value;
	}
}
