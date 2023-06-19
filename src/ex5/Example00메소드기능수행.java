package ex5;

import java.util.Scanner;

public class Example00메소드기능수행 {
//[ 김찬영  2023-06-14 오후 12:07:42 ] 메소드기능수행
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		num = s.nextInt();
		// 짝수냐? 짝수면 짝수라고 출력. 홀수면 홀수라고 출력
		method1(num);
		
		System.out.println("정수를 입력하시오.");
		num = s.nextInt();
		// 짝수냐? 짝수면 짝수라고 출력. 홀수면 홀수라고 출력
		method1(num);

		System.out.println("정수를 입력하시오.");
		num = s.nextInt();
		// 짝수냐? 짝수면 짝수라고 출력. 홀수면 홀수라고 출력
		method1(num);

		
	}
	public static void method1(int num) {
		if(num%2 == 0) {
			System.out.println(num + "은 짝수 입니다.");
		}else{
			System.out.println(num + "은 홀수 입니다.");
		}
	}
	
	
}
