package ex10.com.section03;

public class Example08 {
	//[ 김찬영  2023-06-28 오후 03:44:13 ]
	public static void main(String[] args) {
		
		Integer a = 3;
		System.out.println(a.toString()); // 원래 숫자에 이거 못쓰는데 객체형이라서 이렇게 쓸수있다.
		int i1 = a.intValue(); // INTEGER  를 명시적으로 int 로 변환 규칙에 따라서
		int j1 = a; // 언박싱: 객체형이 바로 기본형에 저장되는 기능
		System.out.println(a+ " "+ i1 + " "+ j1);

		int b = 20;
		Integer i2 = Integer.valueOf(b); // int 를 명시적으로 Integer 로 변환 규칙에 따라서 
		Integer j2 = b; // 박싱: 기본형이 객체형으로 변경되는 것으로 박싱이라고 함
		System.out.println(b+" "+ i2+ " "+ j2);
	}
}
