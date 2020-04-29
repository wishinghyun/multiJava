package oop.chap07.poly;

public class Tea extends Beverage {
	static int amount;
	public Tea() {
		
	}
	public Tea(String name) {
		super(name);
		amount++;//Tea가 판매 되면 1씩 증가		
		calcPrice();//주문되는 음료의 가격을 계산
	}
	
	public static int getAmount() {
		return amount;
	}
	@Override
	public void calcPrice() {
		if(getName().equals("redginsengTea")) {
			price = 2500;
		}else if(getName().equals("ginsengTea")) {
			price = 2000;
		}else if(getName().equals("lemonTea")) {
			price = 1500;
		}
	}
	
}
