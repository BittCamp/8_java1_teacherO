package ex6;

import java.util.Scanner;

public class Example03_3_연습 {
	//[ 김찬영  2023-06-19 오전 10:30:27 ]
	public static void main(String[] args) {
		// 입력을 5번 받아서 배열에 저장
		int arr[] = new int[5]; 
		// 정수만 받기
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i<arr.length+1 ; i++) {
			System.out.println(i+ "번 숫자를입력하세요");
			int input = s.nextInt();
			sum+=input;
		}

		// 받은 정수의 합을 구하고 출력
		System.out.println("정수의 합은" +  sum);
	}
}
