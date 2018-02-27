package org.schema;
/**
* A short TV program or a segment/part of a TV program.
*/
public interface ITVClip extends IClip{
	
	
	/**
	 * The TV series to which this episode or season belongs.
	 *
	 */
	
	public TVSeries getPartOfTVSeries() throws ClassCastException;
	
	public void setPartOfTVSeries(TVSeries value) throws ClassCastException;
}
