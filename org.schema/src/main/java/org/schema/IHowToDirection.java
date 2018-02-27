package org.schema;
/**
* A direction indicating a single action to do in the instructions for how to achieve a result.
*/
public interface IHowToDirection extends IListItem{
	
	
	/**
	 * A media object representing the circumstances before performing this direction.
	 *
	 */
	
	public MediaObject getBeforeMedia() throws ClassCastException;
	
	public void setBeforeMedia(MediaObject value) throws ClassCastException;
	/**
	 * The total time required to perform instructions or a direction (including time to prepare the supplies), in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 */
	
	public Duration getTotalTime() throws ClassCastException;
	
	public void setTotalTime(Duration value) throws ClassCastException;
	/**
	 * The length of time it takes to prepare the items to be used in instructions or a direction, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 */
	
	public Duration getPrepTime() throws ClassCastException;
	
	public void setPrepTime(Duration value) throws ClassCastException;
	/**
	 * A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.
	 *
	 */
	
	public <T> T getTool(Class<T> c) throws ClassCastException;
	
	public void setTool(String value) throws ClassCastException;
	public void setTool(HowToTool value) throws ClassCastException;
	/**
	 * A media object representing the circumstances while performing this direction.
	 *
	 */
	
	public MediaObject getDuringMedia() throws ClassCastException;
	
	public void setDuringMedia(MediaObject value) throws ClassCastException;
	/**
	 * A sub-property of instrument. A supply consumed when performing instructions or a direction.
	 *
	 */
	
	public <T> T getSupply(Class<T> c) throws ClassCastException;
	
	public void setSupply(HowToSupply value) throws ClassCastException;
	public void setSupply(String value) throws ClassCastException;
	/**
	 * The length of time it takes to perform instructions or a direction (not including time to prepare the supplies), in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 */
	
	public Duration getPerformTime() throws ClassCastException;
	
	public void setPerformTime(Duration value) throws ClassCastException;
	/**
	 * A media object representing the circumstances after performing this direction.
	 *
	 */
	
	public MediaObject getAfterMedia() throws ClassCastException;
	
	public void setAfterMedia(MediaObject value) throws ClassCastException;
}
