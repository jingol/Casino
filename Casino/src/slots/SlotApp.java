package slots;

import gui.GUIApplication;



public class SlotApp extends GUIApplication {

	public SlotApp(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		SlotScreen ss = new SlotScreen(getWidth(),getHeight());
		setScreen(ss);

	}
	
	public static void main(String[] args) {
		SlotApp slot = new SlotApp(1000,800);
		Thread game = new Thread(slot);
		game.start();

	}

}
