package ex2;

public class Example05 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-9 오후 12:06:19 ]
		
		int x = 10;
		System.out.println(x++); // 먼저 출력이 되고 + 가됨.
		System.out.println(x); 
		System.out.println(++x); // + 먼저 되고 출력
		System.out.println(x);
		System.out.println(x--); //  먼저 출력하고 - 가 됨.
		System.out.println(x);
		System.out.println(--x); // 먼저 - 가 되고 출력됨.

		System.out.println("==================================");
		  x = 10;
		  System.out.println(x++);	
		  System.out.println(++x);
		  System.out.println(x--); 
		  System.out.println(--x);
		 
	}
}
