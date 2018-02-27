package org.schema;
/**
* The act of planning the execution of an event/task/action/reservation/plan to a future date.
*/
public interface IPlanAction extends IOrganizeAction{
	
	
	/**
	 * The time the object is scheduled to.
	 *
	 */
	
	public java.util.Date getScheduledTime() throws ClassCastException;
	
	public void setScheduledTime(java.util.Date value) throws ClassCastException;
}
