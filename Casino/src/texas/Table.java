package texas;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Component;

public class Table extends Component implements Pot{

	private int money;
	public Table(int x, int y, int w, int h) {
		super(x, y, w, h);
		money=0;
	}
	@Override
	public void increaseValue(int i) {
		money += i;
		update();
		
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(new Color(200,220,255));
		g.fillRoundRect(25, 25, 120, 50, 10, 10);
		g.setColor(Color.black);
		g.drawRoundRect(25, 25, 120, 50, 10, 10);
		g.drawString("Money bet = "+money, 40, 55);
	}

}
