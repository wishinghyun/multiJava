package chap03;
//기본형과 참조형 변수의 비교
public class VariableTest {
	public static void main(String[] args) {
		
//		비교형 변수
		int i = 10;
		int j = 10;
		System.out.println("=======기본형=======");
		if(i==j) {
			System.out.println("기본형 같다");
		}else {
			System.out.println("기본형 다르다");
		}
		
//		참조형 변수
		String str1 = new String("java");
		String str2 = new String("java");
//		str1=str2;
		if (str1==str2) {
			System.out.println("참조형 같다");
		}else {
			System.out.println("참조형 다르다");
		}
		
//		문자열 비교 - String클래스 메소드로 처리
		
		/*boolean result = str1.equals(str2);
		if (result==true) or if(result) 아래 식과 같은 의미*/
		if (str1.equals(str2)) {
			System.out.println("문자열 같다");
		}else {
			System.out.println("문자열 다르다");
		}
	}

}
