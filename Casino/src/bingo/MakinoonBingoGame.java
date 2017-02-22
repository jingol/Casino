package bingo;



public class MakinoonBingoGame extends GUIApplication{
	private MakinoonBingoBoard userBoard;
	private static MakinoonBingoGame bingoGame;
	private static MakinoonDisplay md;
	// all three other games 
	
	
	public MakinoonBingoGame(MakinoonBingoBoard userBoard, int width, int height) {
		super(width, height);
		this.userBoard = userBoard; 
		
		SquareMakinoon[][] temp  = userBoard.getGrid();
		
		for(int r = 0; r < temp.length; r++){
			for( int c = 0; c < temp[0].length; c++ ){
				md.addObject(temp[r][c]);
			}
		}
		// TODO Auto-generated constructor stub
	}

	public void initScreen() {
		md = new MakinoonDisplay(this.userBoard, getWidth(), 
				getHeight());
		setScreen(md); 

	}

	public static void main(String[] args) {
		int[][] testArray = { {0, 0,0,0,0} , {1,1,1,1,1}, {2,2,2,2,2},
				{3,3,3,3,3}, {4,4,4,4,4}};
		MakinoonBingoBoard testBoard = new MakinoonBingoBoard(testArray,
				100, 300, 40);
		
		MakinoonBingoGame mbg = new MakinoonBingoGame(testBoard, 1000, 700);
		Thread game = new Thread(mbg); 
		game.start();
		

	}

}
