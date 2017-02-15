
package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {
	
	private FontMetrics fm;
	private int newY;
	private int oldY;
	private int x;
	
	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
		oldY = 20;
		this.x = x;
	}

	
	public void update(Graphics2D g){
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.setFont(new Font(getFont(), Font.PLAIN,getSize()));
		if(getText()!=null){
			fm = g.getFontMetrics();
			String[] words = getText().split(" ");
			if(fm.stringWidth(getText()) > (fm.stringWidth(getText())/2)){
				newY = oldY + fm.getHeight() + fm.getDescent() + fm.getAscent();
				for(int i =0; i < words.length/2; i++){
					g.drawString(words[i], x, newY);
				}
				for(int i = words.length/2 + 1; i < words.length; i++){
					g.drawString(words[i], x, oldY);
				}
			}
			else g.drawString(getText(), x, oldY);
		}
	}
}