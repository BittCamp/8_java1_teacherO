package ex6;

public class Example01 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-15 오후 04:07:29 ]
		
		int[] myArr = new int[5];
		myArr[0] = 10;
		myArr[1] = 20;
		myArr[2] = 30;
		myArr[3] = 40;
		myArr[4] = 50;
		
		int sum = 0 ;
		for(int i = 0; i < 5; i++) {
			System.out.println(i+ "번째 요소값 : " + myArr[i]);
		


			
			sum += myArr[i]; // sum = sum+ 값 이랑 같은거
			
		}
		System.out.println("============================");
		System.out.println("값의 합 : "+sum);
		System.out.println("============================");
		for(int num:myArr) { // 확장형 for문
			System.out.println("각 요소값 : "+num);
		}
	}
}
