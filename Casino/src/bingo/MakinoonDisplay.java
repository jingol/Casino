package bingo;

import java.util.ArrayList;
import java.util.List;

import guiCompononets.Visible;
import guiScreens.ClickableScreen;

/**
 * @author Makinoon
 */
public class MakinoonDisplay extends ClickableScreen implements Runnable {
	
	private MakinoonBingoBoard userBoard; 
	
	public MakinoonDisplay(MakinoonBingoBoard userBoard, 
			int width, int height) {
		
		super(width, height);
		
		this.userBoard = userBoard; 
		
		 
		Thread app = new Thread(this);
		
		app.start();
	}

	

	@Override
	public void initAllObjects(List<Visible> lst) {
		SquareMakinoon[][] grid = userBoard.getGrid();
		
		for(int r = 0 ; r < grid.length; r++ ){ 
			for(int c = 0; c < grid[0].length; c ++){ 
				lst.add(grid[r][c]);
			}
		}
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void initObjects(ArrayList<Visible> ) {
		super.initObjects(lst);
		
	}

	
}