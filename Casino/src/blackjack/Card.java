package blackjack;

/**
 * @author Kristy Tan
 *
 */
 
public class Card {

	public int value;
	public String faceValue;
	public String suit;
	
	public Card(int value, String fValue, String suit) {
		this.value = value;
		this.faceValue = fValue;
		this.suit = suit;
	} 
}
