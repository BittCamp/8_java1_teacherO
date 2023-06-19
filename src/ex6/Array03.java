package ex6;

import java.util.Scanner;

public class Array03 {
	
	public static void main(String[] args) {
		double[][] marks = new double[2] [3];
		Scanner s = new Scanner(System.in);
		
		for( int i =0; i < marks.length; i++) {
			System.out.println("학생 번호 " + (i +1));
			System.out.println("국어 점수 ");
			marks[i][0] = s.nextDouble();
			
			System.out.println("수학 점수 ");
			marks[i][1] = s.nextDouble();
			
			marks[i][2] = (marks[i][0] + marks[i][1])/2;
			
		}
		
		// 학생번호, 국어 , 수학, 평균을 출력해 봅시다.
		// for 문은 하나만 쓰시오.
		for(int i=0; i<marks.length; i++) {
			System.out.print("학생번호: " + (i+1));
			System.out.print("국어점수: " + marks[i][0]+":::");
			System.out.print("수학점수: " + marks[i][1]+":::");
			System.out.println("개인평균: " + marks[i][2]);
		}
		
	}
}
