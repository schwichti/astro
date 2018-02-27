package org.schema;
/**
* A collection of datasets.
*/
public class DataCatalog extends CreativeWork{
	
	
	/**
	* A dataset contained in this catalog.
	 *
	 * Ranges: Dataset
	 */
	private Dataset _dataset;
	
	public Dataset getDataset() throws ClassCastException{
		return (Dataset) _dataset;
	}
	
	public void setDataset(Dataset value) throws ClassCastException{
		_dataset = value;
	}
}
