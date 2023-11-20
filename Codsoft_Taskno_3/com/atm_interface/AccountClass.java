package com.atm_interface;


public abstract class AccountClass {

	
	
	double depositAmount;
	double withdrawAmount;
	private static double savingsAccountBalance=10000;
	
	private static double currentAccountBalance=20000;
	
	
	
	
	
	public static double getSavingsAccountBalance() {
		return savingsAccountBalance;
	}
	public static void setSavingsAccountBalance(double savingsAccountBalance) {
		AccountClass.savingsAccountBalance = savingsAccountBalance;
	}
	public static double getCurrentAccountBalance() {
		return currentAccountBalance;
	}
	public static void setCurrentAccountBalance(double currentAccountBalance) {
		AccountClass.currentAccountBalance = currentAccountBalance;
	}
	
	abstract void deposit();
	abstract void getBalance();
	abstract void withdraw();
	 
	
	 public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdraw(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public double getdepositAmount() {
		return depositAmount;
	}
	public void setDeposit(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	
}
