package blackjack;

import java.util.ArrayList;

/**
 * @author Kristy Tan
 *
 */

public class Deck {

	public static ArrayList <Card> deck;
	
	public Deck() {
		generateDeck();
		shuffleDeck();
	}
	
	public void generateDeck(){
		String[] faces = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen",  "king"};
		String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
		for(int i = 0; i < 13; i++){
			for(int s = 0; s < 4; s++){
				if(i == 10 || i == 11 || i == 12){
					deck.add(new Card(10, faces[i], suit[s]));
				}else{
					deck.add(new Card(i + 1, faces[i], suit[s]));
				}
			}
		}
	}
	
	public void shuffleDeck(){
		for(int i = 0; i < deck.size(); i++){
			int randNum = (int) (Math.random() * deck.size());
			Card holder = deck.get(randNum);
			deck.set(randNum, deck.get(i));
			deck.set(i, holder);
		}
	}
}