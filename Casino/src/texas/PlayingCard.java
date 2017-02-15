/**
 * 
 */
package texas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import gui.components.Component;

/**
 * @author Kristy L.
 *
 */
public class PlayingCard extends Component implements PlayingCardInterface {
	
	private boolean faceDown;
	public static final int WIDTH = 60;
	public static final int HEIGHT= 100;
	private String suit;
	private int value;
	
	public PlayingCard(int x, int y, int value, String suit) {
		super(x, y, WIDTH, HEIGHT);
		faceDown = true;
		this.value = value;
		this.suit = suit;
		update();
	}

	@Override
	public void flipCard() {
		faceDown = !faceDown;
		update();

	}

	@Override
	public void update(Graphics2D g) {
		if (faceDown)
		{
			g.setColor(Color.red);
			g.fillRoundRect(0, 0, 100, 100, 5, 5);
		}
		else{
			BufferedImage img = null;
			try {
			    img = ImageIO.read(new File("imag"));
			} catch (IOException e) {
			}
		}
			

	}

	@Override
	public String getCardValue() {
		if(value > 0 && value < 11){
			return ""+value;
		}
		else if(value == 11){
			return "jack";
		}
		else if(value == 12){
			return "queen";
		}
		else if(value == 13){
			return "king";
		}
		return null;
	}

}















