package blackjack;

import java.awt.image.BufferedImage;

import gui.components.Action;
import gui.components.Clickable;

public interface ButtonInterface extends Clickable {
	BufferedImage getImage();
	int getX();
	int getY();
	void setAction(Action a);
	boolean isHovered(int arg0, int arg1);
}
