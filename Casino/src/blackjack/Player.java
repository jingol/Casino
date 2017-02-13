package blackjack;

import java.util.ArrayList;
import java.util.List;

import guiCompononets.TextArea;
import guiCompononets.Visible;
import guiScreens.ClickableScreen;
/*
 * David Szymanski
 */
public class Player extends ClickableScreen implements Runnable{
	
	private TextArea score;
	private ArrayList<CardInterface> hand; 
	private ButtonInterface[] button;

	public Player(int width, int height) {
		super(width, height);
		Thread bj = new Thread(this);
		bj.start();
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(List<Visible> arg0) {
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		addButtons(viewObjects);
		for(int i = 0; i < 4; i++){
			viewObjects.add(button[i]);
		}
		hand = new ArrayList<CardInterface>();
		score = new TextArea(130, 230, 300, 40, getScore());
		hand.add(drawCard());
		hand.add(drawCard());
		
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
		
	}


}
