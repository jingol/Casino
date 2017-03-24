package guiMakinoonComp;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ClickableGraphic extends Graphic implements Clickable, MouseMotionListener, MouseListener {
	private Action action;

	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		this.setX(x);
		this.setY(y);
		setLoadedImages(false);
		loadImages(imageLocation, 0, 0);
		
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public boolean isHovered(int x, int y) {

		return x > getX() && x < getX() + getWidth() && y > getY() && y < getY() + getHeight();
	}

	public void act() {
			//System.out.println("triggered");
		if(action != null){
			action.act();
		}
	}

	public void setAction(Action a) {
		this.action = a; 
		

	}

	public void mouseClicked(MouseEvent arg0) {

	}

	public void mouseEntered(MouseEvent arg0) {

	}

	public void mouseExited(MouseEvent arg0) {

	}

	public void mousePressed(MouseEvent arg0) {

	}

	public void mouseReleased(MouseEvent arg0) {

	}

	public void mouseDragged(MouseEvent arg0) {

	}

	public void mouseMoved(MouseEvent arg0) {

	}

}
