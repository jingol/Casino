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
	//ratio is 500: 726
	public static final int WIDTH = 70;
	public static final int HEIGHT= 102;
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
			g.fillRoundRect(0, 0, WIDTH, HEIGHT, 10, 10);
		}
		else{
			if(getCardValue() != null && suit != null)
			    try {
			    	BufferedImage img = ImageIO.read(new File("images/cardImages/"+getCardValue()+"_of_"+suit+".png"));
			    	g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
			    } catch (IOException e) {
					e.printStackTrace();
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















