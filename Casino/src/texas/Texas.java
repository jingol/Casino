package texas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.components.Action;
import gui.screens.ClickableScreen;
import main.Casino;

/**
 * @author Kristy and Ray
 *
 */

public class Texas extends ClickableScreen implements Runnable{
	private Dealer dealer;
	private Graphic bg;
	private Table table;
	private Button fold;
	private Button raise;
	private Button call;
	private Button allIn;
	private Button start;
	private Button done;
	
	private TextLabel[] moneyCounters;
	private TextLabel playerMoney;
	private TextLabel cMoney1;
	private TextLabel cMoney2;
	private TextLabel cMoney3;
	private TextLabel betText;
	
	private Framer[] frames;
	private Framer f1;
	private Framer f2;
	private Framer f3;
	private Framer f4;
	
	private Thread t;
	
	private ArrayList<PlayingCard> pile;
	private ArrayList<PlayingCard> deck;
	private Player[] players;
	private boolean gameRunning;
	private boolean canClick;
	private int roundNum;
	private int betValue;
	
	
	private final int BHEIGHT = 30;
	private final int BWIDTH = 60;
	private final int PLAYERS = 4;
	private final int smallBlind = 10;
	private final int bigBlind = 20;
	private final int CARD_DELAY = 600;
			
	public Texas(int width, int height) {
		super(width, height);
	}

	@Override
	public void run() {
		startGame();
	}

	private void theFlop() {
		betValue = 0;
		betText.setText("$"+betValue);
		for(roundNum = 0; roundNum<3; roundNum++){
			PlayingCard c = dealer.millCard();
			remove(c);
			addObject(c);
			c.shiftCard(200+c.getX()+100*roundNum, c.getY());
			c.flipCard();
			addCardToPlayers(c);
			//maybe delay??
		}
		roundNum++;
		canClick = true;
	}

	private void finalTurn(){
		for(int i = 0; i<PLAYERS; i++){
			if(players[i].isPlaying()){
				//idk ill look at this lator
			}
		}
	}
	private void endGame()
	{
		/*finalScore0 = 0;
		finalScore1 = 0;
		finalScore2 = 0;
		finalScore3 = 0;
		for (int i =0; i<PLAYERS; i++)
		{
			finalScore+i = DealtHand.getWinHand(players[i].getHand()); 
		}
		if (finalScore0 > finalScore1 && finalScore0 > finalScore2 && finalScore0 > finalScore3)
		{
			System.out.println("You win");
			players[0].setMoney(players[0].getMoney()+table.getMoney());
			
		}
		else if (finalScore1 > finalScore0 && finalScore1 > finalScore2 && finalScore1 > finalScore3)
		{
			System.out.println("CPU 1 wins");
			players[1].setMoney(players[1].getMoney()+table.getMoney());
		}
		else if (finalScore2 > finalScore0 &&finalScore2 > finalScore1 &&finalScore2 > finalScore3)
		{
			System.out.println("CPU 2 wins");
			players[2].setMoney(players[2].getMoney()+table.getMoney());
		}
		else if (finalScore3 > finalScore0 && finalScore3 > finalScore1 && finalScore3 > finalScore2)
		{
			System.out.println("CPU 3 wins");
			players[3].setMoney(players[3].getMoney()+ table.getMoney());
		}
		table.money =0;
		// return all cards 
		Dealer.shuffleDeck();// shuffle 
		startGame();*/
	}
	
	private void finalScore(Player p){
		
	}
	
	private void aiTurn()
	{
		/*for (int i =0; i<PLAYERS; i++)
		{
			if (players[i].getMoney() > betValue)
			{
				if(DealtHand.getWinHand(players[i].getHand() =8)
					{ // royal flush; allin
					
					}
				
				else
				if (Dealthand.getWinHand( players[i].getHand())> 5 && DealtHand.getWinHand(players[i].getHand()<7)
					{ // raise; 
					
					}
				else if (DealtHand.getWinHand(players[i].getHand() > 2 && DealtHand.getWinHand(players[i].getHand() < 5) 
						{
							// call
						}
				else if (DealtHand.getWinHand(players[i].getHand()= 1)
						if (betValue > players[i].getMoney()/2)
						{
							//fold
						}
						else
						{
							//call
						}
			}
		}*/
	}
	
	private void flipAllCards(){
		for(int i = 1; i<PLAYERS; i++){
			if(players[i].isPlaying()){
				for(int j = 0; j<players[i].getHand().size(); j++){
					players[i].getHand().get(j).flipCard();
				}
			}
		}
	}
	
