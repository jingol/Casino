/**
 * 
 */
package slots;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import gui.components.Component;

/**
 * @author Matthew Yarmolinsky
 *
 */
public class Table extends Component {

	private int boxes;
	private String text;
	private int boxDimensionX;
	private int boxDimensionY;

	public Table(int x, int y, int w, int h) {
		super(x, y, w, h);
		draw();
	}

	private void draw() {
		boxes = 1;
		while (boxes <= 12) {
			if (boxes == 1) {
				boxDimensionX = 100;
				boxDimensionY = 100;
				text = "Game History";
				update();
				boxes++;
			} else if (boxes == 2) {
				boxDimensionX = 100;
				boxDimensionY = 130;
				text = "Bets";
				update();
				boxDimensionX = 150;
				boxDimensionY = 130;
				text = "Rewards";
				update();
				boxes++;
			} else if (boxes == 3) {
				boxDimensionX = 100;
				boxDimensionY = 160;
				text = (String) MatthewSlots.bets.get(MatthewSlots.bets.size());
				update();
				boxDimensionX = 150;
				boxDimensionY = 160;
				text = "" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size()) + "";
				update();
				boxes++;
			} else if (boxes == 4) {
				boxDimensionX = 100;
				boxDimensionY = 190;
				text = (String) MatthewSlots.bets.get(MatthewSlots.bets.size()-1);
				update();
				boxDimensionX = 150;
				boxDimensionY = 190;
				text = "" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 1) + "";
				update();
				boxes++;
			} else if (boxes == 5) {
				boxDimensionX = 100;
				boxDimensionY = 220;
				text = (String) MatthewSlots.bets.get(MatthewSlots.bets.size()-2);
				update();
				boxDimensionX = 150;
				boxDimensionY = 220;
				text = "" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 2) + "";
				update();
				boxes++;
			} else if (boxes == 6) {
				boxDimensionX = 100;
				boxDimensionY = 250;
				text = (String) MatthewSlots.bets.get(MatthewSlots.bets.size()-3);
				update();
				boxDimensionX = 150;
				boxDimensionY = 250;
				text = "" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 3) + "";
				update();
				boxes++;
			} else if (boxes == 7) {
				boxDimensionX = 100;
				boxDimensionY = 280;
				text = (String) MatthewSlots.bets.get(MatthewSlots.bets.size()-4);
				update();
				boxDimensionX = 150;
				boxDimensionY = 280;
				text = "" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 4) + "";
				update();
				boxes++;
			} else if (boxes == 8) {
				boxDimensionX = 100;
				boxDimensionY = 310;
				text = (String) MatthewSlots.bets.get(MatthewSlots.bets.size()-5);
				update();
				boxDimensionX = 150;
				boxDimensionY = 310;
				text = "" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 5) + "";
				update();
				boxes++;
			} else if (boxes == 9) {
				boxDimensionX = 100;
				boxDimensionY = 340;
				text = (String) MatthewSlots.bets.get(MatthewSlots.bets.size()-6);
				update();
				boxDimensionX = 150;
				boxDimensionY = 340;
				text = "" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 6) + "";
				update();
				boxes++;
			} else if (boxes == 10) {
				boxDimensionX = 100;
				boxDimensionY = 370;
				text = (String) MatthewSlots.bets.get(MatthewSlots.bets.size()-7);
				update();
				boxDimensionX = 150;
				boxDimensionY = 370;
				text = "" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 7) + "";
				update();
				boxes++;
			} else if (boxes == 11) {
				boxDimensionX = 100;
				boxDimensionY = 400;
				text = (String) MatthewSlots.bets.get(MatthewSlots.bets.size()-8);
				update();
				boxDimensionX = 150;
				boxDimensionY = 400;
				text = "" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 8) + "";
				update();
				boxes++;
			} else if (boxes == 12) {
				boxDimensionX = 100;
				boxDimensionY = 430;
				text = (String) MatthewSlots.bets.get(MatthewSlots.bets.size()-9);
				update();
				boxDimensionX = 150;
				boxDimensionY = 430;
				text = "" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 9) + "";
				update();
				boxes++;
			}
		}
	}

	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		if (boxes == 1) {
			g.setColor(Color.red);
			g.fillRect(boxDimensionX, boxDimensionY, 100, 30);
			g.setColor(Color.black);
			g.drawRect(boxDimensionX, boxDimensionY, 100, 30);
		} else {
			g.setColor(Color.green);
			g.fillRect(boxDimensionX, boxDimensionY, 50, 30);
			g.setColor(Color.black);
			g.drawRect(boxDimensionX, boxDimensionY, 50, 30);
		}
		g.setFont(new Font("Helvetica", Font.PLAIN, 15));
		FontMetrics fm = g.getFontMetrics();
		if (text != null) {
			g.setColor(Color.white);
			String t = text;
			int cutoff = t.length();
			while (cutoff > 0 && fm.stringWidth(t) > getWidth()) {
				cutoff--;
				t = t.substring(0, cutoff);
			}
			g.drawString(t, (50 - fm.stringWidth(t)) / 2, (30 + fm.getDescent()) / 2);
		}
	}

}