package org.schema;
/**
* A work of art that is primarily visual in character.
*/
public class VisualArtwork extends CreativeWork{
	
	
	/**
	* The material used. (e.g. Oil, Watercolour, Acrylic, Linoprint, Marble, Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil, Mixed Media, etc.)
	 *
	 * Ranges: Text, URL
	 */
	private String _artMedium;
	
	public String getArtMedium() throws ClassCastException{
		return (String) _artMedium;
	}
	
	public void setArtMedium(String value) throws ClassCastException{
		_artMedium = value;
	}
	/**
	* The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc.
	 *
	 * Ranges: URL, Text
	 */
	private String _artworkSurface;
	
	public String getArtworkSurface() throws ClassCastException{
		return (String) _artworkSurface;
	}
	
	public void setArtworkSurface(String value) throws ClassCastException{
		_artworkSurface = value;
	}
	/**
	* e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc.
	 *
	 * Ranges: Text, URL
	 */
	private String _artform;
	
	public String getArtform() throws ClassCastException{
		return (String) _artform;
	}
	
	public void setArtform(String value) throws ClassCastException{
		_artform = value;
	}
	/**
	* The number of copies when multiple copies of a piece of artwork are produced - e.g. for a limited edition of 20 prints, 'artEdition' refers to the total number of copies (in this example "20").
	 *
	 * Ranges: Text, Integer
	 */
	private Object _artEdition;
	
	public <T> T getArtEdition(Class<T> c) throws ClassCastException{
		return (T) _artEdition;
	}
	
	public void setArtEdition(String value) throws ClassCastException{
		_artEdition = value;
	}
	public void setArtEdition(Integer value) throws ClassCastException{
		_artEdition = value;
	}
	/**
	* The depth of the item.
	 *
	 * Ranges: QuantitativeValue, Distance
	 */
	private Object _depth;
	
	public <T> T getDepth(Class<T> c) throws ClassCastException{
		return (T) _depth;
	}
	
	public void setDepth(QuantitativeValue value) throws ClassCastException{
		_depth = value;
	}
	public void setDepth(Distance value) throws ClassCastException{
		_depth = value;
	}
	/**
	* A material used as a surface in some artwork, e.g. Canvas, Paper, Wood, Board, etc.
	 *
	 * Ranges: URL, Text
	 */
	private String _surface;
	
	public String getSurface() throws ClassCastException{
		return (String) _surface;
	}
	
	public void setSurface(String value) throws ClassCastException{
		_surface = value;
	}
	/**
	* The width of the item.
	 *
	 * Ranges: Distance, QuantitativeValue
	 */
	private Object _width;
	
	public <T> T getWidth(Class<T> c) throws ClassCastException{
		return (T) _width;
	}
	
	public void setWidth(Distance value) throws ClassCastException{
		_width = value;
	}
	public void setWidth(QuantitativeValue value) throws ClassCastException{
		_width = value;
	}
	/**
	* The height of the item.
	 *
	 * Ranges: Distance, QuantitativeValue
	 */
	private Object _height;
	
	public <T> T getHeight(Class<T> c) throws ClassCastException{
		return (T) _height;
	}
	
	public void setHeight(Distance value) throws ClassCastException{
		_height = value;
	}
	public void setHeight(QuantitativeValue value) throws ClassCastException{
		_height = value;
	}
}
