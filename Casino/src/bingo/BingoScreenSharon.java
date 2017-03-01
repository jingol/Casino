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
 * @author Sharon
 */
public class BingoScreenSharon{
	// FIELDS

	public static ArrayList<Integer> spinner;
	public static ArrayList<Integer> numBallList;

	//private SquaresInterfaceSharonWong[] squares;

	// 2D array of player board to add numbers
	public static int[][] playerBoard = new int[5][5];
	// 2D array of AI board
	public static int[][] aiBoard = new int[5][5];

	// 2D arrays for checking if clicked, change color
	public static Boolean[][] aiBoolean = new Boolean[5][5];
	public static Boolean[][] playerBoolean = new Boolean[5][5];
	private static ArrayList<BingoGameHistory> gameHistory;

	public BingoScreenSharon(){
		spinner= new ArrayList<Integer>();
		numBallList= new ArrayList<Integer>();
		gameHistory= new ArrayList<BingoGameHistory>();
	}

	public int randNumGenerator(int s) { 
		//random.nextInt(max - min + 1) + min
	
		Random rand = new Random();
		int roll= rand.nextInt(s+1);
		
		return roll; //if s=50, this GENERATES NUM BETWEEN 0-50
	}
	
	public int[][] createAiNumBoard(){
		for (int i = 1; i < 51; i++) {
			spinner.add(i);
		}

		for (int i = 0; i < aiBoard.length; i++) {
			for (int j = 0; j < aiBoard[i].length; j++) {
				int randGenSize = spinner.size();
				int roll = randNumGenerator(randGenSize-1); // get a random index from current length to choose from
				
				aiBoard[i][j] = spinner.get(roll);
				spinner.remove(roll);
			}

		}
		return aiBoard;
		
	}
	public Boolean[][] createAiBoolBoard(){
		for (int i = 0; i < aiBoolean.length; i++) {
			for (int j = 0; j < aiBoolean[i].length; j++) {
				aiBoolean[i][j] = false;
			}
		}
		return aiBoolean;
	}
	
	public int[][] createPlayerNumBoard(){
		for (int i = 1; i < 51; i++) {
			spinner.add(i);
		}

		for (int i = 0; i < playerBoard.length; i++) {
			for (int j = 0; j < playerBoard[i].length; j++) {
				int randGenSize = spinner.size();
				int roll = randNumGenerator(randGenSize-1); // get a random index from current length to choose from
				
				playerBoard[i][j] = spinner.get(roll);
				spinner.remove(roll);
			}

		}
		return playerBoard;
	}
	public Boolean[][] createPlayerBoolBoard(){
		for (int i = 0; i < playerBoolean.length; i++) {
			for (int j = 0; j < playerBoolean[i].length; j++) {
				playerBoolean[i][j] = false;
			}
		}
		return playerBoolean;
	}
/*
	public void initBoards() {	
	}
*/	
	public void initBingoCage(){ //add 50 balls to bingo cage
		for (int i = 1; i < 51; i++) {
			numBallList.add(i);
		}
	}
	
	public int randNumBallGenerator() {//Once a number ball is called, it is removed from the bingo cage.
		//ArrayList<Integer> numBallList = new ArrayList<>();
		/*
		for (int i = 1; i < 51; i++) {
			numBallList.add(i);
		}
		*/
		int numsLeft= numBallList.size();
		int randomIndex= randNumGenerator(numsLeft-1);
		
		int spinResult= numBallList.get(randomIndex);
		numBallList.remove(randomIndex);
		return spinResult;
	}

	public void drawNumbers() {
		MakinoonBingoGame.md.showNumber(randNumBallGenerator());
		
	}
	
}

