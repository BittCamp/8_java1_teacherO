package ex10.com.section03;

public class Package07 {
	//[ 김찬영  2023-06-28 오후 04:00:55 ]
	
	public static void main(String[] args) {
		
		Integer num1 = 100; // 박싱.  
		Integer num2 = 200; // 박싱.
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		 int a = num1; // 언박싱
		String value1 = num1.toString(); /// 해당 객체의 toString 사용. 자기의 함수를 사용할수 있다. 숫자지만문자열로 사용.
		String value2 = Integer.toString(num1); // 
		System.out.println("정수로 출력 :"+a);
		System.out.println("num1.toString(): " + value1);
		System.out.println("Integer.toString(num2): " + value2);
		
		
	}
}
