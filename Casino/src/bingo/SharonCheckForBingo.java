/**
 * 
 */
package bingo;

/**
 * @author Sharon
 *
 */
public class SharonCheckForBingo {
	public static boolean isBingo(boolean[][] board){

	    // horizontalCheck 
	    for (int j = 0; j< board.length ; j++ ){
	        for (int i = 0; i< board[0].length; i++){
	            if (board[i][j] == true && board[i][j+1] == true && board[i][j+2] == true && board[i][j+3] == true && board[i][j+4] == true){
	                System.out.println("BINGO!!!! You Win!!");
	            	return true;
	            }           
	        }
	    }
	    // verticalCheck
	    for (int j = 0; j< board.length ; j++ ){
	        for (int i = 0; i< board[0].length; i++){
	            if (board[i][j] == true && board[i+1][j] == true && board[i+2][j] == true && board[i+3][j] == true && board[i+4][j] == true){
	            	System.out.println("BINGO!!!! You Win!!");
	            	return true;
	            }           
	        }
	    }
	    // positive slope Diagonal
	    for (int i=4; i< board.length; i++){
	        for (int j=0; j<board[0].length; j++){
	            if (board[i][j] == true && board[i-1][j+1] == true && board[i-2][j+2] == true && board[i-3][j+3] == true && board[i-4][j+4] == true)
	            	System.out.println("BINGO!!!! You Win!!");
	            	return true;
	        }
	    }
	    // negative slope Diagonal
	    for (int i=4; i<board.length; i++){
	        for (int j=4; j<board[0].length; j++){
	            if (board[i][j] == true && board[i-1][j-1] == true && board[i-2][j-2] == true && board[i-3][j-3] == true && board[i-4][j-4] == true)
	            	System.out.println("BINGO!!!! You Win!!");
	            	return true;
	        }
	    }
	    System.out.println(" No Bingo ");
	    return false;
	}

}




