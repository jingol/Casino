package blackjack;

import gui.GUIApplication;


/*
 * David Szymanski
 */
public class BlackJackGame extends GUIApplication{

	public BlackJackGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static void main(String[] args){
		BlackJackGame bjg = new BlackJackGame(1000,800);
		Thread game = new Thread(bjg);
		game.start();
	}



	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		BlackjackScreen bjs = new BlackjackScreen(getHeight(), getWidth());
		setScreen(bjs);
	}
	

}
