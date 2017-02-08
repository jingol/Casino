/**
 * 
 */
package texas;

import gui.GUIApplication;

/**
 * @author Kristy L.
 *
 */
public class TexasDemo extends GUIApplication {

	/**
	 * @param width
	 * @param height
	 */
	public TexasDemo(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see gui.GUIApplication#initScreen()
	 */
	@Override
	public void initScreen() {
		Texas screen= new Texas(getWidth(),getHeight());
		setScreen(screen);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TexasDemo demo = new TexasDemo(800,500);
		Thread app = new Thread(demo);
		app.start();
		

	}

}
