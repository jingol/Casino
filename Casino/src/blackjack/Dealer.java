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
	
	/**
	 * dealer passes 2 cards to itself and the player
	 */
	public void initialStart(){
		for(int i = 0; i < 2; i++){
			dealerHand.add(Deck.deck.get(0));
			Deck.deck.remove(0);
//			playerHand.add(Deck.deck.get(0));
//			Deck.deck.remove(0);
		}
	}
	
	/**
	 * adds up all the card values  
	 * @return current total value of cards  
	 */
	public int checkValue(){
		if(dealerPlaying){
			for(int i = 0; i < dealerHand.size(); i++){
				currentTotal += dealerHand.get(0).value;
			}
		}
		return currentTotal;
	}
	
	/**
	 * give card to dealer
	 */
	public void hit(){
		dealerHand.add(Deck.deck.get(0));
		Deck.deck.remove(0);
	}
	
	/**
	 * if 21 or >21 dealerPlaying is false  
	 * if 17+, dealer can take a risk and hit
	 */
	public void stay(){
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
