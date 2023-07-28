package ex9;
//[ 김찬영  2023-06-27 오후 03:26:37 ]
public class Example06 {
	public static void main(String[] args) {
		Baby myBaby = new Baby();
		
		// 구현했기 때문에 다쓸수있다.
		// 틀리면 구현 한 쪽에서 수정하면 된다.
		// 책임위임.( 스벅매장에서 파리들어오면 해당스벅매장에서 책임짐 . 본사가 책임안짐. )
		myBaby.genderFather();
		myBaby.genderMother();
		myBaby.printInfo();
	}
}
