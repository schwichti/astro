package org.schema;
/**
* A direction indicating a single action to do in the instructions for how to achieve a result.
*/
public class HowToDirection extends ListItem{
	
	
	/**
	* A media object representing the circumstances before performing this direction.
	 *
	 * Ranges: MediaObject
	 */
	private MediaObject _beforeMedia;
	
	public MediaObject getBeforeMedia() throws ClassCastException{
		return (MediaObject) _beforeMedia;
	}
	
	public void setBeforeMedia(MediaObject value) throws ClassCastException{
		_beforeMedia = value;
	}
	/**
	* The total time required to perform instructions or a direction (including time to prepare the supplies), in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 * Ranges: Duration
	 */
	private Duration _totalTime;
	
	public Duration getTotalTime() throws ClassCastException{
		return (Duration) _totalTime;
	}
	
	public void setTotalTime(Duration value) throws ClassCastException{
		_totalTime = value;
	}
	/**
	* The length of time it takes to prepare the items to be used in instructions or a direction, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 * Ranges: Duration
	 */
	private Duration _prepTime;
	
	public Duration getPrepTime() throws ClassCastException{
		return (Duration) _prepTime;
	}
	
	public void setPrepTime(Duration value) throws ClassCastException{
		_prepTime = value;
	}
	/**
	* A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.
	 *
	 * Ranges: Text, HowToTool
	 */
	private Object _tool;
	
	public <T> T getTool(Class<T> c) throws ClassCastException{
		return (T) _tool;
	}
	
	public void setTool(String value) throws ClassCastException{
		_tool = value;
	}
	public void setTool(HowToTool value) throws ClassCastException{
		_tool = value;
	}
	/**
	* A media object representing the circumstances while performing this direction.
	 *
	 * Ranges: MediaObject
	 */
	private MediaObject _duringMedia;
	
	public MediaObject getDuringMedia() throws ClassCastException{
		return (MediaObject) _duringMedia;
	}
	
	public void setDuringMedia(MediaObject value) throws ClassCastException{
		_duringMedia = value;
	}
	/**
	* A sub-property of instrument. A supply consumed when performing instructions or a direction.
	 *
	 * Ranges: HowToSupply, Text
	 */
	private Object _supply;
	
	public <T> T getSupply(Class<T> c) throws ClassCastException{
		return (T) _supply;
	}
	
	public void setSupply(HowToSupply value) throws ClassCastException{
		_supply = value;
	}
	public void setSupply(String value) throws ClassCastException{
		_supply = value;
	}
	/**
	* The length of time it takes to perform instructions or a direction (not including time to prepare the supplies), in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 * Ranges: Duration
	 */
	private Duration _performTime;
	
	public Duration getPerformTime() throws ClassCastException{
		return (Duration) _performTime;
	}
	
	public void setPerformTime(Duration value) throws ClassCastException{
		_performTime = value;
	}
	/**
	* A media object representing the circumstances after performing this direction.
	 *
	 * Ranges: MediaObject
	 */
	private MediaObject _afterMedia;
	
	public MediaObject getAfterMedia() throws ClassCastException{
		return (MediaObject) _afterMedia;
	}
	
	public void setAfterMedia(MediaObject value) throws ClassCastException{
		_afterMedia = value;
	}
}
