package ex6;

public class Example03_2 {
  public static void main(String[] args) {
	  //[ 김찬영  2023-06-19 오전 10:30:32 ]
	  
	  //정수형으로 수를 배열 10개 방에 저장
	  // 100,200 .... 1000까지 저장.
	  //for 문을 이용
	  int num[] = new int[10];
	  for(int i =1 ; i<11; i++) {
		  num[i-1]= i*10;
	  }
	  for(int n:num) {
		  System.out.print(n+"\t");
	  }
  }
}
