package blackjack;

import java.util.ArrayList;

/**
 * 
 * @author Kristy Tan
 *
 */

public abstract class DealtHand {
	
	public void initialStart(){
		for(int i = 0; i < 2; i++){
			Dealer.dealerHand.add(Deck.deck.get(0));
			Deck.deck.remove(0);
			PlayerHand.hand.add(Deck.deck.get(0));
			Deck.deck.remove(0);
		}
	}
	 
	public abstract int checkValue();
	
	public abstract void hit();
	
	public abstract void stay();
	
}
