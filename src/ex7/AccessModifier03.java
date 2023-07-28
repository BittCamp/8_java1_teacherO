package ex7;

public class AccessModifier03 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-22 오후 12:26:23 ]
		Dog obj = new Dog();
		
		obj.breed = "포메라니언";
		obj.color =  "갈색";
		
		System.out.println("강아지 품종 : " + obj.breed);
		System.out.println("강아지 색상 : " + obj.breed);
		obj.bowbow();
		obj.age = 10;
		System.out.println("강아지 나이 : " + obj.age);
		obj.run();
		// private String name 이라 사용불가.
		// obj.name = "다운"; setName 안쓰면 오류뜸
		obj.setName("다운");
		System.out.println("강아지 이름 : " + obj.getName());
		
		//obj.sleep(); //private void sleep()라 사용불가
	}
}
