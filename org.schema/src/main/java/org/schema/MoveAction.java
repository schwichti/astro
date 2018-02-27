package org.schema;
/**
* <p>The act of an agent relocating to a place.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/TransferAction">TransferAction</a>: Unlike TransferAction, the subject of the move is a living Person or Organization rather than an inanimate object.</li>
</ul>
*/
public class MoveAction extends Action{
	
	
	/**
	* A sub property of location. The original location of the object or the agent before the action.
	 *
	 * Ranges: Place
	 */
	private Place _fromLocation;
	
	public Place getFromLocation() throws ClassCastException{
		return (Place) _fromLocation;
	}
	
	public void setFromLocation(Place value) throws ClassCastException{
		_fromLocation = value;
	}
	/**
	* A sub property of location. The final location of the object or the agent after the action.
	 *
	 * Ranges: Place
	 */
	private Place _toLocation;
	
	public Place getToLocation() throws ClassCastException{
		return (Place) _toLocation;
	}
	
	public void setToLocation(Place value) throws ClassCastException{
		_toLocation = value;
	}
}
