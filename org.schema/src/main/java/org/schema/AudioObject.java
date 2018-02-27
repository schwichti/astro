package org.schema;
/**
* An audio file.
*/
public class AudioObject extends MediaObject{
	
	
	/**
	* If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
	 *
	 * Ranges: Text
	 */
	private String _transcript;
	
	public String getTranscript() throws ClassCastException{
		return (String) _transcript;
	}
	
	public void setTranscript(String value) throws ClassCastException{
		_transcript = value;
	}
}
