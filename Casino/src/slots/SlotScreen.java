package slots;

import java.util.ArrayList;

import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public abstract class SlotScreen extends ClickableScreen implements Runnable {
	
	public static ArrayList<Slotpic> slots;
	private static gui.components.Button button1;
	private static gui.components.Button button2;
	private static gui.components.Button button3;
	private static gui.components.Button start;
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
		title = new TextLabel(350,220,100,40,"Slots");

	}
	
	
	
	public void spin(){
		
	}
	
	public void update(){
		
	}

}
