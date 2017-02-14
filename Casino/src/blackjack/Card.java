package blackjack;

import java.awt.image.BufferedImage;

/**
 * @author Kristy Tan
 *
 */
 
public class Card /*extends MovingComponent */implements CardInterface{

	public int value;
	public String faceValue;
	public String suit;
	private int y;
	private int x;
	private int height;
	private int width;
	
	public Card(int value, String fValue, String suit) {
		this.value = value;
		this.faceValue = fValue;
		this.suit = suit;
		//setY(800);
		//setVY(-2);
		//play();
	}

//	int destinationY = 60;
//	
//	public void checkBehaviors(){
//		if(getY() <= destinationY){
//			setVY(0);
//			setY(destinationY);
//		}
//	}
	
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int setX(int x) {
		// TODO Auto-generated method stub
		return this.x = x;
	}

	@Override
	public int setY(int y) {
		// TODO Auto-generated method stub
		return this.y = y;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	} 
}
