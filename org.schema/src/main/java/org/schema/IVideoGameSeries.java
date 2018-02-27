package org.schema;
/**
* A video game series.
*/
public interface IVideoGameSeries extends ICreativeWorkSeries{
	
	
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
	 * An episode of a TV/radio series or season.
	 *
	 */
	
	public Episode getEpisodes() throws ClassCastException;
	
	public void setEpisodes(Episode value) throws ClassCastException;
	/**
	 * An episode of a tv, radio or game media within a series or season.
	 *
	 */
	
	public Episode getEpisode() throws ClassCastException;
	
	public void setEpisode(Episode value) throws ClassCastException;
	/**
	 * A season in a media series.
	 *
	 */
	
	public CreativeWorkSeason getSeasons() throws ClassCastException;
	
	public void setSeasons(CreativeWorkSeason value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirectors() throws ClassCastException;
	
	public void setDirectors(Person value) throws ClassCastException;
	/**
	 * The number of episodes in this season or series.
	 *
	 */
	
	public Integer getNumberOfEpisodes() throws ClassCastException;
	
	public void setNumberOfEpisodes(Integer value) throws ClassCastException;
	/**
	 * The number of seasons in this series.
	 *
	 */
	
	public Integer getNumberOfSeasons() throws ClassCastException;
	
	public void setNumberOfSeasons(Integer value) throws ClassCastException;
	/**
	 * Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time.
	 *
	 */
	
	public GamePlayMode getPlayMode() throws ClassCastException;
	
	public void setPlayMode(GamePlayMode value) throws ClassCastException;
	/**
	 * The composer of the soundtrack.
	 *
	 */
	
	public <T> T getMusicBy(Class<T> c) throws ClassCastException;
	
	public void setMusicBy(MusicGroup value) throws ClassCastException;
	public void setMusicBy(Person value) throws ClassCastException;
	/**
	 * The trailer of a movie or tv/radio series, season, episode, etc.
	 *
	 */
	
	public VideoObject getTrailer() throws ClassCastException;
	
	public void setTrailer(VideoObject value) throws ClassCastException;
	/**
	 * The production company or studio responsible for the item e.g. series, video game, episode etc.
	 *
	 */
	
	public Organization getProductionCompany() throws ClassCastException;
	
	public void setProductionCompany(Organization value) throws ClassCastException;
	/**
	 * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
	 *
	 */
	
	public <T> T getGamePlatform(Class<T> c) throws ClassCastException;
	
	public void setGamePlatform(String value) throws ClassCastException;
	public void setGamePlatform(Thing value) throws ClassCastException;
	/**
	 * Cheat codes to the game.
	 *
	 */
	
	public CreativeWork getCheatCode() throws ClassCastException;
	
	public void setCheatCode(CreativeWork value) throws ClassCastException;
	/**
	 * Real or fictional location of the game (or part of game).
	 *
	 */
	
	public <T> T getGameLocation(Class<T> c) throws ClassCastException;
	
	public void setGameLocation(PostalAddress value) throws ClassCastException;
	public void setGameLocation(Place value) throws ClassCastException;
	public void setGameLocation(String value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirector() throws ClassCastException;
	
	public void setDirector(Person value) throws ClassCastException;
	/**
	 * The task that a player-controlled character, or group of characters may complete in order to gain a reward.
	 *
	 */
	
	public Thing getQuest() throws ClassCastException;
	
	public void setQuest(Thing value) throws ClassCastException;
	/**
	 * A season that is part of the media series.
	 *
	 */
	
	public CreativeWorkSeason getContainsSeason() throws ClassCastException;
	
	public void setContainsSeason(CreativeWorkSeason value) throws ClassCastException;
	/**
	 * A season in a media series.
	 *
	 */
	
	public CreativeWorkSeason getSeason() throws ClassCastException;
	
	public void setSeason(CreativeWorkSeason value) throws ClassCastException;
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
}
