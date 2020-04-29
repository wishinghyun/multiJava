package chap04;

import java.util.Scanner;

public class ScoreMultiIfExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int s = scan.nextInt();
		if (s >= 90 & s <= 100) {
			System.out.println("A");
		} else if (s >= 80 & s <= 89) {
			System.out.println("B");
		} else if (s >= 70 & s <= 79) {
			System.out.println("C");
		} else if (s >= 60 & s <= 69) {
			System.out.println("D");
		} else if (s >= 0 & s <= 59) {
			System.out.println("F");
		} else {
			System.out.println("잘못입력");
		}
	}

}
