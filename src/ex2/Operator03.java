package ex2;

public class Operator03 {

	public static void main(String[] args) {
		int a = 5 , b = 10;
		 
		System.out.println(a> b );
		System.out.println(!(a>b));
		System.out.println((a==b)&&(a==5));
		System.out.println((a!=b)&&(a==5));
		System.out.println(!((a!=b)&&(a==5))); //(a!=b)&&(a==5) 이게 true 라 이거 부정하면 false
		
	}

}