	//when round num is 3
	private void startBetting() {
		betValue = 0;
		betText.setText("$"+betValue);
		roundNum++;
		for(int i = 1; i<players.length; i++){
			if(players[i].isPlaying()){
				if(players[i].getMoney() >= betValue)
					deductMoney(i,betValue);
				else
					deductMoney(i,players[i].getMoney());
			}
		}
		showOptions();
		canClick = true;
	}

	//when round num is 4
	private void theTurn(){
		betValue = 0;
		betText.setText("$"+betValue);
		PlayingCard c = dealer.millCard();
		remove(c);
		addObject(c);
		pile.add(c);
		c.shiftCard(200+c.getX()+100*(roundNum-2), c.getY());
		c.flipCard();
		addCardToPlayers(c);
		//add delay later??
		showOptions();
		canClick = true;
	}
	
	//when round num is 5
	private void theRiver(){
		betValue = 0;
		betText.setText("$"+betValue);
		PlayingCard c = dealer.millCard();
		remove(c);
		addObject(c);
		pile.add(c);
		c.shiftCard(200+c.getX()+100*(roundNum-2), c.getY());
		c.flipCard();
		addCardToPlayers(c);
		//add delay later??
		showOptions();
		canClick = true;
	}
	
	private void preflop(){
		//this should make the other two players either raise or call(bet same as last aggressive action or increase bet)
		//kritty go do dis its a player method i think
		roundNum = 2;
		for(int i = 2; i<PLAYERS; i++){
			betValue = bigBlind;
			if(Math.random() <= .2)
				betValue *= 2;
			deductMoney(i, betValue);
		}
		canClick = true;
		roundNum++;
	}
	
	private void forcedBets(){
		deductMoney(0, smallBlind);
		deductMoney(1, bigBlind);
		dealHoleCards();
	}
	
