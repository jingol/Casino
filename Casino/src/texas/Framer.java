package texas;
//Ray
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import gui.components.Component;

public class Framer extends Component {
	private Color fc;
	public Framer(int x, int y, int w, int h, Color c) {
		super(x, y, w, h);
		setColor(c);
	}

	public void setColor(Color c){
		fc = c;
		update();
	}
	
	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(fc);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
	}

}
