package guiCasino.screens;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui.Screen;
import guiCompononets.Clickable;
import guiCompononets.Visible;

public abstract class ClickableScreen extends Screen implements MouseListener{
	private ArrayList<Clickable> clickables;
	
	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for(Visible i: viewObjects){ 
			if( i instanceof Clickable ){
				clickables.add((Clickable)i);
			}
		}
	}

	public abstract void initAllObjects(ArrayList <Visible> lst);
	
	

	public void addObject(Visible v){
		 super.addObject(v);
		 if(v instanceof Clickable){
		 clickables.add((Clickable)v);
		 }
	}
		 

		 
	public void remove(Visible v){
		 super.remove(v);
		 clickables.remove(v);
	} 
	
	public MouseListener getMouseListener(){
		return this;
		
	}
	public void mouseClicked(MouseEvent m) {
		for(Clickable a: clickables){
			if( a.isHovered(m.getX(), m.getY())){
				a.act();
				break;
			}
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
