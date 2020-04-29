package oop.chap07;
//47p
public class Account {
//	private String accid;	
	private String ownerName;
	private int balance;
	private String account;
	public Account() {
		
	}
	
	public Account(String account, int balance, String ownerName) {
		super();
		this.account = account;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	public void deposit(int ammount) {
		balance = balance+ammount;
	}
	public void withdraw(int ammount) {
		balance = balance-ammount;
	}
	
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}



	
}





