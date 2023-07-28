package sec03.lamda;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
//[ 김찬영  2023-07-11 오후 04:11:26 ]
public class PredicateDemo { //[ 김찬영  2023-07-10 오후 05:45:13 ]
	public static void main(String[] args) {
		IntPredicate even = x -> x%2 ==0;  //test() 테스트메소드의 구현
		System.out.println(even.test(3)?"짝수":"홀수");
		
		IntPredicate one = x -> x == 1; //test() 테스트메소드의 구현
		IntPredicate oneOrEven = one.or(even); // oneOrEven 은 디폴트 메소드임.
		System.out.println(oneOrEven.test(1)?
				"1 혹은 짝수" : "1이 아닌 홀수"); // 자바의 특성상 앞에가 참이면 바로 참으로 응답
		
		Predicate<String> p = Predicate.isEqual("Java Lambda");
		System.out.println(p.test("Java Lambda"));
		System.out.println(p.test("JavaFx"));
		
		BiPredicate<Integer, Integer> bp = (x,y) -> x>y; // test 구현체 
		System.out.println(bp.test(2, 3));
	}
}
