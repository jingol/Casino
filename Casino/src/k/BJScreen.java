package k;

import java.awt.Color;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;
import main.Casino;

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
	private	Box	card1outline;
	private Box	card2outline;
	private Box back1outline;
	private Box back2outline;
	private Button bingo;
	private Button slots;
	private Button poker;
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
		card1outline = new Box(100,200,60,80, Color.black, false);
		card2 = new Graphic(185, 200, 60, 80, PlayerHand.hand.get(1).image1);
		card2outline = new Box(185,200,60,80, Color.black, false);
		backCard1 = new Graphic(600, 200, 60, 80, "resources/sampleImages/backofcard.png");
		back1outline = new Box(600,200,60,80, Color.black, false);
		backCard2 = new Graphic(630, 200, 60, 80, "resources/sampleImages/backofcard.png");
		back2outline = new Box(630,200,60,80, Color.black, false);
		viewObjects.add(card1);
		viewObjects.add(card1outline);
		viewObjects.add(card2);
		viewObjects.add(card2outline);
		viewObjects.add(backCard1);
		viewObjects.add(back1outline);
		viewObjects.add(backCard2);
		viewObjects.add(back2outline);
		
		name = new Graphic(250, 50,	300, 100, "resources/sampleImages/BlackJack.png");
		
		player1.checkValue(); //adds the values of the first 2 cards

		if(player1.getPlayerTotal() == player1.get2ndTotal()){
			playerCT = new TextLabel(280, 100, 260, 300, "Your current total is " + player1.getPlayerTotal()); //text label to show the total
		}
		else{
			playerCT = new TextLabel(280, 100, 260, 300, "Your current total is " + player1.getPlayerTotal() + " or " + player1.get2ndTotal());
		}
		box = new Box(270, 368, 280, 40, Color.green, true);


		//playerCT = new TextLabel(300, 50, 400, 300, "Your current total is " + PlayerHand.getPlayerTotal()); //text label to show the total
		hit = new Button(20, 350,65,40,"Hit", Color.green, new Action() {
			@Override
			public void act() {
				if(player1.getStandCall() == true){
					if(player1.getPlayerTotal() < 21 || player1.get2ndTotal() < 21){
						PlayerHand.hit();
						positionCount += 85;
						viewObjects.add(new Graphic(positionCount, nextRow, 60, 80, player1.nextCard().image1));
						viewObjects.add(new Box(positionCount, nextRow, 60,80, Color.black, false));
						checkPosition();
						player1.checkValue();
						if(player1.getPlayerTotal() > 21 && player1.get2ndTotal() > 21){
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
				if(player1.getStandCall() == true){
					player1.setStandCall();
//					viewObjects.add(new Graphic(600, 200, 60, 80, dealer1.dealerHand.get(0).image1));
//					viewObjects.add(new Graphic(630, 200, 60, 80, dealer1.dealerHand.get(1).image1));
					dealer1.dealerTurn();
					int pos = 600;
					for(int i = 0; i < dealer1.dealerHand.size(); i++){
						viewObjects.add(new Graphic(pos, 200, 60, 80, dealer1.dealerHand.get(i).image1));
						viewObjects.add(new Box(pos, 200,60, 80, Color.black, false));
						pos += 30;
					}
					dealer1.checkWinner();
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
		
		slots = new Button(50, 500, 65, 40, "Slots", Color.green, new Action() {
			public void act(){
				//Casino.game.setScreen(Casino.ss);
			}
		});
		poker = new Button(130, 500, 65, 40, "Poker", Color.green, new Action() {
			public void act(){
				//Casino.game.setScreen(Casino.ps);
			}
		});
		bingo = new Button(210, 500, 65, 40, "Bingo", Color.green, new Action() {
			public void act(){
				//Casino.game.setScreen(Casino.bs);
			}
		});
		
		viewObjects.add(slots);
		viewObjects.add(poker);
		viewObjects.add(bingo);
		
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
		player1.checkValue();
		if(player1.getPlayerTotal() != player1.get2ndTotal()){
			changeText("Your current total is " + player1.getPlayerTotal() + " or " + player1.get2ndTotal());
		}else{
			changeText("Your current total is " + player1.getPlayerTotal());
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}
