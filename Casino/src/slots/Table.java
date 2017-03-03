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
	private TextLabel text1;
	private TextLabel text2;
	private TextLabel text3;
	private TextLabel text4;
	private TextLabel text5;
	private TextLabel text6;
	private TextLabel text7;
	private TextLabel text8;
	private TextLabel text9;
	private TextLabel text10;
	private TextLabel text11;
	private TextLabel text12;
	private TextLabel text13;
	private TextLabel text14;
	private TextLabel text15;
	private TextLabel text16;
	private TextLabel text17;
	private TextLabel text18;
	private TextLabel text19;
	private TextLabel text20;
	private TextLabel text21;
	private TextLabel text22;
	private TextLabel text23;
	private int boxDimensionX;
	private int boxDimensionY;
	private int counter;

	public Table(int x, int y, int w, int h) {
		super(x, y, w, h);
		text1 = new TextLabel(100, 100, 50, 30, "Game History");
		text2 = new TextLabel(100, 130, 50, 30, "Bets");
		text3 = new TextLabel(150, 130, 50, 30, "Rewards");
		text4 = new TextLabel(100, 160, 50, 30, "");
		text5 = new TextLabel(150, 160, 50, 30, "");
		text6 = new TextLabel(100, 190, 50, 30, "");
		text7 = new TextLabel(150, 190, 50, 30, "");
		text8 = new TextLabel(100, 220, 50, 30, "");
		text9 = new TextLabel(150, 220, 50, 30, "");
		text10 = new TextLabel(100, 250, 50, 30, "");
		text11 = new TextLabel(150, 250, 50, 30, "");
		text12 = new TextLabel(100, 280, 50, 30, "");
		text13 = new TextLabel(150, 280, 50, 30, "");
		text14 = new TextLabel(100, 310, 50, 30, "");
		text15 = new TextLabel(150, 310, 50, 30, "");
		text16 = new TextLabel(100, 340, 50, 30, "");
		text17 = new TextLabel(150, 340, 50, 30, "");
		text18 = new TextLabel(100, 370, 50, 30, "");
		text19 = new TextLabel(150, 370, 50, 30, "");
		text20 = new TextLabel(100, 400, 50, 30, "");
		text21 = new TextLabel(150, 400, 50, 30, "");
		text22 = new TextLabel(100, 430, 50, 30, "");
		text23 = new TextLabel(150, 430, 50, 30, "");
		draw();
	}

	private void draw() {
		boxes = 1;
		counter = 1;
		while (boxes <= 12) {
			if (boxes == 1) {
				boxDimensionX = 100;
				boxDimensionY = 100;
				update();
				boxes++;
			} else if (boxes == 2) {
				boxDimensionX = 100;
				boxDimensionY = 130;
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 130;
				counter++;
				update();
				boxes++;
			} else if (boxes == 3) {
				boxDimensionX = 100;
				boxDimensionY = 160;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() >= 1) {
					text4.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 1));
				} else {
					text4.setText("");
				}
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 160;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() >= 1) {
					text5.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 1));
				} else {
					text5.setText("");
				}
				counter++;
				update();
				boxes++;
			} else if (boxes == 4) {
				boxDimensionX = 100;
				boxDimensionY = 190;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() >= 2) {
					text6.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 2));
				} else {
					text6.setText("");
				}
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 190;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() >= 2) {
					text7.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 2));
				} else {
					text7.setText("");
				}
				counter++;
				update();
				boxes++;
			} else if (boxes == 5) {
				boxDimensionX = 100;
				boxDimensionY = 220;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() >= 3) {
					text8.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 3));
				} else {
					text8.setText("");
				}
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 220;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() >= 3) {
					text9.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 3));
				} else {
					text9.setText("");
				}
				counter++;
				update();
				boxes++;
			} else if (boxes == 6) {
				boxDimensionX = 100;
				boxDimensionY = 250;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() >= 4) {
					text10.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 4));
				} else {
					text10.setText("");
				}
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 250;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() >= 4) {
					text11.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 4));
				} else {
					text11.setText("");
				}
				counter++;
				update();
				boxes++;
			} else if (boxes == 7) {
				boxDimensionX = 100;
				boxDimensionY = 280;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() >= 5) {
					text12.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 5));
				} else {
					text12.setText("");
				}
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 280;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() >= 5) {
					text13.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 5));
				} else {
					text13.setText("");
				}
				counter++;
				update();
				boxes++;
			} else if (boxes == 8) {
				boxDimensionX = 100;
				boxDimensionY = 310;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() >= 6) {
					text14.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 6));
				} else {
					text14.setText("");
				}
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 310;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() >= 6) {
					text15.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 6));
				} else {
					text15.setText("");
				}
				counter++;
				update();
				boxes++;
			} else if (boxes == 9) {
				boxDimensionX = 100;
				boxDimensionY = 340;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() >= 7) {
					text16.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 7));
				} else {
					text16.setText("");
				}
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 340;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() >= 7) {
					text17.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 7));
				} else {
					text17.setText("");
				}
				counter++;
				update();
				boxes++;
			} else if (boxes == 10) {
				boxDimensionX = 100;
				boxDimensionY = 370;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() >= 8) {
					text18.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 8));
				} else {
					text18.setText("");
				}
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 370;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() >= 8) {
					text19.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 8));
				} else {
					text19.setText("");
				}
				counter++;
				update();
				boxes++;
			} else if (boxes == 11) {
				boxDimensionX = 100;
				boxDimensionY = 400;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() >= 9) {
					text20.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 9));
				} else {
					text20.setText("");
				}
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 400;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() >= 9) {
					text21.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 9));
				} else {
					text21.setText("");
				}
				counter++;
				update();
				boxes++;
			} else if (boxes == 12) {
				boxDimensionX = 100;
				boxDimensionY = 430;
				if (MatthewSlots.bets != null && MatthewSlots.bets.size() >= 10) {
					text22.setText("" + MatthewSlots.bets.get(MatthewSlots.bets.size() - 10));
				} else {
					text22.setText("");
				}
				counter++;
				update();
				boxDimensionX = 150;
				boxDimensionY = 430;
				if (JiayanWinningCombos.rewardHistory != null && JiayanWinningCombos.rewardHistory.size() >= 10) {
					text23.setText(
							"" + JiayanWinningCombos.rewardHistory.get(JiayanWinningCombos.rewardHistory.size() - 10));
				} else {
					text23.setText("");
				}
				counter++;
				update();
				boxes++;
			}
		}
	}

	public TextLabel chooseText() {
		if (counter == 1) {
			return text1;
		} else if (counter == 2) {
			return text2;
		} else if (counter == 3) {
			return text3;
		} else if (counter == 4) {
			return text4;
		} else if (counter == 5) {
			return text5;
		} else if (counter == 6) {
			return text6;
		} else if (counter == 7) {
			return text7;
		} else if (counter == 8) {
			return text8;
		} else if (counter == 9) {
			return text9;
		} else if (counter == 10) {
			return text10;
		} else if (counter == 11) {
			return text11;
		} else if (counter == 12) {
			return text12;
		} else if (counter == 13) {
			return text13;
		} else if (counter == 14) {
			return text14;
		} else if (counter == 15) {
			return text15;
		} else if (counter == 16) {
			return text16;
		} else if (counter == 17) {
			return text17;
		} else if (counter == 18) {
			return text18;
		} else if (counter == 19) {
			return text19;
		} else if (counter == 20) {
			return text20;
		} else if (counter == 21) {
			return text21;
		} else if (counter == 22) {
			return text22;
		} else if (counter == 23) {
			return text23;
		}
		return null;
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
		if (chooseText() != null) {
			String t = chooseText().getText();
			int cutoff = t.length();
			while (cutoff > 0 && fm.stringWidth(t) > getWidth()) {
				cutoff--;
				t = t.substring(0, cutoff);
			}
			g.drawString(t, (50 - fm.stringWidth(t)) / 2, (30 + fm.getDescent()) / 2);
		}
	}

}