package blackjack;

import java.awt.Graphics2D;
import blackjack.CardInterface;
import gui.components.Components;

/**
 * @author Kristy Tan
 *
 */
 
public class Card extends Components /*extends MovingComponent */implements CardInterface{

	public int value;
	public String faceValue;
	public String suit;
	private static int y;
	private static int x;
	private static int h;
	private static int w;
	
	public Card(int value, String fValue, String suit){
		super(x,y,h,w);
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
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y = y;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return h;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return w;
	} 

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}
}
