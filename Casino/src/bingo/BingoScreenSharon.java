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
	//s=size or length of random
	public int randNumGenerator(int s) { // generates rand num between 1-50
		//double rand = Math.random();
		//int roll = (int) (51 * rand); // 0 to 50
		//return roll + 1; // 1 to 50
		double rand = Math.random();
		int roll = (int) ((s+1) * rand);
		//return roll + 1;
		return roll; //NOW::::GENERATES NUM BETWEEN 0-50
	}

	public void initBoards() {
		
		for (int i = 1; i < 51; i++) {
			spinner.add(i);
		}

		for (int i = 0; i < aiBoard.length; i++) {
			for (int j = 0; j < aiBoard[i].length; j++) {
				int randGenSize = spinner.size();
				int roll = randNumGenerator(randGenSize); // get a random index from current length to choose from
				
				aiBoard[i][j] = spinner.get(roll);
				spinner.remove(roll);
			}

		}
		
		
	/*
		
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
		
		
		*/
		
		for (int i = 0; i < aiBoolean.length; i++) {
			for (int j = 0; j < aiBoolean[i].length; j++) {
				aiBoolean[i][j] = false;
			}
		}

		for (int i = 1; i < 51; i++) {
			spinner.add(i);
		}

		for (int i = 0; i < playerBoard.length; i++) {
			for (int j = 0; j < playerBoard[i].length; j++) {
				int randGenSize = spinner.size();
				int roll = randNumGenerator(randGenSize); // get a random index from current length to choose from
				
				playerBoard[i][j] = spinner.get(roll);
				spinner.remove(roll);
			}

		}
		for (int i = 0; i < playerBoolean.length; i++) {
			for (int j = 0; j < playerBoolean[i].length; j++) {
				playerBoolean[i][j] = false;
			}
		}
	}

	
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
