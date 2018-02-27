package org.schema;
/**
* A structured value providing information about the opening hours of a place or a certain service inside a place.</p>

<p>The place is <strong>open</strong> if the <a class="localLink" href="http://schema.org/opens">opens</a> property is specified, and <strong>closed</strong> otherwise.</p>

<p>If the value for the <a class="localLink" href="http://schema.org/closes">closes</a> property is less than the value for the <a class="localLink" href="http://schema.org/opens">opens</a> property then the hour range is assumed to span over the next day.
*/
public interface IOpeningHoursSpecification extends IStructuredValue{
	
	
	/**
	 * The date when the item becomes valid.
	 *
	 */
	
	public java.util.Date getValidFrom() throws ClassCastException;
	
	public void setValidFrom(java.util.Date value) throws ClassCastException;
	/**
	 * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 */
	
	public java.util.Date getValidThrough() throws ClassCastException;
	
	public void setValidThrough(java.util.Date value) throws ClassCastException;
	/**
	 * The closing hour of the place or service on the given day(s) of the week.
	 *
	 */
	
	public java.util.Date getCloses() throws ClassCastException;
	
	public void setCloses(java.util.Date value) throws ClassCastException;
	/**
	 * The day of the week for which these opening hours are valid.
	 *
	 */
	
	public DayOfWeek getDayOfWeek() throws ClassCastException;
	
	public void setDayOfWeek(DayOfWeek value) throws ClassCastException;
	/**
	 * The opening hour of the place or service on the given day(s) of the week.
	 *
	 */
	
	public java.util.Date getOpens() throws ClassCastException;
	
	public void setOpens(java.util.Date value) throws ClassCastException;
}
