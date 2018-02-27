package org.schema;
/**
* A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device.
*/
public interface IVideoGame extends IGame, ISoftwareApplication{
	
	
	/**
	 * Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time.
	 *
	 */
	
	public GamePlayMode getPlayMode() throws ClassCastException;
	
	public void setPlayMode(GamePlayMode value) throws ClassCastException;
	/**
	 * The server on which  it is possible to play the game.
	 *
	 */
	
	public GameServer getGameServer() throws ClassCastException;
	
	public void setGameServer(GameServer value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirector() throws ClassCastException;
	
	public void setDirector(Person value) throws ClassCastException;
	/**
	 * The trailer of a movie or tv/radio series, season, episode, etc.
	 *
	 */
	
	public VideoObject getTrailer() throws ClassCastException;
	
	public void setTrailer(VideoObject value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActor() throws ClassCastException;
	
	public void setActor(Person value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActors() throws ClassCastException;
	
	public void setActors(Person value) throws ClassCastException;
	/**
	 * Links to tips, tactics, etc.
	 *
	 */
	
	public CreativeWork getGameTip() throws ClassCastException;
	
	public void setGameTip(CreativeWork value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirectors() throws ClassCastException;
	
	public void setDirectors(Person value) throws ClassCastException;
	/**
	 * Cheat codes to the game.
	 *
	 */
	
	public CreativeWork getCheatCode() throws ClassCastException;
	
	public void setCheatCode(CreativeWork value) throws ClassCastException;
	/**
	 * The composer of the soundtrack.
	 *
	 */
	
	public <T> T getMusicBy(Class<T> c) throws ClassCastException;
	
	public void setMusicBy(MusicGroup value) throws ClassCastException;
	public void setMusicBy(Person value) throws ClassCastException;
	/**
	 * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
	 *
	 */
	
	public <T> T getGamePlatform(Class<T> c) throws ClassCastException;
	
	public void setGamePlatform(String value) throws ClassCastException;
	public void setGamePlatform(Thing value) throws ClassCastException;
}
