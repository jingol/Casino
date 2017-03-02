package k;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class BJScreen extends ClickableScreen implements Runnable {

	private Deck deck1;
	public PlayerHand player1;
	public Dealer dealer1;
	public Button hit;
	public Button stand;
	private Button restart;
	private Graphic name;
	private TextLabel playerCT;
	private Box box;
	private Graphic background;
	public Graphic card1;
	public Graphic card2;
	private Graphic backCard1;
	private Graphic backCard2;
	public int positionCount = 185;
	public int nextRow = 200;
	
	
	public BJScreen(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		
		background = new Graphic(0, 0, 800, 600, "resources/sampleImages/background.jpg");
		viewObjects.add(background);
		
		player1 = new PlayerHand();
		dealer1 = new Dealer();
		deck1 = new Deck();
		
		card1 = new Graphic(100, 200, 60, 80, PlayerHand.hand.get(0).image1);
		card2 = new Graphic(185, 200, 60, 80, PlayerHand.hand.get(1).image1);
		backCard1 = new Graphic(600, 200, 60, 80, "resources/sampleImages/backofcard.png");
		backCard2 = new Graphic(630, 200, 60, 80, "resources/sampleImages/backofcard.png");
		viewObjects.add(card1);
		viewObjects.add(card2);
		viewObjects.add(backCard1);
		viewObjects.add(backCard2);
		
		name = new Graphic(250, 50,	300, 100, "resources/sampleImages/BlackJack.png");
		
		PlayerHand.checkValue(); //adds the values of the first 2 cards

		playerCT = new TextLabel(300, 50, 250, 300, "Your current total is " + PlayerHand.getPlayerTotal()); //text label to show the total
		box = new Box(278, 318, 250, 40, Color.green);

		playerCT = new TextLabel(300, 50, 400, 300, "Your current total is " + PlayerHand.getPlayerTotal()); //text label to show the total
		hit = new Button(20, 350,65,40,"Hit", Color.green, new Action() {
			@Override
			public void act() {
				if(PlayerHand.getStandCall() == true){
					if(PlayerHand.getPlayerTotal() < 21 || PlayerHand.get2ndTotal() < 21){
						PlayerHand.hit();
						positionCount += 85;
						viewObjects.add(new Graphic(positionCount, nextRow, 60, 80, PlayerHand.nextCard().image1));
						checkPosition();
						PlayerHand.checkValue();
						if(PlayerHand.getPlayerTotal() > 21 && PlayerHand.get2ndTotal() > 21){
							//dealer1.checkWinner();
							playerCT.setText("");
							changeText("Your total is over 21. You Lose.");
						}else{
							nextTotal();
						}
					}
				}
			} 
		});
		
		stand = new Button(20,400,65,40,"Stand", Color.green, new Action(){
			public void act(){
				if(PlayerHand.getStandCall() == true){
					PlayerHand.setStandCall();
					dealer1.dealerTurn();
				}
			}
		});
		
		restart = new Button(700, 350, 75, 40, "Restart", Color.green, new Action() {
			public void act(){
				initAllObjects(viewObjects);
			}
		});
		
		viewObjects.add(restart);
		viewObjects.add(box);
		viewObjects.add(name);
		viewObjects.add(hit);
		viewObjects.add(stand);
		viewObjects.add(playerCT);
	}
	
	private void checkPosition(){
		if(positionCount >= 395){
			positionCount = 100;
			nextRow += 100;
		}
	}
	
	private void changeText(String string) {
		playerCT.setText(string);
	}

	public void nextTotal() {
		playerCT.setText("");
		PlayerHand.checkValue();
		if(PlayerHand.getPlayerTotal() != PlayerHand.get2ndTotal()){
			changeText("Your current total is " + PlayerHand.getPlayerTotal() + " or " + PlayerHand.get2ndTotal());
		}else{
			changeText("Your current total is " + PlayerHand.getPlayerTotal());
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}
