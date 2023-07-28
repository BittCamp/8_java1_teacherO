package ex11;

public class Example02 {
//[ 김찬영  2023-06-29 오전 10:46:41 ]
	public static void main(String[] args) {
		try {
			Integer in = new Integer("abc");
			in.intValue();
		} 
		catch(ArithmeticException e) {
			System.out.println("예외 발생 ArithmeticException "+ e);
		}
		catch (NumberFormatException e) {
			System.out.println("예외 발생 NumberFormatException " + e);
		}
		System.out.println("try~catch 문의 외부 문장입니다.");
		
	}
}
