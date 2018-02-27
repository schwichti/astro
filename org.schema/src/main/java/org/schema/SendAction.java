package org.schema;
/**
* <p>The act of physically/electronically dispatching an object for transfer from an origin to a destination.Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/ReceiveAction">ReceiveAction</a>: The reciprocal of SendAction.</li>
<li><a class="localLink" href="http://schema.org/GiveAction">GiveAction</a>: Unlike GiveAction, SendAction does not imply the transfer of ownership (e.g. I can send you my laptop, but I'm not necessarily giving it to you).</li>
</ul>
*/
public class SendAction extends TransferAction{
	
	
	/**
	* A sub property of instrument. The method of delivery.
	 *
	 * Ranges: DeliveryMethod
	 */
	private DeliveryMethod _deliveryMethod;
	
	public DeliveryMethod getDeliveryMethod() throws ClassCastException{
		return (DeliveryMethod) _deliveryMethod;
	}
	
	public void setDeliveryMethod(DeliveryMethod value) throws ClassCastException{
		_deliveryMethod = value;
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
}
