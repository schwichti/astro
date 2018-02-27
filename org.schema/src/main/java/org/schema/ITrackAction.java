package org.schema;
/**
* <p>An agent tracks an object for updates.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, TrackAction refers to the interest on the location of innanimates objects.</li>
<li><a class="localLink" href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, TrackAction refers to  the interest on the location of innanimate objects.</li>
</ul>
*/
public interface ITrackAction extends IFindAction{
	
	
	/**
	 * A sub property of instrument. The method of delivery.
	 *
	 */
	
	public DeliveryMethod getDeliveryMethod() throws ClassCastException;
	
	public void setDeliveryMethod(DeliveryMethod value) throws ClassCastException;
}
