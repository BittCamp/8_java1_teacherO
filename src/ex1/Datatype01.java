package ex1;
//[ 김찬영  2023-06-8 오후 05:44:13 ]

public class Datatype01 {

	public static void main(String[] args) {
		// heap은 new를 선언해 주면 보여진다. 
		int a = 10;
		short s = 2;
		byte b = 6;
		long I = 1234562133223l; // 얘만 8바이트 정수선언이라 L 이나 l 붙여줘야함. 
		// 기본이 int 형인데 얘는 int 형이 아니라는것을 알려주기 위해서 L을 쓴다.
		// short 나 byte 는 int 보다 작아서 뒤에 구분안해줘도 됨. long 은 int 보다 큼.
		// long은 int보다 크기 때문에 int에 포함되지 않는다.
		System.out.println(a);
		System.out.println(s);
		System.out.println(b);
	   System.out.println(I);
	}
}
