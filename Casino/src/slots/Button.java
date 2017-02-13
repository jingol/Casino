package slots;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Action;
import gui.components.Component;

public class Button extends Component {

	private static int w = 60;
	private static int h = 60;
	private static int x;
	private static int y;
	private Action act;
	private Color color;
	private Color normalColor;
	private boolean isHighlighted;
	
	public Button() {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	public void act() {
		// TODO Auto-generated method stub
		if(act != null){
			act.act();
		}
	}

	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return x>getX() && x<getX()+getWidth() && 
				y > getY() && y<getY()+getHeight();
	}

	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color = color;
		normalColor = this.color;
		update();
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		Button.x = x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		Button.y = y;
	}

	public void setAction(Action a) {
		// TODO Auto-generated method stub
		this.act = a;
	}

	@Override
	public void update(Graphics2D arg0) {
		// TODO Auto-generated method stub
		
	}

}
