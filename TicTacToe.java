public class TicTacToe {
	GameBoard gameBoard = new GameBoard();
	String board[] = GameBoard.board;
	WinnerCondition conditions = new WinnerCondition();
	Player playerOne;
	Player playerTwo;

	void startGame() {
		gameBoard.setGameBoard();
		gameBoard.printGameBoard();
		playerOne = new Player(Utility.getString("Enter (X) player name :"));
		playerTwo = new Player(Utility.getString("Enter (0) player name :"));
		
		if (isGameTie()) {
			Utility.print("Game Tie");
		}
		else {
			playerOne.setPlayerSymbol();
			if(playerOne.getPlayerSymbol()=="X")
				Utility.print("The winner is " + playerOne.getPlayerName());
			else
				Utility.print("The winner is " + playerTwo.getPlayerName());
		}
	}

	boolean isGameTie() {
		boolean win = true;
		int count=1;
		while (win) {
			
			if(playerOne.getPlayerSymbol()=="X")
				Utility.print( playerOne.getPlayerName()+"'s Turn :");
			else
				Utility.print( playerTwo.getPlayerName()+"'s Turn :");
			
			int value = Utility.getInt();
			if (isPositionTaken(value)) {
				Utility.printError("Already taken");
				Utility.print("Enter again");
			} else {
				board[value - 1] = playerOne.getPlayerSymbol();
				playerOne.setPlayerSymbol();
				gameBoard.printGameBoard();
				win = conditions.isWinner();
				if (count == 9 && win) {
					return true;
				}
				count++;
			}
		}
		return win;
	}

	boolean isPositionTaken(int value) {
		if (board[value - 1] == "X" || board[value - 1] == "0")
			return true;
		return false;
	}
}
