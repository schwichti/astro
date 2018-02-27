package org.schema;
/**
* A food-related business.
*/
public interface IFoodEstablishment extends ILocalBusiness{
	
	
	/**
	 * Indicates whether a FoodEstablishment accepts reservations. Values can be Boolean, an URL at which reservations can be made or (for backwards compatibility) the strings <code>Yes</code> or <code>No</code>.
	 *
	 */
	
	public <T> T getAcceptsReservations(Class<T> c) throws ClassCastException;
	
	public void setAcceptsReservations(String value) throws ClassCastException;
	public void setAcceptsReservations(Boolean value) throws ClassCastException;
	/**
	 * Either the actual menu as a structured representation, as text, or a URL of the menu.
	 *
	 */
	
	public <T> T getMenu(Class<T> c) throws ClassCastException;
	
	public void setMenu(String value) throws ClassCastException;
	public void setMenu(Menu value) throws ClassCastException;
	/**
	 * An official rating for a lodging business or food establishment, e.g. from national associations or standards bodies. Use the author property to indicate the rating organization, e.g. as an Organization with name such as (e.g. HOTREC, DEHOGA, WHR, or Hotelstars).
	 *
	 */
	
	public Rating getStarRating() throws ClassCastException;
	
	public void setStarRating(Rating value) throws ClassCastException;
	/**
	 * Either the actual menu as a structured representation, as text, or a URL of the menu.
	 *
	 */
	
	public <T> T getHasMenu(Class<T> c) throws ClassCastException;
	
	public void setHasMenu(String value) throws ClassCastException;
	public void setHasMenu(Menu value) throws ClassCastException;
	/**
	 * The cuisine of the restaurant.
	 *
	 */
	
	public String getServesCuisine() throws ClassCastException;
	
	public void setServesCuisine(String value) throws ClassCastException;
}
