
public class WinnerCondition {
	String[] board = GameBoard.board;

	public boolean isWinner() {
		if (board[0] == board[1] && board[1] == board[2])
	        return false;
		else if (board[3] == board[4] && board[4] == board[5])
	        return false;
		else if (board[6] == board[7] && board[7] == board[8])
	        return false;
		else if (board[0] == board[3] && board[3] == board[6])
	        return false;
		else if (board[1] == board[4] && board[4] == board[7])
	        return false;
		else if (board[2] == board[5] && board[5] == board[8])
	        return false;
		else if (board[0] == board[4] && board[4] == board[8])
	        return false;
		else if (board[2] == board[4] && board[4] == board[6])
	        return false;
		else
			return true;
	}
}
