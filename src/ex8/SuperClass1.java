package ex8;

public class SuperClass1 { //[ 김찬영  2023-06-23 오후 05:51:44 ]
	String familyName;
	// 생성자는 클래스와 이름이 같다. 그리고 반환값도 없다.
	public SuperClass1() {}
	public SuperClass1(String familyName) {
		this.familyName = familyName;
	}
	// 메소드는 클래스와 이름이 다름. 반환값 있음.
	public void printName() {
		System.out.println("나의 성은 " + familyName + "이다. ");
	}
}
