package workbook;
//Test06
public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	public double getAvg() {
		double avg = (this.korean+this.english+this.math+this.science)/4.0;
		return avg;
	}
	public String getGrade() {
		double avg = getAvg(); 
		String grade = "";
		if(avg>=90 & avg<=100) {
			grade = "A학점";
		}else if(avg>=70) {
			grade = "B학점";
		}else if(avg>=50) {
			grade = "C학점";
		}else if(avg>=30) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}return grade;
	}
	public void print() {
		System.out.println(getName()+" 평균:"+getAvg()+" 학점:"+getGrade());
	}
}












