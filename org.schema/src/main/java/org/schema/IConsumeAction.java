package org.schema;
/**
* The act of ingesting information/resources/food.
*/
public interface IConsumeAction extends IAction{
	
	
	/**
	 * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
	 *
	 */
	
	public Offer getExpectsAcceptanceOf() throws ClassCastException;
	
	public void setExpectsAcceptanceOf(Offer value) throws ClassCastException;
}
