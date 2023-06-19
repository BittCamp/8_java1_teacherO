package ex4;

import java.util.Scanner;

public class Loop03 { 
	//[ 김찬영  2023-06-14 오전 10:03:48 ]
	
	public static void main(String[] args) {
		System.out.println("10보다 큰 숫자를 입력하세요.");
		int sum = 0;
		int  x;
		
		do {
			Scanner s = new Scanner(System.in);
			x = s.nextInt();
			if(x>10) sum += x;
			x--;
		} while(x>= 10); // 10보다 작은 수도 더함.
		System.out.println("합계 : " + sum );
	}
}
