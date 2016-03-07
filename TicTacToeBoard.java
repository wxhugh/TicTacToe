import java.util.*;

class TicTacToeBoard {
	Scanner player1 = new Scanner(System.in);
	Scanner player2 = new Scanner(System.in);
	private String[][] board;
	public TicTacToeBoard() {
		board = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = "_";
			}
		}
	}
	public String gameSetup() {
		System.out.println("Hello Player One. Do you want to be X or O?(Use X and O)");
		String answer = player1.next();
		String other = "";
		if (answer == "X") {
			other = "O";
		}
		else {
			other = "X";
		}
		System.out.println("Player 1 is " + answer + " and Player 2 is " + other + ".");
		return answer;
	}
	public String toString(){
		return (board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "\n"
		 +  board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "\n" 
		 + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "\n");

	}
}