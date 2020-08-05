
public class Player {
	String playerSymbol="X";
	String playerName;
	
	public Player(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerSymbol() {
		return playerSymbol;
	}

	public void setPlayerSymbol() {
	    if (playerSymbol == "X") {
	        playerSymbol = "O";
	    } else {
	        playerSymbol = "X";
	    }
	}
}
