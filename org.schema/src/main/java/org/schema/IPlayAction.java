package org.schema;
/**
* <p>The act of playing/exercising/training/performing for enjoyment, leisure, recreation, Competition or exercise.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/ListenAction">ListenAction</a>: Unlike ListenAction (which is under ConsumeAction), PlayAction refers to performing for an audience or at an event, rather than consuming music.</li>
<li><a class="localLink" href="http://schema.org/WatchAction">WatchAction</a>: Unlike WatchAction (which is under ConsumeAction), PlayAction refers to showing/displaying for an audience or at an event, rather than consuming visual content.</li>
</ul>
*/
public interface IPlayAction extends IAction{
	
	
	/**
	 * Upcoming or past event associated with this place, organization, or action.
	 *
	 */
	
	public Event getEvent() throws ClassCastException;
	
	public void setEvent(Event value) throws ClassCastException;
	/**
	 * An intended audience, i.e. a group for whom something was created.
	 *
	 */
	
	public Audience getAudience() throws ClassCastException;
	
	public void setAudience(Audience value) throws ClassCastException;
}
