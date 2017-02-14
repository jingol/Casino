/**
 * 
 */
package slots;

import java.util.ArrayList;

/**
 * @author Jiayan
 *
 */
public class JiayanWinningCombos {
	//public ArrayList<>imageList = new ArrayList<>();
	public int [] reward = new int [6];
	private static int betAmount;
	private boolean comboFound = false;
	private static int roundReward;
	//public ArrayList<Reward>RewardHistory = new ArrayList<Reward>(RewardHistory);
	//
	/**
	 * use constants to store value of a slot image?
	 * rewards generated from slot images produced by Jason
	 * multiple wins
	 * rewards vary depending on nockles' faces
	 * some faces appear more often compared to others
	 * 
	 */
	public JiayanWinningCombos() {
		// TODO Auto-generated constructor stub
		roundReward = 0;
	}
	
	public static boolean checkHorizontal()
	{
		
		return false;
	}
	public static boolean checkVertical()
	{
		
		return false;
	}
	public static boolean checkDiagonal()
	{
		
		return false;
	}
	public static void generateReward()
	{
		if(checkHorizontal())
		{
			roundReward = 100 + betAmount;
		}
		else if(checkVertical())
		{
			roundReward = 200 + betAmount;
		}
		else if(checkDiagonal())
		{
			roundReward = 300 + betAmount;
		}
	}
}
