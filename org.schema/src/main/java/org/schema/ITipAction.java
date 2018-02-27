package org.schema;
/**
* The act of giving money voluntarily to a beneficiary in recognition of services rendered.
*/
public interface ITipAction extends ITradeAction{
	
	
	/**
	 * A sub property of participant. The participant who is at the receiving end of the action.
	 *
	 */
	
	public <T> T getRecipient(Class<T> c) throws ClassCastException;
	
	public void setRecipient(ContactPoint value) throws ClassCastException;
	public void setRecipient(Person value) throws ClassCastException;
	public void setRecipient(Organization value) throws ClassCastException;
	public void setRecipient(Audience value) throws ClassCastException;
}
