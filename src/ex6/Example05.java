package ex6;

public class Example05 {

	public static void main(String[] args) {
		String s1 ="Java";
	    String s2 ="Java";
	    String s3 = new String("Java");
	    String s4 = new String("Java");
	    
	    System.out.println(s1); // 레퍼런스 값을 출력
	    System.out.println(s2); // 레퍼런스 값을 출력
	    System.out.println(s3); // 문자열 값을 출력
	    System.out.println(s4); // 문자열 값을 출력
	    
	    // 오버라이딩 자식관계 메소드가 부모메소드를 재선언해서 쓰는거.
	    System.out.println("\n");
	    System.out.println(s1==s2); 
	    System.out.println(s3==s4);
	}

}
