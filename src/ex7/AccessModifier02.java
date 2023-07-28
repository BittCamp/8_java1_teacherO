package ex7;

public class AccessModifier02 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-22 오후 12:00:23 ]
		
		Dog obj = new Dog();
		
		obj.breed = "포메라니언";
		obj.color = "갈색";
		
		System.out.println("강아지 품종 : "+ obj.breed);
		System.out.println("강아지 품종 : "+ obj.color);
		obj.bowbow();
		obj.age = 10;
		System.out.println("강아지 나이 : "+ obj.age);
		obj.run();
	}

}
