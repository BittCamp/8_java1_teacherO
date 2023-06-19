package ex6;

import java.util.Iterator;
import java.util.Scanner;

public class Array04_1_연습{
	//[ 김찬영  2023-06-19 오전 11:19:45 ]
	public static void main(String[] args) {
		// 2행 3열 배열을 선언
		int num[][] = new int[2][3];
		// 2행 3열의 정수를 입력받아서 저장
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		for(int i =0; i<num.length; i++) { // 행의길이
			for(int j =0; j<num[i].length; j++) { //열의 길이
				num[i][j] = s.nextInt();
			}
		}
		//0 행과 1행의 각 요소의 합을 구하기
		//sum[3]
		int sum[] = new int[3];
		for(int i = 0; i < num[0].length; i++) {
			sum[i] = num[0][i] + num[1][i];
		}
		//각 열의 합 출력
		System.out.println("각 열의합 출력");
		for(int i =0; i< sum.length; i++) {
			System.out.println(sum[i]+"\t");
		}
		System.out.println("\n");
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j] + "\t"); //열출력
			}
			System.out.println();
		}
		
	}
}
