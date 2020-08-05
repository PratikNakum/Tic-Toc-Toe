public class GameBoard {
	static String[] board = new String[9];
	
	void setGameBoard() {
		for (int i = 0; i < board.length; i++) {
			board[i] = Integer.toString(i+1);
		}
	}
	
	void printGameBoard() {
		System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
		System.out.println("----------");
		System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
		System.out.println("----------");
		System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
	}
}
