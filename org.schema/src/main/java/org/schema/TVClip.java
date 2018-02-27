package org.schema;
/**
* A short TV program or a segment/part of a TV program.
*/
public class TVClip extends Clip{
	
	
	/**
	* The TV series to which this episode or season belongs.
	 *
	 * Ranges: TVSeries
	 */
	private TVSeries _partOfTVSeries;
	
	public TVSeries getPartOfTVSeries() throws ClassCastException{
		return (TVSeries) _partOfTVSeries;
	}
	
	public void setPartOfTVSeries(TVSeries value) throws ClassCastException{
		_partOfTVSeries = value;
	}
}
