package blackjack;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import gui.components.Visible;
import gui.screens.ClickableScreen;
import gui.components.Action;
import gui.components.TextArea;


public class BlackjackScreen extends ClickableScreen implements Runnable {

	private TextArea score;
	private TextArea label;
	private ArrayList<CardInterface> hand; 
	private ButtonInterface[] buttons;
	
	public BlackjackScreen(int width, int height) {
		super(width, height);
		Thread bj = new Thread(this);
		bj.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons(viewObjects);
		for(int i = 0; i < 3; i++){
			viewObjects.add(buttons[i]);
		}
//		hand = new ArrayList<CardInterface>();
//		score = new TextArea(130, 230, 300, 40, getScore());
		label = new TextArea(600, 100, 300, 40, "");
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
		int[]x = {50, 130, 210};
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = getAButton();
			buttons[i].setX(x[i]);
			buttons[i].setY(50);
			final ButtonInterface b = buttons[i];
//			if(i == 0){
//				buttons[i].setAction(new Action(){
//					public void act(){
//						
//					}
//				});
//			}
//			if(i == 1){
//			buttons[i].setAction(new Action(){
//				public void act(){
//					
//				}
//			});
//		}
//			if(i == 2){
//			buttons[i].setAction(new Action(){
//				public void act(){
//					
//				}
//			});
//		}
			buttons[i] = b;
			viewObjects.add(b);
		}
		
	}


	private ButtonInterface getAButton() {
		// TODO Auto-generated method stub
		return new Button();
	}



	@Override
	public void run() {
		label.setText("BLACKJACK");
//		nextRound();
	}

//	private void nextRound() {
//		
//	}
}
