package backjoon;

import java.util.Scanner;

public class silsuep6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			star1(c);
			System.out.println();
			star2(c);
			if(c>1) {
				System.out.println();
			}
		}
		
	}
	public static void star1(int a) {
		if(a%2==1) {
			for (int i = 0; i < a; i+=2) {
				System.out.print("*");
				if(i==a-1) {
					break;
				}
				System.out.print(" ");
			}
		}else {
			for (int i = 0; i < a; i+=2) {
				System.out.print("*");
				if(i==a-1) {
					break;
				}
				System.out.print(" ");
			}
		}
	}
	
	public static void star2(int b) {
		if(b%2==1) {
			for (int i = 0; i < b; i+=2) {
				System.out.print(" ");
				if(i==b-1) {
					break;
				}
				System.out.print("*");
			}
		}else {
			for (int i = 0; i < b; i+=2) {
				System.out.print(" ");
				if(i==b-1) {
					break;
				}
				System.out.print("*");
			}
		}
	}
}
