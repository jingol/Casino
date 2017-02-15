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
 *publ asdf
 */
public class BingoScreenSharon extends ClickableScreen implements Runnable{
public static ArrayList<Integer> randBingoNum;
private SquaresInterfaceSharonWong[] squares;


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
		//create ArrayList of the squares on the bingo board
		int numberOfSquares = 25;
		squares = new SquaresInterfaceSharonWong[numberOfSquares];
		//place all squares
				for(int i =0; i < numberOfSquares; i++){
					squares[i] = getASquare();
					//final SquaresInterfaceSharonWong b = squares[i];
				
				}
				
	}

	@Override
	public void initObjects(ArrayList<Visible> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public  void playerBoardArray() {
		Random randomGenerator = new Random();
		while (.length < ) {

		    int random = randomGenerator .nextInt(4);
		    if (!numbers.contains(random)) {
		        numbers.add(random);
		    }
		}
		/*
		//buttons = new ButtonInterfaceSharonWong[5];
		//code that randomly selects a ButtonInterfaceX
		int rand = (int)(Math.random()*buttons.length);
		//if its equal then select rand again
		while(rand == last){
			rand = (int) (Math.random()*buttons.length);
		}
		last = rand;
		return new Move(buttons[rand]);
		*/
	}
	
	// Generate ball spin of random number : used to check if value of button clicked is this number
	public int randNumBallGenerator(int n)
	{
	    ArrayList<Integer> numBallList = new ArrayList<>();
	    Random random = new Random();

	    for (int i = 0; i < n; i++)
	    {
	    	numBallList.add(random.nextInt(25));
	    }
	    return numBallList.size()-1;
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
