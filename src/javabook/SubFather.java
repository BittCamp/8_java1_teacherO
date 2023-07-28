package javabook;
//[ 김찬영  2023-06-23 오후 04:40:13 ]
public class SubFather extends Grandfather {

	String familyName = "프로그래머";
	String houseAddress = "프로그래머";
	
	void printerFather() {
		System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속 받았습니다.");
	}
}
