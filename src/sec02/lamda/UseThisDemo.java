package sec02.lamda;

//import java.util.Comparator;

interface UseThis{//[ 김찬영  2023-07-10 오후 04:52:01 ]
	void use();
}

public class UseThisDemo {
	
	public void lamda() {
		String hi = "Hi!"; // final이 없어도 final이다.
		// class 어떤이름 implements UseThis{ use()메소드를 반드시 구현}
		UseThis u1 = new UseThis(){ //무명클래스 기법으로 interface 구현하는 객체 만들기
			public void use() {
				System.out.println(this); // 외부에서 호출 했을때 , 자기자신을 출력하는데.
				System.out.println(hi);
				 //hi = hi + "Lamda."; // 지역변수는 final 이므로 수정 불가
			}
		};
		u1.use();
		
		//lamda 식으로 선언. 메소드 하나있는. use를 ()로 구현한거
		UseThis u2 = () -> { //use 메소드를 구현했는데 이름이 없는 클래스 구현. 람다식으로 함.
			System.out.println(this);
			System.out.println(hi);
			//hi=hi+ "Lamda."; // 지역변수는 final 이므로 수정 불가.
		};
		u2.use();
	}
	@Override
	public String toString() {
		return "UseThisDemo";
	}
	public static void main(String[] args) {
	 int one = 1;
	 new UseThisDemo().lamda();
	 // 람다식의 매개변수 one은 그 변수를 매개변수로 해서 지역변수로 다시 선언 할 수 없다. 그래서 밑에처럼 쓰면 에러난다.
	 // Comparator<String> c = (one,two) -> one.length() - two.length();
	}
	// final을 변수에 사용하면 한번만 저장하고 수정불가.
	// final을 클래스에 사용하면 상속 불가.
	// final 을 메소드에 사용하면 오버라이드 불가.
	// 따라서 상수를 선언할때 final static 변수명 ( 대문자로) = 값;
}
