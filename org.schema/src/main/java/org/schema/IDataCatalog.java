package org.schema;
/**
* A collection of datasets.
*/
public interface IDataCatalog extends ICreativeWork{
	
	
	/**
	 * A dataset contained in this catalog.
	 *
	 */
	
	public Dataset getDataset() throws ClassCastException;
	
	public void setDataset(Dataset value) throws ClassCastException;
}
