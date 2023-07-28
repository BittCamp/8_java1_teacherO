package ex10.com.section03;

import java.util.StringTokenizer;
//[ 김찬영  2023-06-28 오후 04:49:44 ]
public class Example11 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java,C,Python,JSP,PHP",","); ///( "배열" ,"구분자")
		while(st.hasMoreTokens()) { // .hasMoreTokens() 남아있는 토큰이 있는지 불리언값으로 반환
			System.out.println(st.nextToken());
	}
  }
}
