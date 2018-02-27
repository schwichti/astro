package org.schema;
/**
* A book.
*/
public interface IBook extends ICreativeWork{
	
	
	/**
	 * The illustrator of the book.
	 *
	 */
	
	public Person getIllustrator() throws ClassCastException;
	
	public void setIllustrator(Person value) throws ClassCastException;
	/**
	 * The format of the book.
	 *
	 */
	
	public BookFormatType getBookFormat() throws ClassCastException;
	
	public void setBookFormat(BookFormatType value) throws ClassCastException;
	/**
	 * The edition of the book.
	 *
	 */
	
	public String getBookEdition() throws ClassCastException;
	
	public void setBookEdition(String value) throws ClassCastException;
	/**
	 * The number of pages in the book.
	 *
	 */
	
	public Integer getNumberOfPages() throws ClassCastException;
	
	public void setNumberOfPages(Integer value) throws ClassCastException;
	/**
	 * The ISBN of the book.
	 *
	 */
	
	public String getIsbn() throws ClassCastException;
	
	public void setIsbn(String value) throws ClassCastException;
}
