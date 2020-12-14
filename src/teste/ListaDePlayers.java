package teste;

import java.util.ArrayList;
import java.util.List;

import character.sheet.data.Player;

public class ListaDePlayers {
	
	private List<Player> players = new ArrayList<Player>();
	
	public ListaDePlayers() {
		
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	public void registerPlayer(Player player) {
		players.add(player);
	}
	
	
	
}
