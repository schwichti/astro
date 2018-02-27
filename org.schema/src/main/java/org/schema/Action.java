package org.schema;
/**
* An action performed by a direct agent and indirect participants upon a direct object. Optionally happens at a location with the help of an inanimate instrument. The execution of the action may produce a result. Specific action sub-type documentation specifies the exact expectation of each argument/role.</p>

<p>See also <a href="http://blog.schema.org/2014/04/announcing-schemaorg-actions.html">blog post</a> and <a href="http://schema.org/docs/actions.html">Actions overview document</a>.
*/
public class Action extends Thing{
	
	
	/**
	* The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from <em>January</em> to December.</p>
	
	<p>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _startTime;
	
	public java.util.Date getStartTime() throws ClassCastException{
		return (java.util.Date) _startTime;
	}
	
	public void setStartTime(java.util.Date value) throws ClassCastException{
		_startTime = value;
	}
	/**
	* The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read <em>a book</em>.
	 *
	 * Ranges: Thing
	 */
	private Thing _object;
	
	public Thing getObject() throws ClassCastException{
		return (Thing) _object;
	}
	
	public void setObject(Thing value) throws ClassCastException{
		_object = value;
	}
	/**
	* The object that helped the agent perform the action. e.g. John wrote a book with <em>a pen</em>.
	 *
	 * Ranges: Thing
	 */
	private Thing _instrument;
	
	public Thing getInstrument() throws ClassCastException{
		return (Thing) _instrument;
	}
	
	public void setInstrument(Thing value) throws ClassCastException{
		_instrument = value;
	}
	/**
	* Other co-agents that participated in the action indirectly. e.g. John wrote a book with <em>Steve</em>.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _participant;
	
	public <T> T getParticipant(Class<T> c) throws ClassCastException{
		return (T) _participant;
	}
	
	public void setParticipant(Person value) throws ClassCastException{
		_participant = value;
	}
	public void setParticipant(Organization value) throws ClassCastException{
		_participant = value;
	}
	/**
	* Indicates the current disposition of the Action.
	 *
	 * Ranges: ActionStatusType
	 */
	private ActionStatusType _actionStatus;
	
	public ActionStatusType getActionStatus() throws ClassCastException{
		return (ActionStatusType) _actionStatus;
	}
	
	public void setActionStatus(ActionStatusType value) throws ClassCastException{
		_actionStatus = value;
	}
	/**
	* The direct performer or driver of the action (animate or inanimate). e.g. <em>John</em> wrote a book.
	 *
	 * Ranges: Organization, Person
	 */
	private Object _agent;
	
	public <T> T getAgent(Class<T> c) throws ClassCastException{
		return (T) _agent;
	}
	
	public void setAgent(Organization value) throws ClassCastException{
		_agent = value;
	}
	public void setAgent(Person value) throws ClassCastException{
		_agent = value;
	}
	/**
	* The result produced in the action. e.g. John wrote <em>a book</em>.
	 *
	 * Ranges: Thing
	 */
	private Thing _result;
	
	public Thing getResult() throws ClassCastException{
		return (Thing) _result;
	}
	
	public void setResult(Thing value) throws ClassCastException{
		_result = value;
	}
	/**
	* The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to <em>December</em>.</p>
	
	<p>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _endTime;
	
	public java.util.Date getEndTime() throws ClassCastException{
		return (java.util.Date) _endTime;
	}
	
	public void setEndTime(java.util.Date value) throws ClassCastException{
		_endTime = value;
	}
	/**
	* For failed actions, more information on the cause of the failure.
	 *
	 * Ranges: Thing
	 */
	private Thing _error;
	
	public Thing getError() throws ClassCastException{
		return (Thing) _error;
	}
	
	public void setError(Thing value) throws ClassCastException{
		_error = value;
	}
	/**
	* Indicates a target EntryPoint for an Action.
	 *
	 * Ranges: EntryPoint
	 */
	private EntryPoint _target;
	
	public EntryPoint getTarget() throws ClassCastException{
		return (EntryPoint) _target;
	}
	
	public void setTarget(EntryPoint value) throws ClassCastException{
		_target = value;
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
}
