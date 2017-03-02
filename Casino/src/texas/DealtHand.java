package texas;
//Ray
import java.util.ArrayList;
import java.util.Arrays;

public abstract class DealtHand {
	private ArrayList<PlayingCard> hand;
	private final int HIGH_CARD = 0;
	private final int PAIR = 1;
	private final int TWO_PAIR = 2;
	private final int THREE_OF_KIND = 3;
	private final int STRAIGHT = 4;
	private final int FLUSH = 5;
	private final int FULL_HOUSE = 6;
	private final int BOMB = 7;
	private final int STRAIGHT_FLUSH = 8;
	public DealtHand() {
		setHand(new ArrayList<PlayingCard>());
	}
	public void addCard(PlayingCard c){
		getHand().add(c);
	}
	public void addCard(PlayingCard c, int index){
		getHand().add(index, c);
	}
	public int getWinHand(ArrayList<PlayingCard> pileCards){
		//returns the highest poker hand that can be won given an arraylist and players current hand
		//first get the entire list of cards being used
		ArrayList<PlayingCard> cHand = new ArrayList<PlayingCard>();
		cHand.addAll(getHand());
		cHand.addAll(pileCards);
		//next get the face values of each of them and put them in order to compare
		//also an array for suits is helpful
		int[] faceValues = new int[cHand.size()];
		String[] suits = new String[cHand.size()];
		for(int i = 0; i<faceValues.length; i++){
			faceValues[i] = cHand.get(i).getCardValue();
			suits[i] = cHand.get(i).getSuit();
		}
		Arrays.sort(faceValues);
		//to make checking easier later, check for same suit and check if the values are consecutive
		boolean sameSuit = isSameSuit(suits);
		boolean consecutiveValues = hasAllConsec(faceValues);
		//additionally, check for number of consecutive values
		int consecutives = consecutiveChainOfValues(faceValues);
		//check for straight flush first
		if(sameSuit && consecutiveValues)
			return STRAIGHT_FLUSH;
		if(consecutives == 4)
			return BOMB;
		if(isFullHouse(faceValues))
			return FULL_HOUSE;
		if(sameSuit)
			return FLUSH;
		if(consecutiveValues)
			return STRAIGHT;
		if(consecutives == 3)
			return THREE_OF_KIND;
		if(hasTwoPairs(faceValues))
			return TWO_PAIR;
		if(consecutives == 2)
			return PAIR;
		return HIGH_CARD;
	}
	public ArrayList<PlayingCard> getHand() {
		return hand;
	}
	public void setHand(ArrayList<PlayingCard> hand) {
		this.hand = hand;
	}
	//checks if two pair
	private boolean hasTwoPairs(int[] arr) {
		int pairNum = 0;
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				pairNum++;
				i+=2;
			}
			if(pairNum == 2)
				break;
		}
		return pairNum == 2;
	}
	//checks if full house
	private boolean isFullHouse(int[] arr) {
		for(int i = 0; i<arr.length-4; i++){
			if(arr[i] == arr[i+1] && arr[i+2] == arr[i+3] && arr[i+3] == arr[i+4])
				return true;
		}
		return false;
	}
	private boolean isSameSuit(String[] suits) {
		String compSuit = suits[0];
		for(int i = 1; i<suits.length; i++){
			if(!suits[i].equals(compSuit))
				return false;
		}
		return true;
	}
	//checks if all values in array are consecutive
	private boolean hasAllConsec(int[] arr) {
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i]+1 != arr[i+1]){
				return false;
			}
		}
		return true;
	}
	//checks longest chain of same values
	private int consecutiveChainOfValues(int[] arr){
		int chain = 1;
		int cChain = 0;
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				cChain++;
				if(cChain > chain)
					chain = cChain;
			}
			else cChain = 0;
		}
		return chain;
	}
	abstract ArrayList<PlayingCard> getTieHand();

}
