/**
 * 
 */
package texas;

import java.util.ArrayList;

import gui.components.Visible;
import gui.screens.ClickableScreen;

/**
 * @author Kristy and Ray
 *
 */
public class Texas extends ClickableScreen implements Runnable{

	public Texas(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> view) {
		int x = 53;
		for (int i = 0; i<52;i++ )
		{
			PlayingCard c = new PlayingCard(x,60);
			view.add(c);	
//			x += PlayingCard.WIDTH + 5;
		}
		
	}





}
