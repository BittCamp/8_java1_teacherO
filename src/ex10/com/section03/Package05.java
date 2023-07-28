package ex10.com.section03;

import java.util.Scanner;
//[ 김찬영  2023-06-28 오후 03:19:02 ]

public class Package05 {
	public static void main(String[] args) {
		String str = "";
		Scanner in = new Scanner(System.in);
		System.out.println("입력 문자열 : ");
		str = in.nextLine();
		int len = str.length();
		String revStr1 = "";
		for (int i = len -1 ; i>=0; i--) { // 숫자가 작아지게 해서 앞으로 가게
			revStr1 += str.charAt(i);
		}
		System.out.println("String 클래스의 역순 문자열 : " + revStr1);
		StringBuffer revStr2 = new StringBuffer(str);
		revStr2.reverse();
		System.out.println("StringBuffer 클래스의 역순 문자열 : " + revStr2);
	}
}
