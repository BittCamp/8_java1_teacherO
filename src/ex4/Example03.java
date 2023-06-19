package ex4;

import java.util.Scanner;

public class Example03 {
	//[ 김찬영  2023-06-12 오후 05:19:30 ]
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요!");
		int num = s.nextInt();
		//int num = 20;
		
		
		if(num == 10) {
			System.out.println("숫자가 10입니다.");
		}else if (num == 15) {
			System.out.println("숫자가 15입니다.");
		}else if(num == 20) {
			System.out.println("숫자가 20입니다.");
		}else 
		{System.out.println("숫자가 존재하지 않습니다.");}
		
		System.out.println("done");
	}
}
