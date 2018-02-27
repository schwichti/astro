package org.schema;
/**
* The act of returning to the origin that which was previously received (concrete objects) or taken (ownership).
*/
public interface IReturnAction extends ITransferAction{
	
	
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
