/**
 * 
 */
package bingo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.ArrayList;

import guiCasino.screens.TextLabel;
import guiCompononets.Component;

/**
 * @author Makinoon
 *
 */
public class BingoBoxText extends Component {

	
	private String boxTitle; 
	private Rectangle rectBox;
	private ArrayList<String> boxContent; 
	private boolean multipleLines; 
	private static final int _BORDER_WIDTH = 10; 
	
	/**
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */
	public BingoBoxText(int x, int y, int w, int h, String boxTitle, ArrayList<String> boxContent, boolean multipleLines) {
		super(x, y, w, h);
		this.boxTitle = boxTitle; 
		
		rectBox = new Rectangle(_BORDER_WIDTH/2 , 20  + _BORDER_WIDTH/2 , w - _BORDER_WIDTH   , h - 20 - _BORDER_WIDTH  );
		this.boxContent = boxContent;
		System.out.println(boxContent);
		update();
		
		
	}

	/* (non-Javadoc)
	 * @see guiCompononets.Component#update(java.awt.Graphics2D)
	 */
	@Override
	public void update(Graphics2D g) {
		if(boxTitle != null){
			FontMetrics fm = g.getFontMetrics();  
		
			g.setColor(Color.BLACK); 
			g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
					RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("Calibri",Font.BOLD, 20));
			g.drawString(boxTitle, (getWidth() - fm.stringWidth(boxTitle)) /2 , 20);
			
			g.setStroke(new BasicStroke(_BORDER_WIDTH));
			g.draw(rectBox);
			
		} 
		if(boxContent != null){ 
			
			System.out.println("BoxContent is not null");
			for(int i = 0; i < this.boxContent.size(); i ++){ 
				
				FontMetrics fm = g.getFontMetrics();  
			
				
				
				g.setColor(Color.BLACK); 
				g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
						RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
				g.setFont(new Font("Calibri",Font.BOLD, 20));
				g.drawString(this.boxContent.get(i), (getWidth() - fm.stringWidth(this.boxContent.get(i))) /2 , 40 + 20*i);
				
			//g.drawString(this.boxContent.get(i), getWidth()+30, 40);
			
				}	
		}
		
		
	}
	public void addLine(String temp ){ 
		this.boxContent.add(temp);
		update(); 
	}

	public void clearAndAddLine( String string) {
			clear();
			this.boxContent.clear();
			
			
			this.boxContent.add(string);
			update(); 
	}
}
