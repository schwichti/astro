package org.schema;
/**
* The act of traveling from an fromLocation to a destination by a specified mode of transport, optionally with participants.
*/
public interface ITravelAction extends IMoveAction{
	
	
	/**
	 * The distance travelled, e.g. exercising or travelling.
	 *
	 */
	
	public Distance getDistance() throws ClassCastException;
	
	public void setDistance(Distance value) throws ClassCastException;
}
