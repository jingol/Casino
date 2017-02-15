package bingo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiCasino.screens.Button; 
import guiCasino.screens.Action;
//import gui.sampleGames.MouseFollower;
import guiCasino.screens.TextLabel;
import guiCasino.screens.ClickableScreen;

import guiCompononets.Visible;

/**
 * @author Makinoon
 */
public class MakinoonDisplay extends ClickableScreen implements Runnable {
	
	private MakinoonBingoBoard userBoard; 
	private TextLabel title;
	private Button switchButton; 
	
	
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
		title = 
				new TextLabel(300, 30, 500, 40, "BINGO", Color.BLACK);
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