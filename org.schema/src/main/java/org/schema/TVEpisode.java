package org.schema;
/**
* A TV episode which can be part of a series or season.
*/
public class TVEpisode extends Episode{
	
	
	/**
	* Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>.
	 *
	 * Ranges: Language, Text
	 */
	private Object _subtitleLanguage;
	
	public <T> T getSubtitleLanguage(Class<T> c) throws ClassCastException{
		return (T) _subtitleLanguage;
	}
	
	public void setSubtitleLanguage(Language value) throws ClassCastException{
		_subtitleLanguage = value;
	}
	public void setSubtitleLanguage(String value) throws ClassCastException{
		_subtitleLanguage = value;
	}
	/**
	* The country of the principal offices of the production company or individual responsible for the movie or program.
	 *
	 * Ranges: Country
	 */
	private Country _countryOfOrigin;
	
	public Country getCountryOfOrigin() throws ClassCastException{
		return (Country) _countryOfOrigin;
	}
	
	public void setCountryOfOrigin(Country value) throws ClassCastException{
		_countryOfOrigin = value;
	}
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
