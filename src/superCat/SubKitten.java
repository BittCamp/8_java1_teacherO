package superCat;


public class SubKitten extends SuperCat{ //[ 김찬영  2023-06-23 오후 05:25:42 ]
	// Super Class 가져와쓰기
	String age = "2살";
	
	void printInfo() {
		System.out.println("아기 고양이 입니다.");
	}
	
	void printDetail() {
		super.printInfo();
		System.out.println("품종은 "+super.breed+", 나이는 " + super.age);
		
		printInfo();
		System.out.println("품종은 "+ breed + ", 나이는 "+age);
		// System.out.println("아기 고양이는  "+ this.breed + ", 나이는 "+this.age);
	}

}

