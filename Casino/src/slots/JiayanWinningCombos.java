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
public class JiayanWinningCombos{
	public static ArrayList<Slotpic> slots = SlotScreen.slots;
	private boolean nextRound;
	private static int [] rewards = new int [6];
	private static int roundReward;
	private static int prize;
	private static int betAmount = MatthewSlots.betAmount;
	public static ArrayList<int[]> rewardList = new ArrayList<int[]>();
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
	public static boolean checkHorizontal(ArrayList<Slotpic> list)
	{
		
		for(int row=0; row<list.size();row++)
		{
			for(int col=0; col<((List<Slotpic>) list.get(0)).size();col++)
			{ 
				if(((List<Slotpic>) list.get(row)).get(col).equals(((List<Slotpic>) list.get(row)).get(col-1)) && ((List<Slotpic>) list.get(row)).get(col).equals(((List<Slotpic>) list.get(row)).get(col+1)))
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
				for(int col = 0; col<((List<Slotpic>) list.get(0)).size(); col++)
				{
					if(((List<Slotpic>) list.get(row)).get(col).equals(((List<Slotpic>) list.get(row-1)).get(col)) && ((List<Slotpic>) list.get(row)).get(col).equals(((List<Slotpic>) list.get(row+1)).get(col)))
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
			for(int col = 0; col<((List<Slotpic>) list.get(0)).size(); col++)
			{
				if(((List<Slotpic>) list.get(row)).get(col).equals(((List<Slotpic>) list.get(row+1)).get(col+1)) && ((List<Slotpic>) list.get(row)).get(col).equals(list.get(row+2)(col+2)))
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
			for(int col = 0; col<((List<Slotpic>) list.get(0)).size(); col++)
			{
				if(((List<Slotpic>) list.get(row)).get(col).equals(((List<Slotpic>) list.get(row-1)).get(col+1)) && ((List<Slotpic>) list.get(row)).get(col).equals(list.get(row-2)(col+2)))
				{
					return true;
				}
			}
		}
		
		return false;  
	}
	public static void generateReward()
	{
			 if(checkHorizontal(slots))
			{
				roundReward = rewards[0] * betAmount;
				//rewardList.add(roundReward);
			}
			else 
			{
				if(checkVertical( slots))
				{
					roundReward = rewards[3] * betAmount;
				}
				else 
				{
					if(checkDownDiagonal(slots) || checkUpDiagonal( slots))
					{
						roundReward = rewards[6] * betAmount;
					}
				}
		}
	}
	

	
}
