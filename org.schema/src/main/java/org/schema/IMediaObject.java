package org.schema;
/**
* A media object, such as an image, video, or audio object embedded in a web page or a downloadable dataset i.e. DataDownload. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).
*/
public interface IMediaObject extends ICreativeWork{
	
	
	/**
	 * Date when this media object was uploaded to this site.
	 *
	 */
	
	public java.util.Date getUploadDate() throws ClassCastException;
	
	public void setUploadDate(java.util.Date value) throws ClassCastException;
	/**
	 * The production company or studio responsible for the item e.g. series, video game, episode etc.
	 *
	 */
	
	public Organization getProductionCompany() throws ClassCastException;
	
	public void setProductionCompany(Organization value) throws ClassCastException;
	/**
	 * The height of the item.
	 *
	 */
	
	public <T> T getHeight(Class<T> c) throws ClassCastException;
	
	public void setHeight(Distance value) throws ClassCastException;
	public void setHeight(QuantitativeValue value) throws ClassCastException;
	/**
	 * File size in (mega/kilo) bytes.
	 *
	 */
	
	public String getContentSize() throws ClassCastException;
	
	public void setContentSize(String value) throws ClassCastException;
	/**
	 * A NewsArticle associated with the Media Object.
	 *
	 */
	
	public NewsArticle getAssociatedArticle() throws ClassCastException;
	
	public void setAssociatedArticle(NewsArticle value) throws ClassCastException;
	/**
	 * A URL pointing to a player for a specific video. In general, this is the information in the <code>src</code> element of an <code>embed</code> tag and should not be the same as the content of the <code>loc</code> tag.
	 *
	 */
	
	public String getEmbedUrl() throws ClassCastException;
	
	public void setEmbedUrl(String value) throws ClassCastException;
	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 *
	 */
	
	public Duration getDuration() throws ClassCastException;
	
	public void setDuration(Duration value) throws ClassCastException;
	/**
	 * The width of the item.
	 *
	 */
	
	public <T> T getWidth(Class<T> c) throws ClassCastException;
	
	public void setWidth(Distance value) throws ClassCastException;
	public void setWidth(QuantitativeValue value) throws ClassCastException;
	/**
	 * The CreativeWork encoded by this media object.
	 *
	 */
	
	public CreativeWork getEncodesCreativeWork() throws ClassCastException;
	
	public void setEncodesCreativeWork(CreativeWork value) throws ClassCastException;
	/**
	 * Player type required&#x2014;for example, Flash or Silverlight.
	 *
	 */
	
	public String getPlayerType() throws ClassCastException;
	
	public void setPlayerType(String value) throws ClassCastException;
	/**
	 * mp3, mpeg4, etc.
	 *
	 */
	
	public String getEncodingFormat() throws ClassCastException;
	
	public void setEncodingFormat(String value) throws ClassCastException;
	/**
	 * Indicates if use of the media require a subscription  (either paid or free). Allowed values are <code>true</code> or <code>false</code> (note that an earlier version had 'yes', 'no').
	 *
	 */
	
	public Boolean getRequiresSubscription() throws ClassCastException;
	
	public void setRequiresSubscription(Boolean value) throws ClassCastException;
	/**
	 * Actual bytes of the media object, for example the image file or video file.
	 *
	 */
	
	public String getContentUrl() throws ClassCastException;
	
	public void setContentUrl(String value) throws ClassCastException;
	/**
	 * The regions where the media is allowed. If not specified, then it's assumed to be allowed everywhere. Specify the countries in <a href="http://en.wikipedia.org/wiki/ISO_3166">ISO 3166 format</a>.
	 *
	 */
	
	public Place getRegionsAllowed() throws ClassCastException;
	
	public void setRegionsAllowed(Place value) throws ClassCastException;
	/**
	 * The bitrate of the media object.
	 *
	 */
	
	public String getBitrate() throws ClassCastException;
	
	public void setBitrate(String value) throws ClassCastException;
}
