/**
 * 
 */
package bingo;

public class BingoGameHistory {

	/**
	 * Makinoon Sami 
	 */
	private String playerName; 
	private String winner; 
	private double previousMoney; 
	private double endMoney;
	private double winningAmount; 
	
	public BingoGameHistory(String playerName, String winner, double previousMoney, 
			double endMoney, double winningAmount) {
			this.playerName = playerName;
			this.winner = winner; 
			this.previousMoney = previousMoney; 
			this.endMoney = endMoney; 
			this.winningAmount = winningAmount; 
	}
	public String getSummary(){
	
		return playerName + " played Ai";
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getWinner() {
		return winner;
	}

	public static String setWinner(String winner) {
		return winner;
	}

	public double getPreviousMoney() {
		return previousMoney;
	}

	public void setPreviousMoney(double previousMoney) {
		this.previousMoney = previousMoney;
	}

	public double getEndMoney() {
		return endMoney;
	}

	public void setEndMoney(double endMoney) {
		this.endMoney = endMoney;
	}

	public double getWinningAmount() {
		return winningAmount;
	}

	public void setWinningAmount(double winningAmount) {
		this.winningAmount = winningAmount;
	}

}
