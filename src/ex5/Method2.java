package ex5;

public class Method2 {
	public static int div() { // 메소드[ 김찬영  2023-06-15 오후 03:32:22 ]
		
		int a = 10, b =5;
//		int result = a/b ;
//		
//		return result;
		
		return a/b; // 이것도 됨.
	}
	
	
	public static void main(String[] args) {
		int num = div();
		System.out.println(num);
	}
}
