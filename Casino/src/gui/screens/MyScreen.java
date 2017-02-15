package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.TextArea;
import gui.components.Visible;
import gui.sampleGames.MouseFollower;
import gui.components.Action;
import gui.components.Button;


public class MyScreen extends Screen implements MouseListener{
	
	private TextArea text;
	private Button button;

	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		text = new TextArea(20, 200, 500, 100, "Duuuuuuuuuuuuuuuuuuuuuuun Dun dun dun dun "
				+ "dun dun dun dun dun dun dun dundun dun dundundun "
				+ "dun dun dun dun dun dun dundun dundunBOOM ");
		viewObjects.add(text);
		
		button = new Button(100, 500, 80, 60, "Go Back", 
				new Color(255,0,255), 
				new Action(){

					@Override
					public void act() {
						// TODO Auto-generated method stub
						MouseFollower.game.setScreen(MouseFollower.cs);
					}
			
		});
		viewObjects.add(button);
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
