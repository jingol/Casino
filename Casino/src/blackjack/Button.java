package blackjack;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import gui.components.Action;
import gui.components.Clickable;
import gui.components.Components;

public class Button extends Components implements ButtonInterface{
	
	private static int x;
	private static int y;
	private static int h = 60;
	private static int w = 80;
	private Action act;
	
	public Button(){
		super(x,y,w,h);
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		if(act != null){
			act.act();
		}
	}

	@Override
	public boolean isHovered(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return x>getX() && x<getX()+getWidth() && 
				y > getY() && y<getY()+getHeight();
	}

	@Override
	public void setAction(Action a) {
		// TODO Auto-generated method stub
		this.act = a;
	}
	@Override
	public void update(Graphics2D arg0) {
		// TODO Auto-generated method stub
		
	}
}
