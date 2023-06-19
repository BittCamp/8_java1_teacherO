package ex2;
//[ 김찬영  2023-06-9 오후 01:00:23 ]
import		java.util.Scanner;

public class Input01 {
//[ 김찬영  2023-06-9 오후 12:49:53 ] 유틸스캐너
	// 인스턴스 : 클래스 안에 있는 객체
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("정숫값 입력하기");
		int n = s1.nextInt();
		System.out.println("실숫값 입력하기");
		double db = s1.nextDouble();
		
		Scanner input = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하세요.");
		String name = input.nextLine(); // 입력을 받고 다음 라인으로 내려가라
		System.out.println("당신의 이름 : " + name );
		
		System.out.println("정숫값: " + n);
		System.out.println("실숫값: " + db);
		
		


		
	}

}

