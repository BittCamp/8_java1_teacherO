package ex6;

import java.util.Scanner;

public class Example03_3 {
	//[ 김찬영  2023-06-19 오전 10:30:27 ]
	public static void main(String[] args) {
		// 입력을 5번 받아서 배열에 저장
		// 정수만 받기
		int num[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 5개 입력하시오.");
		for(int i =0; i< num.length; i++) {
			num[i] =s.nextInt();
			
		}
		int sum=0;
		// 받은 정수의 합을 구하고 출력
		for( int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		System.out.println("받은정수의합"+sum);
	}
}
