package ex6;


public class Example03_2_연습 {
  public static void main(String[] args) {
	  ///[ 김찬영  2023-06-19 오전 10:30:40 ] // 진행중!!
	  
	  //정수형으로 수를 배열 10개 방에 저장
	  // 100,200 .... 1000까지 저장.
	  //for 문을 이용
	  
	  //배열선언
	  int arr[] = new int[10];
	  //반복문
	  for(int i=1; i<arr.length; i++) {
		  arr[i-1] = i*100;
		  
	  }
	  
	  for(int i : arr) {
		  System.out.print(i+"\t");
	  }
	  
	  
	  // 출력
  }
}
