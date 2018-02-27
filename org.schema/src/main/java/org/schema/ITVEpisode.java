package org.schema;
/**
* A TV episode which can be part of a series or season.
*/
public interface ITVEpisode extends IEpisode{
	
	
	/**
	 * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>.
	 *
	 */
	
	public <T> T getSubtitleLanguage(Class<T> c) throws ClassCastException;
	
	public void setSubtitleLanguage(Language value) throws ClassCastException;
	public void setSubtitleLanguage(String value) throws ClassCastException;
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
