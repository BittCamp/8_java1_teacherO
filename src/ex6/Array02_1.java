package ex6;

import java.util.Scanner;

public class Array02_1 {
	//[ 김찬영  2023-06-16 오후 04:50:49 ]
	public static void main(String[] args) {
		//5개의 점수(정수)를 입력받아서 총점과 평균을 구하고 출력하시오.
		int[] score = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("5개 정수를 입력하세요.");
		int sum = 0;
		double avg = 0.0;
		for(int i=0;i<5;i++) {
			score[i]= s.nextInt();
			sum+=score[i];
		}
		avg = sum/score.length;
		System.out.println( "총합은: " + sum);
		System.out.println( "평균은: " + avg);
		System.out.printf( "평균은: %6.3f", avg);
	}
}
