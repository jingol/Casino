package blackjack;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import blackjack.ButtonInterface;
import gui.components.Action;
import gui.components.Clickable;
import gui.components.Components;

public class Button extends Components implements ButtonInterface{
	
	private static int x;
	private static int y;
	private static int h = 60;
	private static int w = 80;
	private static String text;
	private Action act;
	
	public Button(){
		super(x,y,w,h);
	}
	
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return h;
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return w;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}
	
	public void setX(int x){
		this.x = x;
		update();
	}
	
	public void setY(int y){
		this.y = y;
		update();
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void setText(String text){
		this.text = text;
		update();
	}

//	@Override
//	public void update() {
//		// TODO Auto-generated method stub
//		
//	}

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
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.red);
		g.fillRect(x,y,w,h);
		g.setColor(Color.black);
		g.drawRect(x,y,w-1,h-1);
		g.drawString(text,x,y);
	}
}
