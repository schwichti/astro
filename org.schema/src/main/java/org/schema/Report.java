package org.schema;
/**
* A Report generated by governmental or non-governmental organization.
*/
public class Report extends Article{
	
	
	/**
	* The number or other unique designator assigned to a Report by the publishing organization.
	 *
	 * Ranges: Text
	 */
	private String _reportNumber;
	
	public String getReportNumber() throws ClassCastException{
		return (String) _reportNumber;
	}
	
	public void setReportNumber(String value) throws ClassCastException{
		_reportNumber = value;
	}
}
