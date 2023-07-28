package ex9;

public class Car extends FourWheeler {
	//[ 김찬영  2023-06-27 오후 02:26:44 ]
	@Override
	public void printPrice() {
		System.out.println("가격 : 50,000,000");
	}
	//자신의 메소드
	public void printType() {
		System.out.println("이것은 자동차 입니다.");
	}
	public void printBrand() {
		System.out.println("브랜드 : BMW");
	}

}
