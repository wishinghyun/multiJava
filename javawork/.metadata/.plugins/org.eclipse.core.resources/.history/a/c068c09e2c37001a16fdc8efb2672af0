package api.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		//다음과 같은 변수명으로 HashSet객체 2개 작성하기
		//set1 -> 1부터 10까지의 정수
		//set2 -> 5부터 15까지의 정수
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		for (int i = 1; i <= 10; i++) {
			set1.add(i);
		}
		for (int i = 5; i <= 15; i++) {
			set2.add(i);
		}
		//set1과 set2 합집합 출력하기
		HashSet<Integer> set3 = new HashSet<Integer>(set1);
		set3.addAll(set2);
		print(set3, "set3");
		//set1과 set2 교집합 출력하기
		set1.retainAll(set2);
		print(set1, "set1,2 교집합");
	}
	public static void print(Set<Integer> set, String setName) {
		for (Integer data : set) {
			System.out.println(setName+"에 저장된 요소 : "+data);
		}
		System.out.println("===============================");
	}

}
