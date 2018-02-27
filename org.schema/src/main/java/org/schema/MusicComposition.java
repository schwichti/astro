package org.schema;
/**
* A musical composition.
*/
public class MusicComposition extends CreativeWork{
	
	
	/**
	* The words in the song.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _lyrics;
	
	public CreativeWork getLyrics() throws ClassCastException{
		return (CreativeWork) _lyrics;
	}
	
	public void setLyrics(CreativeWork value) throws ClassCastException{
		_lyrics = value;
	}
	/**
	* The key, mode, or scale this composition uses.
	 *
	 * Ranges: Text
	 */
	private String _musicalKey;
	
	public String getMusicalKey() throws ClassCastException{
		return (String) _musicalKey;
	}
	
	public void setMusicalKey(String value) throws ClassCastException{
		_musicalKey = value;
	}
	/**
	* The date and place the work was first performed.
	 *
	 * Ranges: Event
	 */
	private Event _firstPerformance;
	
	public Event getFirstPerformance() throws ClassCastException{
		return (Event) _firstPerformance;
	}
	
	public void setFirstPerformance(Event value) throws ClassCastException{
		_firstPerformance = value;
	}
	/**
	* The type of composition (e.g. overture, sonata, symphony, etc.).
	 *
	 * Ranges: Text
	 */
	private String _musicCompositionForm;
	
	public String getMusicCompositionForm() throws ClassCastException{
		return (String) _musicCompositionForm;
	}
	
	public void setMusicCompositionForm(String value) throws ClassCastException{
		_musicCompositionForm = value;
	}
	/**
	* The person who wrote the words.
	 *
	 * Ranges: Person
	 */
	private Person _lyricist;
	
	public Person getLyricist() throws ClassCastException{
		return (Person) _lyricist;
	}
	
	public void setLyricist(Person value) throws ClassCastException{
		_lyricist = value;
	}
	/**
	* The International Standard Musical Work Code for the composition.
	 *
	 * Ranges: Text
	 */
	private String _iswcCode;
	
	public String getIswcCode() throws ClassCastException{
		return (String) _iswcCode;
	}
	
	public void setIswcCode(String value) throws ClassCastException{
		_iswcCode = value;
	}
	/**
	* Smaller compositions included in this work (e.g. a movement in a symphony).
	 *
	 * Ranges: MusicComposition
	 */
	private MusicComposition _includedComposition;
	
	public MusicComposition getIncludedComposition() throws ClassCastException{
		return (MusicComposition) _includedComposition;
	}
	
	public void setIncludedComposition(MusicComposition value) throws ClassCastException{
		_includedComposition = value;
	}
	/**
	* An arrangement derived from the composition.
	 *
	 * Ranges: MusicComposition
	 */
	private MusicComposition _musicArrangement;
	
	public MusicComposition getMusicArrangement() throws ClassCastException{
		return (MusicComposition) _musicArrangement;
	}
	
	public void setMusicArrangement(MusicComposition value) throws ClassCastException{
		_musicArrangement = value;
	}
	/**
	* An audio recording of the work.
	 *
	 * Ranges: MusicRecording
	 */
	private MusicRecording _recordedAs;
	
	public MusicRecording getRecordedAs() throws ClassCastException{
		return (MusicRecording) _recordedAs;
	}
	
	public void setRecordedAs(MusicRecording value) throws ClassCastException{
		_recordedAs = value;
	}
	/**
	* The person or organization who wrote a composition, or who is the composer of a work performed at some event.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _composer;
	
	public <T> T getComposer(Class<T> c) throws ClassCastException{
		return (T) _composer;
	}
	
	public void setComposer(Person value) throws ClassCastException{
		_composer = value;
	}
	public void setComposer(Organization value) throws ClassCastException{
		_composer = value;
	}
}
