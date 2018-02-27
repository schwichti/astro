package org.schema;
/**
* The act of expressing a preference from a fixed/finite/structured set of choices/options.
*/
public class VoteAction extends ChooseAction{
	
	
	/**
	* A sub property of object. The candidate subject of this action.
	 *
	 * Ranges: Person
	 */
	private Person _candidate;
	
	public Person getCandidate() throws ClassCastException{
		return (Person) _candidate;
	}
	
	public void setCandidate(Person value) throws ClassCastException{
		_candidate = value;
	}
}
