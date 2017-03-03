/**
 * 
 */
package main;

import gui.GUIApplication;

import k.BJScreen;
import k.Balance;
import texas.Texas;
import slots.SlotScreen;


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
	public static Texas ps;
	public static SlotScreen ss;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	/**
	 * @param width
	 * @param height
	 */
	@Override
	public void initScreen() {

		// TODO Auto-generated method stub
		bjs = new BJScreen(getWidth(), getHeight());
		ss = new SlotScreen(getWidth(), getHeight());
		//Bingo screen initiated
		ps = new Texas(getWidth(), getHeight());
		setScreen(bjs);
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