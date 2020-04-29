package chap04;

// if문을 중첩해서 사용하는 연습 - gender와 age를 판단해서 결과를 출력하는 예제
import java.util.Scanner;

// Ctrl + shift + f 를 누르면 코드를 정리
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("남자는 1,3 여자는 2,4를 입력할 것");
		System.out.print("성별을 입력하세요:");
		int sex = key.nextInt();

		if (sex < 1 || sex > 4) {
			System.out.println("숫자를 잘못입력");
		} else {
			System.out.print("나이를 입력하세요:");
			int age = key.nextInt();
			if (sex == 1 || sex == 3) {
				if (age >= 1 && age < 20) {
					System.out.println("청소년남자");
				} else {
					System.out.println("성인남자");
				}
			} else {
				if (age >= 1 && age < 20) {
					System.out.println("청소년여자");
				} else {
					System.out.println("성인여자");
				}

			}
		}

	}

}
