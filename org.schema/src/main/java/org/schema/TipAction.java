package org.schema;
/**
* The act of giving money voluntarily to a beneficiary in recognition of services rendered.
*/
public class TipAction extends TradeAction{
	
	
	/**
	* A sub property of participant. The participant who is at the receiving end of the action.
	 *
	 * Ranges: ContactPoint, Person, Organization, Audience
	 */
	private Object _recipient;
	
	public <T> T getRecipient(Class<T> c) throws ClassCastException{
		return (T) _recipient;
	}
	
	public void setRecipient(ContactPoint value) throws ClassCastException{
		_recipient = value;
	}
	public void setRecipient(Person value) throws ClassCastException{
		_recipient = value;
	}
	public void setRecipient(Organization value) throws ClassCastException{
		_recipient = value;
	}
	public void setRecipient(Audience value) throws ClassCastException{
		_recipient = value;
	}
}
