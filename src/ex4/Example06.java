package ex4;

public class Example06 {

	public static void main(String[] args) {
		char grade = 'C'; // char 단일 문자만 쓸수 있음. char 가 int 안에 포함. 
		switch(grade) {
			case'A':
				System.out.println("매우 우수");
				break;
			case'B':
				System.out.println("우수");
				break;
			case'C':
				System.out.println("좋음");
				break;
			case'D':
				System.out.println("좀 더 열심히");
				break;
			case'F':
				System.out.println("미흡");
				break;
			default:
				System.out.println("잘못된 등급");
		
		}

	}

}
