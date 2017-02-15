package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;
import gui.screens.MyScreen;

public class MouseFollower extends GUIApplication {

	//FIELDS
	public static MouseFollower game;//only ONE exists
	public static CoordinateScreen cs;
	public static MyScreen myScreen;
	
	
	public MouseFollower(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		myScreen = new MyScreen(getWidth(), getHeight());
		setScreen(cs);
	}

	public static void main(String[] args) {
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}
