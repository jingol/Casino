/**
 * 
 */
package main;

import gui.GUIApplication;
import k.BJScreen;
import k.Balance;

/**
 * @author Jason Lau
 *
 */
public class Casino extends GUIApplication {

	/**
	 * STATIC FIELDS
	 */
	public static Casino game;
	public static BJScreen bjs;
//	public static BingoScreen bs;
//	public static PokerScreen ps;
//	public static SlotsScreen ss;
	
	/**
	 * @param width
	 * @param height
	 */
	public Casino(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see gui.GUIapp#initScreen()
	 */
	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		bjs = new BJScreen(getWidth(), getHeight());
		//Slots screen initiated
		//Bingo screen initiated
		//Poker screen initiated
		setScreen(bjs);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Balance.setBalance(10000);
		game = new Casino(800,600);
		Thread play = new Thread(game);
		play.start();
	}

}
