package org.schema;
/**
* A body of structured information describing some topic(s) of interest.
*/
public interface IDataset extends ICreativeWork{
	
	
	/**
	 * A data catalog which contains this dataset (this property was previously 'catalog', preferred name is now 'includedInDataCatalog').
	 *
	 */
	
	public DataCatalog getIncludedDataCatalog() throws ClassCastException;
	
	public void setIncludedDataCatalog(DataCatalog value) throws ClassCastException;
	/**
	 * The range of temporal applicability of a dataset, e.g. for a 2011 census dataset, the year 2011 (in ISO 8601 time interval format).
	 *
	 */
	
	public java.util.Date getTemporal() throws ClassCastException;
	
	public void setTemporal(java.util.Date value) throws ClassCastException;
	/**
	 * The range of temporal applicability of a dataset, e.g. for a 2011 census dataset, the year 2011 (in ISO 8601 time interval format).
	 *
	 */
	
	public java.util.Date getDatasetTimeInterval() throws ClassCastException;
	
	public void setDatasetTimeInterval(java.util.Date value) throws ClassCastException;
	/**
	 * The range of spatial applicability of a dataset, e.g. for a dataset of New York weather, the state of New York.
	 *
	 */
	
	public Place getSpatial() throws ClassCastException;
	
	public void setSpatial(Place value) throws ClassCastException;
	/**
	 * A data catalog which contains this dataset.
	 *
	 */
	
	public DataCatalog getCatalog() throws ClassCastException;
	
	public void setCatalog(DataCatalog value) throws ClassCastException;
	/**
	 * A downloadable form of this dataset, at a specific location, in a specific format.
	 *
	 */
	
	public DataDownload getDistribution() throws ClassCastException;
	
	public void setDistribution(DataDownload value) throws ClassCastException;
	/**
	 * The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
	 *
	 */
	
	public String getIssn() throws ClassCastException;
	
	public void setIssn(String value) throws ClassCastException;
	/**
	 * A data catalog which contains this dataset.
	 *
	 */
	
	public DataCatalog getIncludedInDataCatalog() throws ClassCastException;
	
	public void setIncludedInDataCatalog(DataCatalog value) throws ClassCastException;
}
