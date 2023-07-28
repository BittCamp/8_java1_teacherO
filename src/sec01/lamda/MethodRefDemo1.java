package sec01.lamda;
//[ 김찬영  2023-07-7 오후 02:57:05 ]
class Util {
	int add(int a , int b) {
		return a + b; 
	}
}
interface Applyable {
	boolean apply(Box a, Box b);
}
class Box {
	int no;
	public Box(int no) {
		this.no = no;
	}
	boolean isSame(Box b) {
		return this.no == b.no;
	}
}

public class MethodRefDemo1 {
	public static void main(String[] args) {
	  Applyable app;
	// app = (a,b) -> a.isSame(b); // 구현
	  app = Box::isSame; // 구현..
	  System.out.println(app.apply(new Box(1), new Box(2)));
	  System.out.println(app.apply(new Box(1), new Box(1)));
	}
}

