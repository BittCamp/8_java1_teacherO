package ex6;

import java.util.Scanner;

public class Array02_1답안{
	//[ 김찬영  2023-06-16 오후 04:50:49 ]
	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0.0;
		
		System.out.println("5명의 점수를 입력하시오.");
		for(int i =0; i < score.length; i++) {
			score[i] = s.nextInt();
			sum+=score[i];
		}
		avg = (sum*1.0)/score.length; //우변에 있는 숫자중 하나를 실수로 입력해줘서 실수로 정확히 출력됨. 이게 정확한 식임.
		//avg = sum/score.length; 좌변은 실수타입이지만 우변에 있는 숫자가 전부 정수라 계산식이 실수로 출력이 안됨.
		System.out.println("점수의 총합 " + sum);
		System.out.println("전체 평균 " + avg);
		System.out.printf("전체 평균: %6.3f", avg);
	}
	}