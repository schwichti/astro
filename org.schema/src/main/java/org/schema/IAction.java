package org.schema;
/**
* An action performed by a direct agent and indirect participants upon a direct object. Optionally happens at a location with the help of an inanimate instrument. The execution of the action may produce a result. Specific action sub-type documentation specifies the exact expectation of each argument/role.</p>

<p>See also <a href="http://blog.schema.org/2014/04/announcing-schemaorg-actions.html">blog post</a> and <a href="http://schema.org/docs/actions.html">Actions overview document</a>.
*/
public interface IAction extends IThing{
	
	
	/**
	 * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from <em>January</em> to December.</p>
	 
	 <p>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
	 *
	 */
	
	public java.util.Date getStartTime() throws ClassCastException;
	
	public void setStartTime(java.util.Date value) throws ClassCastException;
	/**
	 * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read <em>a book</em>.
	 *
	 */
	
	public Thing getObject() throws ClassCastException;
	
	public void setObject(Thing value) throws ClassCastException;
	/**
	 * The object that helped the agent perform the action. e.g. John wrote a book with <em>a pen</em>.
	 *
	 */
	
	public Thing getInstrument() throws ClassCastException;
	
	public void setInstrument(Thing value) throws ClassCastException;
	/**
	 * Other co-agents that participated in the action indirectly. e.g. John wrote a book with <em>Steve</em>.
	 *
	 */
	
	public <T> T getParticipant(Class<T> c) throws ClassCastException;
	
	public void setParticipant(Person value) throws ClassCastException;
	public void setParticipant(Organization value) throws ClassCastException;
	/**
	 * Indicates the current disposition of the Action.
	 *
	 */
	
	public ActionStatusType getActionStatus() throws ClassCastException;
	
	public void setActionStatus(ActionStatusType value) throws ClassCastException;
	/**
	 * The direct performer or driver of the action (animate or inanimate). e.g. <em>John</em> wrote a book.
	 *
	 */
	
	public <T> T getAgent(Class<T> c) throws ClassCastException;
	
	public void setAgent(Organization value) throws ClassCastException;
	public void setAgent(Person value) throws ClassCastException;
	/**
	 * The result produced in the action. e.g. John wrote <em>a book</em>.
	 *
	 */
	
	public Thing getResult() throws ClassCastException;
	
	public void setResult(Thing value) throws ClassCastException;
	/**
	 * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to <em>December</em>.</p>
	 
	 <p>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
	 *
	 */
	
	public java.util.Date getEndTime() throws ClassCastException;
	
	public void setEndTime(java.util.Date value) throws ClassCastException;
	/**
	 * For failed actions, more information on the cause of the failure.
	 *
	 */
	
	public Thing getError() throws ClassCastException;
	
	public void setError(Thing value) throws ClassCastException;
	/**
	 * Indicates a target EntryPoint for an Action.
	 *
	 */
	
	public EntryPoint getTarget() throws ClassCastException;
	
	public void setTarget(EntryPoint value) throws ClassCastException;
	/**
	 * The location of for example where the event is happening, an organization is located, or where an action takes place.
	 *
	 */
	
	public <T> T getLocation(Class<T> c) throws ClassCastException;
	
	public void setLocation(Place value) throws ClassCastException;
	public void setLocation(PostalAddress value) throws ClassCastException;
	public void setLocation(String value) throws ClassCastException;
}
