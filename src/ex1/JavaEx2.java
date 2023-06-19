package ex1;

public class JavaEx2 {

	public static void main(String[] args) {
		//변수 a = 23435 , b = 435 (정수형)
		//선언 
		// +, -, * , / 을 출력 
		int a = 23435, c = 19929; // 이렇게 선언해줘도 된다. java는 한문장이 끝날때 ;을 입력함.
		// 경고등이 뜨는것은 변수를 아직 사용하지않아서 경고등이 뜬 것이다. 메모리 누수가 생기면 서버가 다운될수도있다.
		// 메모리 누수는 불필요한 데이터를 선언했을때 발생할수 있다. 
		// 경고등이 켜지는 것을 정적테스트 를 한다라고 한다. 정적테스팅이라고도 한다. 
		// project > build Automatically 체크되어있는데 이것은 자동으로 틀린것을 알려주는 기능이다. 
		int b = 435;
		System.out.println((a+b+a+b+b+a));
		System.out.println("a+b 는 " + (a+b));
		System.out.println("a-b 는 " + (a-b));
		System.out.println("a*b 는 " + a*b);
		System.out.println("a/b 는 " + a/b);
		System.out.println("a/b 는 " + a%b); // %는 나머지 구하는 것임.
		
	}

}
