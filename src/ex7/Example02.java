package ex7;

public class Example02 {
	//[ 김찬영  2023-06-20 오후 03:28:26 ]
	
	static void myMethod1() { // static은 정적메서드
		System.out.println("정적 메서드 호출");
	}
	// 정적 메소드 (static): 생성자 없이도 생성이 가능한 메소드
	public void myMethod2() {
		System.out.println("인스턴스 메서드 호출");
	}
	public static void main(String[] args) {
		System.out.println("정적 메서드 호출");
		myMethod1(); /// static은 바로호출가능.
		 
		//myMethod2(); // staitc 메소드가 아니므로 바로 호출하면 오류난다.
		//디폴트 생성자가 없는 경우 자동 생성됨. 
		Example02 myObj = new Example02();
		// 인스턴스 메소드 , 생성자를 통해서 객체가 생성되지 않으면 사용불가.
		myObj.myMethod2();
	}
	
}
