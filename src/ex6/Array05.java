package ex6;

public class Array05 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-19 오전 11:52:04 ]
		
		///다른공간에 저장됨. 
		String s1 = "Java Programming"; 
		String s2 = new String("Java Programming"); // <== 얘는 클래스에 저장됨.
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("\n");
		
		//s1 객체의 메소드 실행
		System.out.println("s1.length() : "+ s1.length());
		System.out.println("s1.charAt(1) : "+ s1.charAt(1));
		System.out.println("s1.substring(6) : " + s1.substring(6));
		System.out.println("s1.substring(5,13) : "+ s1.substring(5,13));
		System.out.println("s1.indexOf('P') : "+ s1.indexOf("P"));
		System.out.println("s1.toLoweCare() : "+ s1.toLowerCase());
		System.out.println("s1.toUpperCase() : " +s1.toUpperCase());
		
		System.out.println("\n");
		
		//s2 객체의 메소드
		System.out.println("s2.length() : "+ s2.length());
		System.out.println("s2.charAt(1) : "+ s2.charAt(1));
		System.out.println("s2.substring(6) : " + s2.substring(6));
		System.out.println("s2.substring(5,13) : "+ s2.substring(5,13));
		System.out.println("s2.indexOf('P') : "+ s2.indexOf("P"));
		System.out.println("s2.toLoweCare() : "+ s2.toLowerCase());
		System.out.println("s2.toUpperCase() : " +s2.toUpperCase());
	}
}
