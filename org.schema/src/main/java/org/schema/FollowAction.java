package org.schema;
/**
* <p>The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates polled from.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/BefriendAction">BefriendAction</a>: Unlike BefriendAction, FollowAction implies that the connection is <em>not</em> necessarily reciprocal.</li>
<li><a class="localLink" href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, FollowAction implies that the follower acts as an active agent constantly/actively polling for updates.</li>
<li><a class="localLink" href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, FollowAction implies that the agent is interested in continuing receiving updates from the object.</li>
<li><a class="localLink" href="http://schema.org/JoinAction">JoinAction</a>: Unlike JoinAction, FollowAction implies that the agent is interested in getting updates from the object.</li>
<li><a class="localLink" href="http://schema.org/TrackAction">TrackAction</a>: Unlike TrackAction, FollowAction refers to the polling of updates of all aspects of animate objects rather than the location of inanimate objects (e.g. you track a package, but you don't follow it).</li>
</ul>
*/
public class FollowAction extends InteractAction{
	
	
	/**
	* A sub property of object. The person or organization being followed.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _followee;
	
	public <T> T getFollowee(Class<T> c) throws ClassCastException{
		return (T) _followee;
	}
	
	public void setFollowee(Person value) throws ClassCastException{
		_followee = value;
	}
	public void setFollowee(Organization value) throws ClassCastException{
		_followee = value;
	}
}
