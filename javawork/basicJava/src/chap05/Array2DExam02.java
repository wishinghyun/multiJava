package chap05;
//workbook 21p 2¹ø
public class Array2DExam02 {
	public static void main(String[] args) {
		/*int [][] arr2 = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total=0;
		int count=0;
		for (int j=0;j<arr2.length;j++) {
			for(int i=0;i<arr2[j].length;i++) {
				total = total + arr2[j][i];
				count++;
			}
			
		}
		float avg = (float)total/(float)count;
		
		System.out.println(total);
		System.out.println(avg);*/
		
		int [][] arr2 = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		int sum = 0;
		double avg = 0.0;
		int count=0;
		for(int row = 0;row<arr2.length;row++) {
			for(int i = 0;i<arr2[row].length;i++) {
				sum = sum + arr2[row][i];
				count++;
			}
		}
		System.out.println("total="+sum+",count="+count);
		System.out.println("average="+((double)sum/count));
	}

}











