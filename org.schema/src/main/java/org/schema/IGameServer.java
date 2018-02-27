package org.schema;
/**
* Server that provides game interaction in a multiplayer game.
*/
public interface IGameServer extends IIntangible{
	
	
	/**
	 * Number of players on the server.
	 *
	 */
	
	public Integer getPlayersOnline() throws ClassCastException;
	
	public void setPlayersOnline(Integer value) throws ClassCastException;
	/**
	 * Status of a game server.
	 *
	 */
	
	public GameServerStatus getServerStatus() throws ClassCastException;
	
	public void setServerStatus(GameServerStatus value) throws ClassCastException;
	/**
	 * Video game which is played on this server.
	 *
	 */
	
	public VideoGame getGame() throws ClassCastException;
	
	public void setGame(VideoGame value) throws ClassCastException;
}
