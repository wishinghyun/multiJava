package oop.chap06;

//MyMethod 클래스에서 정의한 메소드를 사용하는 클래스
public class MyMethodTest {
	public static void main(String[] args) {
		System.out.println("****프로그램 시작****");
		MyMethod m = new MyMethod();

		// 1. 매개변수가 없고 void인 메소드의 호출
		m.display();
		System.out.println("****step1****");
		m.display();
		System.out.println("****step2****");
		m.display();

		// 2. 매개변수가 1개, 리턴값이 없는 메소드의 호출
		m.display("★");
		m.display("※");
		m.display("▣");

		// 3. 리턴값이 없고 매개변수가 2개인 메소드의 호출
		// m.display(50,"↑"); //display(int,String)
		m.display("◇", 30);
		m.display("↑", 50); // display(String,int)

		// 매개변수와 리턴값이 있는 메소드의 호출
		// 리턴값이 있을 경우 리턴값과 동일한 타입의 변수를 선언해서 저장해야 한다
		// 또는 다른 메소드의 매개변수로 전달할 수 있다
		int result = m.add(100, 200);
		System.out.println("메소드 호출 결과=>" + result);

		System.out.println("메소드 호출 결과=>"+m.add(100, 200));
	}

}
