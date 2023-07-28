package ex9;
//[ 김찬영  2023-06-27 오후 12:40:13 ]
public abstract class TwoWheeler extends Vehicle{
// 추상 클래스 이므로 상속받은 추상클래스의 추상 메소드 구현할 필요없다.

	public void printprice() {
		System.out.println("가격 : 150,000");
	}
	
	public void printType() {
		System.out.println("이것은 자전거입니다.");
	}
	// 자신의 클래스
	public void printBrand() {
		System.out.println("브랜드 : 삼천리");
	}
	
}
