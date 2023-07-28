package ex11;
//[ 김찬영  2023-06-29 오후 12:48:05 ]
public class Example06{
	public static void main(String[] args) {
		try {
			System.out.println("try 블록입니다.");
			throw new MyException("MyException 클래스 호출됩니다."); // 여기서 예외선언한 클래스 호출
		} catch(MyException e) {
			System.out.println("catch 블록입니다.");
			System.out.println(e);
			System.out.println(e.getMessage());
//			MyException(String str2) { // 생성자 만들어주고 super에다가 생성자만들어주고, 이해할수있는 이름 만들어주고.
//				super(str2); 
			// 이렇게 안하면 null 이라고 뜸.
		}
	}
}