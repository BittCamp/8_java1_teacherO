package ex6;

public class Example02 {

	public static void main(String[] args) {
		//[ 김찬영  2023-06-16 오후 04:28:49 ]
		
		// myArr이라는 int형 배열이 선언되면서 각 방에 10~~50 까지 저장하는 5개의 방이 생김.
		
		int[] myArr = {10,20,30,40,50};
		for(int i=0; i<5; i++) {
			System.out.println(i +"번째 요소 값: " + myArr[i]);
		}
	}

}
