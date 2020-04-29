package chap09.api.lang;
//String클래스의 기본 메소드
public class StringTest02 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));//1번요소의 문자
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));//문자열 연결 (중첩가능)
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));//앞에서 a의 요소번호
		System.out.println("str1.indexOf('합')=>"+str1.indexOf('합'));//'합'이 없을경우 -1 출력
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));//뒤에서부터 문자검색
		System.out.println("str1.length()=>"+str1.length());//띄어쓰기 포함 길이
		
		//문자열 비교 - 정확하게 대소문자까지 비교
		System.out.println("str1.equals(\"java programming\")=>"
									+ str1.equals("java programming"));
		System.out.println("str1.equals(\"Java programming\")=>"
									+ str1.equals("Java programming"));
		
		
		//문자열 비교 - 대소문자 비교 안함
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"
				+ str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"
				+ str1.equalsIgnoreCase("Java programming"));
		
		//문자열비교 - prefix
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"Java\")=>"+str1.startsWith("ming"));
		
		//문자열비교 - suffix
		System.out.println("str1.endsWith(\"ming\")=>"+str1.endsWith("ming"));
	}

}





