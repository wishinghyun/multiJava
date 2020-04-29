package backjoon;

import java.util.Scanner;

public class silsuep4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int k = 0; k <= i; k++) {
					System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if(j>i) {
					System.out.print("*");
				}
			}
				System.out.println();
		}
	}

}
