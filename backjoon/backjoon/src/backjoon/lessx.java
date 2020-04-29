package backjoon;

import java.util.Scanner;

public class lessx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] list = new int[N];
		for (int i = 0; i < list.length; i++) {
			int a = sc.nextInt();
			list[i] = a;
			if(a<X) {
				System.out.print(a+" ");
			}
		}
		
		
		
	}

}
