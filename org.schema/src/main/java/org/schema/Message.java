package org.schema;
/**
* A single message from a sender to one or more organizations or people.
*/
public class Message extends CreativeWork{
	
	
	/**
	* The date/time the message was received if a single recipient exists.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _dateReceived;
	
	public java.util.Date getDateReceived() throws ClassCastException{
		return (java.util.Date) _dateReceived;
	}
	
	public void setDateReceived(java.util.Date value) throws ClassCastException{
		_dateReceived = value;
	}
	/**
	* A sub property of recipient. The recipient blind copied on a message.
	 *
	 * Ranges: Organization, Person, ContactPoint
	 */
	private Object _bccRecipient;
	
	public <T> T getBccRecipient(Class<T> c) throws ClassCastException{
		return (T) _bccRecipient;
	}
	
	public void setBccRecipient(Organization value) throws ClassCastException{
		_bccRecipient = value;
	}
	public void setBccRecipient(Person value) throws ClassCastException{
		_bccRecipient = value;
	}
	public void setBccRecipient(ContactPoint value) throws ClassCastException{
		_bccRecipient = value;
	}
	/**
	* A sub property of recipient. The recipient who was directly sent the message.
	 *
	 * Ranges: Audience, Organization, Person, ContactPoint
	 */
	private Object _toRecipient;
	
	public <T> T getToRecipient(Class<T> c) throws ClassCastException{
		return (T) _toRecipient;
	}
	
	public void setToRecipient(Audience value) throws ClassCastException{
		_toRecipient = value;
	}
	public void setToRecipient(Organization value) throws ClassCastException{
		_toRecipient = value;
	}
	public void setToRecipient(Person value) throws ClassCastException{
		_toRecipient = value;
	}
	public void setToRecipient(ContactPoint value) throws ClassCastException{
		_toRecipient = value;
	}
	/**
	* The date/time at which the message was sent.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _dateSent;
	
	public java.util.Date getDateSent() throws ClassCastException{
		return (java.util.Date) _dateSent;
	}
	
	public void setDateSent(java.util.Date value) throws ClassCastException{
		_dateSent = value;
	}
	/**
	* A CreativeWork attached to the message.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _messageAttachment;
	
	public CreativeWork getMessageAttachment() throws ClassCastException{
		return (CreativeWork) _messageAttachment;
	}
	
	public void setMessageAttachment(CreativeWork value) throws ClassCastException{
		_messageAttachment = value;
	}
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
	/**
	* The date/time at which the message has been read by the recipient if a single recipient exists.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _dateRead;
	
	public java.util.Date getDateRead() throws ClassCastException{
		return (java.util.Date) _dateRead;
	}
	
	public void setDateRead(java.util.Date value) throws ClassCastException{
		_dateRead = value;
	}
	/**
	* A sub property of recipient. The recipient copied on a message.
	 *
	 * Ranges: ContactPoint, Organization, Person
	 */
	private Object _ccRecipient;
	
	public <T> T getCcRecipient(Class<T> c) throws ClassCastException{
		return (T) _ccRecipient;
	}
	
	public void setCcRecipient(ContactPoint value) throws ClassCastException{
		_ccRecipient = value;
	}
	public void setCcRecipient(Organization value) throws ClassCastException{
		_ccRecipient = value;
	}
	public void setCcRecipient(Person value) throws ClassCastException{
		_ccRecipient = value;
	}
	/**
	* A sub property of participant. The participant who is at the sending end of the action.
	 *
	 * Ranges: Organization, Person, Audience
	 */
	private Object _sender;
	
	public <T> T getSender(Class<T> c) throws ClassCastException{
		return (T) _sender;
	}
	
	public void setSender(Organization value) throws ClassCastException{
		_sender = value;
	}
	public void setSender(Person value) throws ClassCastException{
		_sender = value;
	}
	public void setSender(Audience value) throws ClassCastException{
		_sender = value;
	}
}
