package ex2;

public class TypeConverseion01자동형변환예시 {
	
	public static void main(String[] args) {
		//[ 김찬영  2023-06-12 오후 04:19:22 ]
		
		//실수형이 소수점까지 표현가능해서 표현범위가 크다 그래서 부동소수점을 더 많이선언한다. long float 같은거
		int x = 10;
		double y  = 3.0;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
	   System.out.println(x/y);
	}
}
