package ex7;

public class Dog { // 접근제한자. public 접근제한자를 이용하여 클래스 맴버 호출하기
	//[ 김찬영  2023-06-22 오전 11:37:32 ]
	public String breed;
	public String color;
	public int age;
	private String name ;
	
	public void bowbow() {
		System.out.println("멍멍 짖다");
		sleep(); // 이렇게 하면 private sleep 쓴거 경고창 사라짐. 같은 클래스 내에서 썼기 떄문.
	}
	
	protected void run() {
	 System.out.println("달리다");
	}
	private void sleep() { // 패키지 내부라서 외부에서 못씀.
	 System.out.println("잠을 자다");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
