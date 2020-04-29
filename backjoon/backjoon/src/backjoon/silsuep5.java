package backjoon;

import java.util.Scanner;

public class silsuep5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 1; j <= a; j++) {
				if(j>i) {
						System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			for (int j = a-1; j > 0; j--) {
				if(j>i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 1; i < a; i++) {
			for (int j = a-1; j > 0; j--) {
				if(j>i) {
						System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			for (int j = 0; j < a; j++) {
				if(j>i) {
						System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
