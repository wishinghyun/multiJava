package chap09.api.lang;
//StringŬ������ �⺻ �޼ҵ�
public class StringTest02 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));//1������� ����
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));//���ڿ� ���� (��ø����)
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));//�տ��� a�� ��ҹ�ȣ
		System.out.println("str1.indexOf('��')=>"+str1.indexOf('��'));//'��'�� ������� -1 ���
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));//�ڿ������� ���ڰ˻�
		System.out.println("str1.length()=>"+str1.length());//���� ���� ����
		
		//���ڿ� �� - ��Ȯ�ϰ� ��ҹ��ڱ��� ��
		System.out.println("str1.equals(\"java programming\")=>"
									+ str1.equals("java programming"));
		System.out.println("str1.equals(\"Java programming\")=>"
									+ str1.equals("Java programming"));
		
		
		//���ڿ� �� - ��ҹ��� �� ����
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"
				+ str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"
				+ str1.equalsIgnoreCase("Java programming"));
		
		//���ڿ��� - prefix
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"Java\")=>"+str1.startsWith("ming"));
		
		//���ڿ��� - suffix
		System.out.println("str1.endsWith(\"ming\")=>"+str1.endsWith("ming"));
	}

}




