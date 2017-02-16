/**
 * 
 */
package texas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import gui.components.Button;
import gui.components.Graphic;
import gui.components.Visible;
import gui.screens.ClickableScreen;
import main.Casino;

/**
 * @author Kristy and Ray
 *
 */

public class Texas extends ClickableScreen implements Runnable{
	private Graphic bg;
	
	private Button fold;
	private Button raise;
	private Button call;
	private Button allIn;
	private Button bet;
	
	private Dealer dealer;
	
	private ArrayList<PlayingCard> deck;
			
	public Texas(int width, int height) {
		super(width, height);
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(List<Visible> view) {
		bg = new Graphic(0, 0, Casino.WIDTH, Casino.HEIGHT, "images/greenbg.jpg");
		view.add(bg);
		
		dealer = new Dealer();
		deck = dealer.getDeck();
		view.addAll(deck);
		
		
		fold = new Button(60, 175, 75, 50, "fold", Color.green, null);
		view.add(fold);
		
		call = new Button(60, 225, 75, 50, "call", Color.green, null);
		view.add(call);
		
		raise = new Button(60, 275, 75, 50, "raise", Color.green, null);
		view.add(raise);
		
		bet = new Button(60, 325, 75, 50, "bet", Color.green, null);
		view.add(bet);
		
		allIn = new Button(60, 375, 75, 50, "All In", Color.green, null);
		view.add(allIn);
	}




		






}
