package oop.chap07.poly;

public class Coffee extends Beverage{
	static int amount;
	public Coffee() {
		
	}
	public Coffee(String name) {
		super(name);
		amount++;//Coffee가 판매되면 1씩 증가
		calcPrice();//주문되는 음료의 가격을 계산
	}
	//static멤버를 엑세스하기 위해서 static메소드를 정의해서 엑세스한다
	public static int getAmount() {
		return amount;
	}
	@Override
	public void calcPrice() {
		if(getName().equals("Cappuccino")) {
			price = 3000;
		}else if(getName().equals("CafeLatte")) {
			price = 2500;
		}else if(getName().equals("Americano")) {
			price = 1500;
		}
		
	}
	
}






