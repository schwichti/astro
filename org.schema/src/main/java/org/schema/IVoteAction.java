package org.schema;
/**
* The act of expressing a preference from a fixed/finite/structured set of choices/options.
*/
public interface IVoteAction extends IChooseAction{
	
	
	/**
	 * A sub property of object. The candidate subject of this action.
	 *
	 */
	
	public Person getCandidate() throws ClassCastException;
	
	public void setCandidate(Person value) throws ClassCastException;
}
