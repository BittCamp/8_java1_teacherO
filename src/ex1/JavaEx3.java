package ex1;

public class JavaEx3 {

	public static void main(String[] args) { // << 실행을 위해 만들어진 특수 메소드 
		//0번과 1번에 들어있는 값을 사용
		//args[0] , args[1] 
		//문자를 숫자로 바꾸기 
		//이렇게 선언도 가능함.//args[0] = "100"; args[1] = "100"; 
		int a =  Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		//RUN AS > RUN CONFIGURATION > Arguments > Programme arguments에서 435 12 fmf gkfekdgowndjTek..
		//4칙연산 + %연산 할것임.
		System.out.println("a+b 는 " + (a+b));
		System.out.println("a-b 는 " + (a-b));
		System.out.println("a*b 는 " + a*b);
		System.out.println("a/b 는 " + a/b);
		System.out.println("a/b 는 " + a%b); // %는 나머지 구하는 것임.
		
		int c ; // 메모리에 어딘가 공간을 잡고 있는 것이 아니라 알고만 있는거.
		//System.out.println(c); ==> 여기선 오류남. 아직 이니셜라이즈가 안되어있다.
		// 초기화가 안되면 사용할수 없다. 값을 지정하고 타입을 지정하는것이 초기화이다.
		
		c = 15;
	}

}
