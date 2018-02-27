package org.schema;
/**
* A screening of a movie or other video.
*/
public interface IScreeningEvent extends IEvent{
	
	
	/**
	 * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>.
	 *
	 */
	
	public <T> T getSubtitleLanguage(Class<T> c) throws ClassCastException;
	
	public void setSubtitleLanguage(Language value) throws ClassCastException;
	public void setSubtitleLanguage(String value) throws ClassCastException;
	/**
	 * The movie presented during this event.
	 *
	 */
	
	public Movie getWorkPresented() throws ClassCastException;
	
	public void setWorkPresented(Movie value) throws ClassCastException;
	/**
	 * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
	 *
	 */
	
	public String getVideoFormat() throws ClassCastException;
	
	public void setVideoFormat(String value) throws ClassCastException;
}
