package chap04;

public class GuGu {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int row = 1; row <= 9; row++) {
				System.out.print(i + "x" + row + "=" + row * i + "\t");
			}
			System.out.println();
		}
	}

}
