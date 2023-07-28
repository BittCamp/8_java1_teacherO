package ex10.com.section03;

public class Example05 {
	//[ 김찬영  2023-06-28 오후 02:38:58 ]
	public static void main(String[] args) {
		String str = new String("Java");
		for (int i= 0 ; i< str.length(); i++) {
			System.out.println(str.charAt(i)+ " ");
		}
		System.out.println("====");
		System.out.println("\n"); //줄바꿈.
		System.out.println("====");
		System.out.println(str.compareTo("JAVA")); 
		// 처음 다른 문자의 차를 구함. A 와 a 다르므로 두문자의 차를 구함 (97- 65) = 32
		System.out.println("====");
		System.out.println(str.compareTo("Java"));
		//동일하면 0
		System.out.println("====");
		// 대소문자 구별 없이 비교해라. 0 
		System.out.println(str.compareToIgnoreCase("JAVA"));
	}
}
