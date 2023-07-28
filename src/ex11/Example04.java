package ex11;

public class Example04 {
	//[ 김찬영  2023-06-29 오후 12:21:09 ]
	static void check() throws ArithmeticException {// 익셉션 생기면 던져라.
		System.out.println("내부 메서드");
		int div = 5/0;
		// throws ArithmeticException 이거안쓰면 비정상 종료됨. 근데 밑에서 트라이케치있어서 오류안나고 실행됨. 안전장치로 한개더해준거임.
	}
	public static void main (String[] args) {
		try {
			check();//메소드 호출
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 " + e );
		}
	}
}
