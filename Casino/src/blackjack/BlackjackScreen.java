package blackjack;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import gui.components.Visible;
import gui.screens.ClickableScreen;


public class BlackjackScreen extends ClickableScreen {

	public BlackjackScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(ArrayList<Visible> arg0) {

	}

	public void drawBackground(Graphics2D g){
		g.setColor(Color.green);
		g.fillRect(0, 0, getWidth(), getHeight());
	}
}
