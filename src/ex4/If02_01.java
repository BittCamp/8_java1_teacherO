package ex4;

import java.util.Scanner;

public class If02_01 {
	public static void main(String[] args) {
		// 입력받은 숫자가 3으로 나누어서 나머지가 0이면 3의 배수입니다. 그렇지 않으면 3의 배수가 아닙니다.

		Scanner in = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");

		
		int input = in.nextInt();
		System.out.println(" ");
		System.out.print("결과는???   ");
		if (input%3 == 0) { // 나누기는 %로 계산한다.
			System.out.println(input+"  는 3의 배수입니다.");
		} else {
			System.out.println(input+"  는 3의 배수가 아닙니다.");
		}
		
		
	}
}
