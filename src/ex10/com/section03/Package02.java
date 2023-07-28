package ex10.com.section03;

import ex10.com.javamaster.mypackage.*;
//[ 김찬영  2023-06-27 오후 04:46:35 ]
public class Package02 {
	public static void main(String[] args) {
		Dog dog01 = new Dog();
		Dog dog02 = new Dog();
		//Object 비교 
		System.out.println(dog01.equals(dog02));
		
		String str1 = dog01.bowwow();
		String str2 = dog01.bowwow();
		//String 비교 
		System.out.println(str1.equals(str2));
		
		
	}
}
