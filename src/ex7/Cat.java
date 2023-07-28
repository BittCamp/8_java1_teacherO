package ex7;

public class Cat {
	//[ 김찬영  2023-06-20 오후 02:12:15 ]
	// 맴버 변수
	String breed;
	String color;
	/* 생성자의 인자 (파라메터의 종류와 갯수에 따라 호출되는 방법이 달라지는 데 이것을 
	 * 생성자 오버로딩 
	 * 메소드 여러개 인자값다르게 쓰면 그건 메소드 오버로딩*/ 
	// 선언 해놓는거를 힙영역이라함. 힙을 메인메소드에서 가져와서 쓰는거임
	Cat() {
		// 클래스랑 똑같은데 뒤에 괄호붙은거 생성자임. 생성자는 초기화할려고 쓰는거임.
		// 맴버변수를 초기화
		System.out.println("Cat() 생성자 호출합니다.");
		// 디폴트 생성자로 불리고, 생성자가 아무것도 없는 경우 자동 생성되기도 함.
	}
	
	Cat(String pBreed){ // 파라메터를 갖고 있을 수 있음. 
		
		System.out.println("Cat(...) 생성자 호출합니다.");
		breed = pBreed; //맴버 변수에 값을 저장.
	}
	Cat(String pBreed,String pColor){ //맴버 변수에 값을 넣기 위해 사용되는 파라메터
		System.out.println("Cat(... , ...) 생성자 호출합니다");
		breed = pBreed; // 초기화를 통해 맴버변수 값 2개 저장
		color = pColor;
	}
	// 맴버 메소드 ( 기능에 해당) //인스턴스 메소드 라고도 한다. new 라는 생성자 안만나면 쓸수가 없다. 
	// new 라는 생성자를 만나면 쓸수 있다.
	void eat() {
		System.out.println("먹이를 먹다.");
	}
	void scratch() {
		System.out.println("발톱으로 할퀴다.");
	}
	
	void meow() {
		System.out.println("울다!");
	}
	
}
