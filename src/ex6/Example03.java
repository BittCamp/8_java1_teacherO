package ex6;

import java.util.Iterator;

public class Example03 {
	//[ 김찬영  2023-06-16 오후 05:22:46 ] 
	// 2차원배열
	
	public static void main(String[] args) {
		int[][] myArr = new int[2][4];
		myArr[0][0] = 2;
		myArr[0][1] = 5;
		myArr[0][2] = 7;
		myArr[0][3] = 4;
		myArr[1][0] = 9;
		myArr[1][1] = 3;
		myArr[1][2] = 2;
		myArr[1][3] = 8;
		int sum1 =0 , sum2 =0;
		for(int i =0; i < 4; i++) {
			sum1 += myArr[0][i];
		}
		System.out.println("첫번째 행의 합계: " +sum1);
		for(int i=0; i<4 ; i++) {
			sum2 += myArr[1][i];
		}
		System.out.println("두번째 행의 합계: "+ sum2);
		
		// for 문을 줄때 행이 변하는 반복 1개
		// 행 하나에 열이 변하는 반복
		int sum =0;
		for(int i =0; i<myArr.length;i++) { //바깥의 길이
			sum =0;
			for(int j =0; j<myArr[i].length; j++) { // 해당되는 행의 길이
				System.out.print(myArr[i][j]+ "\t");
				sum+=myArr[i][j];
			}
			System.out.println((i+1)+"번째 행의 합계: "+sum);
			System.out.println();
		}
		
	}

	
	
	
}
