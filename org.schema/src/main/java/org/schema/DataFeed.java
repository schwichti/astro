package org.schema;
/**
* A single feed providing structured information about one or more entities or topics.
*/
public class DataFeed extends Dataset{
	
	
	/**
	* An item within in a data feed. Data feeds may have many elements.
	 *
	 * Ranges: DataFeedItem, Text, Thing
	 */
	private Object _dataFeedElement;
	
	public <T> T getDataFeedElement(Class<T> c) throws ClassCastException{
		return (T) _dataFeedElement;
	}
	
	public void setDataFeedElement(DataFeedItem value) throws ClassCastException{
		_dataFeedElement = value;
	}
	public void setDataFeedElement(String value) throws ClassCastException{
		_dataFeedElement = value;
	}
	public void setDataFeedElement(Thing value) throws ClassCastException{
		_dataFeedElement = value;
	}
}
