package chap05;

import java.util.Random;

//workbook 23p 4¹ø
public class Array2DExam04 {
	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0;
		double count = 0;
		Random rand = new Random();
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = rand.nextInt(10) + 1;
			System.out.print(arr3[i] + " ");
			sum = sum + arr3[i];
			count++;
		}
		System.out.println();
		System.out.println("sum=" + sum);
		System.out.println("avg=" + sum / count);

	}
}
