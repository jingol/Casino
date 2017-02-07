/**
 * 
 */
package bingo;

import java.awt.Color;
import java.awt.Graphics2D;

import guiCompononets.Clickable;
import guiCompononets.Component;

/**
 * @author Period 6 2.0
 *
 */
public class SharonBingoButton extends Component implements Clickable {

	private int value;
	private Color color;
	/**
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */
	public SharonBingoButton(int x, int y, int w, int h) {
		super(x, y, w, h);
		
		//init value & color
	}

	/* (non-Javadoc)
	 * @see guiCompononets.Clickable#act()
	 */
	@Override
	public void act() {//what happens when clicked
		//if value of the button is the same as the last random bingo number generated, change the color of the button
		if (value==BingoScreenSharon.randBingoNum.get(BingoScreenSharon.randBingoNum.size()-1)){
			
		}
	}

	/* (non-Javadoc)
	 * @see guiCompononets.Clickable#isHovered(int, int)
	 */
	@Override
	public boolean isHovered(int x, int y) {
		
		return x>getX() && x<getX()+getWidth() && y>getY() && y<getY()+getHeight();
	}

	/* (non-Javadoc)
	 * @see guiCompononets.Component#update(java.awt.Graphics2D)
	 */
	@Override
	public void update(Graphics2D arg0) {
		
		//draw button
	}

}
