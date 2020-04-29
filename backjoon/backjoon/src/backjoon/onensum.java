package backjoon;

import java.util.Scanner;

public class onensum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = sc.nextInt();
		int result = 0;
		for (int i = 0; i < b; i++) {
			result = result + a;
			a++;
		}
		System.out.println(result);
	}
}
