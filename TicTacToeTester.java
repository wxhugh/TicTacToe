import java.util.*;

class TicTacToeTester {
	Scanner p1 = new Scanner(System.in);
	Scanner p2 = new Scanner(System.in);
	Scanner answers = new Scanner(System.in);
	int answer = 0;
	String player1 = "";
	String player2 = "";
	public static String gameSetup() {
		System.out.println("Hello Player One. Do you want to be X or O?(Use X and O)");
		player1 = p1.next();
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
		System.out.println("What row do want your X/O placed in?(Top, Mid, Bot)");
		answer = answers.next();
		if (answer.equals("Top")) {
			System.out.println("What row do want your X/O placed in?(Left, Mid, Right)");
			answer = answers.next();
			
		}



		
	}
	public static void main(String[] args) {
		TicTacToeBoard board1 = new TicTacToeBoard();
		gameSetup();
		System.out.println(board1.toString());
	}
}