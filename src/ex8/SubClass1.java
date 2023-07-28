package ex8;

public class SubClass1 extends SuperClass1 { //[ 김찬영  2023-06-23 오후 05:51:49 ]
	String name;
	int age;
	
	public SubClass1() {}
	
	public SubClass1(String name , String familyName , int age) {
		super(familyName); // this.familyName = familyName;
		this.name = name;
		this.age = age;
	}
	public void printName() {
		super.printName(); // 상위클래스
		System.out.println("나의 이름은 " + familyName + name + "이다.");
		System.out.println("나의 나이는 " + age + "이다.");
		
	}
}
