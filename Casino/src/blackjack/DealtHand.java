package blackjack;

import java.util.ArrayList;

/**
 * 
 * @author Kristy Tan
 *
 */
 
public abstract class DealtHand {
	
	public abstract int checkValue();
	
	public abstract void hit();
	
	public abstract boolean stay();
	
}
