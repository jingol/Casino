package bingo;

import java.awt.Color;

//arraylist, button
public class SquareMakinoon {
	private Color color; 
	private boolean isClicked; 
	private int number;
	
	public SquareMakinoon(Color color, int number) {
		super();
		
		this.color = color;
		
		this.isClicked = false; 
		
		this.number = number;
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;//
	}
	public boolean isClicked() {
		return isClicked;
	}
	public void setClicked(boolean isClicked) {
		this.isClicked = isClicked;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	} 
	
}