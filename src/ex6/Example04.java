package ex6;
public class Example04 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-19 오전 10:36:58 ]
		int myArr[][] = {{1,2,3,4,5},
						  {6,7,8,9,10},
						   {11,12,13,14,15}};
		/// #1 이렇게도 쓸수도
		for(int i=0; i<myArr.length; i++) { // 행에 해당
			for(int j=0; j<myArr[i].length; j++) { // 열에
				System.out.print(myArr[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("");
		/// #2 이렇게도 쓸수도
		for(int i=0; i<3; i++) { // 행에 해당
			for(int j=0; j<5; j++) { // 열에
				System.out.print(myArr[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("myArr[0][1]값: " + myArr[0][1]);
	}
}
