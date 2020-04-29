package backjoon;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		int result = 0;
		if(dan>=1&&dan<=9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan+" * "+i+" = "+dan*i);
			}
		}
	}
}
