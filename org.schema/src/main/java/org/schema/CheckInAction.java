package org.schema;
/**
* <p>The act of an agent communicating (service provider, social media, etc) their arrival by registering/confirming for a previously reserved service (e.g. flight check in) or at a place (e.g. hotel), possibly resulting in a result (boarding pass, etc).</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/CheckOutAction">CheckOutAction</a>: The antonym of CheckInAction.</li>
<li><a class="localLink" href="http://schema.org/ArriveAction">ArriveAction</a>: Unlike ArriveAction, CheckInAction implies that the agent is informing/confirming the start of a previously reserved service.</li>
<li><a class="localLink" href="http://schema.org/ConfirmAction">ConfirmAction</a>: Unlike ConfirmAction, CheckInAction implies that the agent is informing/confirming the <em>start</em> of a previously reserved service rather than its validity/existence.</li>
</ul>
*/
public class CheckInAction extends CommunicateAction{
	
	
}
