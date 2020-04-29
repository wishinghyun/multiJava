package workbook;
//p55
public class Test02 {
	public static void main(String[] args) {
		//Company의 salary가 double이고 입력받은 money가 int이므로
		//자동casting이 된다
		int money = Integer.parseInt(args[0]);
	Company c = new Company(money);
	System.out.println("연 기본급 합: "+c.getIncome()+" 세후: "+c.getAfterTaxIncome());
	System.out.println("연 보너스 합: "+c.getBonus()+"	   세후: "+c.getAfterTaxBonus());
	System.out.println("연 지급액 합: "+(c.getAfterTaxIncome()+c.getAfterTaxBonus()));
}
}