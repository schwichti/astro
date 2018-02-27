package org.schema;
/**
* A reservation to dine at a food-related business.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
*/
public class FoodEstablishmentReservation extends Reservation{
	
	
	/**
	* Number of people the reservation should accommodate.
	 *
	 * Ranges: Integer, QuantitativeValue
	 */
	private Object _partySize;
	
	public <T> T getPartySize(Class<T> c) throws ClassCastException{
		return (T) _partySize;
	}
	
	public void setPartySize(Integer value) throws ClassCastException{
		_partySize = value;
	}
	public void setPartySize(QuantitativeValue value) throws ClassCastException{
		_partySize = value;
	}
	/**
	* The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to <em>December</em>.</p>
	
	<p>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _endTime;
	
	public java.util.Date getEndTime() throws ClassCastException{
		return (java.util.Date) _endTime;
	}
	
	public void setEndTime(java.util.Date value) throws ClassCastException{
		_endTime = value;
	}
	/**
	* The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from <em>January</em> to December.</p>
	
	<p>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _startTime;
	
	public java.util.Date getStartTime() throws ClassCastException{
		return (java.util.Date) _startTime;
	}
	
	public void setStartTime(java.util.Date value) throws ClassCastException{
		_startTime = value;
	}
}
