/**
 * 
 */
package bingo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiCompononets.Visible;
import guiScreens.ClickableScreen;

/**
 * @author Sharon
 *publ
 */
public class BingoScreenSharon extends ClickableScreen implements Runnable{
public static ArrayList<Integer> randBingoNum;
private SquaresInterfaceSharonWong[] squares;

	/**
	 * @param width
	 * @param height
	 */
	public BingoScreenSharon(int width, int height) {
		super(width, height);
		
		Thread bingoBegin = new Thread(this);
		bingoBegin.start();
	}

	/* (non-Javadoc)
	 * @see guiScreens.ClickableScreen#initAllObjects(java.util.List)
	 */
	@Override
	public void initAllObjects(ArrayList<Visible> square) {
		addSquares(square);
	}

	private void addSquares(ArrayList<Visible> square) {
		//create ArrayList of the squares on the bingo board
		int numberOfSquares = 25;
		squares = new SquaresInterfaceSharonWong[numberOfSquares];
		//place all squares
				for(int i =0; i < numberOfSquares; i++){
					squares[i] = getASquare();
					final SquaresInterfaceSharonWong b = squares[i];
				
				}
				
	}

	/* (non-Javadoc)
	 * @see gui.Screen#initObjects(java.util.ArrayList)
	 */
	@Override
	public void initObjects(ArrayList<Visible> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	private SquaresInterfaceSharonWong getASquare() {
		return null;
		//return new Square();
	}

	@Override
	public void initAllObjects(List<Visible> arg0) {
		// TODO Auto-generated method stub
		
	}

}
