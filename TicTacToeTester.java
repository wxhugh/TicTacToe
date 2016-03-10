import java.util.*;

class TicTacToeTester {
	static TicTacToeBoard board1 = new TicTacToeBoard();
	static Scanner answers = new Scanner(System.in);
	static String answer = "";
	static String player1 = "";
	static String player2 = "";
	public static String gameSetup() {
		System.out.println("Hello Player One. Do you want to be X or O?(X and O)");
		player1 = answers.next();
		if (player1.equals("X")) {
			player2 = "O";
		}
		else {
			player2 = "X";
		}
		System.out.println("Player 1 is " + player1 + " and Player 2 is " + player2 + ".");
		return player1;
	}
	public static String gamePlay() {
		int row = 0;
		int col = 0;
		System.out.println("What row do want your X/O placed in?(top, mid, bot)");
		answer = answers.next();
		if (answer.equals("top")) {
			row = 0;
			System.out.println("What row do want your X/O placed in?(left, mid, right)");
			answer = answers.next();
			if (answer.equals("left")) {
				col = 0;
			}
			if (answer.equals("mid")) {
				col = 1;
			}
			if (answer.equals("right")) {
				col = 2;
			}
			board1.board[row][col] = player1;		
		}
		if (answer.equals("mid")) {
			row = 0;
			System.out.println("What row do want your X/O placed in?(left, mid, right)");
			answer = answers.next();
			if (answer.equals("left")) {
				col = 0;
			}
			if (answer.equals("mid")) {
				col = 1;
			}
			if (answer.equals("right")) {
				col = 2;
			}
			board1.board[row][col] = player1;		
		}
		if (answer.equals("bot")) {
			row = 0;
			System.out.println("What row do want your X/O placed in?(left, mid, right)");
			answer = answers.next();
			if (answer.equals("left")) {
				col = 0;
			}
			if (answer.equals("mid")) {
				col = 1;
			}
			if (answer.equals("right")) {
				col = 2;
			}
			board1.board[row][col] = player1;		
		}
		System.out.println(board);
		return answer;
		
	}

	}
	public static void main(String[] args) {
		gameSetup();
		System.out.println(board1.toString());
		gamePlay();
	}
}