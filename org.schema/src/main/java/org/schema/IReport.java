package org.schema;
/**
* A Report generated by governmental or non-governmental organization.
*/
public interface IReport extends IArticle{
	
	
	/**
	 * The number or other unique designator assigned to a Report by the publishing organization.
	 *
	 */
	
	public String getReportNumber() throws ClassCastException;
	
	public void setReportNumber(String value) throws ClassCastException;
}
