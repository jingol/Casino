/**
 * 
 */
package bingo;

import java.awt.Color;
import java.awt.Graphics2D;

import guiCompononets.Clickable;
import guiCompononets.Component;

/**
 * @author Sharon
 *
 */
public class SharonBingoButton extends Component implements Clickable {

	//private int value;
	//private Color color;
	public static final int WIDTH = 100;
	public static final int HEIGHT = 100;
	private int value;
	private Object color;
	
	//asdf
	/**
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */
	public SharonBingoButton(int x, int y, int value, Color c) {
		super(x, y, WIDTH, HEIGHT);
		this.value=value;
		this.color=c;
		update();
		
		//init value & color
	}

	@Override
	public void act() {//what happens when clicked
		//if value of the button is the same as the last random bingo number generated, change the color of the button
		if (value==BingoScreenSharon.randBingoNum.get(BingoScreenSharon.randBingoNum.size()-1)){
			//change color of button value belongs to
		}
		else if (value!=BingoScreenSharon.randBingoNum.get(BingoScreenSharon.randBingoNum.size()-1)){
			//display "GAME OVER"
		}
	}

	
	@Override
	public boolean isHovered(int x, int y) {
		
		return x>getX() && x<getX()+getWidth() && y>getY() && y<getY()+getHeight();
	}

	
	@Override
	public void update(Graphics2D arg0) {
		
		//draw button
	}

}
