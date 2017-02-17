/**
 * 
 */
package texas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
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
	public static final int WIDTH = 60;
	public static final int HEIGHT= 87;
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
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g.setColor(Color.red);
			g.fillRoundRect(0, 0, WIDTH, HEIGHT, 17, 17);
			g.setColor(Color.BLACK);
			g.setStroke(new BasicStroke(2));
			g.drawRoundRect(0, 0, WIDTH-1, HEIGHT-1, 15, 15);
		}
		else{
			if(getCardValue() != null && suit != null)
			    try {
			    	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			    	BufferedImage img = ImageIO.read(new File("images/cardImages/"+getCardValue()+"_of_"+suit+".png"));
			    	g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
			    } catch (IOException e) {
					e.printStackTrace();
				}
		}
			

	}

	@Override
	public String getCardValue() {
		if(value > 1 && value < 11){
			return ""+value;
		}
		else if(value == 14){
			return "ace";
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















