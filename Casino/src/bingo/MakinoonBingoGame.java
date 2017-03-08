package bingo;
/*
 * Makinoon Sami
 */
import java.util.ArrayList;

public class MakinoonBingoGame extends GUIApplication{
	public MakinoonBingoBoard userBoard;
	public MakinoonBingoBoard aiBoard;
	public static BingoScreenSharon backend;
	public static MakinoonBingoGame bingoGame;
	public static MakinoonDisplay md;
	public static ArrayList<BingoGameHistory> gameHistory; 
	
	
	// all three other games 
	
	
	public MakinoonBingoGame(MakinoonBingoBoard userBoard, MakinoonBingoBoard aiBoard, ArrayList<BingoGameHistory> gameHistory, int width, int height) {
		super(width, height);
		this.bingoGame=this;
		this.userBoard = userBoard;
		this.aiBoard = aiBoard; 
		this.gameHistory = gameHistory;
		
		
		SquareMakinoon[][] userTemp  = userBoard.getGrid();
		SquareMakinoon[][] aiTemp  = aiBoard.getGrid();
		
		for(int r = 0; r < userTemp.length; r++){
			for( int c = 0; c < userTemp[0].length; c++ ){
				md.addObject(userTemp[r][c]);
			}
		}
		for(int r = 0; r < aiTemp.length; r++){
			for( int c = 0; c < aiTemp[0].length; c++ ){
				md.addObject(aiTemp[r][c]);
			}
		}
		
		for(BingoGameHistory x: gameHistory){ 
			md.addGameHistory(x);
		}
		// TODO Auto-generated constructor stub
	}

	public void initScreen() {
		md = new MakinoonDisplay(this.userBoard, this.aiBoard,  this.gameHistory, getWidth(), 
				getHeight());
		setScreen(md); 

	}


	public static void main(String[] args) {
		backend= new BingoScreenSharon();
		MakinoonBingoBoard compBoard = new MakinoonBingoBoard(backend.createAiNumBoard(), 
				backend.createAiBoolBoard(),
				 80, 250, 40);
		MakinoonBingoBoard playerBoard = new MakinoonBingoBoard(backend.createPlayerNumBoard(),
				backend.createPlayerBoolBoard(),
				330, 250, 40);
		ArrayList <BingoGameHistory> gameHistory = new ArrayList<>();
		BingoGameHistory testGame = new BingoGameHistory("Mak", 
				"AI", 10.00, 5.99, 4.01);
		gameHistory.add(testGame); 
		MakinoonBingoGame mbg = new MakinoonBingoGame(compBoard, playerBoard, 
				gameHistory , 1000, 700);
		Thread game = new Thread(mbg); 
		game.start();
		backend.start();

	}

}
