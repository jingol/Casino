/**
 * 
 */
package bingo;

import gui.GUIapp;
import main.Casino;

/**
 * @author Sharon
 *
 */
public class BingoDemo extends GUIapp {

	/**
	 * @param width
	 * @param height
	 */
	public BingoDemo(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see gui.GUIapp#initScreen()
	 */
	@Override
	public void initScreen() {
		BingoScreenSharon bingo = new BingoScreenSharon(getWidth(),getHeight());
		setScreen(bingo);

	}
	public static void main(String[] args){
		BingoDemo game = new BingoDemo (800,600);
		Thread play = new Thread(game);
		play.start();
	}
	
}
