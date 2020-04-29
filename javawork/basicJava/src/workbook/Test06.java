package workbook;

public class Test06 {
	public static void main(String[] args) {
		Student Kim = new Student();
		Kim.setName("Kim");
		Kim.setKorean(100);
		Kim.setEnglish(90);
		Kim.setMath(95);
		Kim.setScience(89);
		Student Lee = new Student();
		Lee.setName("Lee");
		Lee.setKorean(60);
		Lee.setEnglish(70);
		Lee.setMath(99);
		Lee.setScience(98);
		Student Park = new Student();
		Park.setName("Park");
		Park.setKorean(68);
		Park.setEnglish(86);
		Park.setMath(60);
		Park.setScience(40);
		
		Kim.print();
		Lee.print();
		Park.print();
		
		/*System.out.println(Kim.getName()+" Æò±Õ:"+Kim.getAvg()+" ÇÐÁ¡:"+Kim.getGrade());
		System.out.println(Lee.getName()+" Æò±Õ:"+Lee.getAvg()+" ÇÐÁ¡:"+Lee.getGrade());
		System.out.println(Park.getName()+" Æò±Õ:"+Park.getAvg()+" ÇÐÁ¡:"+Park.getGrade());*/
		
	}

}
