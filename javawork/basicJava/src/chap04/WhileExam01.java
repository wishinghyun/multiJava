package chap04;
//ForExam03À» While¹®À¸·Î º¯°æ
public class WhileExam01 {
	public static void main(String[] args) {
		int sum = 0;
		int even = 0;
		int odd = 0;
		int sumVal = 1;
		while (sumVal<=100) {		
			sum = sum + sumVal;
			sumVal++;
			if (sumVal%2==0) {
				even = even + sumVal;
			}else {
				odd = odd +sumVal;
			}
		}
		System.out.println("ÃÑÇÕ:"+sum);
		System.out.println("Â¦¼öÇÕ:"+even);
		System.out.println("È¦¼öÇÕ:"+odd);
	}

}
