package backjoon;

import java.util.Scanner;

public class silsuep2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
			if(a>b) {
				a=b;
				if(b>c) {
					a=c;
				}
			}else if(a>c) {
				a=c;
				if(c>b) {
					a=b;
				}
			}
			if(d>e) {
				d=e;
			}
		System.out.println(a+d-50);
	}

}
