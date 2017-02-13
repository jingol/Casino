/**
 * 
 */
package bingo;

import java.awt.Color;

import guiCompononets.Clickable;

/**
 * @author Sharon
 *
 */
public interface SquaresInterfaceSharonWong extends Clickable{
	void setColor(Color color); //initial: white

	void setX(int i);

	void setY(int i);
	
	void setAction(Action a);

	void highlight(); //color turns red

}
