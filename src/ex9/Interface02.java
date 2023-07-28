package ex9;
//[ 김찬영  2023-06-27 오후 03:34:11 ]
public interface Interface02 {
	public static void main(String[] args) {
		Chicken myChicken = new Chicken();
		Chicken myChicken1 = new Chicken();
		Bird myBird = new Bird();
		
		myChicken.fly();
		myChicken.walk();
		myBird.fly();
		
		myChicken1.ffly();
	}
}
