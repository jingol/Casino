package texas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import gui.components.MovingComponent;

/**
 * @author Kristy Lo + Ray
 *
 */
public class PlayingCard extends MovingComponent implements PlayingCardInterface {
	
	private boolean faceDown;
	//ratio is 500: 726
	public static final int WIDTH = 60;
	public static final int HEIGHT= 87;
	private String suit;
	private int value;
	private final int slowdown = 30;
	
	public PlayingCard(int x, int y, int value, String suit) {
		super(x, y, WIDTH, HEIGHT);
		faceDown = true;
		this.value = value;
		this.suit = suit;
		update();
	}

	public boolean isFaceDown(){
		return faceDown;
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
			try {
		    	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		    	BufferedImage img = ImageIO.read(new File("images/backofcard.png"));
		    	g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
		    } catch (IOException e) {
				e.printStackTrace();
			}
			g.setColor(Color.BLACK);
			g.setStroke(new BasicStroke(2));
			g.drawRect(0, 0, WIDTH-1, HEIGHT-1);
		}
		else{
			if(getCardName() != null && suit != null)
			    try {
			    	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			    	BufferedImage img = ImageIO.read(new File("images/cardImages/"+getCardName()+"_of_"+suit+".png"));
			    	g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
			    } catch (IOException e) {
					e.printStackTrace();
				}
		}
			

	}

	public int getCardValue(){
		return value;
	}
	
	public String getSuit(){
		return suit;
	}
	
	@Override
	public String getCardName() {
		if(value < 11){
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
	
	public void shiftCard(int newX, int newY){
		double dx = (newX-getX())/slowdown;
		double dy = (newY-getY())/slowdown;
		Thread t = new Thread(new Runnable(){
			@Override
			public void run() {
				while(getX() != newX || getY() != newY){
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(newX-getX() < dx)
						setX(newX);
					else
						setX((int)(getX()+dx));
					if(newY-getY() < dy)
						setY(newY);
					else
						setY((int)(getY()+dy));
				}
			}
			
		});
		t.start();
	}

}














