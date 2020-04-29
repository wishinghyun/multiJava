package chap05;

//workbook 14p 7¹ø
public class ArrayExam04 {
	public static void main(String[] args) {

		System.out.println(args[0]);
		int x = 0;
		int num = Integer.parseInt(args[0]);
		for (int i = 1; i <= 100; i++) {
			if (i % num == 0) {
				x = x + i;
			}
		}

		for (int j = 1; j <= 100; j++)
			if (j % num == 0) {
				System.out.print(j + "+");
			}
		System.out.println("=" + x);

	}

}
