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
	public int[] getFaceValues(){
		int[] faceValues = new int[hand.size()];
		for(int i = 0; i<faceValues.length; i++){
			faceValues[i] = hand.get(i).getCardValue();
		}
		Arrays.sort(faceValues);
		return faceValues;
	}
	public String[] getSuits(){
		String[] suits = new String[hand.size()];
		for(int i = 0; i<suits.length; i++){
			suits[i] = hand.get(i).getSuit();
		}
		Arrays.sort(suits);
		return suits;
	}
	public int getWinHand(){
		//iterate thru "player's hand"
		//get the face values of each of them and put them in order to compare
		//also an array for suits is helpful
		int[] faceValues = getFaceValues();
		System.out.println(Arrays.toString(faceValues));
		String[] suits = getSuits();
		System.out.println(Arrays.toString(suits));
		//to make checking easier later, check for same suit and check if the values are consecutive
		boolean sameSuit = isSameSuit(suits);
		boolean consecutiveValues = hasAllConsec(faceValues);
		//additionally, check for number of consecutive values
		int consecutives = consecutiveChainOfValues(faceValues);
		//check for straight flush first
		//dont need to compare
		if(sameSuit && consecutiveValues)
			return STRAIGHT_FLUSH;
		//dont need to compare
		if(consecutives == 4)
			return BOMB;
		//dont need to compare
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
				i+=1;
			}
			if(pairNum == 2)
				break;
		}
		return pairNum == 2;
	}
	//checks if full house
	private boolean isFullHouse(int[] arr) {
		int trip = 0;
		for(int i = 0; i<arr.length-3; i++){
			if(arr[i] == arr[i+1] && arr[i+1] == arr[i+2]){
				trip = arr[i];
				for(int j = 0; j<arr.length-2; j++){
					if(arr[j] != trip && arr[j] == arr[j+1])
						return true;
				}
			}
		}
		
		return false;
	}
	private boolean isSameSuit(String[] suits) {
		for(int i = 0; i<suits.length-4; i++){
			if(suits[i].equals(suits[i+1]) && suits[i+1].equals(suits[i+2]) && suits[i+2].equals(suits[i+3]) && suits[i+3].equals(suits[i+4]))
				return true;
		}
		return false;
	}
	//checks if has 5 consecutive values
	private boolean hasAllConsec(int[] arr) {
		int consec = 0;
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i]+1 == arr[i+1]){
				consec++;
			}
		}
		return consec == 5;
	}
	//checks longest chain of same values
	private int consecutiveChainOfValues(int[] arr){
		int chain = 1;
		int cChain = 1;
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				cChain++;
				if(cChain > chain)
					chain = cChain;
			}
			else cChain = 1;
		}
		return chain;
	}
	abstract ArrayList<Integer> getTieHand();

}
