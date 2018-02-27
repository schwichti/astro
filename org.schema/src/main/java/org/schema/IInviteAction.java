package org.schema;
/**
* The act of asking someone to attend an event. Reciprocal of RsvpAction.
*/
public interface IInviteAction extends ICommunicateAction{
	
	
	/**
	 * Upcoming or past event associated with this place, organization, or action.
	 *
	 */
	
	public Event getEvent() throws ClassCastException;
	
	public void setEvent(Event value) throws ClassCastException;
}
