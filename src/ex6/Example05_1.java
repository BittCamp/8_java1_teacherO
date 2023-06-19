package ex6;

public class Example05_1 {
	public static void main(String[] args) {
	  //[ 김찬영  2023-06-19 오전 11:39:48 ]
		
	  String s1 ="안녕하세요";
	  String s2 ="안녕하세요";
	  
	  System.out.println("두 문자열의 레퍼런스" + s1==s2);
	  //false라고출력됨
	  
	  System.out.println("두 문자열의 레퍼런스"+ (s1==s2));
	  // true 라고 출력이 된다. 레퍼런스의 주소값비교
	  System.out.println("두 문자열의 값 비교 "+ (s1.equals(s2)));
	  // 값 비교. 
	  // C는 물리적인 값 비교. 자바는 물리적인 값을 비교하지 않는다. C는 메모리 만지는 부분이있었다. 
	  s2= "반가워요!";
	  
	 
	  
	}
}
