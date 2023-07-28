package ex8;

public class Example07 {
	//[ 김찬영  2023-06-26 오후 03:07:43 ]	
	public static void main(String[] args) {
	 int a = 4;
	 int b = 5;
	 double c = 11.12;
	 double d = 21.34;
	 
	 Calculate obj = new Calculate();
	 System.out.println("정수의 합: "+obj.add(a, b));
	 System.out.println("실수의 합: "+obj.add(c, d));
	}
}
