package org.schema;
/**
* The act of participating in performance arts.
*/
public interface IPerformAction extends IPlayAction{
	
	
	/**
	 * A sub property of location. The entertainment business where the action occurred.
	 *
	 */
	
	public EntertainmentBusiness getEntertainmentBusiness() throws ClassCastException;
	
	public void setEntertainmentBusiness(EntertainmentBusiness value) throws ClassCastException;
}
