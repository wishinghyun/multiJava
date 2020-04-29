package oop.chap06;

import oop.chap07.Staff;
import oop.chap07.Teacher;

public class Test06 {
	public static void main(String[] args) {
		Student s1 = new Student("Kim",25,100,90,95,89);		
		Student s2 = new Student("Lee",20,60,70,99,98);
		Student s3 = new Student("Park",19,68,86,60,40);
		
		Teacher t1 = new Teacher("장동건", 45, "Spring");
		Staff s = new Staff("김현수", 27, "전산실");
		s1.print();
		s2.print();
		s3.print();
		t1.print();
		s.print();
	}

}
