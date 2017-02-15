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
	private ArrayList<PlayingCard> deck;
	private Button fold;
	private Button raise;
	private Button call;
	private Button allIn;
	private Button bet;
			
	public Texas(int width, int height) {
		super(width, height);
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> view) {
		bg = new Graphic(0, 0, Casino.WIDTH, Casino.HEIGHT, "images/greenbg.jpg");
		view.add(bg);
		deck = new ArrayList<PlayingCard>();
		int x = 53;
		String[] suits = {"Spades", "Hearts", "Clovers", "Diamonds"};
		for (int j = 0; j<13;j++)
		{
			for (int k = 0;k<4;k++)
			{
				PlayingCard c = new PlayingCard(53, 53, j, suits[k]);
				deck.add(c);
				view.add(c);
			}
		}
		fold = new Button(60, 70, 75, 50, "fold", Color.green, null);
		view.add(fold);
		
		call = new Button(60, 75, 75, 50, "call", Color.green, null);
		view.add(call);
		
		raise = new Button(60, 80, 75, 50, "raise", Color.green, null);
		view.add(raise);
		
		bet = new Button(60, 85, 75, 50, "bet", Color.green, null);
		view.add(bet);
		
		allIn = new Button(60, 85, 75, 50, "All In", Color.green, null);
		view.add(allIn);
	}

	@Override
	public void initAllObjects(List<Visible> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initObjects(ArrayList<Visible> arg0) {
		// TODO Auto-generated method stub
		
	}




		






}
