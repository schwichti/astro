package org.schema;
/**
* A reservation to dine at a food-related business.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
*/
public interface IFoodEstablishmentReservation extends IReservation{
	
	
	/**
	 * Number of people the reservation should accommodate.
	 *
	 */
	
	public <T> T getPartySize(Class<T> c) throws ClassCastException;
	
	public void setPartySize(Integer value) throws ClassCastException;
	public void setPartySize(QuantitativeValue value) throws ClassCastException;
	/**
	 * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to <em>December</em>.</p>
	 
	 <p>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
	 *
	 */
	
	public java.util.Date getEndTime() throws ClassCastException;
	
	public void setEndTime(java.util.Date value) throws ClassCastException;
	/**
	 * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from <em>January</em> to December.</p>
	 
	 <p>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
	 *
	 */
	
	public java.util.Date getStartTime() throws ClassCastException;
	
	public void setStartTime(java.util.Date value) throws ClassCastException;
}
