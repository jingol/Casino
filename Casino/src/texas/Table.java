package texas;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Component;

public class Table extends Component implements Pot{

	private int money;
	public Table(int x, int y, int w, int h) {
		super(100, 100, 100, 100);
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
		g.fillOval(0, 0, 99, 99);
		g.setColor(Color.black);
		g.drawOval(0, 0, 99, 99);
		g.drawString("Money bet = "+money, 40, 55);
	}

}