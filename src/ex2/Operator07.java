package ex2;

public class Operator07 {
	public static void main(String[] args) {
		double d = 3.14;
		//캐스팅
		//long I = d; 이려면 형변환이 안된거라 오류 나온다.
		long I = (long)d;  
		int i = (int)I;
		System.out.println(d);
		System.out.println(I);
		System.out.println(i);
	}
}
