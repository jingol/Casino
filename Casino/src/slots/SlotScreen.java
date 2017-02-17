package slots;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;
import main.Casino;


public class SlotScreen extends ClickableScreen implements Runnable {
	
	public static ArrayList<Slotpic> slots;
	private static gui.components.Button button1;
	private static gui.components.Button button2;
	private static gui.components.Button button3;
	private static gui.components.Button start;
	private Graphic bg;
	private TextLabel title;
	private static TextLabel balance;
	private Thread barrel1;
	private Thread barrel;
	private Thread barrel3;
	
	
	public SlotScreen(int width, int height) {
		super(width, height);
		Thread play = new Thread(this);
		play.start();
		
	}

	@Override
	public void run() {
		

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		slots = new ArrayList<Slotpic>();
		title = new TextLabel(450,20,100,40,"Slots");
		balance = new TextLabel(10,20,200,40,"Balance:$0");
		bg = new Graphic(0, 0,1000,800, "resources/back.jpg");
		button1 = new Button(275,575,100,40,
				"STOP",Color.RED,
				new Action() {
			
			public void act() {
				
			}
		});
		button2 = new Button(425,575,100,40,
				"STOP",Color.RED,
				new Action() {
			
			public void act() {
				
			}
		});
		button3 = new Button(575,575,100,40,
				"STOP",Color.RED,
				new Action() {
			
			public void act() {
				
			}
		});
		addPics();
		for(Slotpic p : slots){
			
			viewObjects.add(p);
		}
		moveToBack(bg);
		viewObjects.add(bg);
		viewObjects.add(title);
		viewObjects.add(balance);
		viewObjects.add(button1);
		viewObjects.add(button2);
		viewObjects.add(button3);
		
		
	}
	
	
	public void spin(){
		
	}
	
	public void addPics(){
		ArrayList<Slotpic> demo = new ArrayList<Slotpic>();
		demo.add(new Slotpic(0,0,100,100,"resources/evilflow.png"));
		demo.add(new Slotpic(0,0,100,100,"resources/flow.png"));
		demo.add(new Slotpic(0,0,100,100,"resources/gabe.png"));
		demo.add(new Slotpic(0,0,100,100,"resources/java.png"));
		demo.add(new Slotpic(0,0,100,100,"resources/noc1png"));
		demo.add(new Slotpic(0,0,100,100,"resources/noc2.png"));
		demo.add(new Slotpic(0,0,100,100,"resources/noc3.png"));
		int x = 0;
		int y = 0;
		for(int i = 0; i < 7; i++){
			Slotpic temp = demo.get(i);
			temp.setX(x);
			temp.setY(y);
			slots.add(demo.get(i));
			x += 50;
			y += 50;
		}
		
	}
	
	
	
	

}
