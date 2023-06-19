package ex4;

import java.util.Scanner;

public class Loop01_2 {
	public static void main(String[] args) {
		///[ 김찬영  2023-06-13 오전 11:43:29 ] 
		// 지역변수  범위 설명
		int sum = 0; // 지역변수 인데 범위가
		System.out.println("5개의 숫자를 입력하세요.");
		//int num = 20;
		for( int  n =1; n<= 5; n++) {
			Scanner s = new Scanner(System.in);
			// num 은 지역변수 이므로 for 문을 벗어나면 오류됨.
			int num = s.nextInt();
			/// n 과 num은  for 의지역변수 이므로 for 블럭까지 
		}
		///신텍스에러 문법오류
		//  n = 10; // 선언되지 않아서 오류 
		/*
		 * for (int i:num) { // num은 정의되지 않아서 오류 // 배열일때만 가능
		 * sum += i; // sum = sum+num과 같은 코드
		 * 0이 출력됨.
		 * }
		 */	
		System.out.println("합계 : "+sum);
		}
}
