package slots;

import java.util.ArrayList;

import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public abstract class SlotScreen extends ClickableScreen implements Runnable {
	
	private static ArrayList<Slotpic> slots;
	private static Button button1;
	private static Button button2;
	private static Button button3;
	private TextLabel title;
	private static TextLabel balance;

	public SlotScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		slots = new ArrayList<Slotpic>();
		

	}
	
	
	
	public void spin(){
		
	}
	
	public void update(){
		
	}

}
