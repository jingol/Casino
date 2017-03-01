package k;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Component;

public class Box extends Component {
	
	private Color color;

	public Box(int x, int y, int w, int h, Color color) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		this.color = color;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.drawRect(0,0,getHeight(), getWidth());
		g.setColor(this.color);
		g.fillRect(0, 0, getWidth(), getHeight());
	}

}
