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
import gui.components.TextLabel;

/**
 * @author Matthew Yarmolinsky
 *
 */
public class Table extends Component {

	private int boxes;
	private TextLabel text;
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
				text.setText("Game History");
				update();
				boxes++;
			} else if (boxes == 2) {
				boxDimensionX = 100;
				boxDimensionY = 130;
				text.setText("Bets");
				update();
				boxDimensionX = 150;
				boxDimensionY = 130;
				text.setText("Rewards");
				update();
				boxes++;
			} else if (boxes == 3) {
				boxDimensionX = 100;
				boxDimensionY = 160;
				if (MatthewSlots.bets != null) {
					text.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 1));
				} else {
					text.setText("");
				}
				update();
				boxDimensionX = 150;
				boxDimensionY = 160;
				if (JiayanWinningCombos.rewardHistory != null) {
					text.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 1));
				} else {
					text.setText("");
				}
				update();
				boxes++;
			} else if (boxes == 4) {
				boxDimensionX = 100;
				boxDimensionY = 190;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() < 3) {
					text.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 2));
				} else {
					text.setText("");
				}
				update();
				boxDimensionX = 150;
				boxDimensionY = 190;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() < 3) {
					text.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 2));
				} else {
					text.setText("");
				}
				update();
				boxes++;
			} else if (boxes == 5) {
				boxDimensionX = 100;
				boxDimensionY = 220;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() < 4) {
					text.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 3));
				} else {
					text.setText("");
				}
				update();
				boxDimensionX = 150;
				boxDimensionY = 220;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() < 4) {
					text.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 3));
				} else {
					text.setText("");
				}
				update();
				boxes++;
			} else if (boxes == 6) {
				boxDimensionX = 100;
				boxDimensionY = 250;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() < 5) {
					text.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 4));
				} else {
					text.setText("");
				}
				update();
				boxDimensionX = 150;
				boxDimensionY = 250;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() < 5) {
					text.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 4));
				} else {
					text.setText("");
				}
				update();
				boxes++;
			} else if (boxes == 7) {
				boxDimensionX = 100;
				boxDimensionY = 280;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() < 6) {
					text.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 5));
				} else {
					text.setText("");
				}
				update();
				boxDimensionX = 150;
				boxDimensionY = 280;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() < 6) {
					text.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 5));
				} else {
					text.setText("");
				}
				update();
				boxes++;
			} else if (boxes == 8) {
				boxDimensionX = 100;
				boxDimensionY = 310;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() < 7) {
					text.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 6));
				} else {
					text.setText("");
				}
				update();
				boxDimensionX = 150;
				boxDimensionY = 310;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() < 7) {
					text.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 6));
				} else {
					text.setText("");
				}
				update();
				boxes++;
			} else if (boxes == 9) {
				boxDimensionX = 100;
				boxDimensionY = 340;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() < 8) {
					text.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 7));
				} else {
					text.setText("");
				}
				update();
				boxDimensionX = 150;
				boxDimensionY = 340;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() < 8) {
					text.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 7));
				} else {
					text.setText("");
				}
				update();
				boxes++;
			} else if (boxes == 10) {
				boxDimensionX = 100;
				boxDimensionY = 370;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() < 9) {
					text.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 8));
				} else {
					text.setText("");
				}
				update();
				boxDimensionX = 150;
				boxDimensionY = 370;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() < 9) {
					text.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 8));
				} else {
					text.setText("");
				}
				update();
				boxes++;
			} else if (boxes == 11) {
				boxDimensionX = 100;
				boxDimensionY = 400;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() < 10) {
					text.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 9));
				} else {
					text.setText("");
				}
				update();
				boxDimensionX = 150;
				boxDimensionY = 400;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() < 10) {
					text.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 9));
				} else {
					text.setText("");
				}
				update();
				boxes++;
			} else if (boxes == 12) {
				boxDimensionX = 100;
				boxDimensionY = 430;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() < 11) {
					text.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 10));
				} else {
					text.setText("");
				}
				update();
				boxDimensionX = 150;
				boxDimensionY = 430;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() < 11) {
					text.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 10));
				} else {
					text.setText("");
				}
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
		g.setColor(Color.white);
		System.out.println(text.getText());
		String t = text.getText();
		int cutoff = t.length();
		while (cutoff > 0 && fm.stringWidth(t) > getWidth()) {
			cutoff--;
			t = t.substring(0, cutoff);
		}
		g.drawString(t, (50 - fm.stringWidth(t)) / 2, (30 + fm.getDescent()) / 2);
	}

}