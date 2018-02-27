package org.schema;
/**
* The act of participating in performance arts.
*/
public class PerformAction extends PlayAction{
	
	
	/**
	* A sub property of location. The entertainment business where the action occurred.
	 *
	 * Ranges: EntertainmentBusiness
	 */
	private EntertainmentBusiness _entertainmentBusiness;
	
	public EntertainmentBusiness getEntertainmentBusiness() throws ClassCastException{
		return (EntertainmentBusiness) _entertainmentBusiness;
	}
	
	public void setEntertainmentBusiness(EntertainmentBusiness value) throws ClassCastException{
		_entertainmentBusiness = value;
	}
}
