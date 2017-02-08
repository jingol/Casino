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
	public void initAllObjects(ArrayList<Visible> v) {
		bg = new Graphic(0, 0, Casino.WIDTH, Casino.HEIGHT, "images/greenbg.jpg");
		v.add(bg);
	}





}
