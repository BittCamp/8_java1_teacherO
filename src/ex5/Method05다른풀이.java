package ex5;

import java.util.Scanner;

public class Method05다른풀이 {
	
	public static void main(String[] args) {
	/*[ 김찬영  2023-06-15 오후 03:32:29 ]
	 * ㄴ
	 * 원의 둘레 를 구하는 공식. 2*파이*반지름
	 * 원의 둘레를계산해서 출력하는 함수 (return 없음)
	 * main 에서 원의 반지름(5) ,pi = 3.141592
	 * 매개변수로 반지름과 파이를 전달
	 * 함수에서는 원의 둘레를 출려
	 * */
		Scanner s = new Scanner(System.in);
		System.out.println("원둘레입력!!!");
		int r = s.nextInt();
		double pi = 3.141592;
		calculation(r, pi);
	}
		
	public static void  calculation(int r , double pi) {
		double pii = 2*pi*r;
		System.out.println("원둘레는 "+ pii );
	}
	
	
	
}
