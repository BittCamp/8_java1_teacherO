package ex5;

import java.util.Scanner;

public class Method03 { //[ 김찬영  2023-06-15 오후 02:42:16 ]
	
	public static void main (String[] args){
		/*
		 * 두 수를 입력 받아서 최대값을 구하는 로직 
		 * 두수의 최대값을 구하는 기능은 
		 * 메소드로 구현 이름은 max 두 정수를 파라메터로 전달 전달받은
		 * 정수를 이쁘게 출력
		 */		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요.");
		int s1 = s.nextInt();
		System.out.println("숫자를 한개더 입력하세요.");
		int s2 = s.nextInt();
		
		int result = max(s1,s2);
		System.out.println("결과는 " + result );
	}
	public static int max(int a , int b ) {
		int output;
		if(a > b) {
		output = a;
		}else { 
		output = b;
		}
		
		return output;
	}
	
	
}
