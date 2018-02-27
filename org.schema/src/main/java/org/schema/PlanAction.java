package org.schema;
/**
* The act of planning the execution of an event/task/action/reservation/plan to a future date.
*/
public class PlanAction extends OrganizeAction{
	
	
	/**
	* The time the object is scheduled to.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _scheduledTime;
	
	public java.util.Date getScheduledTime() throws ClassCastException{
		return (java.util.Date) _scheduledTime;
	}
	
	public void setScheduledTime(java.util.Date value) throws ClassCastException{
		_scheduledTime = value;
	}
}
