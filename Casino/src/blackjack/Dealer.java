package blackjack;

import java.util.ArrayList;

/**
 * @author Kristy Tan
 *
 */
public class Dealer {

	public ArrayList <Card> dealerHand;
	private int currentTotal = 0;
	public boolean dealerPlaying;
	
	public Dealer() {
	//dealer passes out initial 2 cards
		for(int i = 0; i < 2; i++){
			dealerHand.add(Deck.deck.get(0));
			Deck.deck.remove(0);
//			playerHand.add(Deck.deck.get(0));
//			Deck.deck.remove(0);
		}
	}
	
	public int checkValue(){
		if(dealerPlaying){
			for(int i = 0; i < dealerHand.size(); i++){
				currentTotal += dealerHand.get(0).value;
			}
		}
		return currentTotal;
	}
	
	public void hit(){
		if(dealerPlaying && currentTotal < 17){
			dealerHand.add(Deck.deck.get(0));
			Deck.deck.remove(0);
		}
		else{
			stay();
		}
	}
	
	public void stay(){
		if(currentTotal > 17 ||  currentTotal > 21){
			dealerPlaying = false;
		}
	}
}
