package org.schema;
/**
* Server that provides game interaction in a multiplayer game.
*/
public class GameServer extends Intangible{
	
	
	/**
	* Number of players on the server.
	 *
	 * Ranges: Integer
	 */
	private Integer _playersOnline;
	
	public Integer getPlayersOnline() throws ClassCastException{
		return (Integer) _playersOnline;
	}
	
	public void setPlayersOnline(Integer value) throws ClassCastException{
		_playersOnline = value;
	}
	/**
	* Status of a game server.
	 *
	 * Ranges: GameServerStatus
	 */
	private GameServerStatus _serverStatus;
	
	public GameServerStatus getServerStatus() throws ClassCastException{
		return (GameServerStatus) _serverStatus;
	}
	
	public void setServerStatus(GameServerStatus value) throws ClassCastException{
		_serverStatus = value;
	}
	/**
	* Video game which is played on this server.
	 *
	 * Ranges: VideoGame
	 */
	private VideoGame _game;
	
	public VideoGame getGame() throws ClassCastException{
		return (VideoGame) _game;
	}
	
	public void setGame(VideoGame value) throws ClassCastException{
		_game = value;
	}
}
