/**
 * 
 */
package texas;

import java.util.ArrayList;

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
		int x = 53;
		for (int i = 0; i<52;i++ )
		{
			PlayingCard c = new PlayingCard(x,60);
			view.add(c);	
//			x += PlayingCard.WIDTH + 5;
		}
		
	}
		






}
