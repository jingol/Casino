package blackjack;

import java.awt.image.BufferedImage;

import gui.components.Action;
import gui.components.Clickable;

public interface ButtonInterface extends Clickable{
	int getX();
	int getY();
	void setX(int x);
	void setY(int y);
	void setAction(Action a);
//	void setText(String text);
	boolean isHovered(int arg0, int arg1);
}
