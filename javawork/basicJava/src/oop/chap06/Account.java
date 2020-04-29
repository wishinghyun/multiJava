package oop.chap06;
//47p
public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		
	}
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getAccount() {
		return account;
	}
	
	public double calculateInterest() {
		double interest = balance*interestRate;
		return interest;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance = balance+money;
	}
	public void withdraw(int money) {
		int withdraw = balance-money;
	}
	
	
}





