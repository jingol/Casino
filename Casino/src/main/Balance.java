package main;

public class Balance implements BalanceInterface {

	/**
	 * @author Matthew Yarmolinsky
	 */

	public int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int newBalance) {
		balance = newBalance;
	}
}
