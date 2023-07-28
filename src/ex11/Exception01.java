package ex11;

import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num1 = s.nextInt();
		
		try {
			int num2 = 10/num1;
			System.out.println(num2);
		}catch(Exception e) {
			System.out.println("올바른 숫자를 입력하세요.");
			System.out.println(e.getMessage());
			e.printStackTrace(); // 오류문장을 출력하도록 함.
		}
		System.out.println("try-catch 블록의 외부 문장입니다.");
	}
}
