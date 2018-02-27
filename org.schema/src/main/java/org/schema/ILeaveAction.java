package org.schema;
/**
* <p>An agent leaves an event / group with participants/friends at a location.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/JoinAction">JoinAction</a>: The antonym of LeaveAction.</li>
<li><a class="localLink" href="http://schema.org/UnRegisterAction">UnRegisterAction</a>: Unlike UnRegisterAction, LeaveAction implies leaving a group/team of people rather than a service.</li>
</ul>
*/
public interface ILeaveAction extends IInteractAction{
	
	
	/**
	 * Upcoming or past event associated with this place, organization, or action.
	 *
	 */
	
	public Event getEvent() throws ClassCastException;
	
	public void setEvent(Event value) throws ClassCastException;
}
