import java.util.*;

class TicTacToeBoard {
	private String[][] board;
	public TicTacToeBoard() {
		board = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = "_";
			}
		}
	}
	
	public String toString(){
		return (board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "\n"
		 +  board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "\n" 
		 + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "\n");

	}
}