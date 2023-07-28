package ex11;
//[ 김찬영  2023-06-29 오후 12:48:05 ]

public class InvalidException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidException(String s) { // 생성자 써서 가져와쓰게 했다.
		super(s); // 입력한 것을 상속받는다.
	}
	
}
