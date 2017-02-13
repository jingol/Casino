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
	private static int roundReward;
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
		
		 for(int row=0; row<slots.size();row++)
		{
			for(int col=0; col<slots.get(0).size();col++)
			{
				if(slots.get(row).get(col)==  && slots.get(row).get(col-1)==  && slots.get(row).get(col+1)== )
				{
					rewardType = 100;
				}
			}
		}
		
		return false;
	}
	public static boolean checkVertical(List<Slotpic>slots)
	{
		 /*for(int row = 0; row<slots.size(); row++)
			{
				for(int col = 0; col<slots.get(0).size(); col++)
				{
					if(slots.get(row).get(col)==  && slots.get(row-1).get(col)== && slots.get(row+1)(col)== )
					{
						rewardType = 200;
					}
				}
			}
			*/
		return false;
	}
	public static boolean checkDownDiagonal(List<Slotpic>slots)
	{
		/*
		 ******* this diagonal is \
		for(int row = 0; row<slots.size(); row++)
		{
			for(int col = 0; col<slots.get(0).size(); col++)
			{
				if(slots.get(row).get(col)==  && slots.get(row+1).get(col+1)== && slots.get(row+2)(col+2)== )
				{
					rewardType = 300;
				}
			}
		}
		*/
		return false;
	}
	public static boolean checkUpDiagonal(List<Slotpic>slots)
	{
		/*
		 ******* this diagonal is /
		for(int row = 0; row<slots.size(); row++)
		{
			for(int col = 0; col<slots.get(0).size(); col++)
			{
				if(slots.get(row).get(col)==  && slots.get(row-1).get(col+1)== && slots.get(row-2)(col+2)== )
				{
					rewardType = 300;
				}
			}
		}
		*/
		return false;
	}
	public static void generateReward()
	{
		roundReward = rewardType * betAmount;
		/* if(checkHorizontal(null))
		{
			
		}
		else 
		{
			if(checkVertical(null))
			{
				
			}
			else 
			{
				if(checkDownDiagonal(null) || checkUpDiagonal(null))
				{
					
				}
			}
		}
		*/
	}
}
