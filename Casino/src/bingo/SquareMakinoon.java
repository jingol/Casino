package bingo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiCompononets.Component;


/**
 * @author Makinoon
 */
//arraylist, button
public class SquareMakinoon extends Component 
implements SquareMakinoonInterface {
	private Color color; 
	private boolean isClicked; 
	private int number; 
	public SquareMakinoon(Color color, int number,  int x, int y, int w, int h) {
		
		super(x, y, w, h);
		
		this.number = number; 
		
		this.color = color;
		
		this.isClicked = false; 
		
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;//
	}
	public boolean isClicked() {
		return isClicked;
	}
	public void setClicked(boolean isClicked) {
		this.isClicked = isClicked;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(color != null){
			g.setColor(color);
		}
		else{
			g.setColor(Color.lightGray);
		}
		g.fillOval(0, 0, super.getWidth(), super.getHeight());
		g.setColor(Color.black);
		g.drawOval(0, 0, super.getWidth(), super.getHeight());
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isHovered(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void highlight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setX() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAction(Action action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	} 
	
}