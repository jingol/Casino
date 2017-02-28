/**
 * 
 */
package slots;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiayan
 *
 */

public class JiayanWinningCombos implements RewardInterface{
	public static ArrayList<List<Slotpic>> slotsList = SlotScreen.slots;
	private static boolean nextRound;
	private static int [] reward = new int [6];
	private static int roundReward;
	private static int betAmount = MatthewSlots.betAmount;
	public static ArrayList<Integer>rewardHistory = new ArrayList<Integer>();
	//
	/**
	 * reward array will contain the rewards available/multiplier(has to be decided on)
	 *loop thru reward array to get final rewards
	 * switching between rounds(boolean?)
	 * 
	 * 
	 *  multiple wins
	 */
	public JiayanWinningCombos() 
	{
		// TODO Auto-generated constructor stub
		  
	}
	public static boolean checkHorizontal(ArrayList<List<Slotpic>> list)
	{
		for(int row=0; row<list.size();row++)
		{
			for(int col=0; col<list.get(0).size();col++)
			{
				if(list.get(row).get(col)==list.get(row).get(col-1) && list.get(row).get(col)==list.get(row).get(col+1))
				{
					return true;
				}
			}
		}
		
		return false;
	}
	public static boolean checkVertical(ArrayList<List<Slotpic>> list)
	{
		for(int row = 0; row<list.size(); row++)
		{
			for(int col = 0; col<list.get(0).size(); col++)
			{
				if(list.get(row).get(col)==list.get(row-1).get(col) && list.get(row).get(col)==list.get(row+1).get(col))
				{
					return true;
				}
			}
		}
		
	return false;
	}
	public static boolean checkDownDiagonal(ArrayList<List<Slotpic>> list)
	{
		//this diagonal is \
				for(int row = 0; row<list.size(); row++)
				{
					for(int col = 0; col<list.get(0).size(); col++)
					{
						if(list.get(row).get(col)==(list.get(row+1).get(col+1)) && list.get(row).get(col)==list.get(row+2).get(col+2))
						{
							return true;
						}
					}
				}
				
				return false;
	}
	public static boolean checkUpDiagonal(ArrayList<List<Slotpic>> list)
	{
		 // this diagonal is /
		for(int row = 0; row<list.size(); row++)
		{
			for(int col = 0; col<list.get(0).size(); col++)
			{
				if(list.get(row).get(col)==(list.get(row-1).get(col+1)) && list.get(row).get(col)==list.get(row-2).get(col+2))
				{
					return true;
				}
			}
		}
		
		return false;  
	}
	public static void generateReward()
	{
		 if(checkHorizontal(slotsList))
			{
				roundReward = reward[0] * betAmount;
				nextRound =true;
			}
			else 
			{
				if(checkVertical(slotsList))
				{
					roundReward = reward[3] * betAmount;
					nextRound = true;
				}
				else 
				{
					if(checkDownDiagonal(slotsList) || checkUpDiagonal(slotsList))
					{
						roundReward = reward[6] * betAmount;
						nextRound = true;
					}
				}
		}
	}
	

	@Override
	public ArrayList<Integer> getRewardHistory() {
		// TODO Auto-generated method stub
		return rewardHistory;
	}

	@Override
	public ArrayList<Integer> setRewardHistory() {
		// TODO Auto-generated method stub
		//rewardHistory =;
	}

	
}
