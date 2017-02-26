package bingo;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import guiCasino.screens.Button; 
import guiCasino.screens.Action;
//import gui.sampleGames.MouseFollower;
import guiCasino.screens.TextLabel;
import guiCasino.screens.ClickableScreen;
import guiCompononets.Graphic;
import guiCasino.screens.TextArea;
import guiCompononets.Visible;
import main.Casino;

/**
 * @author Makinoon
 */
public class MakinoonDisplay extends ClickableScreen implements Runnable {
	
	private Graphic bg; 
	private MakinoonBingoBoard userBoard; 
	private TextLabel title;
	private Button startEnd; 
	private Button switchButton1;
	private Button switchButton2; 
	private Button switchButton3; 
	private TextLabel currentBalance;  
	private TextArea currentNumber; 
	private TextArea gameHistoryBox; 
	private BingoBoxText history; 
	private SharonBingoButton sampleButton; 
	
	private ArrayList<BingoGameHistory> gameHistoryList; 
	//private TextArea gameScreen;
	
	
	public MakinoonDisplay(MakinoonBingoBoard userBoard,
			ArrayList<BingoGameHistory> gameHistoryList,
			int width, int height) {
		super(width, height);
		
		System.out.println("this is Makinoon Display" + userBoard);
		this.userBoard = userBoard; 
		this.gameHistoryList = new ArrayList<BingoGameHistory>();
//	SquareMakinoon[][] temp  = userBoard.getGrid();
//		
//		for(int r = 0; r < temp.length; r++){
//			for( int c = 0; c < temp[0].length; c++ ){
//				this.addObject(temp[r][c]);
//			}
//		}
		 
		Thread app = new Thread(this);
		
		app.start();
	}

	



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}







	@Override
	public void initAllObjects(ArrayList<Visible> lst) {
		//super.initObjects(lst);
		bg = new Graphic(0, 0, 1000, 700, "imagesBingo/casinobg.jpg");
		

		lst.add(bg);
		//gameScreen = new TextArea(0, 0, 800, 800, "");
		title = 
				new TextLabel(300, 90, 500, 40, "BINGO", Color.BLACK);
		title.setSize(45);
		title.setFont("Calibri");

		lst.add(title);
		switchButton1 = new Button(30,580,150,40,
				"PLAY SLOTS",Color.GREEN,
				
				new Action() {
			
			public void act() {
				System.out.print(" Button Pressed1! ");
				//Casino.setScreen(Casino.SlotScreen);
			}
		});
		
				lst.add(switchButton1);	
			/* button 2  */	
			switchButton2 = new Button(210,580,195,40,
					"PLAY BLACKJACK",Color.GREEN,
					
					new Action() {
				
				public void act() {
					System.out.print(" Button Pressed2! ");
				}
			});
			
					lst.add(switchButton2);	
				// button3 		
			switchButton3 = new Button(430,580,230,40,
					"PLAY TEXAS HOLD'EM",Color.GREEN,
					
					new Action() {
				
				public void act() {
					//GUIApplication.setScreen(texas.Texas.texas);
				}
			});
			
					lst.add(switchButton3);							
		
					
			startEnd = new Button(30,50,100,50,
					"BEGIN",Color.GREEN,
					
					new Action() {
				
				public void act() {
					System.out.print(" Begin/End ! ");
				}
			});
			
					lst.add(startEnd);	
					
					int rightComponentWidth = 250; 
					
			currentBalance = new TextLabel(500, 80, rightComponentWidth, 50, "CurrentBalance: "
					, Color.BLACK);
			lst.add(currentBalance);
			ArrayList<String> testStrings = new ArrayList<String>();
			testStrings.add("Winner" );
			
			history = new BingoBoxText(500, 220, rightComponentWidth, 250, "History", testStrings, true); 
			lst.add(history);
			
			
			
	}

	public void addGameHistory(BingoGameHistory gameHistory ){ 
		this.gameHistoryList.add(gameHistory); 
		history.addLine(gameHistory.getSummary());
		
	}






	}