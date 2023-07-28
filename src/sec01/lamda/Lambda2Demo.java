package sec01.lamda;
//[ 김찬영  2023-07-7 오후 02:24:39 ]
interface Nagative{
	int neg(int x);
}
interface Printable{
	void print();
}

public class Lambda2Demo {
	public static void main(String[] args) {
		Nagative n; // 인터페이스로 선언. 구현할 메소드가 단일이므로 가능.
		n = (int x) -> {return -x; }; // neg 구현
		 System.out.println(n);
		// neg 구현 이미 인터페이스에서 int형 이라고 선언되어 있으므로 구현체도 자동 int 형으로 컴파일러가 인지
		n = (x) -> {return -x;}; 
		// 어차피 타입을 알고있는 x는 ()가 필요없어서 생략
		n = x -> {return -x;};
		 //return 생략하고 {}도 생략
		n = (int x) -> -x;
		n = (x) -> -x;
		n = (x) -> -x;
		n = x -> -x;
		System.out.println(n.neg(5));
		Printable p;
		// 인터페이스가 있는데 구현할 메소드가 하나만 있는경우 이렇게 씀.
		// 이름없는 구현체가 만들어짐
		p = () -> {System.out.println("안녕!");};
		// 이름없는 구현체가 만들어짐2
		p = () -> System.out.println("안녕!");
		p.print();
	}
}
