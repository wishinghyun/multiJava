package workbook;

public class Company {
	private double salary;					//기본급
	private double annualIncome;			//년소득
	private double afterTaxAnnualIncome;	//세금 공제 후 년소득의 합
	private double bonus;					//보너스
	private double afterTaxBonus;			//세금 공제 후 년 보너스의 
	
	public Company() {
		
	}
	public Company(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public double getAfterTaxAnnualIncome() {
		return afterTaxAnnualIncome;
	}
	public double getAfterTaxBonus() {
		double afterTaxBonus = getBonus()*0.945;
		return afterTaxBonus;
	}
	public double getIncome() {
		double income = salary*12;
		return income;
	}
	public double getAfterTaxIncome() {
		double getAfterTaxIncome = getIncome()*0.9;
		return getAfterTaxIncome;
	}
	public double getBonus() {
		double getBonus = getSalary()*4*0.2;
		return getBonus;		
	}
	
}
