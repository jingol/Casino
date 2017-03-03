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
	private static Slotpic image;
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
		if(list.get(1).get(0)==list.get(1).get(1) && list.get(1).get(0)==list.get(1).get(2))
			{
			image = list.get(1).get(0);
			return true;
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
					image = list.get(row).get(col);
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
					image = list.get(row).get(col);
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
					image = list.get(row).get(col);
					return true;
				}
			}
		}
		return false;  
	}
	public static void generateReward()
	{
		double nums [] = {0,0.5, 1.00, 1.25, 1.50, 1.75, 2.00, 10};
		int i=0;
		for(double n:nums)
		{
			multipliers[i] += n;
			i++;
		}
		if(checkHorizontalCombo(slotsList)||checkVerticalCombo(slotsList)||checkDownDiagonalCombo(slotsList)||checkUpDiagonalCombo(slotsList))
		{
			if(image.equals("resources/noc1.png"))
			{
				roundReward = multipliers[4]*betAmount;
				rewardHistory.add(roundReward);
				nextRound = true;
			}
			if(image.equals("resources/noc2.png"))
			{
				roundReward = multipliers[7]*betAmount;
				rewardHistory.add(roundReward);
				nextRound = true;
			}
			if(image.equals("resources/noc3.png"))
			{
				roundReward = multipliers[0]*betAmount;
				rewardHistory.add(roundReward);
				nextRound = true;
			}
			if(image.equals("resources/java.jpg"))
			{
				roundReward = multipliers[3]*betAmount;
				rewardHistory.add(roundReward);
				nextRound = true;
			}
			if(image.equals("resources/flow.png"))
			{
				roundReward = multipliers[2]*betAmount;
				rewardHistory.add(roundReward);
				nextRound = true;
			}
			if(image.equals("resources/evilflow.png"))
			{
				roundReward = multipliers[1]*betAmount;
				rewardHistory.add(roundReward);
				nextRound = true;
			}
			if(image.equals("resources/gabe.jpg"))
			{
				roundReward = multipliers[5]*betAmount;
				rewardHistory.add(roundReward);
				nextRound = true;
			}
			if(image.equals("resources/cherry.jpg"))
			{
				roundReward = multipliers[6]*betAmount;
				rewardHistory.add(roundReward);
				nextRound = true;
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
