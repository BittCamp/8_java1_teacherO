package ex8;

public class Example01 {
	public static void main(String[] args) {
		BabyCat bCat = new BabyCat();
		System.out.println("품종: " + bCat.breed); //수퍼클래스의 맴버변수 사용
		System.out.println("색상"+ bCat.color );
		
		bCat.eat(); //수퍼클래스의 메소드 사용
		bCat.meow();
	}
}
