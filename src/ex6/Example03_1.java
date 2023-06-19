package ex6;

public class Example03_1 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-19 오전 10:30:36 ]
		int[] num = {10,20,30,40,50,60,70};
		// num 배열의 값을 출력
		
		// 일반적인 for
		System.out.println("1번결과는요 ");
		for (int i = 0; i<num.length; i++) {
			System.out.print( " "+ num[i]);			
		}
		
		System.out.println("\n");
		
		System.out.println("2번결과는요 ");
		//확장형 for
		for (int n : num) {
			System.out.print( " "+ n);
		}
		
	}
}
