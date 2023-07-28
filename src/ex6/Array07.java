package ex6;

public class Array07 {
	//[ 김찬영  2023-06-20 오후 12:39:00 ]
	
	public static void main(String[] args) {
		String s1 = new String("Java"); 
		String s2 = new String("Java");
		// s1, s2 는 객체를 생성하고 그 객체의 위치값을 참고 하고 있음.
		// s1의 참조값을 s3에 복사
		String s3 = s1; // 묵시적인 방식의 선언이 아님. 
			
		if (s1==s2) System.out.println("s1과 s2는 같다"); // 다른 값이라 참조값이 다르다.
		else System.out.println("s1과 s2는 같지않다");
		// --> s1과 s2는 같지않다
			
		// 참조 데이터가 같은지?
		if(s1==s3) System.out.println("s1과 s3는 같다"); // 참조값이 같다.
		else System.out.println("s1과 s3는 같지않다.");
		// --> s1과 s3는 같다
		
		// 참조 데이터가 가리키고 있는 값이 같은지?? 둘다 "JAVA" 라는 값을 가지고있다. 같은 값을 가리키고 있다.
		if(s1.equals(s2)) System.out.println("s1과 s2의 값은 같다");
		else System.out.println("s1과 s2의 값은 같지 않다.");
		// --> s1과 s2의 값은 같다
		
		
		
	}
}

