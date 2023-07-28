package ex10.com.section01;
//[ 김찬영  2023-06-27 오후 04:27:18 ]
public class Example01 {
	
	public int add ( int a , int b ) {
		return a+b;
	}
	public static void main (String[] args) {
		Example01 obj = new Example01();
		System.out.println(obj.add(10,20));
		// 이렇게 스캐너 클래스 쓸수도 있다.
		// 주어진 이름대로 해도 충돌 날 수도 있다. 경로를 정확하게 적어 줘야될때도 있다.
		java.util.Scanner s =new java.util.Scanner(System.in);
	}
}
