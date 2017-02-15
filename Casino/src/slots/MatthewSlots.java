/**
 * 
 */
package slots;

import java.awt.Color;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Visible;

/**
 * @author Matthew Yarmolinsky
 *
 */
public class MatthewSlots {
	
	public static int betAmount;
	public static gui.components.Button texasButton;
	public static gui.components.Button blackjackButton;
	public static gui.components.Button bingoButton;

	public MatthewSlots() {
		
	}
	
	public void initAllObjects(ArrayList<Visible> viewObjects){
		texasButton = new gui.components.Button(166, 750, 200, 100, "To Texas Hold 'Em", Color.RED, new Action(){
			public void act() {
				gui.GUIApplication.setScreen(texas.Texas.texas);
			}
		});
		blackjackButton = new gui.components.Button(166, 750, 200, 100, "To Blackjack", Color.RED, new Action(){
			public void act() {
				gui.GUIApplication.setScreen(blackjack.BlackJackGame.bjs);
			}
		});
		bingoButton = new gui.components.Button(166, 750, 200, 100, "To Bingo", Color.RED, new Action(){
			public void act() {
				gui.GUIApplication.setScreen(bingo.MakinoonBingoGame.md);
			}
		});
	}

}
