package ex1;

public class Vaiable01 { // Vaiable01 을 클래스라고 함.
static int j;  //클래스 전체에 변수선언 전역변수 , static 변수 
// 중괄호 아니고 바깥에 있으면 전역변수라고 함.
	public static void main(String[] args) { //main이라는 걸 메소드 라고 부름.
		//정확하게는 특수정적 메소드
		// 정수형 days  라는 변수를 선언하고 10으로 초기화
		int days = 10; // 메소드 안에 있는 변수는 지역변수라고 한다.
		// 콘솔에 출력하는데 days라는 변수에 값을 출력해라.
		System.out.println(days); //  days 변수출력
		System.out.print(days); //print 줄바꿈안됨.
		System.out.println(days + "\n"); //  println하고 같음.
		System.out.println(j + "\n"); //  println하고 같음.
		//print 줄바꿈안됨.
		//println 줄바꿈됨.
		
		//정수형 speed라는 변수를 선언
		int speed;
		//speed 변수를 지정하고 20을 저장
		speed = 20;
		//콘솔에 출력하는데 speed라는 변수에 값을 출력해라
		System.out.println(speed); // speed 변수출력
		
	}

}
