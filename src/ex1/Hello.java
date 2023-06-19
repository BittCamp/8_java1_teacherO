package ex1; //한줄 주석.... 폴더(라고 생각하면 됨. 같은 종류가 들어있는 묶음 )

//클래스 이름은 대문자로 시작, 단어가 바뀔 때마다 대문자로 작성(카멜표기)
public class Hello { // 클래스 시작  , class 는 키워드로 클래스를 나타냄

	public static void main(String[] args) {
		
		System.out.println("안녕하세요");
		System.out.println("안녕하세요. 반가워요!");
		// Ctr+ f11  실행단축키
		System.out.println(256+987);
		// 256+987 = 1243
		int i100 = 100; // i100이라는 정수형 변수를 선언(지역변수)
		int j200 = 200; // j200이라는 정수형 변수를 선언(지역변수)
		
		System.out.println("합은: "+ (i100 + j200)); // "" 문자열
		// 문자열과 함께 사용할 경우 숫자를 먼저 계산 하려면 ()가 필요하다.
		System.out.println("합은: "+ i100 +j200); // 뒷부분이 다 문자열이 되었다. 
	}

} // 클래스 끝
