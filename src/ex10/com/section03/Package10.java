package ex10.com.section03;

import java.util.StringTokenizer;

public class Package10 {
	//[ 김찬영  2023-06-28 오후 04:00:55 ]
	public static void main(String[] args) {

		StringTokenizer str = new StringTokenizer("Welcome to Java Programming!!"); // 구분자 없으면 띄어쓰기를 구분자로 해줌.
		
		System.out.println("str.nextElement():");
		while(str.hasMoreElements()) { //.hasMoreTokens() 남아있는 토큰이 있는지 불리언값으로 반환
			System.out.println(str.nextElement());
		}
		
	}
}
