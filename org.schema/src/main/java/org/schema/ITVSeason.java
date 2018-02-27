package org.schema;
/**
* Season dedicated to TV broadcast and associated online delivery.
*/
public interface ITVSeason extends ICreativeWork, ICreativeWorkSeason{
	
	
	/**
	 * The country of the principal offices of the production company or individual responsible for the movie or program.
	 *
	 */
	
	public Country getCountryOfOrigin() throws ClassCastException;
	
	public void setCountryOfOrigin(Country value) throws ClassCastException;
	/**
	 * The TV series to which this episode or season belongs.
	 *
	 */
	
	public TVSeries getPartOfTVSeries() throws ClassCastException;
	
	public void setPartOfTVSeries(TVSeries value) throws ClassCastException;
}
