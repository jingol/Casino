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
public class JiayanWinningCombos {
	public int [] reward = new int [6];
	private boolean comboFound = false;
	private static int rewardType;
	private static int betAmount = MatthewSlots.betAmount;
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
	public JiayanWinningCombos() 
	{
		// TODO Auto-generated constructor stub
		rewardType = 0;
	}
	
	public static boolean checkHorizontal(List<Slotpic>slots)
	{
		/*
		 for(int row=0; row<slots.size();row++)
		{
			for(int col=0; col<slots.get(0).size();col++)
			{
				if(slots.get(row).get(col)==)
				{
					
				}
			}
		}
		*/
		return false;
	}
	public static boolean checkVertical(List<Slotpic>slots)
	{
		 for(int row = 0; row<slots.size(); row++)
			{
				for(int col = 0; col<slots.get(0).size(); col++)
				{
					if()
					{
						
					}
				}
			}
		return false;
	}
	public static boolean checkDiagonal(List<Slotpic>slots)
	{
		
		return false;
	}
	public static void generateReward()//betAmount)
	{
		if(checkHorizontal(null))
		{
			//roundReward = 100 * betAmount;
		}
		else 
		{
			if(checkVertical(null))
			{
				//roundReward = 200 * betAmount;
			}
			else 
			{
				if(checkDiagonal(null))
				{
					//roundReward = 300 * betAmount;
				}
			}
		}
	}
}
