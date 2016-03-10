import java.util.*;

class TicTacToeTester {
	static TicTacToeBoard board1 = new TicTacToeBoard();
	static Scanner answers = new Scanner(System.in);
	static String answer = "";
	static String player1 = "";
	static String player2 = "";
	static boolean win;
	static String winner = "";
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
		while (win == false) {
			System.out.println("What row do want your X/O placed in?(top, mid, bot)");
		answer = answers.next();
		if (answer.equals("top")) {
			row = 0;
			System.out.println("What row do want your X/O placed in?(left, center, right)");
			answer = answers.next();
			if (answer.equals("left")) {
				col = 0;
			}
			if (answer.equals("center")) {
				col = 1;
			}
			if (answer.equals("right")) {
				col = 2;
			}
			board1.board[row][col] = player1;		
		}
		if (answer.equals("mid")) {
			row = 1;
			System.out.println("What row do want your X/O placed in?(left, center, right)");
			answer = answers.next();
			if (answer.equals("left")) {
				col = 0;
			}
			if (answer.equals("center")) {
				col = 1;
			}
			if (answer.equals("right")) {
				col = 2;
			}
			board1.board[row][col] = player1;		
		}
		if (answer.equals("bot")) {
			row = 2;
			System.out.println("What row do want your X/O placed in?(left, center, right)");
			answer = answers.next();
			if (answer.equals("left")) {
				col = 0;
			}
			if (answer.equals("center")) {
				col = 1;
			}
			if (answer.equals("right")) {
				col = 2;
			}
			board1.board[row][col] = player1;		
		}
		System.out.println(board1.toString());
		checkWin();
		}
		return answer;
	}
	public static boolean checkWin() {
		int letterCount = 0;
		if (win == false) {
			for (int i = 0;i < board1.board.length;i++) {
				for (int j = 0;j < board1.board.length;j++) {
					if (board1.board[i][j] == player1) {
						letterCount++;
						if (letterCount == 3) {
							win = true;
							winner = player1;
						}
					}	
					if (board1.board[i][j] == player2) {
						letterCount++;
						if (letterCount == 3) {
							win = true;
							winner = player2;
						}
					}
					/*if (board1.board[j][i] == player1) {
						letterCount++;	
						if (letterCount == 3) {
							win = true;
							winner = player1;
						}
					}	
					if (board1.board[j][i] == player2) {
						letterCount++;
						if (letterCount == 3) {
							win = true;
							winner = player2;
						}
					}*/
				}
			}
		}
	return win;	
	}


	
	public static void main(String[] args) {
		gameSetup();
		System.out.println(board1.toString());
		gamePlay();
	}
	
}
