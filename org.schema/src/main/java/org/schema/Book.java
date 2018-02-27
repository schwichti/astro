package org.schema;
/**
* A book.
*/
public class Book extends CreativeWork{
	
	
	/**
	* The illustrator of the book.
	 *
	 * Ranges: Person
	 */
	private Person _illustrator;
	
	public Person getIllustrator() throws ClassCastException{
		return (Person) _illustrator;
	}
	
	public void setIllustrator(Person value) throws ClassCastException{
		_illustrator = value;
	}
	/**
	* The format of the book.
	 *
	 * Ranges: BookFormatType
	 */
	private BookFormatType _bookFormat;
	
	public BookFormatType getBookFormat() throws ClassCastException{
		return (BookFormatType) _bookFormat;
	}
	
	public void setBookFormat(BookFormatType value) throws ClassCastException{
		_bookFormat = value;
	}
	/**
	* The edition of the book.
	 *
	 * Ranges: Text
	 */
	private String _bookEdition;
	
	public String getBookEdition() throws ClassCastException{
		return (String) _bookEdition;
	}
	
	public void setBookEdition(String value) throws ClassCastException{
		_bookEdition = value;
	}
	/**
	* The number of pages in the book.
	 *
	 * Ranges: Integer
	 */
	private Integer _numberOfPages;
	
	public Integer getNumberOfPages() throws ClassCastException{
		return (Integer) _numberOfPages;
	}
	
	public void setNumberOfPages(Integer value) throws ClassCastException{
		_numberOfPages = value;
	}
	/**
	* The ISBN of the book.
	 *
	 * Ranges: Text
	 */
	private String _isbn;
	
	public String getIsbn() throws ClassCastException{
		return (String) _isbn;
	}
	
	public void setIsbn(String value) throws ClassCastException{
		_isbn = value;
	}
}
