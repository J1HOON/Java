package StarCraft;

import java.util.*;

public class player {
	Random r = new Random();
	
	String player;
	String title;
	int loc;
	
	
	
	public player(String player, String title, int loc) {
		this.player = player;
		this.title = title;
		this.loc = loc;
		
	}

	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLoc() {
		return loc;
	}
	public void setLoc(int loc) {
		this.loc = loc;
	}
}
