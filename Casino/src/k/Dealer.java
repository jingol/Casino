package k;

import java.util.ArrayList;

public class Dealer implements CallInterface {

	public static ArrayList <Card> dealerHand;
	private int currentTotal = 0;
	public boolean dealerPlaying;
	public int finalCTotal;
	public int rewards;
	private int secondTotal;
	private String computerWinner; 
	 
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
		if(dealerPlaying == false && PlayerHand.getStandCall() == false){
			if(getTotal() < 22 || get2ndTotal() < 22){
				if(getTotal() >  PlayerHand.getPlayerTotal() && getTotal() >  PlayerHand.get2ndTotal()){
					//computer wins and player loses money
					setWinner("true");
				}
				else if(get2ndTotal() > PlayerHand.getPlayerTotal() && get2ndTotal() > PlayerHand.get2ndTotal()){
					//computer wins and player loses money
					setWinner("true");
				}
				else if(getTotal() < PlayerHand.getPlayerTotal() && get2ndTotal() < PlayerHand.getPlayerTotal()){
					//player wins and player wins money
					setWinner("false");
				}
				else if(get2ndTotal() < PlayerHand.get2ndTotal() && getTotal() < PlayerHand.get2ndTotal()){
					//player wins and player wins money
					setWinner("false");
				}
				else if(getTotal() == PlayerHand.getPlayerTotal() || getTotal() == PlayerHand.get2ndTotal() || 
						get2ndTotal() == PlayerHand.getPlayerTotal() || get2ndTotal() == PlayerHand.get2ndTotal()){
					//tie 
					setWinner("tie");
				}
			}
			else{
				setWinner("false");
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

	@Override
	public String getWinner() {
		return computerWinner;
	}

	@Override
	public void setWinner(String win) {
		computerWinner = win;
	}
}
