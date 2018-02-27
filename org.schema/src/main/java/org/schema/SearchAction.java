package org.schema;
/**
* <p>The act of searching for an object.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/FindAction">FindAction</a>: SearchAction generally leads to a FindAction, but not necessarily.</li>
</ul>
*/
public class SearchAction extends Action{
	
	
	/**
	* A sub property of instrument. The query used on this action.
	 *
	 * Ranges: Text
	 */
	private String _query;
	
	public String getQuery() throws ClassCastException{
		return (String) _query;
	}
	
	public void setQuery(String value) throws ClassCastException{
		_query = value;
	}
}
