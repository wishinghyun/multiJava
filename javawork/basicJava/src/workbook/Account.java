package workbook;
//47p
public class Account {
	private String account;
	private int balance;
	private double interestRate;
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return account;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getInterstRate() {
		return interestRate;
	}
	
	public double calculateInterest() {
		double interest = balance*interestRate;
		return interest;
	}
	public void deposit(int money) {
		balance = balance+money;
	}
	public void withdraw(int money) {
		int withdraw = balance-money;
	}
	
	
}





