package chap04;
//입력받은 구구단을 출력
import java.util.Scanner;

public class ForExam02 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("출력 단:");
		int num1 = num.nextInt();
		for (int i = 1; i <=9; i++) {
			System.out.println(num1+"*"+i+"="+num1*i);
		}
	}

}
