package ex2;

public class Operator04 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		
		System.out.println(c=a);
		System.out.println(b += a);
		System.out.println(b -= a);
		//System.out.println(b -= a); 10
		//System.out.println(b -= a); 0 b값이  a 만큼 누적해서 빠졌음.
		
		System.out.println(b *= a);
		System.out.println(b /= a);
		System.out.println(b %= a);
		
	}
}

