/**
 * 
 */
package main;

import gui.GUIApplication;
import texas.Texas;
import bingo.MakinoonDisplay;
import slots.SlotScreen;

/**
 * @author Jason Lau
 *
 */
public class Casino extends GUIApplication {
	public static Texas texas;
	public static MakinoonDisplay bingo;
	public static SlotScreen slot;
	/**
	 * STATIC FIELDS
	 */
	public static Casino game;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	/**
	 * @param width
	 * @param height
	 */
	public Casino(int width, int height) {
		super(width, height);
		setTitle("Dat Casino Tho");
	}

	/* (non-Javadoc)
	 * @see gui.GUIapp#initScreen()
	 */
	@Override
	public void initScreen() {
		texas = new Texas(getWidth(), getHeight());
		bingo = new MakinoonDisplay();
		slot = new SlotScreen();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		game = new Casino(800,600);
		Thread play = new Thread(game);
		play.start();
	}

}
