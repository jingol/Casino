/**
 * 
 */
package bingo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import guiCompononets.Visible;
import guiScreens.ClickableScreen;

/**
 * @author Sharon publ asdf
 */
public class BingoScreenSharon extends ClickableScreen implements Runnable {
	// FIELDS

	public static ArrayList<Integer> spinner;
	public static Integer randBingoNum;
	private SquaresInterfaceSharonWong[] squares;

	// 2D array of player board
	public static Integer[][] playerBoard = new Integer[5][5];
	// 2D array of AI board
	public static Integer[][] aiBoard = new Integer[5][5];

	// 2D arrays for checking if clicked, change color
	public static Boolean[][] aiBoolean = new Boolean[5][5];
	public static Boolean[][] playerBoolean = new Boolean[5][5];

	public BingoScreenSharon(int width, int height) {
		super(width, height);

		Thread bingoBegin = new Thread(this);
		bingoBegin.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> square) {
		addSquares(square);
	}

	private void addSquares(ArrayList<Visible> square) {
		// create ArrayList of the squares on the bingo board
		int numberOfSquares = 25;
		squares = new SquaresInterfaceSharonWong[numberOfSquares];
		// place all squares
		for (int i = 0; i < numberOfSquares; i++) {
			squares[i] = getASquare();

			// final SquaresInterfaceSharonWong b = squares[i];
		}
	}

	@Override
	public void initObjects(ArrayList<Visible> view) {
		// TODO Auto-generated method stub

	}

	public int randNumGenerator() { // generates rand num between 1-50
		double rand = Math.random();
		int roll = (int) (51 * rand); // 0 to 50
		return roll + 1; // 1 to 50
	}

	public void initBoards() {
	
		// ArrayList<Visible>values = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 1; i < 51; i++) {
			spinner.add(i);
		}

		for (int i = 0; i < aiBoard.length; i++) {
			for (int j = 0; j < aiBoard[i].length; j++) {
				int randGenSize = spinner.size();
				double rand = Math.random();
				int roll = (int) (randGenSize * rand);
				aiBoard[i][j] = spinner.get(roll);
				spinner.remove(roll);
			}

		}
		for (int i = 0; i < aiBoard.length; i++) {
			for (int j = 0; j < aiBoard[i].length; j++) {
				aiBoolean[i][j] = false;
			}
		}

		for (int i = 1; i < 51; i++) {
			spinner.add(i);
		}

		for (int i = 0; i < playerBoard.length; i++) {
			for (int j = 0; j < playerBoard[i].length; j++) {
				int randGenSize = spinner.size();
				double rand = Math.random();
				int roll = (int) (randGenSize * rand);
				playerBoard[i][j] = spinner.get(roll);
				spinner.remove(roll);
			}

		}
		for (int i = 0; i < playerBoard.length; i++) {
			for (int j = 0; j < playerBoard[i].length; j++) {
				playerBoolean[i][j] = false;
			}
		}
	}



	
/*
	public Integer[][] playerBoardArray() {

		for (int i = 0; i < playerBoard.length; i++) {
			for (int j = 0; j < playerBoard[i].length; j++) {
				// generate random number
				int random = randNumGenerator();
				// check to see if board already contains that number
				for (int x = 0; i < playerBoard.length; x++) {
					for (int y = 0; j < playerBoard[i].length; y++) {
						if (playerBoard[x][y].equals(random)) {
							randNumGenerator();
						}
					}
					playerBoard[i][j] = random;

				}
			}

		}
		return playerBoard;

	}
*/
	// Generate ball spin of random number : used to check if value of button
	// clicked is this number
	
	public int randNumBallGenerator(int n) {
		ArrayList<Integer> numBallList = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			numBallList.add(random.nextInt(25));
		}
		return numBallList.size() - 1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	private SquaresInterfaceSharonWong getASquare() {
		return null;
		// return new Square();
	}

	@Override
	public void initAllObjects(List<Visible> arg0) {
		// TODO Auto-generated method stub

	}

}
