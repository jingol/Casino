package bingo;

import java.awt.Color;
import java.util.ArrayList;

/**
 * @author Makinoon
 *
 *
 *
 *Class called BingoBoard 
 *	- All of the functions related to the board, variables
 *	- arraylist of arraylists - 
 *		2D array of squares (another class - class called "square")
 *			- Square implements/extends button - button is the abstract class
 * 
 *	class for entire window - BingoScreen? 
 *	
 */
public class MakinoonBingoBoard {

	/**
	 * 
	 */
	private SquareMakinoon[][] grid = new SquareMakinoon[5][5]; 
	
	
	public MakinoonBingoBoard(int[][] boardNumbers) {
		
		for(int i = 0; i < boardNumbers.length; i ++){ 
			for(int k = 0; k < boardNumbers[0].length; k++){ 
				getGrid() [i][k] = new SquareMakinoon(Color.WHITE, boardNumbers[i][k], 100, 100, 20, 20); 
				
			}
		}
	}


	public SquareMakinoon[][] getGrid() {
		return grid;
	}


	public void setGrid(SquareMakinoon[][] grid) {
		this.grid = grid;
	}
}
