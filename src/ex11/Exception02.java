package ex11;

import java.util.Scanner;

public class Exception02 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-29 오전 11:42:56 ]
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = s.nextInt();
		
		int arr[] = new int[5]; // arr[] 0 1 2 3 4 까지가 배열 5개임.
		
		try {
			arr[num] = 10/num; // arr[] 5는 있을수없다.
			System.out.println(arr[num]);
		} 
		catch(ArithmeticException e) {
			System.out.println("0이 아닌 값을 입력하세요.");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("올바른배열 인덱스를 입력하세요.");
			System.out.println(e.getMessage());
		}
		
		
	}
}
