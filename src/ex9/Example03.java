package ex9;

public class Example03 {
	//[ 김찬영  2023-06-27 오후 02:26:44 ]
	public static void main(String[] args) {
		Bike myBike = new Bike();
		Car myCar =  new Car();
		
		myBike.printType();
		myBike.printBrand();
		myBike.printPrice();
		
		System.out.println("========");
		
		
		myCar.printType();
		myCar.printBrand();
		myCar.printPrice();
	}
	
}
