package texas;

import java.awt.Graphics2D;

import gui.components.Component;
import main.Casino;
/*
	Ray
*/
public class Pile extends Component {

	public Pile() {
		super(PlayingCard.WIDTH*2, Casino.HEIGHT/2-PlayingCard.HEIGHT/2, Casino.WIDTH/2, Casino.HEIGHT/2);
		
	}

	@Override
	public void update(Graphics2D g) {
		
	}

}
