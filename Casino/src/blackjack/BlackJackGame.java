package blackjack;

import gui.GUIapp;

/*
 * David Szymanski
 */
public class BlackJackGame extends GUIapp{

	public BlackJackGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static void main(String[] args){
		BlackJackGame bjg = new BlackJackGame(800,500);
		Thread game = new Thread(bjg);
		game.start();
	}



	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		BlackJackScreen bjs = new BlackJackScreen(getHeight(), getWidth());
		setScreen(bjs);
	}
	

}
