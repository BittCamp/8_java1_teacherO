package ex2;

public class TypeConversion02 {

	public static void main(String[] args) {
		int x = 10;
		double y = 3.0;
		// 캐스팅
		System.out.println(x/y);
		System.out.println(x/(int)y);
		System.out.println((int)(x/y));
	}
}
