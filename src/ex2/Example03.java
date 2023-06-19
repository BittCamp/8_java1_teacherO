package ex2;

public class Example03 {

	public static void main(String[] args) {
		int x = 10;
		
		//자바는 && 공통연산자이면 앞에거 틀리면 뒤에꺼 안본다.
		System.out.println(x<10&&x<20);
		System.out.println(x<10 || x < 20);
		System.out.println(!(x<10&&x<20)); // (x<10&&x<20) 가 false 이기 때문에 이거 부정하면 true된다.

	}

}
