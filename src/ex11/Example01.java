package ex11;

public class Example01 {
//[ 김찬영  2023-06-29 오전 10:46:41 ]
// 자바에서 오류가 나면 대체로 Exception이다.
// 익셉션할때는 접미사로 사용한다.
	public static void main(String[] args) {
		// 수학에서 불능에 해당되는 경우 ---- 오류
		
		int a =0;
		int b = 0;
		try {
			b = 5/a;
		} catch(java.lang.ArithmeticException e){
			System.out.println("0으로 나누면 안되요.");
		} /// 문제가 생겨도 꼭해야 되는건 finally에 써줘야한다.
		System.out.println("b: "+ b);
	}
}
