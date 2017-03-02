/**
 * 
 */
package slots;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Visible;
import main.Balance;

/**
 * @author Matthew Yarmolinsky
 *
 */
public class MatthewSlots {

	public static int betAmount;
	public static gui.components.Button texasButton;
	public static gui.components.Button blackjackButton;
	public static gui.components.Button bingoButton;
	public static int balance;
	public static ArrayList bets;
	public static int[][] gameHistory;
	public Balance number = new Balance();

	public void initAllObjects(ArrayList<Visible> viewObjects) {
		balance = number.getBalance();

		texasButton = new gui.components.Button(166, 750, 200, 100, "To Texas Hold 'Em", Color.RED, new Action() {
			public void act() {
				gui.GUIApplication.setScreen(texas.Texas.texas);
			}
		});

		blackjackButton = new gui.components.Button(166, 750, 200, 100, "To Blackjack", Color.RED, new Action() {
			public void act() {
				gui.GUIApplication.setScreen(blackjack.BlackJackGame.bjs);
			}
		});

		bingoButton = new gui.components.Button(166, 750, 200, 100, "To Bingo", Color.RED, new Action() {
			public void act() {
				gui.GUIApplication.setScreen(bingo.MakinoonBingoGame.md);
			}
		});
	}

	public void bet(ArrayList bets) {
		betAmount = (int) bets.get(bets.size());
		balance -= betAmount;
	}

	public void reward() {
		Balance.balance = balance += JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size());
	}

	public void addBet() {
		bets.add(betAmount);
	}
}
