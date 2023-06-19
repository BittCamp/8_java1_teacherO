package ex1;
//[ 김찬영  2023-06-8 오후 05:43:59 ]

public class Datatype04 {
    //int j; 공간이 분리되어있기에...
    static int j; //static 에서 쓰려면 이렇게 써줘야한다.
	public static void main(String[] args) {
		String str = "Java";
		String str2 = "Program"; 
		//스트링은 클래스 타입이다. 클래스 타입은 메소드를 쓸수가 있다.
		 char c = str.charAt(0); //str클래스
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(c);
		System.out.println(j);
	}
}
