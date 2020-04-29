package backjoon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class aplusb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ArrayList list = new ArrayList(T);
		int a = 0;
		int b = 0;
		for (int i = 0; i < T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			list.add(i, a+b);
		}
		for (int i = 0; i < T; i++) {
			System.out.println(list.get(i));
		}
	}

}
