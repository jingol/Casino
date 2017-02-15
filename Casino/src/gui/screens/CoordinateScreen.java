package gui.screens;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


import gui.Screen;
import gui.components.Button;
import gui.components.ClickableGraphic;
import gui.components.Graphic;
import gui.components.TextArea;
import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.sampleGames.MouseFollower;

public class CoordinateScreen extends Screen implements MouseListener, MouseMotionListener {

	
	//FIELD
	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphic antz;
	private ClickableGraphic antz2;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(20,100,80,40,
				"Button",new Color(100,100,250),
				new Action() {
			
			public void act() {
				// TODO Auto-generated method stub
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
		});
		viewObjects.add(button);
		text = 
				new TextLabel(20, 500, 500, 40, "Some text");
		viewObjects.add(text);
		
		area = new TextArea(20, 200, 500, 100, "A hell of a lot of text mate "
				+ "this is a crazy amount of shiett.");
		viewObjects.add(area);
		
//		antz = new Graphic(20,300,"resources/" + "sampleImages/antz.jpg");
//		
//		viewObjects.add(antz);
		
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse X coordinate
		int my = e. getY();//get Y coord
		text.setText("Mouse at: "+mx +", "+my);
	}

	public MouseMotionListener getMouseMotionListener(){ 
		return this;
	}
	
	public MouseListener getMouseListener(){
		return this;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
		}
		if(antz2.isHovered(e.getX(), e.getY())){
			antz2.act();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
}