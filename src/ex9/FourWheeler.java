package ex9;
//[ 김찬영  2023-06-27 오후 12:40:05 ]
public abstract class FourWheeler  extends Vehicle{
 // 추상 클래스 이므로 상속받은 추상클래스의 추상 메소드 구현할 필요없다.
	
	public void printPrice () {
		System.out.println("가격: 50,000,000");
	}
	
	public void printType() {
		System.out.println("이것은 자동차입니다.");
	}
	public void printBrand() {
		System.out.println("브랜드 : BMW");
	}
}

