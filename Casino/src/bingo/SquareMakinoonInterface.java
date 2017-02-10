package bingo;

import java.awt.Color;
 //action not in jar along with guiapplication 

import guiCompononets.Clickable;

public interface SquareMakinoonInterface extends Clickable{

	void highlight();

	void setColor(Color color);

	void setX();

	void setY();

	void setAction(Action action);

	void dim();
	void setName(String name);
	

}
