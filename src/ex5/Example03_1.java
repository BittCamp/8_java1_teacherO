package ex5;

public class Example03_1 {

	public static void main(String[] args) {//[ 김찬영  2023-06-15 오후 02:42:35 ]
		
		// 정수형 변수 a와 b를 선언하고 a=5,b=6 저장.
		// 덧셈을 하는 메소드를 호출 add(5가 들어가 있는 변수, 6이 들어가 있는 변수)
		// add 함수는 반환되는 값이 정수형이므로 정수형으로 받는 변수는 sum
		// 출력을 이쁘게 해보기 sum
		
		int  a=5, b= 6;
		
		int sum = add(5,6);
		
		System.out.println(a + "와(과) " + b + " 의 합은: " + sum );

	}

	
	
	public static int add(int a , int b ) { // a,b 도 지역변수 
		return a+b;
	}
	
}
 