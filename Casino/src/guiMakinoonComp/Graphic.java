package guiMakinoonComp;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {

	
	//field 
	private BufferedImage image; 
	private boolean loadedImages; 
	private int x; 
	private int y; 
	/**
	 * Full size graphics constructor
	 * @param x
	 * @param y
	 * @param imageLocation
	 */
	public Graphic(int x, int y, String imageLocation) {
		this.setX(x); 
		this.setY(y); 
		setLoadedImages(false); 
		loadImages(imageLocation, 0, 0);
		
	}
	//custome size 
	public Graphic(int x, int y, int w, int h, 
			String imageLocation) {
		this.setX(x); 
		this.setY(y); 
		setLoadedImages(false); 
		loadImages(imageLocation, w, h);
		
		
		
	}
	//scaled size
	public Graphic(int x, int y, 
			double scale, String imageLocation) {
		this.setX(x); 
		this.setY(y); 
		setLoadedImages(false); 
		
		loadImages(imageLocation, scale);
		
	}

	private void loadImages(String imageLocation, double scale) {
		try{
			ImageIcon icon = new ImageIcon(imageLocation);
			int newWidth = (int) (icon.getIconWidth() * scale);
			int newHeight = (int) (icon.getIconHeight() * scale);
			 image = new BufferedImage(newWidth, newHeight, 
					 BufferedImage.TYPE_INT_ARGB);
			 Graphics2D g = image.createGraphics();
			 g.drawImage(icon.getImage(), 0, 0, newWidth, newHeight 
						, 0, 0, icon.getIconWidth(),icon.getIconHeight()
						,null);
					 
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void loadImages(String imageLocation, int w, int h) {
		
		try{ 
			//full size image 
			
			ImageIcon icon = new ImageIcon(imageLocation);
		if ( w <= 0 && h <= 0){
			//use fullsize icon 
			image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight()
					, BufferedImage.TYPE_INT_ARGB);
			//use the graphics2D tool to copy the icon
			Graphics2D g = image.createGraphics();
			
			g.drawImage(icon.getImage(), 0, 0, null);
		}else{
			//use custom size icon\
			image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
			//use the graphics2D tool to copy the icon
			Graphics2D g = image.createGraphics();
			
			
			/* 
			 * images to draw
			 * xC of destination
			 * y of destina
			 * width of des
			 * height of des
			 * xcoord of target
			 * ycoord of target
			 * w of target
			 * h of target
			 * null
			 * 
			 */
			g.drawImage(icon.getImage(), 0, 0, w, h 
					, 0, 0, icon.getIconWidth(),icon.getIconHeight()
					,null);
		}
			setLoadedImages(true); 
		}catch(Exception e){
			//this happens when you dont name the image correctly. 
			e.printStackTrace(); 
			
		}
	}


	public BufferedImage getImage() {
		
		return image;
	}

	
	public int getX() {
		
		return x;
	}

	
	public int getY() {
		
		return y;
	}

	
	public int getWidth() {
		
		return image.getWidth();
	}

	
	public int getHeight() {
		
		return image.getHeight();
	}

	
	public boolean isAnimated() {
		
		return false;
	}

	
	public void update() {
			//does nothing. image stays same. 
		

	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isLoadedImages() {
		return loadedImages;
	}
	public void setLoadedImages(boolean loadedImages) {
		this.loadedImages = loadedImages;
	}

}
