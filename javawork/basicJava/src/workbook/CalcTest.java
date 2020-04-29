package workbook;

//67p workbook
public class CalcTest {
	public static void main(String[] args) {		
		Calculator cal = new Calculator();
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		double result = cal.divide(num1,num2);
		System.out.println("°á°ú:"+result);
	}

}
