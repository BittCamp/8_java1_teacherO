package ex5;

public class Method06 { //[ 김찬영  2023-06-15 오후 03:39:37 ]
	// 오버로딩 : 매개변수 타입 이나 갯수에 따라서 다르게 쓰고 호출할수 있다.
	
	public static int sum( int x , int y ) {
		return(x+y);
	}
	
	public static int sum(int x , int y , int z) {
		return( x+y+z);
	}
	public static double sum (double x, double y) {
		return (x+y);
	}
	public static void main(String[] args) {
		System.out.println("sum(10,20)의 값: "+ sum(10,20));
		System.out.println("sum(10,20,30)의 값: "+sum(10,20,30));
		System.out.println("sum(10.5,20.5)의 값 :"+sum(10.5,20.5));
	}
}
