package ex7;

public class Add {
	// 앞에 아무것도 안붙은거 디폴트생성자. 같은폴더내부면 쓸수있다.
	//[ 김찬영  2023-06-22 오전 10:01:59 ]
	
	Add(){
		System.out.println("기본 생성자 Add()호출");
	}
	Add(int a , int b){
		System.out.println("일반 생성자 Add(int a, int b) 호출");
		System.out.println(a +" + " + b+" = "+(a+b));
	}
	Add(double a, double b){
		System.out.println("일반 생성자 Add(double a , double b ) 호출");
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	Add(int a , double b){
		System.out.println("일반 생성자 Add(int a , double b ) 호출");
		System.out.println(a+ " + " + b+ " = " + (a+b));
	
	}
}
