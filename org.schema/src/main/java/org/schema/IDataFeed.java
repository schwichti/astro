package org.schema;
/**
* A single feed providing structured information about one or more entities or topics.
*/
public interface IDataFeed extends IDataset{
	
	
	/**
	 * An item within in a data feed. Data feeds may have many elements.
	 *
	 */
	
	public <T> T getDataFeedElement(Class<T> c) throws ClassCastException;
	
	public void setDataFeedElement(DataFeedItem value) throws ClassCastException;
	public void setDataFeedElement(String value) throws ClassCastException;
	public void setDataFeedElement(Thing value) throws ClassCastException;
}
