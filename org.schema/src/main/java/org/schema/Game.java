package org.schema;
/**
* The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting.
*/
public class Game extends CreativeWork{
	
	
	/**
	* Real or fictional location of the game (or part of game).
	 *
	 * Ranges: PostalAddress, Place, URL
	 */
	private Object _gameLocation;
	
	public <T> T getGameLocation(Class<T> c) throws ClassCastException{
		return (T) _gameLocation;
	}
	
	public void setGameLocation(PostalAddress value) throws ClassCastException{
		_gameLocation = value;
	}
	public void setGameLocation(Place value) throws ClassCastException{
		_gameLocation = value;
	}
	public void setGameLocation(String value) throws ClassCastException{
		_gameLocation = value;
	}
	/**
	* A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage).
	 *
	 * Ranges: Thing
	 */
	private Thing _characterAttribute;
	
	public Thing getCharacterAttribute() throws ClassCastException{
		return (Thing) _characterAttribute;
	}
	
	public void setCharacterAttribute(Thing value) throws ClassCastException{
		_characterAttribute = value;
	}
	/**
	* Indicate how many people can play this game (minimum, maximum, or range).
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _numberOfPlayers;
	
	public QuantitativeValue getNumberOfPlayers() throws ClassCastException{
		return (QuantitativeValue) _numberOfPlayers;
	}
	
	public void setNumberOfPlayers(QuantitativeValue value) throws ClassCastException{
		_numberOfPlayers = value;
	}
	/**
	* An item is an object within the game world that can be collected by a player or, occasionally, a non-player character.
	 *
	 * Ranges: Thing
	 */
	private Thing _gameItem;
	
	public Thing getGameItem() throws ClassCastException{
		return (Thing) _gameItem;
	}
	
	public void setGameItem(Thing value) throws ClassCastException{
		_gameItem = value;
	}
	/**
	* The task that a player-controlled character, or group of characters may complete in order to gain a reward.
	 *
	 * Ranges: Thing
	 */
	private Thing _quest;
	
	public Thing getQuest() throws ClassCastException{
		return (Thing) _quest;
	}
	
	public void setQuest(Thing value) throws ClassCastException{
		_quest = value;
	}
}
