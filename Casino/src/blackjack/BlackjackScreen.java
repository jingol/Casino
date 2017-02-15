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
		for(int i = 0; i < 4; i++){
			viewObjects.add(button[i]);
		}
		hand = new ArrayList<CardInterface>();
		score = new TextArea(130, 230, 300, 40, getScore());
		hand.add(drawCard());
		hand.add(drawCard());
		viewObjects.add(score);
		for(int i = 0; i < hand.size(); i++){
			
		}
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
		buttons = new 
		buttons[1];
		
		
	}


	public void drawBackground(Graphics2D g){
		g.setColor(Color.green);
		g.fillRect(0, 0, getWidth(), getHeight());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
