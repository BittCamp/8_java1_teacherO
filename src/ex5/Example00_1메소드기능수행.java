package ex5;

import java.util.Scanner;

public class Example00_1메소드기능수행 {
//[ 김찬영  2023-06-14 오후 12:07:42 ] 메소드기능수행 더깔끔하게
	public static void main(String[] args) {

	for( int i=0; i < 3; i++) {
		System.out.println("정수를 입력하시오.");
		method1();
		System.out.println("");
	}
		
		
	}
	public static void method1() { //static==> 정적 이라는 뜻
		//static 만 들어가는 영역 공통영역. 같은 이름의 static이 하나있어야 된다. 같은공간에 있는것만 쓰게 되어있다. 
		 
		//public  다쓸수있다. void 나혼자만 할고 끝낼거.  return 값이 없다.
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		if(num%2 == 0) {
			System.out.println(num + "은 짝수 입니다.");
		}else{
			System.out.println(num + "은 홀수 입니다.");
		}
	}
	
	
}
