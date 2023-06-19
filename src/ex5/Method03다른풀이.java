package ex5;

import java.util.Scanner;

public class Method03다른풀이 { //[ 김찬영  2023-06-15 오후 02:42:20 ]
	
	public static void main (String[] args){
		/*
		 * 두 수를 입력 받아서 최대값을 구하는 로직 
		 * 두수의 최대값을 구하는 기능은 
		 * 메소드로 구현 이름은 max 두 정수를 파라메터로 전달 전달받은
		 * 정수를 이쁘게 출력
		 */		
		int a,b ;
		System.out.println("2개의 숫자를 입력하세요.");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		s = new Scanner(System.in);
		b = s.nextInt();
		
		int max = max(a,b);
		System.out.println(a +"와 "+b +"중 " +max+" 가 큽니다.");
		
	}

	private static int max(int a, int b) {
		if( a>= b) return a;
		else return b;
		
		// 이렇게도 쓸수있음.
	}

	
}
