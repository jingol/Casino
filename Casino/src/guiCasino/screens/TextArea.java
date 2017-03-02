package guiCasino.screens;
//asdasd
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {
	private String text;
	private Color color; 
	public TextArea(int x, int y, int w, int h, String text, Color color) {
		super(x, y, w, h, text, color);
		
	}

	public void update(Graphics2D g) {
		g = clear(); 
		
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		
		g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
		
		FontMetrics fm = g.getFontMetrics();

		g.setColor(Color.black);
		
		
		if(getText() != null){ 
			String[] words = getText().split(" ");	
			
			if (words.length > 0 ) {
				 int i = 0; 
				 final int SPACING = 0; 
				  int y = 0 + fm.getHeight() + SPACING; 
				  String line = words[i] + " ";
				  i++; 
				  while ( i < words.length){ //makes more lines 
					  //controls a single line of text
					  while (i < words.length && fm.stringWidth(line)
							  + fm.stringWidth(words[i])
							  < getWidth() ){ 
						  line += words[i] + " ";
						  i++; 
						  
					  }
					 if(y < getHeight()){ 
						 g.drawString(line, 2, y);
						 y += fm.getDescent() + fm.getHeight()
						 			+ SPACING;
						 line = "";
						 
					 }else{ 
						 break;//print nomore 
					 }
				  }
			}
		}
				  //				  
//			while (cutoff > 0 && fm.stringWidth(t) > getWidth()) {
//						
//						cutoff--;
//						 
//						temp = t + t.substring(0, cutoff);
//					}
//					g.drawString(temp, (getWidth() - fm.stringWidth(t)) / 2, (getHeight() + fm.getDescent()) / 2);
//				}
//				
//			}
			
			}
			
		
	

	
}

