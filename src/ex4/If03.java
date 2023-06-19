package ex4;

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner s = new Scanner(System.in);
		int grage = s.nextInt();
		if(grage>= 90) {
			System.out.println("A 학점");
		}else if(grage>= 80){
			System.out.println("B 학점");
		}else if(grage>= 70){
			System.out.println("C 학점");
		}else if(grage>= 60){
			System.out.println("D 학점");
		}else{
			System.out.println("F 학점");
		}
		
	}
	}
