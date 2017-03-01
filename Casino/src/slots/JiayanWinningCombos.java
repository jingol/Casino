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
	 * reward array will contain the multiplier: noc1 = 1.1, noc2 = 1.3/1.5, noc3 = 5, 
	 *loop thru reward array to get final rewards
	 * switching between rounds(boolean?)
	 * 
	 * 
	 *  multiple wins
	 */
	public JiayanWinningCombos() 
	{
		generateReward();	  
	}

	public static boolean checkHorizontalCombo(ArrayList<List<Slotpic>> list)
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
	public static boolean checkVerticalCombo(ArrayList<List<Slotpic>> list)
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
	public static boolean checkDownDiagonalCombo(ArrayList<List<Slotpic>> list)
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
	public static boolean checkUpDiagonalCombo(ArrayList<List<Slotpic>> list)
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
		 if(checkHorizontalCombo(slotsList))
			{
				roundReward = reward[0] * betAmount;
				nextRound =true;
			}
			else 
			{
				if(checkVerticalCombo(slotsList))
				{
					roundReward = reward[3] * betAmount;
					nextRound = true;
				}
				else 
				{
					if(checkDownDiagonalCombo(slotsList) || checkUpDiagonalCombo(slotsList))
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
	public void setRewardHistory(ArrayList<Integer> rewardList) {
		// TODO Auto-generated method stub
		rewardList = rewardHistory;
	}


	
}
