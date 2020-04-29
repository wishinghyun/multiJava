package backjoon;

import java.util.Scanner;

public class iftest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m>=45) {
			m = m - 45;
		}else {
			if(h==0) {
				h = 24;
			}
			h = h-1;
			m = 60 - (45 - m);
		}
		System.out.println(h+" "+m);
	}
}
