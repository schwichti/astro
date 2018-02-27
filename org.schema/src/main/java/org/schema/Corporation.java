package org.schema;
/**
* Organization: A business corporation.
*/
public class Corporation extends Organization{
	
	
	/**
	* The exchange traded instrument associated with a Corporation object. The tickerSymbol is expressed as an exchange and an instrument name separated by a space character. For the exchange component of the tickerSymbol attribute, we reccommend using the controlled vocaulary of Market Identifier Codes (MIC) specified in ISO15022.
	 *
	 * Ranges: Text
	 */
	private String _tickerSymbol;
	
	public String getTickerSymbol() throws ClassCastException{
		return (String) _tickerSymbol;
	}
	
	public void setTickerSymbol(String value) throws ClassCastException{
		_tickerSymbol = value;
	}
}
