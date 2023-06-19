package ex5;

public class Method04 {
//[ 김찬영  2023-06-15 오후 02:42:11 ]
	public static void main(String[] args) {
		System.err.print("1부터 100까지의 합계: " ); // 빨간글씨로 출력됨. 리턴값 이 있어야 "1부터 100까지의 합계: " + sum() 이 가능함.
		//함수를 호출 거기서 출력 함수명은 sum();
		 sum();
		
		
	}
	
	public static void sum() {
		int sum = 0;
		for(int i= 1; i<=100; i++) {
			
			sum +=i;
		}
		System.out.println("값은"+sum);
	
	}
	

}
