package org.schema;
/**
* An image file.
*/
public class ImageObject extends MediaObject{
	
	
	/**
	* The caption for this object.
	 *
	 * Ranges: Text
	 */
	private String _caption;
	
	public String getCaption() throws ClassCastException{
		return (String) _caption;
	}
	
	public void setCaption(String value) throws ClassCastException{
		_caption = value;
	}
	/**
	* Thumbnail image for an image or video.
	 *
	 * Ranges: ImageObject
	 */
	private ImageObject _thumbnail;
	
	public ImageObject getThumbnail() throws ClassCastException{
		return (ImageObject) _thumbnail;
	}
	
	public void setThumbnail(ImageObject value) throws ClassCastException{
		_thumbnail = value;
	}
	/**
	* exif data for this object.
	 *
	 * Ranges: PropertyValue, Text
	 */
	private Object _exifData;
	
	public <T> T getExifData(Class<T> c) throws ClassCastException{
		return (T) _exifData;
	}
	
	public void setExifData(PropertyValue value) throws ClassCastException{
		_exifData = value;
	}
	public void setExifData(String value) throws ClassCastException{
		_exifData = value;
	}
	/**
	* Indicates whether this image is representative of the content of the page.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _representativeOfPage;
	
	public Boolean getRepresentativeOfPage() throws ClassCastException{
		return (Boolean) _representativeOfPage;
	}
	
	public void setRepresentativeOfPage(Boolean value) throws ClassCastException{
		_representativeOfPage = value;
	}
}
