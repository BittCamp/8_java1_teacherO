package ex10.com.section03;

import java.util.Random;
//[ 김찬영  2023-06-29 오전 09:50:28 ]
public class Example12 {
	public static void main(String[] args) {
		
		
		Random random1 = new Random();
		System.out.println("난수 값 "+ random1.nextInt());
		
		Random random2 = new Random();
		for(int i =0; i < 10; i++) {
			System.out.print(random2.nextInt(100)+ " "); // 100사이에 난수값출력
		}
	}
}
