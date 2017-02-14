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
			chance();
		}
	}
	
	public void chance(){
		int chance = (int) (Math.random() * 100);;
		if(currentTotal == 21 || currentTotal > 21){
			stay();
		}else if(currentTotal < 17){
			hit();
		}
		else if(currentTotal == 17){
			if(chance >= 75){
				hit();
				dealerPlaying = true;
			}
			else{
				stay();
			}
		}
		else if(currentTotal == 18){
			if(chance >= 85){
				hit();
				dealerPlaying = true;
			}
			else{
				stay();
			}
		}
		else if(currentTotal == 19){
			if(chance >= 90){
				hit();
				dealerPlaying = true;
			}
			else{
				stay();
			}
		}
		else if(currentTotal == 20){
			if(chance >= 95){
				hit();
				dealerPlaying = true;
			}
			else{
				stay();
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
		dealerPlaying = false;
	}
}
