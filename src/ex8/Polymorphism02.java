package ex8;

public class Polymorphism02 {
	//[ 김찬영  2023-06-26 오후 03:43:43 ]
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}
