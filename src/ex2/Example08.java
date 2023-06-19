package ex2;
import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
	
		//System.in  은 표준 입력 사용
		//new Scanner() 는 객체를 생성(입력용) 표준 입력을 받는 것으로 생성
		// new Scanner 설계도를 보고 객체를 만들어라.
		Scanner input = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요.");
		
		String name = input.nextLine(); // 입력을 받고 다음 라인으로 내려가라
		
		
	
		System.out.println("당신의 이름 : " + name );
		
		//Scanner 는 콘솔창에 데이터 입력하면 다시 쓸때 해당 데이터가 출력이 된다.
		
	}
}
