package k;

import java.util.ArrayList;

public class Dealer implements CallInterface {

	public static ArrayList <Card> dealerHand;
	private int currentTotal = 0;
	public boolean dealerPlaying;
	public int finalCTotal;
	public int rewards;
	private PlayerHand playerhand;
	private int secondTotal; 
	 
	public Dealer() {
		dealerHand = new ArrayList <Card>();
		//dealerTurn();
	}
	
	public void dealerTurn(){
		dealerPlaying = true;
		while(dealerPlaying){ //computer plays
			checkValue(); //checkValue
			chance(); //take a chance
		}
		//checkWinner();
	}
	
	public void checkWinner(){
		checkValue();
		if(!dealerPlaying && ! playerhand.getStandCall()){
			if(getTotal() >  playerhand.getPlayerTotal() && getTotal() >  playerhand.get2ndTotal()){
				//computer wins and player loses money
			}
			else if(get2ndTotal() > playerhand.getPlayerTotal() && get2ndTotal() > playerhand.get2ndTotal()){
				//computer wins and player loses money
			}
			else if(getTotal() < playerhand.getPlayerTotal() && get2ndTotal() < playerhand.getPlayerTotal()){

				//player wins and player wins money
			}
			else if(get2ndTotal() < playerhand.get2ndTotal() && getTotal() < playerhand.get2ndTotal()){

				//player wins and player wins money
			}
			else if(getTotal() == playerhand.getPlayerTotal() || getTotal() == playerhand.get2ndTotal() || get2ndTotal() == playerhand.getPlayerTotal() || get2ndTotal() ==playerhand.get2ndTotal()){
				//tie 
			}
		}
	}
	
	public void chance(){
		int chance = (int) (Math.random() * 100);
		if(currentTotal == 21 || secondTotal == 21 || currentTotal > 21 || secondTotal > 21){
			stand();
		}else if(currentTotal < 17 || secondTotal < 17){
			hit();
		}
		else if(currentTotal == 17 || secondTotal == 17){
			if(chance >= 75){
				hit();
			}
			else{
				stand();
			}
		}
		else if(currentTotal == 18 || secondTotal == 18){
			if(chance >= 85){
				hit();
			}
			else{
				stand();
			}
		}
		else if(currentTotal == 19 || secondTotal == 19){
			if(chance >= 90){
				hit();
			}
			else{ 
				stand();
			}
		}
		else if(currentTotal == 20 || secondTotal == 20){
			if(chance >= 95){
				hit();
			}
			else{
				stand();
			}
		} 
	}
	
	@Override 
	public int checkValue() {
		if(dealerPlaying){
			currentTotal = 0;
			secondTotal = 0;
			for(int i = 0; i < dealerHand.size(); i++){
				currentTotal += dealerHand.get(i).value;
				if(dealerHand.get(i).faceValue == "ace"){
					secondTotal += 11;
				}
				else{
					secondTotal += dealerHand.get(i).value;
				}
			}
		}
		set2ndTotal(secondTotal);
		return currentTotal;
	}

	@Override
	public void hit() {
		dealerHand.add(Deck.deck.get(0));
		Deck.deck.remove(0);
	}

	@Override
	public boolean stand() {
		finalCTotal = currentTotal;
		dealerPlaying = false;
		return dealerPlaying;
	}

	@Override
	public boolean getStandCall() {
		// TODO Auto-generated method stub
		return dealerPlaying;
	}

	@Override
	public void setStandCall() {
		dealerPlaying = false;
	}

	@Override
	public int getTotal() {
		return finalCTotal;
	}

	@Override
	public void setTotal() {
		finalCTotal = currentTotal;
	}
	
	public int get2ndTotal(){
		return secondTotal;
		
	}
	
	public void set2ndTotal(int num1){
		secondTotal = num1;
	}
}
