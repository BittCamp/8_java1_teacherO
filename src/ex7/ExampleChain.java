package ex7;

public class ExampleChain {
	public static void main(String[] args) {
		///[ 김찬영  2023-06-22 오전 11:50:00 ]
		
		Employee e = new Employee(12341243, "홍길순","매장직원" ,2);
		System.out.println("직원 명: " + e.ename);
		System.out.println("계약 여부: " + e.cont);
		
		Chain c = new Chain(7);
		System.out.println(c.toString());
		
		MemberChain m = new MemberChain();
		System.out.println(m.toString());
	}
}
