package org.schema;
/**
* An agent approves/certifies/likes/supports/sanction an object.
*/
public class EndorseAction extends ReactAction{
	
	
	/**
	* A sub property of participant. The person/organization being supported.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _endorsee;
	
	public <T> T getEndorsee(Class<T> c) throws ClassCastException{
		return (T) _endorsee;
	}
	
	public void setEndorsee(Person value) throws ClassCastException{
		_endorsee = value;
	}
	public void setEndorsee(Organization value) throws ClassCastException{
		_endorsee = value;
	}
}
