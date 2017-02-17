package blackjack;

import java.util.ArrayList;

/**
 * 
 * @author Kristy
 *
 */
 
public class PlayerHand {

	public static ArrayList <Card> hand;
	public static boolean player = true;
	private static int playerTotal = 0;
	public int finalTotal;
	public static Card nextCard;

	public PlayerHand(){
		hand = new ArrayList <Card>();
	}


	public int checkValue() {
		for(int i = 0; i < hand.size(); i++){
			playerTotal += hand.get(0).value;
		}
		setPlayerTotal(playerTotal);
		return playerTotal;
	}
 

	public boolean stand() {
		finalTotal = playerTotal;
		player = false;
		return player;
	}

	public static void hit() {
			hand.add(Deck.deck.get(0));
			nextCard = Deck.deck.get(0);
			Deck.deck.remove(0);
		
	}

	public static Card nextCard(){
		return nextCard;
	}


	public static boolean getStandCall(){
		return player;
		
	}
	
	public static void setStandCall(){
		player = false;
	}
	
	public static int getPlayerTotal() {
		return playerTotal;
	}


	public static void setPlayerTotal(int playerTotal) {
		PlayerHand.playerTotal = playerTotal;
	}
}
