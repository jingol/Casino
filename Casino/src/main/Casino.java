/**
 * 
 */
package main;

import gui.GUIapp;

/**
 * @author Jason Lau
 *
 */
public class Casino extends GUIapp {

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
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see gui.GUIapp#initScreen()
	 */
	@Override
	public void initScreen() {
		// TODO Auto-generated method stub

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
