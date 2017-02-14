package blackjack;

import java.util.ArrayList;

/**
 * @author Kristy Tan
 *
 */

public class Dealer extends DealtHand {

	public static ArrayList <Card> dealerHand;
	private int currentTotal = 0;
	public boolean dealerPlaying;
	public int rewards; 
	 
	public Dealer() {
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
	public int checkValue() {
		if(dealerPlaying){
			for(int i = 0; i < dealerHand.size(); i++){
				currentTotal += dealerHand.get(0).value;
			}
		}
		return currentTotal;
	}

	@Override
	public void hit() {
		dealerHand.add(Deck.deck.get(0));
		Deck.deck.remove(0);
		
	}

	@Override
	public void stay() {
		if(currentTotal == 21 || currentTotal > 21){
			dealerPlaying = false;
		}
		else if(currentTotal >= 17){
			int chance = (int) (Math.random() * 100);
			if(chance >= 75){
				dealerPlaying = true;
			}
			else{
				dealerPlaying = false;
			}
		}
	}
}
