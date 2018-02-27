package org.schema;
/**
* The act of ingesting information/resources/food.
*/
public class ConsumeAction extends Action{
	
	
	/**
	* An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
	 *
	 * Ranges: Offer
	 */
	private Offer _expectsAcceptanceOf;
	
	public Offer getExpectsAcceptanceOf() throws ClassCastException{
		return (Offer) _expectsAcceptanceOf;
	}
	
	public void setExpectsAcceptanceOf(Offer value) throws ClassCastException{
		_expectsAcceptanceOf = value;
	}
}
