package org.schema;
/**
* A video game series.
*/
public class VideoGameSeries extends CreativeWorkSeries{
	
	
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
	* An episode of a TV/radio series or season.
	 *
	 * Ranges: Episode
	 */
	private Episode _episodes;
	
	public Episode getEpisodes() throws ClassCastException{
		return (Episode) _episodes;
	}
	
	public void setEpisodes(Episode value) throws ClassCastException{
		_episodes = value;
	}
	/**
	* An episode of a tv, radio or game media within a series or season.
	 *
	 * Ranges: Episode
	 */
	private Episode _episode;
	
	public Episode getEpisode() throws ClassCastException{
		return (Episode) _episode;
	}
	
	public void setEpisode(Episode value) throws ClassCastException{
		_episode = value;
	}
	/**
	* A season in a media series.
	 *
	 * Ranges: CreativeWorkSeason
	 */
	private CreativeWorkSeason _seasons;
	
	public CreativeWorkSeason getSeasons() throws ClassCastException{
		return (CreativeWorkSeason) _seasons;
	}
	
	public void setSeasons(CreativeWorkSeason value) throws ClassCastException{
		_seasons = value;
	}
	/**
	* A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 * Ranges: Person
	 */
	private Person _directors;
	
	public Person getDirectors() throws ClassCastException{
		return (Person) _directors;
	}
	
	public void setDirectors(Person value) throws ClassCastException{
		_directors = value;
	}
	/**
	* The number of episodes in this season or series.
	 *
	 * Ranges: Integer
	 */
	private Integer _numberOfEpisodes;
	
	public Integer getNumberOfEpisodes() throws ClassCastException{
		return (Integer) _numberOfEpisodes;
	}
	
	public void setNumberOfEpisodes(Integer value) throws ClassCastException{
		_numberOfEpisodes = value;
	}
	/**
	* The number of seasons in this series.
	 *
	 * Ranges: Integer
	 */
	private Integer _numberOfSeasons;
	
	public Integer getNumberOfSeasons() throws ClassCastException{
		return (Integer) _numberOfSeasons;
	}
	
	public void setNumberOfSeasons(Integer value) throws ClassCastException{
		_numberOfSeasons = value;
	}
	/**
	* Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time.
	 *
	 * Ranges: GamePlayMode
	 */
	private GamePlayMode _playMode;
	
	public GamePlayMode getPlayMode() throws ClassCastException{
		return (GamePlayMode) _playMode;
	}
	
	public void setPlayMode(GamePlayMode value) throws ClassCastException{
		_playMode = value;
	}
	/**
	* The composer of the soundtrack.
	 *
	 * Ranges: MusicGroup, Person
	 */
	private Object _musicBy;
	
	public <T> T getMusicBy(Class<T> c) throws ClassCastException{
		return (T) _musicBy;
	}
	
	public void setMusicBy(MusicGroup value) throws ClassCastException{
		_musicBy = value;
	}
	public void setMusicBy(Person value) throws ClassCastException{
		_musicBy = value;
	}
	/**
	* The trailer of a movie or tv/radio series, season, episode, etc.
	 *
	 * Ranges: VideoObject
	 */
	private VideoObject _trailer;
	
	public VideoObject getTrailer() throws ClassCastException{
		return (VideoObject) _trailer;
	}
	
	public void setTrailer(VideoObject value) throws ClassCastException{
		_trailer = value;
	}
	/**
	* The production company or studio responsible for the item e.g. series, video game, episode etc.
	 *
	 * Ranges: Organization
	 */
	private Organization _productionCompany;
	
	public Organization getProductionCompany() throws ClassCastException{
		return (Organization) _productionCompany;
	}
	
	public void setProductionCompany(Organization value) throws ClassCastException{
		_productionCompany = value;
	}
	/**
	* The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
	 *
	 * Ranges: URL, Thing, Text
	 */
	private Object _gamePlatform;
	
	public <T> T getGamePlatform(Class<T> c) throws ClassCastException{
		return (T) _gamePlatform;
	}
	
	public void setGamePlatform(String value) throws ClassCastException{
		_gamePlatform = value;
	}
	public void setGamePlatform(Thing value) throws ClassCastException{
		_gamePlatform = value;
	}
	/**
	* Cheat codes to the game.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _cheatCode;
	
	public CreativeWork getCheatCode() throws ClassCastException{
		return (CreativeWork) _cheatCode;
	}
	
	public void setCheatCode(CreativeWork value) throws ClassCastException{
		_cheatCode = value;
	}
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
	* A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 * Ranges: Person
	 */
	private Person _director;
	
	public Person getDirector() throws ClassCastException{
		return (Person) _director;
	}
	
	public void setDirector(Person value) throws ClassCastException{
		_director = value;
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
	/**
	* A season that is part of the media series.
	 *
	 * Ranges: CreativeWorkSeason
	 */
	private CreativeWorkSeason _containsSeason;
	
	public CreativeWorkSeason getContainsSeason() throws ClassCastException{
		return (CreativeWorkSeason) _containsSeason;
	}
	
	public void setContainsSeason(CreativeWorkSeason value) throws ClassCastException{
		_containsSeason = value;
	}
	/**
	* A season in a media series.
	 *
	 * Ranges: CreativeWorkSeason
	 */
	private CreativeWorkSeason _season;
	
	public CreativeWorkSeason getSeason() throws ClassCastException{
		return (CreativeWorkSeason) _season;
	}
	
	public void setSeason(CreativeWorkSeason value) throws ClassCastException{
		_season = value;
	}
	/**
	* An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 * Ranges: Person
	 */
	private Person _actor;
	
	public Person getActor() throws ClassCastException{
		return (Person) _actor;
	}
	
	public void setActor(Person value) throws ClassCastException{
		_actor = value;
	}
	/**
	* An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 * Ranges: Person
	 */
	private Person _actors;
	
	public Person getActors() throws ClassCastException{
		return (Person) _actors;
	}
	
	public void setActors(Person value) throws ClassCastException{
		_actors = value;
	}
}
