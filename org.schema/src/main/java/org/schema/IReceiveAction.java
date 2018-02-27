package org.schema;
/**
* <p>The act of physically/electronically taking delivery of an object thathas been transferred from an origin to a destination. Reciprocal of SendAction.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/SendAction">SendAction</a>: The reciprocal of ReceiveAction.</li>
<li><a class="localLink" href="http://schema.org/TakeAction">TakeAction</a>: Unlike TakeAction, ReceiveAction does not imply that the ownership has been transfered (e.g. I can receive a package, but it does not mean the package is now mine).</li>
</ul>
*/
public interface IReceiveAction extends ITransferAction{
	
	
	/**
	 * A sub property of participant. The participant who is at the sending end of the action.
	 *
	 */
	
	public <T> T getSender(Class<T> c) throws ClassCastException;
	
	public void setSender(Organization value) throws ClassCastException;
	public void setSender(Person value) throws ClassCastException;
	public void setSender(Audience value) throws ClassCastException;
	/**
	 * A sub property of instrument. The method of delivery.
	 *
	 */
	
	public DeliveryMethod getDeliveryMethod() throws ClassCastException;
	
	public void setDeliveryMethod(DeliveryMethod value) throws ClassCastException;
}
