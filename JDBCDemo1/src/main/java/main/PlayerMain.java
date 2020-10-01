package main;

import java.util.List;
import dao.PlayerDAO;
import dao.impl.PlayerDAOImpl;
import model.Player;

public class PlayerMain {

	public static void main(String[] args) {
	
		PlayerDAO dao=new PlayerDAOImpl();
		Player player=new Player(6, "Shivani", 23, "Rockers", "f", "Delhi");
		int c= dao.createPlayer(player);
		if(c==1) {
			System.out.println("Player registerd with below details");
			System.out.println(player);
		}else {
			System.out.println("Failed registration");
		}
		
		
		List<Player> playersList=dao.getAllPlayers();
		System.out.println("\n\nThere are "+playersList.size()+" no of players registered with us.. Below are the details");
		for(Player p:playersList) {
			System.out.println(p);
		}
		
		dao.updatePlayer(1, "CrossvilleTN");
		dao.deletePlayer(4);
	}

}
