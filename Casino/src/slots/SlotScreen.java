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
import main.BalanceInterface;
import main.Casino;


public class SlotScreen extends ClickableScreen implements Runnable,BalanceInterface,RewardInterface{
	
	public static ArrayList <ArrayList<Slotpic>> slots;
	
	private static Button button1;
	private static Button button2;
	private static Button button3;
	private static Button start;
	private static Button plus;
	private static Button minus
	;
	private Graphic bg;
	
	private TextLabel title;
	private static TextLabel balance;
	private static TextLabel bet;
	
	private static int betamount;
	
	private Thread barrel1;
	private Thread barrel;
	private Thread barrel3;
	
	private volatile boolean running = false;
	
	private static Table table;
	
	
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
		slots = new ArrayList <ArrayList<Slotpic>>();
		title = new TextLabel(450,20,100,40,"Slots");
		bet = new TextLabel(830,435,100,100,Integer.toString(betamount));
		balance = new TextLabel(10,20,200,40,"Balance:$0");
		bg = new Graphic(0, 0,1000,800, "resources/back.jpg");
		plus =  new Button(900,500,40,40,
				"+",Color.BLACK,
				new Action() {
			
			public void act() {
				changeText(Integer.toString(betamount));
			}
		});
		minus =  new Button(775,500,40,40,
				"-",Color.RED,
				new Action() {
			
			public void act() {
				
			}
		});
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
		start = new Button(75,375,100,40,
				"Spin!",Color.PINK,
				new Action() {
			
			public void act() {
				
			}
		});
		
		
		ArrayList<Slotpic> set = new ArrayList<Slotpic>();
		for(int i = 0; i < 3; i++){
			slots.add(set);
			System.out.println("hi");
		}
		
		addPics();
		
		for(int i = 0; i < slots.size(); i++){
			for(int a = 0; a < 9; a++){
				viewObjects.add(slots.get(i).get(a));
			}
		}
	
//		for(int a = 0; a < 3 ; a++){
//			for(int i = 0; i < 3; i++){
//				viewObjects.add(slots.get(a).get(i));
//				System.out.println("meh");
//			}
//			System.out.println("wa");
//		}
//		
		
		
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
	}
	
	
	public void spin(){
		
	}
	
	private void changeText(String string) {
		bet.setText(string);
		
	}
	
	public void addPics(){
		ArrayList<Slotpic> demo = new ArrayList<Slotpic>();
		demo.add(new Slotpic(50,0,100,100,"resources/evilflow.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/flow.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/gabe.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/java.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc1.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc2.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/noc3.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/cherry.png"));
		demo.add(new Slotpic(50,0,100,100,"resources/bar.png"));
		int x = 290;
		int y = 200;
		int arrayidx = 0;
		for(int i = 0; i < 9; i++){
			Slotpic temp = demo.get(i);
			temp.setX(x);
			temp.setY(y);
			slots.get(arrayidx).add(temp);
			y += 110;
			if(i == 2 || i == 5 || i == 8){
				x += 120;
				y = 200;
				arrayidx++;
				System.out.println(arrayidx);
			}
			
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

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBalance(int newBalance) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
