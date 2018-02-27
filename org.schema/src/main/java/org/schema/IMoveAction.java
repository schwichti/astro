package org.schema;
/**
* <p>The act of an agent relocating to a place.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/TransferAction">TransferAction</a>: Unlike TransferAction, the subject of the move is a living Person or Organization rather than an inanimate object.</li>
</ul>
*/
public interface IMoveAction extends IAction{
	
	
	/**
	 * A sub property of location. The original location of the object or the agent before the action.
	 *
	 */
	
	public Place getFromLocation() throws ClassCastException;
	
	public void setFromLocation(Place value) throws ClassCastException;
	/**
	 * A sub property of location. The final location of the object or the agent after the action.
	 *
	 */
	
	public Place getToLocation() throws ClassCastException;
	
	public void setToLocation(Place value) throws ClassCastException;
}
