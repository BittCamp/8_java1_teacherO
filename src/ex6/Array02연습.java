package ex6;

public class Array02연습 {
	public static void main(String[] args) {
	
		double[] scoreArr = {90,70.5,80,79,82.5,50,70,90.2,89.5,89.7};
		double sum = 0.0;
		// 총 합을 구하는 로직
		for(int i= 0; i < scoreArr.length; i++) {
			sum+=scoreArr[i];
		}
		System.out.println(sum);
		double avg =  sum/scoreArr.length;	
		System.out.printf("평균 %6.2f ",avg);
		//평균을 구하고 
		// 합계 출력
		// 평균 출력
	}
	
}
