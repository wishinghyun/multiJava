package oop.chap07;

public class CheckingAccount extends Account{
	private String cardNo;
	public CheckingAccount(String account, String ownerName, int balance,String cardNo) {
		super(account,balance,ownerName);
		this.cardNo = cardNo;
	}
		//문자열 비교는 무조건 equals를 이용해서 비교한다
		// == (안됨 - 주소 비교)
	public void pay(int amount,String cardNo) {
		if (this.cardNo.equals(cardNo) & getBalance() >= amount ) {
			//지불 가능한 조건
			withdraw(amount);
		}else {
			System.out.println("지불이 불가능합니다");
			
		}
	}
	
	
	
	
}
