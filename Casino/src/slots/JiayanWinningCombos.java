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
	public static ArrayList<ArrayList<Slotpic>> slotsList = SlotScreen.slots;
	private static boolean nextRound;
	private static int [] multipliers = new int [6];
	private static int roundReward;
	private static int betAmount = MatthewSlots.betAmount;
	public static ArrayList<Integer>rewardHistory;  
	
	public JiayanWinningCombos() 
	{
		rewardHistory = new ArrayList<Integer>();
		generateReward();
	}
	public static boolean checkHorizontalCombo(ArrayList<ArrayList<Slotpic>> list)
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
	public static boolean checkVerticalCombo(ArrayList<ArrayList<Slotpic>> list)
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
	public static boolean checkDownDiagonalCombo(ArrayList<ArrayList<Slotpic>> list)
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
	public static boolean checkUpDiagonalCombo(ArrayList<ArrayList<Slotpic>> list)
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
		double nums [] = {0, 1.00, 1.25, 1.50, 1.75, 2.00, 10};
		int i=0;
		for(double n:nums)
		{
			multipliers[i] += n;
			i++;
		}
		if(checkHorizontalCombo(slotsList))
		{
			roundReward = multipliers[1] * betAmount;
			nextRound =true;
		}
		if(checkVerticalCombo(slotsList))
		{
			roundReward = multipliers[5] * betAmount;
			nextRound = true;
		}
		if(checkDownDiagonalCombo(slotsList) || checkUpDiagonalCombo(slotsList))
		{
			roundReward = multipliers[6] * betAmount;
			nextRound = true;
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
