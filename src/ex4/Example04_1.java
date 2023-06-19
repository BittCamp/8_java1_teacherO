package ex4;

import java.util.Scanner;

public class Example04_1 {
	public static void main(String[] args) {
		System.out.println("성별을 입력하세요");
		Scanner s1 = new Scanner(System.in);
		String in = s1.nextLine();
		
		System.out.println("생년을 입력하세요");
		Scanner s2 = new Scanner(System.in);
		int age = s2.nextInt();
		
		//남성이냐 , 여성
		//중첩으로 2000년 이전 출생, 2000년 이후 출생.
		
		if(in.equals("남성")) {
			if(age>=2000) {
				System.out.println("2000년 이후 출생 남성");
			}else {
				System.out.println("2000년 이전 남성");
			}
		}else if (in.equals("여성")){
			if(age>=2000) {
				System.out.println("2000년 이후 출생 여성");
			}else {
				System.out.println("2000년 이전 여성");
			}
		}else {
			System.out.println("성별 입력 오류");
		} 
		
	}
}
