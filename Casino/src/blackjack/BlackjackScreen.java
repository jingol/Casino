package blackjack;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import gui.components.Visible;
import gui.screens.ClickableScreen;
import gui.components.TextArea;


public class BlackjackScreen extends ClickableScreen implements Runnable {

	private TextArea score;
	private TextArea label;
	private ArrayList<CardInterface> hand; 
	private ButtonInterface[] button;
	
	public BlackjackScreen(int width, int height) {
		super(width, height);
		Thread bj = new Thread(this);
		bj.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons(viewObjects);
		for(int i = 0; i < 3; i++){
			viewObjects.add(button[i]);
		}
//		hand = new ArrayList<CardInterface>();
//		score = new TextArea(130, 230, 300, 40, getScore());
//		hand.add(drawCard());
//		hand.add(drawCard());
//		viewObjects.add(score);
//		for(int i = 0; i < hand.size(); i++){
//			
//		}
	}
	
		
	public CardInterface drawCard(){
		return null;
	}
	
	public String getScore() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addButtons(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		buttons = new ButtonInterface[3];
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = getAButton();
		}
		
		buttons[0].setX(50);
		buttons[0].setY(50);
		buttons[0].setText("BINGO");
//		buttons[0].setAction(new Action() { 
//			public void act(){
//				BingoGame.game.setScreen();
//			}
//		});
		buttons[1].setX(130);
		buttons[1].setY(50);
		buttons[1].setText("SLOTS");
//		buttons[1].setAction(new Action() { 
//			public void act(){
//				SlotGame.game.setScreen();
//			}
//	});
		buttons[2].setX(210);
		buttons[2].setY(50);
		buttons[2].setText("POKER");
//		buttons[2].setAction(new Action() { 
//			public void act(){
//				PokerGame.game.setScreen();
//			}
//	});
		viewObjects.add(buttons[0]);
		viewObjects.add(buttons[1]);
		viewObjects.add(buttons[2]);
	}


	private ButtonInterface getAButton() {
		// TODO Auto-generated method stub
		return new Button();;
	}

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		label.setText("BLACKJACK");
//		nextRound();
//	}
//
//	private void nextRound() {
//		// TODO Auto-generated method stub
//		
//	}
}
