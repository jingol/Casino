/**
 * 
 */
package texas;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Component;

/**
 * @author Kristy L.
 *
 */
public class PlayingCard extends Component implements Card {
	
	private boolean faceDown;
	public static final int WIDTH = 60;
	public static final int HEIGHT= 100;
	
	public PlayingCard(int x, int y) {
		super(x, y, WIDTH, HEIGHT);
		faceDown = true;
		update();
	}

	/* (non-Javadoc)
	 * @see texas.Card#flipCard()
	 */
	@Override
	public void flipCard() {
		faceDown = !faceDown;
		update();

	}

	/* (non-Javadoc)
	 * @see texas.Card#popCard()
	 */
	@Override
	public void popCard() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see gui.components.Component#update(java.awt.Graphics2D)
	 */
	@Override
	public void update(Graphics2D g) {
		// draws the card
		if (faceDown)
		{
			g.setColor(Color.red);
			g.fillRect(0, 0, 100, 100);
		}
		else{
			
		}
			

	}

}