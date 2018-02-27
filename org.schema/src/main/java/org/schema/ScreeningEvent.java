package org.schema;
/**
* A screening of a movie or other video.
*/
public class ScreeningEvent extends Event{
	
	
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
	* The movie presented during this event.
	 *
	 * Ranges: Movie
	 */
	private Movie _workPresented;
	
	public Movie getWorkPresented() throws ClassCastException{
		return (Movie) _workPresented;
	}
	
	public void setWorkPresented(Movie value) throws ClassCastException{
		_workPresented = value;
	}
	/**
	* The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
	 *
	 * Ranges: Text
	 */
	private String _videoFormat;
	
	public String getVideoFormat() throws ClassCastException{
		return (String) _videoFormat;
	}
	
	public void setVideoFormat(String value) throws ClassCastException{
		_videoFormat = value;
	}
}
