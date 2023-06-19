package ex4;

public class Example12{

	public static void main(String[] args) {
	
		for( int i = 0; i <= 10; i++) {
			if(i==3||i==6||i==9) {
				continue; // 다시 조건으로 올라가는 것.  i % 3 ==0 3의 배수
				
			}
			System.out.println(i+" ");
		}
		
	}

}
