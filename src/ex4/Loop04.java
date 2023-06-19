package ex4;

import java.util.Scanner;

public class Loop04 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-14 오전 10:32:05 ]
		
		Scanner s = new Scanner(System.in);
		System.out.println("길이 : ");
		
		int len = s.nextInt();
		
		for ( int i = 0; i < len; i++) { // 줄
			for ( int j = 0; j < i ; j++) { /// 띄워쓰기
				System.out.print(" ");
			}
			for( int j = 0; j < (2*len) -1- (i*2); j++) { // 별표만큼 
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		//데이터를 어떻게 빼내서 어떻게 가져올까? 쿼리를어떻게 단순하게 가져올까? 이게 젤 중요.
		
		System.out.println("입력하세요. 아래로 커지는 삼각형!");
		int ken  = s.nextInt(); // 아래로 커지는 삼각형
		
		for( int i = 0; i < ken; i++) {
			for( int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("입력하세요. 아래로 작아지는 삼각형!");
		int cen = s.nextInt();
		for( int i = 0 ; i < cen; i++) {
			for ( int j = 0 ; j <= cen - i -1; j++) { // cen 길이랑 같아질때 까지 반복.
				System.out.print("*");
			}
			System.out.println("");
		}
		

	
	
	
	
	
	} //
}
