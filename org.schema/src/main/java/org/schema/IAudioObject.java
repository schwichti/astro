package org.schema;
/**
* An audio file.
*/
public interface IAudioObject extends IMediaObject{
	
	
	/**
	 * If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
	 *
	 */
	
	public String getTranscript() throws ClassCastException;
	
	public void setTranscript(String value) throws ClassCastException;
}
