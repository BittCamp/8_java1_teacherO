package ex10.com.section02;

import ex10.com.javamaster.mypackage.*; // 원래 해당되는 클래스만 임포트 해주는게 맞다. 자바 마스터패키지에 있는 퍼블릭클래스 가져와 쓰기
// public 일때만 상속 가능하다. 책 388p 참고
// [ 김찬영  2023-06-27 오후 04:27:18 ]

public class Pagkcage01 {
	public static void main(String[] args) {
		 Cat myCat = new Cat(); // ex10.com.javamaster.mypackage패키지 내 Cat 클래스 생성자 호출
		 
		 myCat.eat();
		 myCat.scratch();
		 myCat.meow();
	}
}
