package ex7;

public class AccessModifier01 {
	//[ 김찬영  2023-06-22 오전 11:49:45 ]
	public static void main(String[] args) {
		Dog dogObj = new Dog();
		
		dogObj.breed = "포메라니언";
		dogObj.color = "갈색";
		
		System.out.println("강아지 품종 : " + dogObj.breed);
		System.out.println("강아지 색상 : " + dogObj.color);
		
		dogObj.bowbow();
	}
}
