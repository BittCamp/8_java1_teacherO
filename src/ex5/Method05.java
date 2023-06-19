package ex5;

public class Method05 {
	
	public static void main(String[] args) {
	/*[ 김찬영  2023-06-15 오후 03:32:26 ]
	 * 
	 * 원의 둘레 를 구하는 공식. 2*파이*반지름
	 * 원의 둘레를계산해서 출력하는 함수 (return 없음)
	 * main 에서 원의 반지름(5) ,pi = 3.141592
	 * 매개변수로 반지름과 파이를 전달
	 * 함수에서는 원의 둘레를 출려
	 * */
		int r=5;
		double pi = 3.14592;
		System.out.print("반지름 "+r+"인 원의 둘레는: " );
		calculata(r, pi);
	}
		
	public static void calculata (int r , double pi) {
		System.out.println(2*pi*r);
	}
	
	
}
