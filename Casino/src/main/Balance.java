package main;

public class Balance implements BalanceInterface {
	
	/*
	 * by Matthew Yarmolinsky
	 */
	
	public static int balance;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int newBalance) {
		balance = newBalance;
	}
}
