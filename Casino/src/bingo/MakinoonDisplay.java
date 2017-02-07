package bingo;

/**
 * @author Makinoon
 */
public class MakinoonDisplay {
	//arraylist of buttons 
	//draw the board 
	//action for the buttons 
	//see the numbers, clicked - color changes
	
	public MakinoonDisplay() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[][] testArray = { {0, 0,0,0,0} , {1,1,1,1,1}, {2,2,2,2,2},
								{3,3,3,3,3}, {4,4,4,4,4}};
		MakinoonBingoBoard testBoard = new MakinoonBingoBoard(testArray);
		System.out.println(testBoard.getGrid()[2][1].getNumber()); 
		
	}

	
}