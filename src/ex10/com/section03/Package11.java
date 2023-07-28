package ex10.com.section03;

import java.util.Random;
//[ 김찬영  2023-06-29 오전 09:50:28 ]
public class Package11 {
	public static void main(String[] args) {
		
		Random obj = new Random();
		System.out.println("obj : "+ obj.nextInt());
		
		obj.setSeed(50);
		System.out.println("obj.setSeed(50): " + obj.nextInt());
		
	}
	
}
