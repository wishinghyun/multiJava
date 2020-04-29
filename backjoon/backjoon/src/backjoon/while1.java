package backjoon;

import java.util.Scanner;

public class while1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			while (0<a&&a<10&&0<b&&b<10) {
				System.out.println(a+b);
				a = sc.nextInt();
				b = sc.nextInt();
				
			}
		}
	}

}
