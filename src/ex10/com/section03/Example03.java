package ex10.com.section03;
//[ 김찬영  2023-06-27 오후 04:33:31 ]
import ex10.com.javamaster.mypackage.Cat;

public class Example03 {
	public static void main(String[] args) {
	   Cat cat01 = new Cat();
	   Cat cat02 = new Cat();
	   System.out.println(cat01.toString()); // toString()은 오브젝트클래스
	   System.out.println(cat02.toString());
	   System.out.println(cat01.equals(cat02)); // 같은객체가 아님
	   cat01 = cat02; // 같은 객체를 가리키게 끔 해주었다.
	   System.out.println(cat01.equals(cat02));
	   
	   
	}
}
