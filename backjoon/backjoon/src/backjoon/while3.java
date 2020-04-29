package backjoon;

import java.util.Scanner;

public class while3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = "";
		int e = 0;
		int z = 0;
		int result = 0;
		if(a<10) {
			b = ("0"+Integer.toString(a));
		}else {
			b = Integer.toString(a);
		}
		while(b!=Integer.toString(a)) {
			int c = Integer.parseInt(b.substring(0,1)); 
			int d = Integer.parseInt(b.substring(1,2));
			e = c+d;
			b = Integer.toString(d)+(e%10);
			z=Integer.parseInt(b);
			result = result + 1;
			if(z==a) {
				break;
			}
		}
		System.out.println(result);
	}

}
