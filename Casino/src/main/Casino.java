/**
 * 
 */
package main;

import gui.GUIapp;
import texas.Texas;

/**
 * @author Jason Lau
 *
 */
public class Casino extends GUIapp {
	public static Texas texas;
	/**
	 * STATIC FIELDS
	 */
	public static Casino game;
	
	/**
	 * @param width
	 * @param height
	 */
	public Casino(int width, int height) {
		super(width, height);
	}

	/* (non-Javadoc)
	 * @see gui.GUIapp#initScreen()
	 */
	@Override
	public void initScreen() {
		texas = new Texas(getWidth(), getHeight());
		setScreen(texas);
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
