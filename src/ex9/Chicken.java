package ex9;
//[ 김찬영  2023-06-27 오후 03:34:11 ]
public class Chicken implements Fly,Walk {

	@Override
	public void fly() {
		System.out.println("닭은 날 수 있다");
		
	}

	@Override
	public void walk() {
		System.out.println("닭은 걸을 수 있다");
		
	}

	@Override
	public void ffly() {
		System.out.println("닭도 날쑤이써~~~~~~~~~~!!!!!!!!!!!!!!!!!!!!!");
		
	}


}
