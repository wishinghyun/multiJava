package workbook;

public class Test06_Array {

	public static void main(String[] args) {
		Student[] studentArr = new Student[3];

		studentArr[0] = new Student();
		studentArr[0].setName("Kim");
		studentArr[0].setKorean(100);
		studentArr[0].setEnglish(90);
		studentArr[0].setMath(95);
		studentArr[0].setScience(89);

		studentArr[1] = new Student();
		studentArr[1].setName("Lee");
		studentArr[1].setKorean(60);
		studentArr[1].setEnglish(70);
		studentArr[1].setMath(99);
		studentArr[1].setScience(98);

		studentArr[2] = new Student();
		studentArr[2].setName("Park");
		studentArr[2].setKorean(68);
		studentArr[2].setEnglish(86);
		studentArr[2].setMath(60);
		studentArr[2].setScience(40);

		for (int i = 0; i < studentArr.length; i++) {
			studentArr[i].print();
		}

		/*
		 * System.out.println(Kim.getName()+" Æò±Õ:"+Kim.getAvg()+" ÇĞÁ¡:"+Kim.getGrade());
		 * System.out.println(Lee.getName()+" Æò±Õ:"+Lee.getAvg()+" ÇĞÁ¡:"+Lee.getGrade());
		 * System.out.println(Park.getName()+" Æò±Õ:"+Park.getAvg()+" ÇĞÁ¡:"+Park.getGrade()
		 * );
		 */

	}

}
