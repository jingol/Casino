package texas;
//Ray
import java.util.ArrayList;

public class Player extends DealtHand{
	private int money;
	private int x;
	private int y;
	private int width;
	private int height;
	private int playernum;
	private boolean isPlaying;
	
	public Player(int x, int y, int width, int height, int money, int playernum) {
		this.money = money;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.playernum = playernum;
		isPlaying = true;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public int getPlayerNum(){
		return playernum;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public ArrayList<Integer> getTieHand() {
		//the array this method will return has the first index as the value of the win hand 
		//aka if bomb then return the numeric value of the bomb
		//checks the best win condition of the hand
		ArrayList<Integer> tHand = new ArrayList<Integer>();
		ArrayList<PlayingCard> cardHand = getHand();
		int hand = getWinHand();
		String[] suitArr = getSuits();
		int[] values = getFaceValues();
		int a = 0;
		int b = 0;
		String suit = "";
		switch(hand){
		//if its a bomb
		case 7: 
			for(int i = 0; i<values.length-4; i++){
				if(values[i] == values[i+1] && values[i+1] == values[i+2] && values[i+2] == values[i+3]){
					a = values[i];
					break;
				}
			}
			tHand.add(a);
			for(int i = values.length-1; i>-1; i--){
				if(values[i] != a)
					tHand.add(values[i]);
			}
			return tHand;
		//if full house
		case 6:
			for(int i = values.length-1; i>1; i--){
				if(values[i] == values[i-1] && values[i-1] == values[i-2]){
					a = values[i];
					break;
				}
			}
			tHand.add(a);
			for(int i = values.length-1; i>0; i--){
				if(values[i] != a && values[i] == values[i-1]){
					b = values[i];
					break;
				}
			}
			tHand.add(b);
			for(int i = values.length-1; i>-1; i--){
				if(i != a && i != b)
					tHand.add(i);
			}
			return tHand;
		//if flush
		case 5:
			for(int i = 0; i<suitArr.length; i++){
				if(suitArr[i].equals(suitArr[i+1]) && suitArr[i+1].equals(suitArr[i+2]) && suitArr[i+2].equals(suitArr[i+3]) && suitArr[i+3].equals(suitArr[i+4]))
					suit = suitArr[i];
			}
			int count = 0;
			for(int i = cardHand.size()-1; i>-1; i--){
				if(count<5 && cardHand.get(i).getSuit().equals(suit)){
					tHand.add(cardHand.get(i).getCardValue());
				}
			}
			for(int i = cardHand.size()-1; i>-1; i--){
				if(!cardHand.get(i).getSuit().equals(suit))
					tHand.add(cardHand.get(i).getCardValue());
			}
			return tHand;
		//if straight
		case 4:
			for(int i = values.length-1; i>4; i--){
				if(values[i] == values[i-1]+1 && values[i-1] == values[i-2]+1 && values[i-2] == values[i-3]+1 && values[i-3] == values[i-4]+1){
					for(int j = 0; j<5; j++){
						tHand.add(values[i-j]);
					}
				break;
				}
			}
			return tHand;
		//if triple
			case 3: 
				for(int i = values.length-1; i>2; i--){
					if(values[i] == values[i-1] && values[i-1] == values[i-2]){
						a = values[i];
						break;
					}
					tHand.add(a);
				}
				for(int j = values.length-1; j>-1; j--){
					if(values[j] != a)
						tHand.add(values[j]);
				}
				return tHand;
		//if double
			case 2: 
				for(int i = values.length-1; i>1; i--){
					if(values[i] == values[i-1]){
						a = values[i];
						break;
					}
					tHand.add(a);
				}
				for(int j = values.length-1; j>-1; j--){
					if(values[j] != a)
						tHand.add(values[j]);
				}
				return tHand;
		//if hi card
			case 1: 
				for(int i = values.length-1; i>-1; i--){
					tHand.add(values[i]);
				}
				return tHand;
			default: return tHand;
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
