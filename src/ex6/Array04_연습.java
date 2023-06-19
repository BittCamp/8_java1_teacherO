package ex6;

public class Array04_연습 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-19 오전 10:54:08 ]
		// 다음 두행렬의 합을 출력하시오.
		int rows =2, columns =3;
		int[][] firstMatrix = {{2,3,4},{3,2,1}};
		int[][] secondMatrix = {{1,2,3},{-4,-2,1}};
		
		int sum[][] = new int[rows][columns];
		
		for( int i=0; i< rows; i++ ) {
			for(int j=0; j< columns; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
				
			}
		}
		
		for(int i=0; i<rows ; i++) {
			for(int j=0; j<columns; j++) {
				System.out.println ( "["+ i +"]"+"["+ j +"]"+ "배열의 합은" + sum[i][j]);
			}
		}
		
	}
}
