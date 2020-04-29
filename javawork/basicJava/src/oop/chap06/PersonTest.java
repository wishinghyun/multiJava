package oop.chap06;

//Person 클래스를 사용하는 클래스
public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("장동건","서울시",45);
		System.out.println(p.getName()+","+p.getAddr()+","+p.getAge());
		Person pp = new Person("김현수","서울시",27);
		System.out.println(pp.getName()+","+pp.getAddr()+","+pp.getAge());
		
		/*Person p1 = new Person();
		p1.setName("장동건");
		p1.setAddr("서울시");
		p1.setAge(45); // age변수는 private으로 선언되어 있으므로 접근할 수 없다
					 // 같은 클래스에서도 접근할 수 없다
		System.out.println("성명:" + p1.getName());
		System.out.println("주소:" + p1.getAddr());
		System.out.println("나이:" + p1.getAge());

		Person p2 = new Person();
		p2.setName("김현수");
		p2.setAddr("서울시");
		p2.setAge(25);
		System.out.println("성명:" + p2.getName());
		System.out.println("주소:" + p2.getAddr());
		System.out.println("나이:" + p2.getAge());*/
	}

}
