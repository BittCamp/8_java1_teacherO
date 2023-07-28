package ex8;

public class Inheritance01 extends Calculation { //[ 김찬영  2023-06-22 오후 12:51:45 ]
	public void multiplication(int x , int y) {
		z = x*y;
		System.out.println("두 수의 곱셈 : " + z);
	} 
	
	public static void main(String[] args) {
		int a =20, b = 10;
		Inheritance01 obj = new Inheritance01();
		obj.addition(a, b);
		obj.subtraction(a, b);
		obj.multiplication(a, b);
	}

}
