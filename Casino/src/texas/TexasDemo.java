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
		TexasDemo demo = new TexasDemo(WIDTH, HEIGHT);
		Thread app = new Thread(demo);
		app.start();
		

	}

}
