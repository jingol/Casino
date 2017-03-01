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

	public Table(int x, int y, int w, int h) {
		super(x, y, w, h);
		initializeFields();
		draw();
	}

	private void initializeFields() {
		boxes = 1;
		text = "Game History";
	}

	private void draw() {
		while (boxes <= 15) {
			if (boxes == 1) {

			}
			if (boxes == 2) {

			}
			if (boxes == 3) {

			}
			if (boxes == 4) {

			}
			if (boxes == 5) {

			}
			if (boxes == 6) {

			}
			if (boxes == 7) {

			}
			if (boxes == 8) {

			}
			if (boxes == 9) {

			}
			if (boxes == 10) {

			}
			if (boxes == 11) {

			}
			if (boxes == 12) {

			}
			if (boxes == 13) {

			}
			if (boxes == 14) {

			}
			if (boxes == 15) {

			}
		}
	}

	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.green);
		g.fillRect(100, 100, 50, 30);
		g.setColor(Color.black);
		g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
		g.setFont(new Font("Helvetica", Font.PLAIN, 15));
		FontMetrics fm = g.getFontMetrics();
		if (getText() != null) {
			g.setColor(Color.white);
			String t = getText();
			// just in case text is too wide, cut off
			int cutoff = t.length();
			while (cutoff > 0 && fm.stringWidth(t) > getWidth()) {
				cutoff--;
				t = t.substring(0, cutoff);
			}
			g.drawString(t, (getWidth() - fm.stringWidth(t)) / 2, (getHeight() + fm.getDescent()) / 2);
		}
	}

	private String getText() {
		return text;
	}

}
