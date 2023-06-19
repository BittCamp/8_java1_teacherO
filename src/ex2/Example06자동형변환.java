package ex2;

public class Example06자동형변환 {

	public static void main(String[] args) {
		// 자동형 변환
		
		int i = 100;
		long I = i; // 8바이트 8바이트 형식만 가져오지만,
		float f = I; // 4바이트 이지만 부동소수점 방식이라 long 보다 바이트는 작아도 형식이 소수점으로 따라간다. 
		// 
		System.out.println(i);
		System.out.println(I);
		System.out.println(f);

	}

}
