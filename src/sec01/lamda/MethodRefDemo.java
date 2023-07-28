package sec01.lamda;
interface Mathematical { ///[ 김찬영  2023-07-7 오후 02:56:38 ]
	double calculate(double d);
}
interface Pickable{
	char pick(String s, int i);
}
interface Computable{
	int compute(int x , int y);
}
class Utils{
	int add(int a, int b) {
		return a + b; 
	}
}

public class MethodRefDemo {
	public static void main(String[] args) {
		Mathematical m;
		Pickable p;
		Computable c;
		/*		1
		class AAA implements Mathematical{
		@Override
		public double calculate(double d){
		   return Math.abs(d);
		 } 
		} 
		//익명 클래스 이거를 		2
		Mathematical m = new Mathematical {
			@Override
			public double calculate(double d){
			   return Math.abs(d);
		 	}	 	
		}
		
		*/ // 이렇게 표현 할수 있다.
		//Mathematical  m = (double d) -> {return Math.abs(d);};		3
// 		m = d -> Math.abs(d);					4
		m = Math::abs;		// 람다식의 축약형 정적 메소드 사용
		System.out.println(m.calculate(-50.3));
//		p = (a,b) -> a.charAt(b);
		p = String::charAt; 	// 선언되어 있는 걸 모른다면 어렵지만. 람다식의 축약형 정적 메소드 사용
		System.out.println(p.pick("안녕, 인스턴스 메서드 참조!", 4));
		
		Utils utils = new Utils(); // 인스턴스 만들고
//		 c = (a,b) -> utils.add(a,b); // 인스턴스의 메소드를 람다식으로 호출.
		c = utils::add; // 람다식의 축약형인데 인스턴스 메소드 사용
		// :: 연산자 다형성 , 여기서는 람다식의 축약형
		System.out.println(c.compute(20, 30));
	}
}

