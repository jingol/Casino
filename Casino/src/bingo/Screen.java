package bingo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guiMakinoonComp.Visible;

public abstract class Screen {

	private BufferedImage image;
	private ArrayList<Visible> viewObjects;


	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width, height);
	}

	public abstract void 
	initObjects(ArrayList<Visible> viewObjects);

	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public BufferedImage getImage(){
		return image;
	}

	public int getWidth(){
		return image.getWidth();
	}

	public int getHeight(){
		return image.getHeight();
	}

	public void update() {
		Graphics2D g = image.createGraphics();
		//smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
//		for(int i = 0; i < viewObjects.size(); i++){
//			
//		}
		for(int i = 0; i < viewObjects.size(); i++){
			Visible v = viewObjects.get(i); 
			//get for arrayLists 
			
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}

	
	//represents ABILITY to listen to mouse
	//but isn't actually doing something
	public MouseMotionListener getMouseMotionListener(){
		return null;
	}
	
	public MouseListener getMouseListener(){
		return null;
	}

	public void addObject(Visible v) {
		// TODO Auto-generated method stub
		viewObjects.add(v);
	}

	public void remove(Visible v) {
		// TODO Auto-generated method stub
		viewObjects.remove(v);
		
		
		/* 
		 * In this implementation, we have a very simple command: remove (v)
		 
		 *Remove is a big deal 
		 *When an object is removed from a list, 
		 *every other object after that object 
		 *is moved up in order. 
		 *Therefore, all of their respective indices change. 
		 *BE aware of this.  
		 *
		 *
		 *classic example: 
		 *Suppose you have a List<integer>with 
		 *{4, 8, 7, 1} remove all integers > 5
		 *for(int i = 0; i < list.size(); i++){ 
		 *	if (list.get(i) > 5) { 
		 *	list.remove(i)
		 *} 
		 *
		 *2 correct ways 
		 *
		 *for(int i = 0; i < list.size(); i++){ 
		 *	while(list.get(i) > 5) list.remove(i)
		 
		 **for(int i = 0; i < list.size(); i++){ 
		 *	if(list.get(i) > 5){
		 *     list.remove(i); 
		 *     i--; 
		 *     
		 *}
		 *
		 *
		 *this doesnt work 
		 *for(int i : list){ 
		 *	while(i > 5) list.remove(i)
		 *
		 *
		 *IF YOU CALL LIST.REMOVE(INT) 
		 *IT WILL RETURN THE OBJECT BEING REMOVED AT THE INDEX 
		 *DO SOMETHING LIKE THIS 
		 *SYSTEM.OUT.PRINTLN(LIST.REMOVE(0).TOSTRING() + 
		 *" WAS REMOVED"); 
		 * 
		 *
		 *
		 
		 */
	}
	public void moveToBack(Visible v){ 
		if(viewObjects.contains(v)){ 
			viewObjects.remove(v); 
			viewObjects.add(0, v);
			//specify index or puts at in the end
			//MOVES EVERYTHING ELSE FORWARD IN THE LIST 
			//LOOK OVER THE GAME ENGINE CODE 
			
			
		}
	}
	public void moveToFront(Visible v){ 
		if(viewObjects.contains(v)){ 
			viewObjects.remove(v); 
			viewObjects.add(v);
		}
	}
}
