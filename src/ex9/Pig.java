package ex9;
//[ 김찬영  2023-06-27 오후 02:56:51 ]

public class Pig implements Animal02 {

	@Override
	public void animalSound() {
		System.out.println("꿀꿀꿀하고 소리 내다");

	}

	@Override
	public void animalWalk() {
		System.out.println("네발로 걷다.");

	}

}
