package org.schema;
/**
* An agent approves/certifies/likes/supports/sanction an object.
*/
public interface IEndorseAction extends IReactAction{
	
	
	/**
	 * A sub property of participant. The person/organization being supported.
	 *
	 */
	
	public <T> T getEndorsee(Class<T> c) throws ClassCastException;
	
	public void setEndorsee(Person value) throws ClassCastException;
	public void setEndorsee(Organization value) throws ClassCastException;
}
