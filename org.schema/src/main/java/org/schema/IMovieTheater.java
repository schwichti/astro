package org.schema;
/**
* A movie theater.
*/
public interface IMovieTheater extends IEntertainmentBusiness, ICivicStructure{
	
	
	/**
	 * The number of screens in the movie theater.
	 *
	 */
	
	public Float getScreenCount() throws ClassCastException;
	
	public void setScreenCount(Float value) throws ClassCastException;
}
