package org.schema;
/**
* A media object, such as an image, video, or audio object embedded in a web page or a downloadable dataset i.e. DataDownload. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).
*/
public class MediaObject extends CreativeWork{
	
	
	/**
	* Date when this media object was uploaded to this site.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _uploadDate;
	
	public java.util.Date getUploadDate() throws ClassCastException{
		return (java.util.Date) _uploadDate;
	}
	
	public void setUploadDate(java.util.Date value) throws ClassCastException{
		_uploadDate = value;
	}
	/**
	* The production company or studio responsible for the item e.g. series, video game, episode etc.
	 *
	 * Ranges: Organization
	 */
	private Organization _productionCompany;
	
	public Organization getProductionCompany() throws ClassCastException{
		return (Organization) _productionCompany;
	}
	
	public void setProductionCompany(Organization value) throws ClassCastException{
		_productionCompany = value;
	}
	/**
	* The height of the item.
	 *
	 * Ranges: Distance, QuantitativeValue
	 */
	private Object _height;
	
	public <T> T getHeight(Class<T> c) throws ClassCastException{
		return (T) _height;
	}
	
	public void setHeight(Distance value) throws ClassCastException{
		_height = value;
	}
	public void setHeight(QuantitativeValue value) throws ClassCastException{
		_height = value;
	}
	/**
	* File size in (mega/kilo) bytes.
	 *
	 * Ranges: Text
	 */
	private String _contentSize;
	
	public String getContentSize() throws ClassCastException{
		return (String) _contentSize;
	}
	
	public void setContentSize(String value) throws ClassCastException{
		_contentSize = value;
	}
	/**
	* A NewsArticle associated with the Media Object.
	 *
	 * Ranges: NewsArticle
	 */
	private NewsArticle _associatedArticle;
	
	public NewsArticle getAssociatedArticle() throws ClassCastException{
		return (NewsArticle) _associatedArticle;
	}
	
	public void setAssociatedArticle(NewsArticle value) throws ClassCastException{
		_associatedArticle = value;
	}
	/**
	* A URL pointing to a player for a specific video. In general, this is the information in the <code>src</code> element of an <code>embed</code> tag and should not be the same as the content of the <code>loc</code> tag.
	 *
	 * Ranges: URL
	 */
	private String _embedUrl;
	
	public String getEmbedUrl() throws ClassCastException{
		return (String) _embedUrl;
	}
	
	public void setEmbedUrl(String value) throws ClassCastException{
		_embedUrl = value;
	}
	/**
	* The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 *
	 * Ranges: Duration
	 */
	private Duration _duration;
	
	public Duration getDuration() throws ClassCastException{
		return (Duration) _duration;
	}
	
	public void setDuration(Duration value) throws ClassCastException{
		_duration = value;
	}
	/**
	* The width of the item.
	 *
	 * Ranges: Distance, QuantitativeValue
	 */
	private Object _width;
	
	public <T> T getWidth(Class<T> c) throws ClassCastException{
		return (T) _width;
	}
	
	public void setWidth(Distance value) throws ClassCastException{
		_width = value;
	}
	public void setWidth(QuantitativeValue value) throws ClassCastException{
		_width = value;
	}
	/**
	* The CreativeWork encoded by this media object.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _encodesCreativeWork;
	
	public CreativeWork getEncodesCreativeWork() throws ClassCastException{
		return (CreativeWork) _encodesCreativeWork;
	}
	
	public void setEncodesCreativeWork(CreativeWork value) throws ClassCastException{
		_encodesCreativeWork = value;
	}
	/**
	* Player type required&#x2014;for example, Flash or Silverlight.
	 *
	 * Ranges: Text
	 */
	private String _playerType;
	
	public String getPlayerType() throws ClassCastException{
		return (String) _playerType;
	}
	
	public void setPlayerType(String value) throws ClassCastException{
		_playerType = value;
	}
	/**
	* mp3, mpeg4, etc.
	 *
	 * Ranges: Text
	 */
	private String _encodingFormat;
	
	public String getEncodingFormat() throws ClassCastException{
		return (String) _encodingFormat;
	}
	
	public void setEncodingFormat(String value) throws ClassCastException{
		_encodingFormat = value;
	}
	/**
	* Indicates if use of the media require a subscription  (either paid or free). Allowed values are <code>true</code> or <code>false</code> (note that an earlier version had 'yes', 'no').
	 *
	 * Ranges: Boolean
	 */
	private Boolean _requiresSubscription;
	
	public Boolean getRequiresSubscription() throws ClassCastException{
		return (Boolean) _requiresSubscription;
	}
	
	public void setRequiresSubscription(Boolean value) throws ClassCastException{
		_requiresSubscription = value;
	}
	/**
	* Actual bytes of the media object, for example the image file or video file.
	 *
	 * Ranges: URL
	 */
	private String _contentUrl;
	
	public String getContentUrl() throws ClassCastException{
		return (String) _contentUrl;
	}
	
	public void setContentUrl(String value) throws ClassCastException{
		_contentUrl = value;
	}
	/**
	* The regions where the media is allowed. If not specified, then it's assumed to be allowed everywhere. Specify the countries in <a href="http://en.wikipedia.org/wiki/ISO_3166">ISO 3166 format</a>.
	 *
	 * Ranges: Place
	 */
	private Place _regionsAllowed;
	
	public Place getRegionsAllowed() throws ClassCastException{
		return (Place) _regionsAllowed;
	}
	
	public void setRegionsAllowed(Place value) throws ClassCastException{
		_regionsAllowed = value;
	}
	/**
	* The bitrate of the media object.
	 *
	 * Ranges: Text
	 */
	private String _bitrate;
	
	public String getBitrate() throws ClassCastException{
		return (String) _bitrate;
	}
	
	public void setBitrate(String value) throws ClassCastException{
		_bitrate = value;
	}
}
