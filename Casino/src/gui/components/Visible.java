package gui.components;

import java.awt.image.BufferedImage;

public interface Visible {
	public BufferedImage getImage();
	public int getY();
	public int getX();
	public int getWidth();
	public int getHeight();
	public boolean isAnimated();
	public void update();

}
