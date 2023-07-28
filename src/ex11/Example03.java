package ex11;

public class Example03 {
	//[ 김찬영  2023-06-29 오후 12:21:09 ]
	public static void main(String[] args) {
		int a[] = new int[2];
		try {
			System.out.println("잘못된 요소에 접근 : "+ a[3]); // a[3] 이라서 안나온다.
			System.out.println("try 마지막");
		}
		catch(Exception e ) {
			System.out.println("예외 발생 ArrayIndexOutOfBoundException "+ e);
			
		}finally {
			System.out.println("finally는 항상 실행됩니다.");
		}
	}
}
