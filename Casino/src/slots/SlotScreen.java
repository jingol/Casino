package slots;

import java.awt.Color;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;


public class SlotScreen extends ClickableScreen implements Runnable {
	
	public static ArrayList<Slotpic> slots;
	private static gui.components.Button button1;
	private static gui.components.Button button2;
	private static gui.components.Button button3;
	private static gui.components.Button start;
	private TextLabel title;
	private static TextLabel balance;

	public SlotScreen(int width, int height) {
		super(width, height);
		Thread play = new Thread(this);
		play.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		slots = new ArrayList<Slotpic>();
		title = new TextLabel(350,220,100,40,"Slots");
		button1 = new Button(100,120,200,40,
				"STOP",Color.RED,
				new Action() {
			
			public void act() {
				
				
			}
		});
		button2 = new Button(250,60,200,40,
				"STOP",Color.RED,
				new Action() {
			
			public void act() {
				
				
			}
		});
		button3 = new Button(400,60,200,40,
				"STOP",Color.RED,
				new Action() {
			
			public void act() {
				
				
			}
		});
		
		viewObjects.add(button1);
		viewObjects.add(button2);
		viewObjects.add(button3);
	}
	
	
	
	public void spin(){
		
	}
	
	public void update(){
		
	}

}
