package ex6;

import java.util.Scanner;

public class Array01 {
	//[ 김찬영  2023-06-16 오후 04:16:48 ]
	
	public static void main(String[] args) {
		// String 배열 선언과 정의(3개 , 0 , 1 , 2 )
		String[] str = new String[3];
		Scanner s = new Scanner(System.in);
		System.out.println("3번의 문자열을 입력하시오.");
		// 0 , 1 , 2 배열에 입력 받아서 저장
		for(int i = 0; i < 3; i++) {
			str[i] = s.nextLine();  // nextLine() : String  이렇게 써있으면 String반환 한다는 뜻임.	
		}
		
		System.out.println("입력받은 문자열은 다음과 같음");
		for(String ss : str ) { // str[0] ,str[1], str[2]
				System.out.println(ss+ "\t"); // \t는 빈칸 좀 띄워서 출력해주라는 뜻임.
		}
	}
}
