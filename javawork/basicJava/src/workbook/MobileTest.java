package workbook;
//60p
public class MobileTest {
	public static void main(String[] args) {
		Ltab l1 = new Ltab("Ltab",500,"AP-01");
		Otab o1 = new Otab("Otab",1000,"AND-20");
		
		System.out.println("Mobile  Battery  OS");
		System.out.println("-----------------------------------");
		System.out.println(l1.getMobileName()+"\t"+l1.operate(10)+"\t"+l1.getOsType());
		System.out.println(o1.getMobileName()+"\t"+o1.operate(10)+"\t"+o1.getOsType());
		
		
		
		
		
	}

}
