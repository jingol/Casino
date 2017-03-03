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
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 800;
	public static int HEIGHT = 500;
	public static int money = 2000;
	public static TexasDemo demo;
	/**
	 * @param width
	 * @param height
	 */
	public TexasDemo(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		Texas screen= new Texas(getWidth(),getHeight());
		setScreen(screen);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		demo = new TexasDemo(WIDTH, HEIGHT);
		Thread app = new Thread(demo);
		app.start();
	}

}
