/**
 * 
 */
package texas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import gui.components.Button;
import gui.components.Component;
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
	private Framer buttonFrame;
	private Button fold;
	private Button raise;
	private Button call;
	private Button allIn;
	private Button bet;
	
	private ArrayList<PlayingCard> pile;
	private ArrayList<PlayingCard> deck;
	
	private final int PADDING = 20;
	private final int BHEIGHT = 30;
	private final int BWIDTH = 60;
	private Dealer dealer;
	
	
			
	public Texas(int width, int height) {
		super(width, height);
	}

	@Override
	public void run() {
		//deal hole cards
	}

	

	@Override
	public void initAllObjects(List<Visible> view) {
		bg = new Graphic(0, 0, Casino.WIDTH, Casino.HEIGHT, "images/greenbg.jpg");
		buttonFrame = new Framer(PADDING, 2*PADDING, Casino.WIDTH/4, Casino.HEIGHT/2-PlayingCard.HEIGHT-3*PADDING, Color.BLACK);
		dealer = new Dealer();
		deck = dealer.getDeck();
		view.add(bg);
		view.addAll(deck);
		view.add(buttonFrame);
		fold = new Button(buttonFrame.getX(), buttonFrame.getY(), BWIDTH, BHEIGHT, "fold", Color.green, null);
		view.add(fold);
		call = new Button(buttonFrame.getX()+buttonFrame.getWidth()-BWIDTH, buttonFrame.getY(), BWIDTH, BHEIGHT, "call", Color.green, null);
		view.add(call);
		raise = new Button(buttonFrame.getX()+buttonFrame.getWidth()/2-BWIDTH/2, buttonFrame.getY()+buttonFrame.getHeight()/2-BHEIGHT/2, BWIDTH, BHEIGHT, "raise", Color.green, null);
		view.add(raise);
		bet = new Button(buttonFrame.getX(), buttonFrame.getY()+buttonFrame.getHeight()-BHEIGHT, BWIDTH, BHEIGHT, "bet", Color.green, null);
		view.add(bet);
		allIn = new Button(buttonFrame.getX()+buttonFrame.getWidth()-BWIDTH, buttonFrame.getY()+buttonFrame.getHeight()-BHEIGHT, BWIDTH, BHEIGHT, "All In", Color.green, null);
		view.add(allIn);
		
		for(int i = 0; i<5; i++){	
			PlayingCard c = dealer.millCard();
			view.add(c);
			c.setX(200+c.getX()+100*i);
			c.flipCard();
		}
		
		pile = new ArrayList<PlayingCard>();
	}




		






}
