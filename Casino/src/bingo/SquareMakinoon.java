package bingo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiCompononets.Clickable;
import guiCompononets.Component;


/**
 * @author Makinoon
 */
//arraylist, button
public class SquareMakinoon extends Component 
implements Clickable {
	private boolean highlighted; 
	private Color color; 
	private boolean isClicked; 
	private int number; 
	public SquareMakinoon(Color color, int number,  int x, int y, int w, int h) {
		
		super(x, y, w, h);
		
		this.number = number; 
		
		this.color = color;
		
		this.highlighted = false; 
		
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
//		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//		if(color != null){
//			g.setColor(color);
//		}
//		else{
//			g.setColor(Color.WHITE);
//		}
//		
//		if(highlighted){
//			System.out.println("highlighted");
//			g.setColor(Color.RED);
//			
//		}
//		//g.fillOval(0, 0, super.getWidth(), super.getHeight());
//		
//		g.setColor(Color.black);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Calibri",Font.BOLD,30));
		g.drawString("hello" + this.number, 0, 0 );
	}

	@Override
	public void act() {
		System.out.println("act");
		highlighted = true;
		update();
		
	}

	public boolean isHovered(int x, int y) {
		
		return x>getX() && x<getX()+getWidth() && y>getY() && y<getY()+getHeight();
	}

	
}