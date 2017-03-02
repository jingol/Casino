package texas;
//Ray
import java.util.ArrayList;

public class Player extends DealtHand{
	private int money;
	private int x;
	private int y;
	private int width;
	private int height;
	private int playernum;
	private boolean isPlaying;
	
	public Player(int x, int y, int width, int height, int money, int playernum) {
		this.money = money;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.playernum = playernum;
		isPlaying = true;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public int getPlayerNum(){
		return playernum;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public ArrayList<PlayingCard> getTieHand() {
		int num = getWinHand(getHand());
		return null;
	}
	
	

}
