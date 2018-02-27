package org.schema;
/**
* The act of traveling from an fromLocation to a destination by a specified mode of transport, optionally with participants.
*/
public class TravelAction extends MoveAction{
	
	
	/**
	* The distance travelled, e.g. exercising or travelling.
	 *
	 * Ranges: Distance
	 */
	private Distance _distance;
	
	public Distance getDistance() throws ClassCastException{
		return (Distance) _distance;
	}
	
	public void setDistance(Distance value) throws ClassCastException{
		_distance = value;
	}
}
