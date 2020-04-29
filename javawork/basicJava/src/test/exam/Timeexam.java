package test.exam;
public class Timeexam{
	public static void main(String[] args){
		//time변수에 저장된 값은 초 데이터이다.
		//___시___분___초   의 형태로 출력하기
		int time = 8888;
		int x = time/3600;
		int y = (time-x*3600)/60;
		int z = time%60;
		System.out.println(x+"시 " + y+"분 "+ z+"초");
	
	}
}
