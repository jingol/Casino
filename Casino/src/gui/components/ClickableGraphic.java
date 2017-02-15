package gui.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickableGraphic extends Graphic implements Clickable{
	
	private Action action;
	private int x;
	private int y;

	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		// TODO Auto-generated constructor stub\
		this.x = x;
		this.y = y;
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y; 
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return x>getX() && x<getX()+getWidth() && 
				y > getY() && y<getY()+getHeight();
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		if(action != null){
			action.act();
		}
	}
	
	public void setAction(Action a){
		this.action = a;
	}
	

}
