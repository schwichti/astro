package org.schema;
/**
* A body of structured information describing some topic(s) of interest.
*/
public class Dataset extends CreativeWork{
	
	
	/**
	* A data catalog which contains this dataset (this property was previously 'catalog', preferred name is now 'includedInDataCatalog').
	 *
	 * Ranges: DataCatalog
	 */
	private DataCatalog _includedDataCatalog;
	
	public DataCatalog getIncludedDataCatalog() throws ClassCastException{
		return (DataCatalog) _includedDataCatalog;
	}
	
	public void setIncludedDataCatalog(DataCatalog value) throws ClassCastException{
		_includedDataCatalog = value;
	}
	/**
	* The range of temporal applicability of a dataset, e.g. for a 2011 census dataset, the year 2011 (in ISO 8601 time interval format).
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _temporal;
	
	public java.util.Date getTemporal() throws ClassCastException{
		return (java.util.Date) _temporal;
	}
	
	public void setTemporal(java.util.Date value) throws ClassCastException{
		_temporal = value;
	}
	/**
	* The range of temporal applicability of a dataset, e.g. for a 2011 census dataset, the year 2011 (in ISO 8601 time interval format).
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _datasetTimeInterval;
	
	public java.util.Date getDatasetTimeInterval() throws ClassCastException{
		return (java.util.Date) _datasetTimeInterval;
	}
	
	public void setDatasetTimeInterval(java.util.Date value) throws ClassCastException{
		_datasetTimeInterval = value;
	}
	/**
	* The range of spatial applicability of a dataset, e.g. for a dataset of New York weather, the state of New York.
	 *
	 * Ranges: Place
	 */
	private Place _spatial;
	
	public Place getSpatial() throws ClassCastException{
		return (Place) _spatial;
	}
	
	public void setSpatial(Place value) throws ClassCastException{
		_spatial = value;
	}
	/**
	* A data catalog which contains this dataset.
	 *
	 * Ranges: DataCatalog
	 */
	private DataCatalog _catalog;
	
	public DataCatalog getCatalog() throws ClassCastException{
		return (DataCatalog) _catalog;
	}
	
	public void setCatalog(DataCatalog value) throws ClassCastException{
		_catalog = value;
	}
	/**
	* A downloadable form of this dataset, at a specific location, in a specific format.
	 *
	 * Ranges: DataDownload
	 */
	private DataDownload _distribution;
	
	public DataDownload getDistribution() throws ClassCastException{
		return (DataDownload) _distribution;
	}
	
	public void setDistribution(DataDownload value) throws ClassCastException{
		_distribution = value;
	}
	/**
	* The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
	 *
	 * Ranges: Text
	 */
	private String _issn;
	
	public String getIssn() throws ClassCastException{
		return (String) _issn;
	}
	
	public void setIssn(String value) throws ClassCastException{
		_issn = value;
	}
	/**
	* A data catalog which contains this dataset.
	 *
	 * Ranges: DataCatalog
	 */
	private DataCatalog _includedInDataCatalog;
	
	public DataCatalog getIncludedInDataCatalog() throws ClassCastException{
		return (DataCatalog) _includedInDataCatalog;
	}
	
	public void setIncludedInDataCatalog(DataCatalog value) throws ClassCastException{
		_includedInDataCatalog = value;
	}
}
