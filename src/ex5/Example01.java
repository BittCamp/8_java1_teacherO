package ex5;

public class Example01 {
	//[ 김찬영  2023-06-14 오후 12:54:02 ]
	
	private static void method() { //public 다른 파일에서 부를수 있음. private 다른 파일에서 못부름.
		System.out.println("static메서드 입니다.");
		System.out.println(5 +6);
	}

		
	public static void main(String[] args) {
		method();
	}
}
