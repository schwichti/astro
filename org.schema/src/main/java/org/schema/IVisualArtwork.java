package org.schema;
/**
* A work of art that is primarily visual in character.
*/
public interface IVisualArtwork extends ICreativeWork{
	
	
	/**
	 * The material used. (e.g. Oil, Watercolour, Acrylic, Linoprint, Marble, Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil, Mixed Media, etc.)
	 *
	 */
	
	public String getArtMedium() throws ClassCastException;
	
	public void setArtMedium(String value) throws ClassCastException;
	/**
	 * The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc.
	 *
	 */
	
	public String getArtworkSurface() throws ClassCastException;
	
	public void setArtworkSurface(String value) throws ClassCastException;
	/**
	 * e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc.
	 *
	 */
	
	public String getArtform() throws ClassCastException;
	
	public void setArtform(String value) throws ClassCastException;
	/**
	 * The number of copies when multiple copies of a piece of artwork are produced - e.g. for a limited edition of 20 prints, 'artEdition' refers to the total number of copies (in this example "20").
	 *
	 */
	
	public <T> T getArtEdition(Class<T> c) throws ClassCastException;
	
	public void setArtEdition(String value) throws ClassCastException;
	public void setArtEdition(Integer value) throws ClassCastException;
	/**
	 * The depth of the item.
	 *
	 */
	
	public <T> T getDepth(Class<T> c) throws ClassCastException;
	
	public void setDepth(QuantitativeValue value) throws ClassCastException;
	public void setDepth(Distance value) throws ClassCastException;
	/**
	 * A material used as a surface in some artwork, e.g. Canvas, Paper, Wood, Board, etc.
	 *
	 */
	
	public String getSurface() throws ClassCastException;
	
	public void setSurface(String value) throws ClassCastException;
	/**
	 * The width of the item.
	 *
	 */
	
	public <T> T getWidth(Class<T> c) throws ClassCastException;
	
	public void setWidth(Distance value) throws ClassCastException;
	public void setWidth(QuantitativeValue value) throws ClassCastException;
	/**
	 * The height of the item.
	 *
	 */
	
	public <T> T getHeight(Class<T> c) throws ClassCastException;
	
	public void setHeight(Distance value) throws ClassCastException;
	public void setHeight(QuantitativeValue value) throws ClassCastException;
}
