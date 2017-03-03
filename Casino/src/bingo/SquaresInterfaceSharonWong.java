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
	
	void setAction(Action act);

	void highlight(); //color turns red
	
	void setNumber(); 
	
}
