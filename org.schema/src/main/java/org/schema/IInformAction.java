package org.schema;
/**
* The act of notifying someone of information pertinent to them, with no expectation of a response.
*/
public interface IInformAction extends ICommunicateAction{
	
	
	/**
	 * Upcoming or past event associated with this place, organization, or action.
	 *
	 */
	
	public Event getEvent() throws ClassCastException;
	
	public void setEvent(Event value) throws ClassCastException;
}
