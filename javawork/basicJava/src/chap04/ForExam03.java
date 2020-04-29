package chap04;

public class ForExam03 {
	public static void main(String[] args) {
		int sumVal =0;    //ÃÑÇÕ
		int evenSumVal=0; //Â¦¼öÇÕ
		int oddSumVal=0;  //È¦¼öÇÕ
		for (int i = 1; i<=100; i++) {
			sumVal = sumVal + i;
			if (i%2==0) {
				evenSumVal = evenSumVal+i;
			}else {
				oddSumVal = oddSumVal+i;
			}
			}
		System.out.println("ÃÑÇÕ:"+sumVal);
		System.out.println("Â¦¼öÇÕ:"+evenSumVal);
		System.out.println("È¦¼öÇÕ:"+oddSumVal);
		}
		
	}

