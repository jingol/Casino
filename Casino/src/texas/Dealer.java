package texas;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer implements DealerInterface {
	private ArrayList<PlayingCard> deck;
	public Dealer() {
		deck = new ArrayList<PlayingCard>();
		String[] suits = {"spades", "hearts", "clubs", "diamonds"};
		for(int i = 1; i<14; i++){
			for(int j = 0; j<4; j++){
				deck.add(new PlayingCard(50, TexasDemo.HEIGHT/2-PlayingCard.HEIGHT/2, i, suits[j]));
			}
		}
		shuffleDeck();
	}

	public void shuffleDeck(){
		Collections.shuffle(deck);
	}
	
	@Override
	public PlayingCard millCard() {
		return deck.remove(0);
	}

	@Override
	public ArrayList<PlayingCard> getDeck() {
		return deck;
	}

	
}
