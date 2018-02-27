package org.schema;
/**
* The act of notifying someone of information pertinent to them, with no expectation of a response.
*/
public class InformAction extends CommunicateAction{
	
	
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
