package ex5;

public class Example02 {
	public static String greeting() {
		   return "Hi!";
	}
	public static void main(String[] args) {
		String str = greeting() ; // greeting 메서도 호출
		String stt = hreeting() ;
		System.out.println(str +" Java " + stt); 
	}
	
	public static String hreeting() {
		return "요요!";
	}
}
