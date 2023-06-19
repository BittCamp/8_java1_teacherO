package ex5;

public class Example06 {
	//[ 김찬영  2023-06-15 오후 03:29:42 ]
	
	public static void calculate(int x , int y ) {
		System.err.println(x*y);
	}
	public static void calculate(int x ) {
		System.err.println(x*x);
	}
	public static void calculate(int x , double y ) {
		System.err.println(x*y);
	}
	public static void calculate(double x ) {
		System.err.println(x*x);
	}
	
	public static void main(String[] args) {
		
		
		
		calculate(2,3);
		calculate(2,3.14);
		calculate(2);
		calculate(2.5);
	}
}
