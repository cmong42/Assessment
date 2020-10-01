package dao;

import model.Player;

import java.util.List;

public interface PlayerDAO {

	public int createPlayer(Player player) ;
	
	public List<Player> getAllPlayers();
	
	public int updatePlayer(int id,String city);
	
	public void deletePlayer(int id);
}
