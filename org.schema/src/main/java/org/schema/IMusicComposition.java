package org.schema;
/**
* A musical composition.
*/
public interface IMusicComposition extends ICreativeWork{
	
	
	/**
	 * The words in the song.
	 *
	 */
	
	public CreativeWork getLyrics() throws ClassCastException;
	
	public void setLyrics(CreativeWork value) throws ClassCastException;
	/**
	 * The key, mode, or scale this composition uses.
	 *
	 */
	
	public String getMusicalKey() throws ClassCastException;
	
	public void setMusicalKey(String value) throws ClassCastException;
	/**
	 * The date and place the work was first performed.
	 *
	 */
	
	public Event getFirstPerformance() throws ClassCastException;
	
	public void setFirstPerformance(Event value) throws ClassCastException;
	/**
	 * The type of composition (e.g. overture, sonata, symphony, etc.).
	 *
	 */
	
	public String getMusicCompositionForm() throws ClassCastException;
	
	public void setMusicCompositionForm(String value) throws ClassCastException;
	/**
	 * The person who wrote the words.
	 *
	 */
	
	public Person getLyricist() throws ClassCastException;
	
	public void setLyricist(Person value) throws ClassCastException;
	/**
	 * The International Standard Musical Work Code for the composition.
	 *
	 */
	
	public String getIswcCode() throws ClassCastException;
	
	public void setIswcCode(String value) throws ClassCastException;
	/**
	 * Smaller compositions included in this work (e.g. a movement in a symphony).
	 *
	 */
	
	public MusicComposition getIncludedComposition() throws ClassCastException;
	
	public void setIncludedComposition(MusicComposition value) throws ClassCastException;
	/**
	 * An arrangement derived from the composition.
	 *
	 */
	
	public MusicComposition getMusicArrangement() throws ClassCastException;
	
	public void setMusicArrangement(MusicComposition value) throws ClassCastException;
	/**
	 * An audio recording of the work.
	 *
	 */
	
	public MusicRecording getRecordedAs() throws ClassCastException;
	
	public void setRecordedAs(MusicRecording value) throws ClassCastException;
	/**
	 * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
	 *
	 */
	
	public <T> T getComposer(Class<T> c) throws ClassCastException;
	
	public void setComposer(Person value) throws ClassCastException;
	public void setComposer(Organization value) throws ClassCastException;
}
