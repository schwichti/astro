package org.schema;
/**
* <p>The act of physically/electronically dispatching an object for transfer from an origin to a destination.Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/ReceiveAction">ReceiveAction</a>: The reciprocal of SendAction.</li>
<li><a class="localLink" href="http://schema.org/GiveAction">GiveAction</a>: Unlike GiveAction, SendAction does not imply the transfer of ownership (e.g. I can send you my laptop, but I'm not necessarily giving it to you).</li>
</ul>
*/
public interface ISendAction extends ITransferAction{
	
	
	/**
	 * A sub property of instrument. The method of delivery.
	 *
	 */
	
	public DeliveryMethod getDeliveryMethod() throws ClassCastException;
	
	public void setDeliveryMethod(DeliveryMethod value) throws ClassCastException;
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
