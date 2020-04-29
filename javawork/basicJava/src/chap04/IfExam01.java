package chap04;

import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = key.nextInt();
		if (num<0) {
			System.out.println(num+"는 음수입니다");
		}else {
			if(num>0 && num%2==1) {
				System.out.println(num+"은 음수입니다");
			}else {
				System.out.println(num+"는 짝수입니다");
			}
		}
	}

}
