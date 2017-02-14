package blackjack;

import java.util.ArrayList;

/**
 * @author Kristy Tan
 *
 */

public class Dealer extends DealtHand {

	public ArrayList <Card> dealerHand;
	private int currentTotal = 0;
	public boolean dealerPlaying;
	public int rewards; 
	 
	public Dealer() {
		//need to take bets
		initialStart(); 
		while(dealerPlaying){
			checkValue();
			if(currentTotal == 21 || currentTotal > 21){
				stay();
			}else if(currentTotal < 17){
				hit();
			}
		}
	}

	@Override
	public void hit() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * dealer passes 2 cards to itself and the player
	 */

}
