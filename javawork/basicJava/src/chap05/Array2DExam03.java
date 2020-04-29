package chap05;
// workbook 22p 3¹ø
public class Array2DExam03 {
	public static void main(String[] args) {
		int [][] arr2 = {
				{5,5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30,30}
				};
		
		
		for(int j=0;j<arr2.length;j++) {
			for(int i=0;i<arr2[j].length;i++) {
				System.out.print(arr2[j][i]+"\t");
			}
			System.out.println();
		}System.out.println();
		
		int sum=0;
		double count=0;
		for(int j=0;j<arr2.length;j++) {
			for(int i=0;i<arr2[j].length;i++) {
				sum = sum + arr2[j][i];
				count++;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("avg="+(double)sum/count);
	}
	}

