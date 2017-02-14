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
	public ArrayList<Slotpic> slots = SlotScreen.slots;
	public static int [] reward = new int [6];
	private static int roundReward;
	private static int betAmount = MatthewSlots.betAmount;
	public static ArrayList<History>rewardHistory = new ArrayList<History>();
	//
	/**
	 * use constants to store value of a slot image??
	 * reward array will contain the rewards available/multiplier
	 *loop thru reward array to get final rewards
	 * rewards vary depending on nockles' faces
	 * some faces appear more often compared to others
	 *  multiple wins
	 */
	public JiayanWinningCombos() 
	{
		// TODO Auto-generated constructor stub
		
	}
	
	public static boolean checkHorizontal(ArrayList<Slotpic>list)
	{
		
		for(int row=0; row<list.size();row++)
		{
			for(int col=0; col<list.get(0).size();col++)
			{
				if(list.get(row).get(col)==  && list.get(row).get(col-1)==  && list.get(row).get(col+1)== )
				{
					return true;
				}
			}
		}
		
		return false;
	}
	public static boolean checkVertical(ArrayList<Slotpic> list)
	{
		 for(int row = 0; row<list.size(); row++)
			{
				for(int col = 0; col<list.get(0).size(); col++)
				{
					if(list.get(row).get(col)==  && list.get(row-1).get(col)== && list.get(row+1)(col)== )
					{
						return true;
					}
				}
			}
			
		return false;
	}
	public static boolean checkDownDiagonal(ArrayList<Slotpic> list)
	{
		
		//this diagonal is \
		for(int row = 0; row<list.size(); row++)
		{
			for(int col = 0; col<list.get(0).size(); col++)
			{
				if(list.get(row).get(col)==  && list.get(row+1).get(col+1)== && list.get(row+2)(col+2)== )
				{
					return true;
				}
			}
		}
		
		return false;
	}
	public static boolean checkUpDiagonal(ArrayList<Slotpic> list)
	{
		 // this diagonal is /
		for(int row = 0; row<list.size(); row++)
		{
			for(int col = 0; col<list.get(0).size(); col++)
			{
				if(list.get(row).get(col)==  && list.get(row-1).get(col+1)== && list.get(row-2)(col+2)== )
				{
					return true;
				}
			}
		}
		
		return false;  
	}
	public static void generateReward()
	{
			 if(checkHorizontal(ArrayList<Slotpic> slots))
			{
				roundReward = reward[0] * betAmount;
				// rewardHistory.add(roundReward);
			}
			else 
			{
				if(checkVertical(ArrayList<Slotpic> slots))
				{
					roundReward = reward[3] * betAmount;
				}
				else 
				{
					if(checkDownDiagonal(ArrayList<Slotpic> slots) || checkUpDiagonal(ArrayList<Slotpic> slots))
					{
						roundReward = reward[6] * betAmount;
					}
				}
		}
	}
}
