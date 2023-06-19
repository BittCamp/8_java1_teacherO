package ex4;

public class Example10 {
	public static void main(String[] args) {
		
		for( int i = 2; i <=4; i++) {
			System.out.println("구구단 " + i + "단 ");
			
			for (int j= 1; j< 10; j++) {
				System.out.println( i + "*" + j + "=" + (i*j));
			}
		}
		
		
		System.out.println("=====================================================");
		
		for( int i = 1; i < 10; i++) {
			System.out.println("구구단은 " + i +" 단 입니다.");
			
			for(int j = 1; j <10; j++) {
				
				System.out.println( i+"*"+ j + "=" + i*j);
				
			}
			
		}
		

	}
}
