package ex7;

public class Object01 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-20 오후 03:28:14 ]
		
		Student stObj1 = new Student(); // 생성자를 호출하라는 명령
		
		stObj1.id =  20221004;
		stObj1.name = "홍길순";
		stObj1.printInfo();
		
		Student stObj2 = new Student();
		stObj2.insertRecord(20021005,"홍길동");
		stObj2.printInfo();
		
		Student stObj3 = new Student(20221006,"임꺽정");
		stObj3.printInfo();
	}
}
