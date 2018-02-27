package org.schema;
/**
* A single message from a sender to one or more organizations or people.
*/
public interface IMessage extends ICreativeWork{
	
	
	/**
	 * The date/time the message was received if a single recipient exists.
	 *
	 */
	
	public java.util.Date getDateReceived() throws ClassCastException;
	
	public void setDateReceived(java.util.Date value) throws ClassCastException;
	/**
	 * A sub property of recipient. The recipient blind copied on a message.
	 *
	 */
	
	public <T> T getBccRecipient(Class<T> c) throws ClassCastException;
	
	public void setBccRecipient(Organization value) throws ClassCastException;
	public void setBccRecipient(Person value) throws ClassCastException;
	public void setBccRecipient(ContactPoint value) throws ClassCastException;
	/**
	 * A sub property of recipient. The recipient who was directly sent the message.
	 *
	 */
	
	public <T> T getToRecipient(Class<T> c) throws ClassCastException;
	
	public void setToRecipient(Audience value) throws ClassCastException;
	public void setToRecipient(Organization value) throws ClassCastException;
	public void setToRecipient(Person value) throws ClassCastException;
	public void setToRecipient(ContactPoint value) throws ClassCastException;
	/**
	 * The date/time at which the message was sent.
	 *
	 */
	
	public java.util.Date getDateSent() throws ClassCastException;
	
	public void setDateSent(java.util.Date value) throws ClassCastException;
	/**
	 * A CreativeWork attached to the message.
	 *
	 */
	
	public CreativeWork getMessageAttachment() throws ClassCastException;
	
	public void setMessageAttachment(CreativeWork value) throws ClassCastException;
	/**
	 * A sub property of participant. The participant who is at the receiving end of the action.
	 *
	 */
	
	public <T> T getRecipient(Class<T> c) throws ClassCastException;
	
	public void setRecipient(ContactPoint value) throws ClassCastException;
	public void setRecipient(Person value) throws ClassCastException;
	public void setRecipient(Organization value) throws ClassCastException;
	public void setRecipient(Audience value) throws ClassCastException;
	/**
	 * The date/time at which the message has been read by the recipient if a single recipient exists.
	 *
	 */
	
	public java.util.Date getDateRead() throws ClassCastException;
	
	public void setDateRead(java.util.Date value) throws ClassCastException;
	/**
	 * A sub property of recipient. The recipient copied on a message.
	 *
	 */
	
	public <T> T getCcRecipient(Class<T> c) throws ClassCastException;
	
	public void setCcRecipient(ContactPoint value) throws ClassCastException;
	public void setCcRecipient(Organization value) throws ClassCastException;
	public void setCcRecipient(Person value) throws ClassCastException;
	/**
	 * A sub property of participant. The participant who is at the sending end of the action.
	 *
	 */
	
	public <T> T getSender(Class<T> c) throws ClassCastException;
	
	public void setSender(Organization value) throws ClassCastException;
	public void setSender(Person value) throws ClassCastException;
	public void setSender(Audience value) throws ClassCastException;
}
