package org.schema;
/**
* An image file.
*/
public interface IImageObject extends IMediaObject{
	
	
	/**
	 * The caption for this object.
	 *
	 */
	
	public String getCaption() throws ClassCastException;
	
	public void setCaption(String value) throws ClassCastException;
	/**
	 * Thumbnail image for an image or video.
	 *
	 */
	
	public ImageObject getThumbnail() throws ClassCastException;
	
	public void setThumbnail(ImageObject value) throws ClassCastException;
	/**
	 * exif data for this object.
	 *
	 */
	
	public <T> T getExifData(Class<T> c) throws ClassCastException;
	
	public void setExifData(PropertyValue value) throws ClassCastException;
	public void setExifData(String value) throws ClassCastException;
	/**
	 * Indicates whether this image is representative of the content of the page.
	 *
	 */
	
	public Boolean getRepresentativeOfPage() throws ClassCastException;
	
	public void setRepresentativeOfPage(Boolean value) throws ClassCastException;
}
