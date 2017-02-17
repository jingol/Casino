/**
 * 
 */
package bingo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiCasino.screens.Action;
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
	public static boolean highlighted;
	private Action action; 
	//asdf
	/**
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */
	

	public SharonBingoButton(int x, int y, int value, Color c, Action action) {
		super(x, y, WIDTH, HEIGHT);
		this.value=value;
		this.color=c;
		this.action = action; 
		update();
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
	public void update(Graphics2D g) {
			g = clear();
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			if(highlighted) {
				g.setColor(Color.RED);
				g.fillOval(0, 0, 65, 65);
				g.setColor(Color.black);
				g.drawOval(0, 0, 65, 65);
			}
			else {
				g.setColor(Color.WHITE);
				g.fillOval(0, 0, 65, 65);
				g.setColor(Color.black);
				g.drawOval(0, 0, 65, 65);
			}
		}

	}


