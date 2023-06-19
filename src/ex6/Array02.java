package ex6;

public class Array02 {
	public static void main(String[] args) {
	///[ 김찬영  2023-06-16 오후 04:43:33 ]
		
		double[] scoreArr = {90,70.5,80,79,82.5,50,70,90.2,89.5,89.7};
		double sum = 0.0;
		// 총 합을 구하는 로직
		for(int i =0; i<scoreArr.length; i++) 
			sum +=scoreArr[i]; 
			
		
		//평균을 구하고 
		double avg = sum/scoreArr.length;
		// 합계 출력
		System.out.println( "총 합: "+sum );
		// 평균 출력
		System.out.printf("평균: %6.2f ", avg); // 총 6개 찍되 소수점이하 둘째 자리만 찍어라.
		/// printf 는 프린트 포멧의 약자
		System.out.format("평균: %6.2f ", avg); // 총 6개 찍되 소수점이하 둘째 자리만 찍어라.
		System.out.println();
		System.out.format("평균: %6.3f ", avg); // 총 6개 찍되 소수점이하 셋째 자리만 찍어라.
		// %6.3f 총 6자리를 출력 그중에 소수점은 3째자리 까지 출력 
	}
	
}
