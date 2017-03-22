package slots;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;

import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;
import main.Casino;


public class SlotScreen extends ClickableScreen implements Runnable,RewardInterface{
	
	public static ArrayList <ArrayList<Slotpic>> slots;
	private static int[] mirror1 = new int[9];
	private static int[] mirror2 = new int[9];
	private static int[] mirror3 = new int[9];
	private static String[] images1 = new String[9];
	private static String[] images2 = new String[9];
	private static String[] images3 = new String[9];
	
	private static Button button1;
	private static Button button2;
	private static Button button3;
	private static Button start;
	private static Button plus;
	private static Button minus;
	private Graphic bg;
	
	
	private TextLabel title;
	private static TextLabel balance;
	private static TextLabel bet;
	
	private static int betamount = 500;
	
	private Thread barrel1;
	private Thread barrel2;
	private Thread barrel3;
	
	private volatile boolean running = true;

	
	private static Table table;
	
	
	public SlotScreen(int width, int height) {
		super(width, height);
		Thread play = new Thread(this);
		play.start();

		
	}

	@Override
	public void run() {
//		spin();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		
		slots = new ArrayList <ArrayList<Slotpic>>();
		title = new TextLabel(450,20,100,40,"Slots");
		bet = new TextLabel(840,515,100,100,Integer.toString(betamount));
		balance = new TextLabel(10,20,200,40,"Balance:$" + betamount);
		bg = new Graphic(0, 0,1000,800, "resources/back.jpg");
		
		
		plus =  new Button(900,575,40,40,
				"+",Color.BLACK,
				new Action() {
			
			public void act() {
				
			}
		});
		minus =  new Button(775,575,40,40,
				"-",Color.RED,
				new Action() {
			
			public void act() {
				
			}
		});
		button1 = new Button(275,575,100,40,
				"STOP",Color.RED,
				new Action() {
			
			public void act() {
				System.out.println("hah");
				
				
			}
		});
		button2 = new Button(425,575,100,40,
				"STOP",Color.RED,
				new Action() {
			
			public void act() {
				System.out.println("hah");
			}
		});
		button3 = new Button(575,575,100,40,
				"STOP",Color.RED,
				new Action() {
			
			public void act() {
				
			}
		});
		start = new Button(75,375,100,40,
				"Spin!",Color.GREEN,
				new Action() {
			
			public void act() {
				
			}
		});
		
		
		for(int i = 0; i < 3; i++){
			slots.add(new ArrayList<Slotpic>());
		}
		
		addPics();
	

		
		Table table = new Table(0,0,500,800);
		System.out.println("k u");
		viewObjects.add(table);
		
		
		viewObjects.add(bg);
		
		
		viewObjects.add(plus);
		viewObjects.add(minus);
		viewObjects.add(title);
		viewObjects.add(bet);
		viewObjects.add(balance);
		viewObjects.add(start);
		viewObjects.add(button1);
		viewObjects.add(button2);
		viewObjects.add(button3);
		
		
		moveToBack(bg);
		
		
		for(int a = 0; a < 3 ; a++){
			viewObjects.add(slots.get(0).get(a));
			viewObjects.add(slots.get(1).get(a));
			viewObjects.add(slots.get(2).get(a));
		}
		
		populateArrays();
		
		
	
	
	}
	
	
	public void spin(){
		
	}
	
	public void populateArrays(){
		String[] paths = {"evilflow.png","flow.png","noc3.png","java.png","noc1.png","noc2.png","gabe.jpg","cherry.jpg","bar.jpg"};
		for(int i = 0; i < 9; i++){
			mirror1[i] = i;
			mirror2[i] = i;
			mirror3[i] = 1;
			images1[i] = paths[i];
			images2[i] = paths[i];
			images3[i] = paths[i];
		}
	}
	
	private void changeText(String string) {
		bet.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addPics(){
		//there can only be one copy of an image, so  that why the images in other arraylists dont show
		ArrayList<Slotpic> demo = new ArrayList<Slotpic>();
		demo.add(new Slotpic(50,0,100,100,"resources/evilflow.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/flow.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc3.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/java.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc1.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc2.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/gabe.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/cherry.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/bar.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/evilflow.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/flow.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc3.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/java.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc1.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc2.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/gabe.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/cherry.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/bar.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/evilflow.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/flow.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc3.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/java.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc1.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc2.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/gabe.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/cherry.jpg"));
		demo.add(new Slotpic(50,0,100,100,"resources/bar.jpg"));
		int xPos = 290;
		int y = 175;
		int arrayidx = 0;
		int itemidx = 0;
		for(int a = 0; a < 3; a++){
			for(int i = 0; i < 9; i++){
				Slotpic temp = demo.get(itemidx);
				temp.setX(xPos);
				temp.setY(y);
				slots.get(arrayidx).add(temp);
				y += 120;
				itemidx++;
			}
			arrayidx++;
			y = 175;
			xPos += 140;
			
		}

	}
	
	

	@Override
	public ArrayList<Integer> getRewardHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRewardHistory(ArrayList<Integer> rewardList) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	

}
