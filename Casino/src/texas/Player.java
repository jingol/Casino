package texas;

import java.util.ArrayList;

public class Player extends DealtHand{
	private int money;
	private int x;
	private int y;
	private int width;
	private int height;
	private int playernum;
	
	public Player(int x, int y, int width, int height, int money, int playernum) {
		this.money = money;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.playernum = playernum;
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
