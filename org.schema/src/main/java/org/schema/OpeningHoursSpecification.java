package org.schema;
/**
* A structured value providing information about the opening hours of a place or a certain service inside a place.</p>

<p>The place is <strong>open</strong> if the <a class="localLink" href="http://schema.org/opens">opens</a> property is specified, and <strong>closed</strong> otherwise.</p>

<p>If the value for the <a class="localLink" href="http://schema.org/closes">closes</a> property is less than the value for the <a class="localLink" href="http://schema.org/opens">opens</a> property then the hour range is assumed to span over the next day.
*/
public class OpeningHoursSpecification extends StructuredValue{
	
	
	/**
	* The date when the item becomes valid.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _validFrom;
	
	public java.util.Date getValidFrom() throws ClassCastException{
		return (java.util.Date) _validFrom;
	}
	
	public void setValidFrom(java.util.Date value) throws ClassCastException{
		_validFrom = value;
	}
	/**
	* The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _validThrough;
	
	public java.util.Date getValidThrough() throws ClassCastException{
		return (java.util.Date) _validThrough;
	}
	
	public void setValidThrough(java.util.Date value) throws ClassCastException{
		_validThrough = value;
	}
	/**
	* The closing hour of the place or service on the given day(s) of the week.
	 *
	 * Ranges: Time
	 */
	private java.util.Date _closes;
	
	public java.util.Date getCloses() throws ClassCastException{
		return (java.util.Date) _closes;
	}
	
	public void setCloses(java.util.Date value) throws ClassCastException{
		_closes = value;
	}
	/**
	* The day of the week for which these opening hours are valid.
	 *
	 * Ranges: DayOfWeek
	 */
	private DayOfWeek _dayOfWeek;
	
	public DayOfWeek getDayOfWeek() throws ClassCastException{
		return (DayOfWeek) _dayOfWeek;
	}
	
	public void setDayOfWeek(DayOfWeek value) throws ClassCastException{
		_dayOfWeek = value;
	}
	/**
	* The opening hour of the place or service on the given day(s) of the week.
	 *
	 * Ranges: Time
	 */
	private java.util.Date _opens;
	
	public java.util.Date getOpens() throws ClassCastException{
		return (java.util.Date) _opens;
	}
	
	public void setOpens(java.util.Date value) throws ClassCastException{
		_opens = value;
	}
}
