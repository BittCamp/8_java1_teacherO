package ex7;

public class Example01 {

	public static void main(String[] args) {
		// [ 김찬영  2023-06-20 오후 02:44:29 ] 생성자 생성해서 메소드 호출. 
		// main 정적 메소드. 
		
		// Cat이라는 클래스 생성. 클래스 생성방식이랑 형식같음.
		// 디폴트 생성자를 실행
		Cat catObj = new Cat();
		// 맴버 변수에 저장.
		catObj.breed = "페르시안 고양이"; // catObj 에 가서 breed 값을 집어넣어라
		catObj.color = "흰색";
		// 맴버 변수 호출 ( 값을 가져와서 보여주기 )
		System.out.println("품종 : " + catObj.breed);
		System.out.println("색상 : " + catObj.color);
		// 메소드 호출!!!!
		catObj.eat();
		catObj.meow();
		catObj.scratch();
		
		// 샴고양이 라는 값을 초기화 해서 저장.
		Cat catObj2 = new Cat("샴고양이");
		catObj2.color = "검은색과 베이지"; 
		System.out.println("품종 : " + catObj2.breed);
		System.out.println("색상 : " + catObj2.color);
		// 메소드 호출!!!!
		catObj2.eat();
		catObj2.meow();
		catObj2.scratch();
		
		// 러시안블루 고양이, 푸른회색 생성자 (String , String)
		Cat catObj3 = new Cat("러시안블루 고양이","푸른회색 생성");
		System.out.println("품종 : " + catObj3.breed);
		System.out.println("색상 : " + catObj3.color);
		// 메소드 호출!!!!
		catObj3.eat();
		catObj3.meow();
		catObj3.scratch();
		
		// 라이딩 -> 롸이팅 쓰다. 재정의하다.
		// 오버로딩 -> 로딩하는거. 가져와서 쓰는거
		
	}

}
