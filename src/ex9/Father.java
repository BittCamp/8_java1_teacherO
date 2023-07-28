package ex9;
//[ 김찬영  2023-06-27 오후 03:22:10 ]

public class Father implements Parent{

	public void printInfo() {
		System.out.println("아버지입니다");
	}

	@Override
	public void gurintInfo() {
		// TODO Auto-generated method stub
		System.out.println("구구구");
		
	}
}
