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
import guiCompononets.TextArea;
import guiCompononets.Visible;

/**
 * @author Makinoon
 */
public class MakinoonDisplay extends ClickableScreen implements Runnable {
	
	private Graphic bg; 
	private MakinoonBingoBoard userBoard; 
	private TextLabel title;
	private Button switchButton; 
	//private TextArea gameScreen;
	
	
	public MakinoonDisplay(MakinoonBingoBoard userBoard, 
			int width, int height) {
		
		super(width, height);
		
		this.userBoard = userBoard; 
		
		 
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
		bg = new Graphic(0, 0, 800, 800, "imagesBingo/casinobg.jpg");
		

		lst.add(bg);
		//gameScreen = new TextArea(0, 0, 800, 800, "");
		title = 
				new TextLabel(330, 50, 500, 40, "BINGO", Color.BLACK);
		title.setSize(45);
		title.setFont("Calibri");

		lst.add(title);
		switchButton = new Button(400,400,100,100,
				"Play BlackJack",Color.GREEN,
				
				new Action() {
			
			public void act() {
				System.out.print(" Button Pressed! ");
			}
		});
		
				lst.add(switchButton);			
		
//		SquareMakinoon[][] grid = userBoard.getGrid();
//		
//		for(int r = 0 ; r < grid.length; r++ ){ 
//			for(int c = 0; c < grid[0].length; c ++){ 
//				lst.add(grid[r][c]);
//			}
//		}
	}








	}