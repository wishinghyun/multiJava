package chap03;

import java.util.Random;

public class APIExam {
	public static void main(String[] args) {
		Random rand = new Random();
		int returnRandom = rand.nextInt();
		System.out.println("·£´ı°ª=>"+returnRandom);
		
		Random rand2 = new Random();
		int result = rand2.nextInt(100);
		System.out.println(result);
		
	}

}
