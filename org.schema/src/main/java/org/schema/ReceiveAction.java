package org.schema;
/**
* <p>The act of physically/electronically taking delivery of an object thathas been transferred from an origin to a destination. Reciprocal of SendAction.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/SendAction">SendAction</a>: The reciprocal of ReceiveAction.</li>
<li><a class="localLink" href="http://schema.org/TakeAction">TakeAction</a>: Unlike TakeAction, ReceiveAction does not imply that the ownership has been transfered (e.g. I can receive a package, but it does not mean the package is now mine).</li>
</ul>
*/
public class ReceiveAction extends TransferAction{
	
	
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
}
