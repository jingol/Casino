package bingo;



public class MakinoonBingoGame extends GUIApplication{
	private MakinoonBingoBoard userBoard;
	private static MakinoonBingoGame bingoGame;
	// all three other games 
	
	
	public MakinoonBingoGame(MakinoonBingoBoard userBoard, int width, int height) {
		super(width, height);
		this.userBoard = userBoard; 
		
		// TODO Auto-generated constructor stub
	}

	public void initScreen() {
		MakinoonDisplay md = new MakinoonDisplay(this.userBoard, getWidth(), 
				getHeight());
		setScreen(md); 

	}

	public static void main(String[] args) {
		int[][] testArray = { {0, 0,0,0,0} , {1,1,1,1,1}, {2,2,2,2,2},
				{3,3,3,3,3}, {4,4,4,4,4}};
		MakinoonBingoBoard testBoard = new MakinoonBingoBoard(testArray);
		System.out.println(testBoard.getGrid()[2][1].getNumber()); 
		
		MakinoonBingoGame mbg = new MakinoonBingoGame(testBoard, 800, 800);
		Thread game = new Thread(mbg); 
		game.start();
		

	}

}
