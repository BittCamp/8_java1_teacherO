package ex4;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		System.out.println("당신의 나이를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		
		if (age >= 18) {
			System.out.println("당신의 나이는 18세 이상입니다.");
			System.out.println("당신은 투표할 자격이 있습니다.");
		}
		System.out.println("이 문장은 if문 외부에 있습니다.");
	
		
		System.out.println("============================================================================================================");
		
		System.out.println("한번 더 할게요. 당신의 나이는요??");
		
		Scanner si = new Scanner(System.in);
		age = si.nextInt();
		
		if (age > 25 ) {
			System.out.println("당신은 나이가 많네요~");
		}
		System.out.println("음... 그렇다고..");
	}
	
}