	private void dealHoleCards(){
		for(int i = 0; i<PLAYERS; i++){
			for(int j = 0; j<2; j++){
				PlayingCard c = dealer.millCard();
				addObject(c);
				players[i].addCard(c);
				c.shiftCard(frames[i].getX()+j*20+50, frames[i].getY()+j*20+20);
				try {
					Thread.sleep(CARD_DELAY);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(i == 0)
					c.flipCard();
			}
		}
		preflop();
	}
	
	private void addCardToPlayers(PlayingCard p){
		for(int i = 0; i<PLAYERS; i++){
			players[i].addCard(p);
		}
	}
	
	private void startGame(){
		betValue = 0;
		gameRunning = true;
		canClick = false;
		remove(start);
		
		playerMoney.setX(f1.getX());
		playerMoney.setY(f1.getY()+100);
		players[0] = new Player(TexasDemo.WIDTH/5, (int)(TexasDemo.HEIGHT*((double)2/3)), 120, 120, TexasDemo.money, 1);
		for(int p = 1; p<PLAYERS; p++){
			players[p] = new Player(TexasDemo.WIDTH/5+50*p, (int)(TexasDemo.HEIGHT*((double)2/3)), 120, 120, new Random().nextInt(1000)+1000, p+1);
		}
		cMoney1 = new TextLabel(f2.getX(), f2.getY()+100, TexasDemo.WIDTH/6, TexasDemo.HEIGHT/10, "$"+players[1].getMoney());
		cMoney2 = new TextLabel(f3.getX(), f3.getY()+100, TexasDemo.WIDTH/6, TexasDemo.HEIGHT/10, "$"+players[2].getMoney());
		cMoney3 = new TextLabel(f4.getX(), f4.getY()+100, TexasDemo.WIDTH/6, TexasDemo.HEIGHT/10, "$"+players[3].getMoney());
		addObject(f1);
		addObject(f2);
		addObject(f3);
		addObject(f4);
		addObject(cMoney1);
		addObject(cMoney2);
		addObject(cMoney3);
		moveToFront(playerMoney);
		moneyCounters[0] = playerMoney;
		moneyCounters[1] = cMoney1;
		moneyCounters[2] = cMoney2;
		moneyCounters[3] = cMoney3;
		
		//THESE BUTTONS SHOULD DO SOMETHING DIFFERENT BASED ON ROUND NUM BECAUSE AI GOES AFTER PLAYER
		fold = new Button((int)(TexasDemo.WIDTH*((double)9/10)), 30, BWIDTH, BHEIGHT, "Fold", Color.green,new Action() {
			public void act() {
				if(canClick){
					gameRunning = false;
					removeOptions();
					canClick = false;
				}
			}
			});
		
		call = new Button((int)(TexasDemo.WIDTH*((double)9/10)), 60, BWIDTH, BHEIGHT, "Call", Color.green, new Action() {
			public void act() {
				if(canClick){
					deductMoney(0, betValue);
					removeOptions();
					canClick = false;
					switch(roundNum){
					case 3: startBetting();theFlop(); break;
					case 4: startBetting();theTurn(); break;
					case 5: startBetting();theRiver(); break;
					default: break; 
					}
				}
			}
			});
		raise = new Button((int)(TexasDemo.WIDTH*((double)9/10)), 90, BWIDTH, BHEIGHT, "Raise or Bet", Color.green,new Action() {
			public void act() {
				if(canClick){
					betValue = betValue +50;
					betText.setText("$"+betValue);
				}
			}
			});
		allIn = new Button((int)(TexasDemo.WIDTH*((double)9/10)), 120, BWIDTH, BHEIGHT, "All In", Color.green,new Action() {
			public void act() {
				if(canClick){
					removeOptions();
					canClick = false;
					deductMoney(0, TexasDemo.money);
					if(roundNum == 3){
						startBetting();theFlop();}
					else if(roundNum == 4){
						startBetting();theTurn();
					}
					else if(roundNum == 5){
						startBetting();theRiver();
					}
				}
			}
			});
		done = new Button((int)(TexasDemo.WIDTH*((double)9/10)), 150, BWIDTH, BHEIGHT, "Done Betting", Color.green,new Action() {
			public void act() {
				if(canClick){
					deductMoney(0, betValue);
					removeOptions();
					canClick = false;
					if(roundNum == 3){
						startBetting();theFlop();}
					else if(roundNum == 4){
						startBetting();theTurn();
					}
					else if(roundNum == 5){
						startBetting();theRiver();
					}
				}
			}
			});
		betText = new TextLabel((int)(TexasDemo.WIDTH*((double)9/10))-BWIDTH-20, 90, BWIDTH, BHEIGHT, "$"+betValue);
		showOptions();
		forcedBets();
	}
	
	private void showOptions(){
		addObject(fold);
		addObject(call);
		addObject(allIn);
		addObject(raise);
		addObject(done);
		addObject(betText);
	}
	
	private void removeOptions(){
		remove(fold);
		remove(call);
		remove(allIn);
		remove(raise);
		remove(done);
		remove(betText);
	}
	
	@Override
	public void initAllObjects(List<Visible> view) {
		moneyCounters = new TextLabel[PLAYERS];
		players = new Player[PLAYERS];
		t = new Thread(this);
		bg = new Graphic(0, 0, Casino.WIDTH, Casino.HEIGHT, "images/greenbg.jpg");
		dealer = new Dealer();
		deck = dealer.getDeck();
		view.add(bg);
		view.addAll(deck);
		table = new Table(TexasDemo.WIDTH/2-150, TexasDemo.HEIGHT/6-20, 300, 100);
		view.add(table);
		playerMoney = new TextLabel(10, (int)(TexasDemo.HEIGHT*((double)9/10))-10, TexasDemo.WIDTH/6, TexasDemo.HEIGHT/10, "$"+TexasDemo.money);
		view.add(playerMoney);
		start = new Button(TexasDemo.WIDTH/2, TexasDemo.HEIGHT/2, BWIDTH, BHEIGHT,
				"Start Texas Hold'em COSTS $10", Color.green,new Action() {
			public void act() {
				if(TexasDemo.money >= 10)
				t.start();
			}
			});
		view.add(start);
		pile = new ArrayList<PlayingCard>();
		
		frames = new Framer[4];
		f1 = new Framer(100, 300, 150, 150, new Color(153, 255, 153));
		f2 = new Framer(270, 300, 150, 150, new Color(0, 128, 0));
		f3 = new Framer(440, 300, 150, 150, new Color(153, 255, 153));
		f4 = new Framer(610, 300, 150, 150, new Color(0, 128, 0));
		frames[0] = f1;
		frames[1] = f2;
		frames[2] = f3;
		frames[3] = f4;
		
	}
	private void deductMoney(int playerIndex, int money){
		if(playerIndex == 0)
			TexasDemo.money -= money;
		players[playerIndex].setMoney(players[playerIndex].getMoney()-money);
		moneyCounters[playerIndex].setText("$"+(players[playerIndex].getMoney()));
		table.increaseValue(money);
	}
	





}
