package org.schema;
/**
* The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting.
*/
public interface IGame extends ICreativeWork{
	
	
	/**
	 * Real or fictional location of the game (or part of game).
	 *
	 */
	
	public <T> T getGameLocation(Class<T> c) throws ClassCastException;
	
	public void setGameLocation(PostalAddress value) throws ClassCastException;
	public void setGameLocation(Place value) throws ClassCastException;
	public void setGameLocation(String value) throws ClassCastException;
	/**
	 * A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage).
	 *
	 */
	
	public Thing getCharacterAttribute() throws ClassCastException;
	
	public void setCharacterAttribute(Thing value) throws ClassCastException;
	/**
	 * Indicate how many people can play this game (minimum, maximum, or range).
	 *
	 */
	
	public QuantitativeValue getNumberOfPlayers() throws ClassCastException;
	
	public void setNumberOfPlayers(QuantitativeValue value) throws ClassCastException;
	/**
	 * An item is an object within the game world that can be collected by a player or, occasionally, a non-player character.
	 *
	 */
	
	public Thing getGameItem() throws ClassCastException;
	
	public void setGameItem(Thing value) throws ClassCastException;
	/**
	 * The task that a player-controlled character, or group of characters may complete in order to gain a reward.
	 *
	 */
	
	public Thing getQuest() throws ClassCastException;
	
	public void setQuest(Thing value) throws ClassCastException;
}
