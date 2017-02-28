/**
 * 
 */
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
	private Button bet;
	private Button start;
	private TextLabel playerMoney;
	
	private Thread t;
	
	private ArrayList<PlayingCard> pile;
	private ArrayList<PlayingCard> deck;
	private Player[] players;
	private boolean game;
	private int counter = 0;
	
	private final int PADDING = 20;
	private final int BHEIGHT = 30;
	private final int BWIDTH = 60;
	private final int PLAYERS = 4;
	
	
			
	public Texas(int width, int height) {
		super(width, height);
	}

	@Override
	public void run() {
		game = true;
		table.increaseValue(PLAYERS*10);
		changeMoney(10);
		remove(start);
		addObject(fold);
		addObject(call);
		addObject(allIn);
		addObject(raise);
		int iter;
		for(iter = 0; iter<3; iter++){	
			PlayingCard c = dealer.millCard();
			addObject(c);
			c.setX(200+c.getX()+100*iter);
			c.flipCard();
		}
		players[0] = new Player(TexasDemo.WIDTH/5, (int)(TexasDemo.HEIGHT*((double)2/3)), 120, 120, TexasDemo.money, 1);
		for(int p = 1; p<PLAYERS; p++){
			players[p] = new Player(TexasDemo.WIDTH/5+50*p, (int)(TexasDemo.HEIGHT*((double)2/3)), 120, 120, new Random().nextInt(1000)+1000, p+1);
		}
		while(game && iter <5)
		{
			for(int i = 1; i<players.length+1; i++){
				if (i==1)
				{
					showBetButton();
				}
				if (i==2)
				{
					hideBetButton();
				}
				if (i==3)
				{
					
				}
				if(i==4)
				{
					
				}
				iter++;
			}
		}
		
	}
	
	private void showBetButton(){
		addObject(bet);
	}
	
	private void hideBetButton(){
		remove(bet);
	}
	
	private void changeMoney(int change){
		playerMoney.setText("$"+(TexasDemo.money-change));
	}
	
	@Override
	public void initAllObjects(List<Visible> view) {
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
				"Start Texas Hold'em", Color.green,new Action() {
			public void act() {
				t.start();
			}
			});
		view.add(start);
		fold = new Button((int)(TexasDemo.WIDTH*((double)9/10)), 30, BWIDTH, BHEIGHT, "Fold", Color.green,new Action() {
			public void act() {
				game = false;
			}
			});
		
		call = new Button((int)(TexasDemo.WIDTH*((double)9/10)), 60, BWIDTH, BHEIGHT, "Call", Color.green, new Action() {
			public void act() {
				//Player.
			}
			});
		raise = new Button((int)(TexasDemo.WIDTH*((double)9/10)), 90, BWIDTH, BHEIGHT, "Raise", Color.green,new Action() {
			public void act() {
				//Player.
			}
			});
		allIn = new Button((int)(TexasDemo.WIDTH*((double)9/10)), 120, BWIDTH, BHEIGHT, "All In", Color.green,new Action() {
			public void act() {
				table.increaseValue(TexasDemo.money);
				changeMoney(TexasDemo.money);
				
			}
			});
		bet = new Button((int)(TexasDemo.WIDTH*((double)9/10)), 150, BWIDTH, BHEIGHT, "Bet", Color.green,new Action() {
			public void act() {
			}
			});
		pile = new ArrayList<PlayingCard>();
	}




		






}
